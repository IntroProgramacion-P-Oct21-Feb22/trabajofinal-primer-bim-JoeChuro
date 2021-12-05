numero = 1
i = 0
sumas = ""
while (i < 100):
    i = i + numero
    sumas = str.format("%s%d + %d /"%(sumas,i,numero))

print(sumas)
