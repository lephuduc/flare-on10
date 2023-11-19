# offset = 0x1C01C33D350
# newcfg = b'{"0":"FLAKE Ultimate Pro v10 (D ","1":5,"2":0,"3":2000}'

# assert len(newcfg)==55
# print(newcfg,len(newcfg))
# [patch_byte(offset+i,j) for i,j in zip(range(55),newcfg)]
cfg =b'{"0":"FLAKE Ultimate Pro v10 (D","1":0,"2": 9999,"3":2}'
assert len(cfg)==55
idaapi.patch_bytes(get_reg_value('rax') + 0x20, cfg)
