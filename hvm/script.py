buf = b''
end_addr = 0x7FF60AAA1D4B

while True:
    idaapi.continue_process()
    idaapi.wait_for_next_event(WFNE_SUSP, -1)
    len_buf = get_reg_value('rax')
    bufaddress = get_reg_value('rdx')
    if get_reg_value('rip') == end_addr: break
    b = get_bytes(bufaddress,len_buf)
    buf += get_bytes(bufaddress,len_buf) + b'\xc3'

print(buf[:100])
with open('conv.bin','wb') as f:
    f.write(buf)
    f.close()