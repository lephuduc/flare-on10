import zlib
with open('real.bin','rb') as f:
    enc_rc4buf = f.read()
enc = enc_rc4buf
def custom_rc4(key,buf):
    length = len(buf)
    buf = list(buf)
    S = [i for i in range(256)]
    i = 0
    for j in range(256):
        i = (i + S[j] + key[j % len(key)]) % 256
        S[i],S[j] = S[j],S[i]
    for j in range(256):
        i = (i + S[j] + key[j % len(key)]) % 256
        S[i],S[j] = S[j],S[i]
    i2 = 0
    j2 = 0
    idx = 0
    while idx < length:
        i2 = (i2 + 1) % 256
        j2 = (S[i2] + j2) % 256
        tmp = S[j2]
        S[j2] = S[i2]
        S[i2] = tmp
        buf[idx] ^= S[(S[i2] + S[j2])%256];
        idx+=1
    i2 = 0
    j2 = 0
    idx = 0
    while idx < length:
        i2 = (i2 + 1) % 256
        j2 = (S[i2] + j2) % 256
        tmp = S[j2]
        S[j2] = S[i2]
        S[i2] = tmp
        buf[idx] ^= S[(S[i2] + S[j2])%256];
        idx+=1
    return bytes(buf)



right_crc32 = 0x92A7A888
for i in range(256):
    buf = bytes([(j - i)&0xff for j in enc])
    # print(buf[:100])
    enc_rc4buf = custom_rc4(b'REVERSEENGINEER',buf)
    # print(hex(zlib.crc32(rc4buf)))
    if zlib.crc32(enc_rc4buf)==right_crc32:
        print(i,hex(zlib.crc32(enc_rc4buf)))