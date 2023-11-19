from hashlib import md5
from base64 import b64decode
from reversing import *
# 18001EF9B: first listen
# 18004DF66: resolve shell
# 18003866E: recv command maybe
# 1800524E8: compare command
# Stack[00001A24]:00000000004EFEE8 aGimmieAdvic3 db 'gimmie_advic3',0
# Stack[00001A24]:00000000004EFEF6 db    0
# Stack[00001A24]:00000000004EFEF7 db    0
# Stack[00001A24]:00000000004EFEF8 aGimmieS3cr3t db 'gimmie_s3cr3t',0

# ask pw: gimmie_s3cr3t
# md5(password)
# 4c8476db197a1039153ca724674f7e13: patience
# 627fe11eeef8994b7254fc1da4a0a3c7: y0u
# d0e6ef34e76c41b0fac84f608289d013: must
# 48367c670f6189cf3f413be394f4f335: h4v3
# pw: patience_y0u_must_h4v3            

    
print(md5(b'patience_y0u_must_h4v3').digest())

sus = b64decode(b'OIZC4eMC/UnTPfDDMMaHeQXUHMPZy4LfSgg/HnB5SXVOIyKOBIHMe45B2KBCe5T/HRfRHZ4SKJe3eLJHeMe5IM5QQJ======')
# print(sus)
xaolon = b64decode(b'/SeOTX+LJS4/32+ynPBMPOe/I5MXw4HXyJRD4+QwP5KVafngPMgw+y+y/ne+/OBRMXaCnZI3JIa/D/ZeBJTVUnyCCC======')
# print(xaolon)
xaolon1 = b64decode(b'f/LB2wRf4Hw+K/TnnQeTeDUfXPSMVOfeMVK2eO+TaRw5+/O4nBe3eVHM+KSHRw4IKnKVIR4w4eX/BIMJ5DwJU34naC======')
# print(xaolon1)

# for i in range(256):
#     print(xorn(sus,i))            
#0x180015CE1 (.text:loc_180015CE1):	do rop-chain (sus)
# 180000: address password
# also a random buffer
buf = b'2Z\xa8j7\xb8\x97,R\x9f^\x85\xb9Qg\x92\xf4\x93\xc1\x8a\x9d\xdb\xd3l\x80\xd0\r`W\x80v\x93\xf4k\xea\xae\x92\x89\xed_\xd7\xb6\xe5B\x87\x92\xb2\x12\xce\x0ea\xe3oCf\n'
past = 0x50
a = 0
flag = []
p = b'patience_y0u_must_h4v3'
for i in range(0,len(buf)-2,2):
    tmp = ((p[i%len(p)]<<1)&0xff)&((buf[i]>>1)&0xff)
    past ^= tmp
    past ^= ((buf[i+1]<<2)&0xff)
    flag.append(past)
print(bytes(flag))