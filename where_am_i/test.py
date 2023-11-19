# 0x0176A59 Call main function
# 0x0176A59 CreateProcessA
# 0x0171a9d virtual alloc
# 0x0175565 write file
from unicorn import *
from unicorn.x86_const import *
from capstone import *

with open('susfunc','rb') as f:
    b = f.read()
md = Cs(CS_ARCH_X86,CS_MODE_32)

disasm_result = md.disasm(b,0)
diass_str = []
for ins in disasm_result:
    # print(ins)
    last_address = int(ins.address)
    last_size = ins.size
    # print("0x%x:\t%s\t%s" %(ins.address, ins.mnemonic, ins.op_str))   
    diass_str.append((ins.address,ins.mnemonic,ins.op_str)) 
# print(diass_str)

def find(address):
    for i in range(len(diass_str)):
        if address==hex(diass_str[i][0]):
            return i
    return -1     
JMPS = ['jmp']
new_code = """"""
pc = 0
while pc < len(diass_str) and pc != -1:
    ins = diass_str[pc]
    if ins[1] != 'jmp':
        new_code += f'{ins[1]}  {ins[2]}\n'
    # print()
        print(f'{hex(ins[0])}  {ins[1]}  {ins[2]}')
    if ins[1] in JMPS:
        pc = find(ins[2])
    else:
        pc +=1
print(new_code)