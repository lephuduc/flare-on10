
from __future__ import print_function

# required for assembly
from keystone import *  

# required for emulation
from unicorn import *
from unicorn.x86_const import *

# required for disassembly (for instruction trace during emulation)
from capstone import *

##########################

CODE="""
mov eax, 0
mov dword ptr [esp], 0x0AC8890A8
mov dword ptr [esp+4], 0x0B9979C8A
mov dword ptr [esp+8], 0x0FF989E93

loc_8048480:
    not byte ptr [esp+eax]
    inc eax
    cmp eax, 0xC
    jnz loc_8048480
"""

### setup capstone disassembler
md = Cs(CS_ARCH_X86, CS_MODE_32)

### compile code
ks = Ks(KS_ARCH_X86, KS_MODE_32)

print("compiling...")
asm_tuple = ks.asm(CODE)
asm_code = "".join(chr(x) for x in asm_tuple[0])  #convert ([1, 2, ...]) into hex string \x01\x02...

print("compiled asm code:", repr(asm_code))

### emulate code

print("init hooks")

# callback for tracing instructions
def hook_code(uc, address, size, user_data):
    print(">>> Tracing instruction at 0x%x, instruction size = 0x%x" %(address, size))

    # Since we only want the first instruction, we call the generator function directly (by using next())
    disasm_result = md.disasm(uc.mem_read(address,len(asm_code)), address).next()
    print("0x%x:\t%s\t%s" %(disasm_result.address, disasm_result.mnemonic, disasm_result.op_str))

    print("> EFLAGS is 0x%x" %(uc.reg_read(UC_X86_REG_EFLAGS)))
    print("------------------------------------------------")
    # Add the registers or info, you would like to see here

# callback for tracing invalid memory access (READ or WRITE)
def hook_mem_invalid(uc, access, address, size, value, user_data):
    print(">>> Missing memory is being WRITE at 0x%x, data size = %u, data value = 0x%x, eip = 0x%x"%(address, size, value, uc.reg_read(UC_X86_REG_EIP)))
    return False   # return False to indicate we want to stop emulation

# memory address where the emulation starts
CODE_ADDRESS = 0x1000000
MEMO_ADDRESS = 0x1001000


print("Emulate i386 code")
try:
    # Initialize emulator in X86-32bit mode
    mu = Uc(UC_ARCH_X86, UC_MODE_32)

    # map 1MB memory for this emulation
    mu.mem_map(CODE_ADDRESS, 2**20)

    # write machine code to be emulated to memory
    mu.mem_write(CODE_ADDRESS, asm_code)

    # initialize machine registers
    mu.reg_write(UC_X86_REG_ESP, MEMO_ADDRESS)

    # intercept invalid memory events
    mu.hook_add(UC_HOOK_MEM_INVALID | UC_HOOK_MEM_READ_UNMAPPED | UC_HOOK_MEM_WRITE_UNMAPPED, hook_mem_invalid)

    # tracing all instructions with customized callback
    mu.hook_add(UC_HOOK_CODE, hook_code)

    print("starting emulation...")

    # emulate machine code in infinite time
    mu.emu_start(CODE_ADDRESS, CODE_ADDRESS + len(asm_code))

    # now print out some registers
    print(">>> Emulation done. Below is the CPU context")

    print(">>> EAX = 0x%x" %mu.reg_read(UC_X86_REG_EAX))
    print(">>> ESP = 0x%x" %mu.reg_read(UC_X86_REG_ESP))
    print(">>> ESP memory =", mu.mem_read(MEMO_ADDRESS, 25))

except UcError as e:
    print("ERROR: %s" % e)