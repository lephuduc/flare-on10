from base64 import b64decode
from arc4 import ARC4
cfg = b64decode(b'WTOh3Rgz17NjWtTfd33llk9w5ZoCQeOQAmegzwI51ZpPfrjdDjOg3Rgkvd0QM6vPDjOi3Rgj7A==')
print(cfg.hex())
key = b'POSITIONAL_OR_KEYWORD'
arc = ARC4(key)
print(arc.decrypt(cfg))