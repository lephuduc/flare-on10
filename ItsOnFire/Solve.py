from Crypto.Cipher import AES
# key = b"4508305374508305"
# iv = b"abcdefghijklmnop"

# aes = AES.new(key,AES.MODE_CBC,iv)
with open('ItsOnFire.apk','rb') as f:
    d = f.read()
with open('iv.png','rb') as f:
    a = f.read()
# for i in range(0,len(d)-32,32):
key = b"4508305374508305"
iv = b"abcdefghijklmnop"
aes = AES.new(key,AES.MODE_CBC,iv)
# print()
dec = aes.decrypt(a)
print(dec)
with open('iv.png','wb') as f:
    f.write(dec)