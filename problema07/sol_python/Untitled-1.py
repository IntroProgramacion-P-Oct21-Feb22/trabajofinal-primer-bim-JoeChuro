int; n1=0
int; n2=0

numero = int(input("Ingrese un numero par: "))
if(numero <2):
    print("error")
else:
    if(numero % 2 ==0):
        n1 = numero /2
        n2 = numero /2
        suma = n1 + n2
    else:
        print("ERROR")


print("%d + %d = %d"%(n1,n2,numero))