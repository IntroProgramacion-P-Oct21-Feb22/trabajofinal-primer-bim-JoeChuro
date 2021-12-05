metros = int(input("Ingrese el numero de metros: "))
contador = 0
datos = ""
while (contador < metros):
    contador = contador + 1
    centimetros = contador / 100
    pulgadas = centimetros / 2.54
    pies = pulgadas / 12
    yardas = pies / 3
    print(f"Metros",contador)
    print(f"Yardas",yardas)
    print(f"Pulgadas",pulgadas)
    print(f"Pies",pies)