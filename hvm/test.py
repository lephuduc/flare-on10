from arc4 import ARC4
from base64 import b64decode,b64encode
import struct
from pwn import xor
from reversing import *
# [rbp-40h] inbuf
# [rbp-48h] to_cmp
encflag = b'\x19v7/=\x1d&?{\x069X\x12#%k*\x07<8\x18h\x16\x1c0\t4#\x08[!$6aj&j\x0fD]\x06\x00\x00\x00\x00\x00\x00\x00'

__ROL4__ = lambda val, r_bits: \
    (val << r_bits%32) & ((2**32)-1) | \
    ((val & ((2**32)-1)) >> (32-(r_bits%32)))
# Rotate right: 0b1001 --> 0b1100
__ROR4__ = lambda val, r_bits: \
    ((val & ((2**32)-1)) >> r_bits%32) | \
    (val << (32-(r_bits%32)) & ((2**32)-1))

def normal_xor(keystream,block):
    ls_keystream = list(struct.unpack("<8Q",keystream))
    block = list(struct.unpack(f"<{len(block)//8}Q",block))
    for i in range(0,len(block),2):
        p1 = block[i]
        p2 = block[i+1]
        for j in range(7,-1,-1):
            oldp1 = p1
            p1 = p1 ^ (ls_keystream[j]^p2)
            p2 = oldp1
        block[i] = p1
        block[i+1] = p2
    return struct.pack(f'<{len(block)}Q',*block)  
  
def rev_xor(keystream,block):
    ls_keystream = list(struct.unpack("<8Q",keystream))
    block = list(struct.unpack(f"<{len(block)//8}Q",block))
    for i in range(0,len(block),2):
        p1 = block[i]
        p2 = block[i+1]
        for j in range(8):
            old = p2
            p2 = old ^ (ls_keystream[j]^p1)
            p1 = old
        block[i] = p1
        block[i+1] = p2
    # print([hex(i) for i in block])
    return struct.pack(f'<{len(block)}Q',*block) 

def Init_key_stream(in_bytes):
    in_list = unpack_ls(in_bytes,32)
    # print([hex(i) for i in in_list])
    S = in_list
    for i in range(0,20,2):
        S[4] ^= __ROL4__((S[0] + S[12])%2**32, 7)
        S[8] ^= __ROL4__((S[4] + S[0])%2**32, 9)
        S[12] ^= __ROL4__((S[8] + S[4])%2**32, 13)
        S[0] ^= __ROR4__((S[12] + S[8])%2**32, 14)
        
        S[9] ^= __ROL4__((S[5] + S[1])%2**32, 7)
        S[13] ^= __ROL4__((S[9] + S[5])%2**32, 9)
        S[1] ^= __ROL4__((S[13] + S[9])%2**32, 13)
        S[5] ^= __ROR4__((S[1] + S[13])%2**32, 14)

        S[14] ^= __ROL4__((S[10] + S[6])%2**32, 7)
        S[2] ^= __ROL4__((S[14] + S[10])%2**32, 9)
        S[6] ^= __ROL4__((S[2] + S[14])%2**32, 13)
        S[10] ^= __ROR4__((S[6] + S[2])%2**32, 14)

        S[3] ^= __ROL4__((S[15] + S[11])%2**32, 7)
        S[7] ^= __ROL4__((S[3] + S[15])%2**32, 9)
        S[11] ^= __ROL4__((S[7] + S[3])%2**32, 13)
        S[15] ^= __ROR4__((S[11] + S[7])%2**32, 14)

        S[1] ^= __ROL4__((S[0] + S[3])%2**32, 7)
        S[2] ^= __ROL4__((S[1] + S[0])%2**32, 9)
        S[3] ^= __ROL4__((S[2] + S[1])%2**32, 13)
        S[0] ^= __ROR4__((S[3] + S[2])%2**32, 14)

        S[6] ^= __ROL4__((S[5] + S[4])%2**32, 7)
        S[7] ^= __ROL4__((S[6] + S[5])%2**32, 9)
        S[4] ^= __ROL4__((S[7] + S[6])%2**32, 13)
        S[5] ^= __ROR4__((S[4] + S[7])%2**32, 14)

        S[11] ^= __ROL4__((S[10] + S[9])%2**32, 7)
        S[8] ^= __ROL4__((S[11] + S[10])%2**32, 9)
        S[9] ^= __ROL4__((S[8] + S[11])%2**32, 13)
        S[10] ^= __ROR4__((S[9] + S[8])%2**32, 14)

        S[12] ^= __ROL4__((S[15] + S[14])%2**32, 7)
        S[13] ^= __ROL4__((S[12] + S[15])%2**32, 9)
        S[14] ^= __ROL4__((S[13] + S[12])%2**32, 13)
        S[15] ^= __ROR4__((S[14] + S[13])%2**32, 14)
    out = ['-']*16
    for i in range(16):
        out[i] = (in_list[i] + S[i])%(2**32)
    return struct.pack('<16I',*out)

keystream = Init_key_stream(b'FLAR'*16)
# print(keystream)
keystream = b'\x02a$\xf5m\x84\x0cx\xfa\xfa\x18\xa3\xb9\x1c$_\xb9\x1c$_\x02a$\xf5m\x84\x0cx\xfa\xfa\x18\xa3\xfa\xfa\x18\xa3\xb9\x1c$_\x02a$\xf5m\x84\x0cxm\x84\x0cx\xfa\xfa\x18\xa3\xb9\x1c$_\x02a$\xf5'

assert rev_xor(keystream,normal_xor(keystream,b'a'*64))==b'a'*64

FLARE = b'FLARE2023FLARE2023FLARE2023FLARE2023\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00'

# res = b64decode(b'iDtM6z2gGr13aynmevMOeotPM+wjpHrIAGBR/2CXGw+7fQCqb+UojTBRFsZthAx4')

# flow:
# tmp2 = b64encode(arg2)
# Init_key_stream(b'FLAR'*16)
# res = normal_xor(keystream,tmp2)
# cmp(res,to_cmp)?
# print(b64encode(tmp))
tmp2 = normal_xor(keystream,FLARE)
a2 = normal_xor(keystream,tmp2)
print(tmp2)
print(a2)
# print(xor(b64encode(a2),encflag)[:41] + b'@flare-on.com')
