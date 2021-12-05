int; n1=0
int; n2=0
int; n3=0
n1 = int(input("Ingrese el primer numero"))
n2 = int(input("Ingrese el segundo numero"))
n3 = int(input("Ingrese el tercer numero"))
while (n1 == n2 or n2 == n3 or n3 == n1):
        print("Ingrese numeros distintos ERROR")
        n1 = int(input("Ingrese el primer numero"))
        n2 = int(input("Ingrese el segundo numero"))
        n3 = int(input("Ingrese el tercer numero"))
if (n1 > n2 and n1 > n3):
    print("El numero mayor es: ",n1)
else:
    if(n2 > n1 and n2 > n3):
        print("El numero mayot es: ",n2)
    else:
         if(n3 > n1 and n3 > n2):
            print ("El numero mayor es: ",n3)
