address = 0x04810C5
add_bpt(address, 0, BPT_SOFT)
enable_bpt(address, True)

end_addr = 0x481AC0
add_bpt(end_addr, 0, BPT_SOFT)
enable_bpt(end_addr, True)

hehe = []

while 1:
    idaapi.continue_process()
    idaapi.wait_for_next_event(WFNE_SUSP, -1)
    if get_reg_value('rip') == end_addr: break
    hehe.append(get_reg_value('rax'))
    
print(hehe)