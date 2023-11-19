from Crypto.Cipher import AES
from pwn import *
import struct

def decrypt(data):
    return AES.new(b"yummyvitamincjoy", AES.MODE_ECB).decrypt(data)

def encrypt(data):
    return AES.new(b"yummyvitamincjoy", AES.MODE_ECB).encrypt(data)

def decrypt2(data):
    return AES.new(b"\"version\": \"6.20", AES.MODE_ECB).decrypt(data)

def decstr(buf):
    dec = b''
    for i in range(0, len(buf), 4):
        n = 0x6499f8a9^struct.unpack('<I',buf[i: i + 4])[0]
        dec += struct.pack('<I',n) 

    return dec

str0 = b'\xc1\x8c\xed\x14\x93\xd7\xb6U\x9b\xcf\xb7T\x87\xc8\xb7U\x93\xcd\xaeW\x9b\xc0\xb6V\x86\x8b\xec\t\xc4\x99\xeb\x1d\xa9\xfb\x9ag'
str1 = bytes([0xcb, 0x99, 0xf7, 0x5, 0xc7, 0x99, 0xfb, 0xb, 0xdd, 0xd8, 0xac, 0x54, 0x99, 0xc8, 0x99, 0x65])
str2 = b'\x8b\x8e\xfc\x16\xda\x91\xf6\n\x8b\xc2\xb9F\xa9\xfb\x9ag'
str3 = b'\xdd\x90\xfcD\xcd\x9d\xfa\x16\xd0\x88\xed\r\xc6\x96\xb9\x0b\xcf\xd8\xed\x0c\xc0\x8b\xb9\x06\xc5\x97\xfbD\xde\x99\xeaD\xda\x8d\xfa\x07\xcc\x8b\xea\x02\xdc\x94\x99e'

print(decstr(str0))
print(decstr(str1))
print(decstr(str2))
print(decstr(str3))


# data = open("3.dec.exe", "rb").read()
# data = b'the decryption of this blob was successful' + data
# with open("3_patched.bin", "wb+") as fout:
#     fout.write(encrypt(data))

# data = open("lol.bin", "rb").read()
# decrypted = decrypt2(data)[:42]
# print(decrypted)
# with open("4.dec.exe", "wb+") as fout:
    # fout.write(decrypted)
# print(decrypted[:42])
# print(decrypted[42:60])