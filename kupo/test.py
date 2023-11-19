with open('k1801vm1.py','r') as f:
    d = f.read()
# print(d)
for i in range(8):
    for j in range(8):
        d = d.replace(f' {i}{j}',f' 0o{i}{j}')
        d = d.replace(f'({i}{j}',f'(0o{i}{j}')
        d = d.replace(f' 0{i}{j}',f' 0o{i}{j}')
        d = d.replace(f'(0{i}{j}',f'(0o{i}{j}')
print(d)