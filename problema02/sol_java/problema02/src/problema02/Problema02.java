/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jooec
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n_trajes;
        double v_unitario = 0;
        double subtotal = 0;
        double v_total = 0;
        double descuento = 0;
        int porcentaje1 = 20;
        int porcentaje2 = 25;
        int porcentaje3 = 40;
        int porcentaje4 = 50;

        System.out.println("Ingrese el numero de trajes a comprar");
        n_trajes = entrada.nextInt();
        System.out.println("Ingrese el valor unitario de los trajes");
        v_unitario = entrada.nextDouble();

        subtotal = v_unitario * n_trajes;

        if (n_trajes == 1) {
            descuento = subtotal * porcentaje1 / 100;
            v_total = subtotal - descuento;
        } else {
            if (n_trajes == 2) {
                descuento = subtotal * porcentaje2 / 100;
                v_total = subtotal - descuento;
            } else {
                if (n_trajes == 3) {
                    descuento = subtotal * porcentaje3 / 100;
                    v_total = subtotal - descuento;
                } else {
                    if (n_trajes > 3) {
                        descuento = subtotal * porcentaje4 / 100;
                        v_total = subtotal - descuento;
                    }

                }
            }
        }
        System.out.printf("Subtotal: %.2f\n" + "Descuento: %.2f\n" 
                + "Valor total: %.2f", subtotal,
                                       descuento,
                                       v_total);
    }
}
