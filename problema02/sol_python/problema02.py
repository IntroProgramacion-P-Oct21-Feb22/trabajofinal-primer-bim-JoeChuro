int; trajes = 0
float; v_unitario = 0
float; subtotal = 0
float; v_total = 0
float; descuento = 0
int; porcentaje1 =20
int; porcentaje2 = 25
int; porcentaje3 = 40
int; porcentaje4 = 50

n_trajes = int (input("Escriba el numero de trajes a comprar"))

v_unitario = float (input("Escriba el valor unitario"))

subtotal = v_unitario * n_trajes

if n_trajes == 1:
    descuento = porcentaje1 * subtotal/100
    v_total = subtotal - descuento
else:
    if n_trajes == 2:
        descuento = porcentaje2 * subtotal/100
        v_total = subtotal - descuento
    else:
        if n_trajes == 3:
            descuento = porcentaje3 * subtotal/100
            v_total = subtotal - descuento
        else:
            if n_trajes >3:
                descuento = porcentaje4 *subtotal/100
                v_total = subtotal - descuento


print("Subtotal",subtotal)
print("Descuento",descuento)
print("Valor Total",v_total)