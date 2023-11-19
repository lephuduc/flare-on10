from unicorn import *
from unicorn.x86_const import *
import base64
from pwn import xor
import struct

bin = open('sus.bin', 'rb').read()
encflag = b'\x19v7/=\x1d&?{\x069X\x12#%k*\x07<8\x18h\x16\x1c0\t4#\x08[!$6aj&j\x0fD]\x06\x00'

mu = Uc (UC_ARCH_X86, UC_MODE_64)
BASE = 0x0
STACK_ADDR = 0x300000
STACK_SIZE = 1024*1024
RSP_value = STACK_ADDR + STACK_SIZE - 1
add_arg1 = 0xe00
add_arg2 = 0xf00

mu.mem_map(BASE, 1024*1024)
mu.mem_map(STACK_ADDR, STACK_SIZE)
mu.reg_write(UC_X86_REG_RSP, RSP_value)
mu.mem_write(BASE, bin)

mu.mem_write(add_arg1, b'FLARE2023FLARE2023FLARE2023FLARE2023')
mu.mem_write(add_arg2, base64.b64encode(b'FLARE2023FLARE2023FLARE2023FLARE2023\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00'))


mu.reg_write(UC_X86_REG_RDI, add_arg1)
mu.reg_write(UC_X86_REG_RSI, add_arg2)

mu.emu_start(0xB3F, 0x55A)
print(mu.mem_read(mu.reg_read(UC_X86_REG_RDI), 64))
print(mu.mem_read(mu.reg_read(UC_X86_REG_RSI), 64))
print(mu.reg_read(UC_X86_REG_RDX))

# print((mu.mem_read(mu.reg_read(UC_X86_REG_RDI), 48)))
res = mu.mem_read(mu.reg_read(UC_X86_REG_RCX), 48) # bytearray(b'\x88;L\xeb=\xa0\x1a\xbdwk)\xe6z\xf3\x0ez\x8bO3\xec#\xa4z\xc8\x00`Q\xff`\x97\x1b\x0f\xbb}\x00\xaao\xe5(\x8d0Q\x16\xc6m\x84\x0cx')
print(res)
res = base64.b64encode(res)
mu.mem_write(BASE, bin)
mu.reg_write(UC_X86_REG_RSP, STACK_ADDR + STACK_SIZE - 1)
mu.mem_write(add_arg1, b'FLARE2023FLARE2023FLARE2023FLARE2023')
mu.mem_write(add_arg2, res)

mu.reg_write(UC_X86_REG_RDI, add_arg1)
mu.reg_write(UC_X86_REG_RSI, add_arg2)

mu.emu_start(0xb3f, 0xb16)
res = mu.mem_read(mu.reg_read(UC_X86_REG_RCX), 48)

# print(base64.b64encode(res))
print(xor(base64.b64encode(res), encflag)[:41] + b'@flare-on.com')