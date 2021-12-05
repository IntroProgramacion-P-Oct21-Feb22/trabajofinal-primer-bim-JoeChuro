str; nombre= "" 
int; tipo_empleado=0
float; costoxh = 0
float; costoxhextra = 0
float; n_horas = 0
float; h_extra_1 = 1.5
float; h_extra_2 = 2
float; h_extra_3 = 2.5
float; sueldo = 0
str; datos = ""

nombre = str (input("Escriba el nombre del empleado: "))

tipo_empleado = int (input("Escriba el tipo de empleado: "))

n_horas = float (input("Escriba el numero de horas trabajadas: "))

costoxh = float (input("Escriba la cuota por horas: "))

sueldo = n_horas * costoxh

if (tipo_empleado ==1 and n_horas >40):
    sueldo = sueldo * h_extra_1
else:
    if (tipo_empleado ==2 and n_horas >40):
        sueldo = sueldo * h_extra_2
    else:
        if (tipo_empleado ==3 and n_horas >40):
            sueldo = sueldo * h_extra_3
        
print("Sueldo: ",sueldo)

# el programa unicamente pide imprimir el sueldo