from capstone import *
from capstone.x86 import *
from capstone.x86_const import *
from keystone import *

binary = open("where_am_i_00640000.bin", "rb").read()

md = Cs(CS_ARCH_X86, CS_MODE_32)
ks = Ks(KS_ARCH_X86, KS_MODE_32)

map_ins_addr_to_new_addr = {

}

map_func_base_to_new_base = {

}

jmp_old_tagers = {}

new_binary = bytearray()

JMPS = [ 'je', 'jz', 'jnz', 'jne', 'jbe' ]

def disass_next(md: Cs, addr: int, instructions: list):
    ins = next(md.disasm(binary[addr:], addr, 1))

    if ins.mnemonic == "ret":
        instructions.append(ins)
        # print("0x%x:\t%s\t%s" %(ins.address, ins.mnemonic, ins.op_str))
        return
    

    # print("0x%x:\t%s\t%s" %(ins.address, ins.mnemonic, ins.op_str))
    # instructions.append(ins)
    if ins.mnemonic == "jmp":
        next_addr = int(ins.op_str[2:], 16)

        addr = next_addr
    else:
        instructions.append(ins)
        addr += ins.size

    disass_next(md, addr, instructions)


def disass_func(mc: Cs, base_addr: int):
    global new_binary

    # TODO: should be fine, backpatch all jmps, then backpatch all calls. also add calls to the stack of to_process.

    new_bin_base = len(new_binary)
    print(f"Func @ {hex(base_addr)} => {hex(new_bin_base)}")
    call_stack = []

    stack = [ base_addr ]
    while len(stack) != 0:
        addr_to_process = stack.pop()

        if addr_to_process in map_ins_addr_to_new_addr.keys():
            continue

        ins = next(md.disasm(binary[addr_to_process:], addr_to_process, 1))
        # map_ins_addr_to_new_addr[addr_to_process] = len(new_binary)

        if ins.mnemonic == "ret":
            # print("0x%x:\t%s\t%s" %(ins.address, ins.mnemonic, ins.op_str))
            map_ins_addr_to_new_addr[addr_to_process] = len(new_binary)
            new_binary += ins.bytes
            continue

        if ins.mnemonic == "call":
            try:
                branch_taken_addr = int(ins.op_str[2:], 16)
                jmp_old_tagers[len(new_binary)] = branch_taken_addr
                v = int(ins.op_str[2:], 16)
                call_stack.append(v)
            except:
                pass

        if ins.mnemonic in JMPS:
            branch_taken_addr = int(ins.op_str[2:], 16)
            jmp_old_tagers[len(new_binary)] = branch_taken_addr
            stack.append(branch_taken_addr)
            # print('aho')

        # print("0x%x:\t%s\t%s" %(ins.address, ins.mnemonic, ins.op_str))
        if ins.mnemonic == "jmp":
            map_ins_addr_to_new_addr[addr_to_process] = len(new_binary)
            next_addr = int(ins.op_str[2:], 16)
            stack.append(next_addr)
        else:
            # print(ins.bytes)
            map_ins_addr_to_new_addr[addr_to_process] = len(new_binary)
            new_binary += ins.bytes
            stack.append(addr_to_process + ins.size)


    # TODO: process calls here after func is fully assembled
    for call_addr in call_stack:
        disass_func(mc, call_addr)

    return

def backpatch_branches(md: Cs, ks: Ks):
    global new_binary

    for ins in md.disasm(new_binary, 0x00):
        if ins.mnemonic in JMPS:
            print("0x%x:\t%s\t%s" %(ins.address, ins.mnemonic, ins.op_str))
            # print(f"{hex(ins.address)}")
            old_addr = jmp_old_tagers[ins.address]
            
            new_addr = map_ins_addr_to_new_addr[old_addr]
            print("0x%x:\t%s\t%s => %s" %(ins.address, ins.mnemonic, ins.op_str, hex(new_addr)))
            new_instr = f"{ins.mnemonic} {hex(new_addr)}"
            print(f"new {new_instr}")
            new_instr_bytes, count = ks.asm(new_instr, ins.address)
            print(f"old bytes: {ins.bytes} new bytes: {[hex(x) for x in new_instr_bytes]}")

            for i in range(len(new_instr_bytes)):
                new_binary[ins.address + i] = new_instr_bytes[i]

            for i in range(len(ins.bytes) - len(new_instr_bytes)):
                new_binary[ins.address + len(new_instr_bytes) + i] = 0x90
        elif ins.mnemonic == "call":
            print("0x%x:\t%s\t%s" %(ins.address, ins.mnemonic, ins.op_str))
            try:
                old_addr = jmp_old_tagers[ins.address]
            
                new_addr = map_ins_addr_to_new_addr[old_addr]
                new_instr = f"{ins.mnemonic} {hex(new_addr)}"
                new_instr_bytes, count = ks.asm(new_instr, ins.address)
                for i in range(len(new_instr_bytes)):
                    new_binary[ins.address + i] = new_instr_bytes[i]

                for i in range(len(ins.bytes) - len(new_instr_bytes)):
                    new_binary[ins.address + len(new_instr_bytes) + i] = 0x90
            except:
                pass


# instructions = []
# disass_next(md, 0x00, instructions)

# for ins in instructions:
#     print("0x%x:\t%s\t%s" %(ins.address, ins.mnemonic, ins.op_str))

disass_func(md, 0x00)
backpatch_branches(md, ks)

print("\n\nDisassembling new func")

# for ins in md.disasm(new_binary, 0x00):
#     print("0x%x:\t%s\t%s" %(ins.address, ins.mnemonic, ins.op_str))

# print(map_ins_addr_to_new_addr)

with open('recon.bin', 'wb+') as fout:
    fout.write(new_binary)
