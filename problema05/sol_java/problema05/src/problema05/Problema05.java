/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jooec
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double x;
        double y;

        System.out.println("Ingrese la cordenada x");
        x = entrada.nextDouble();

        System.out.println("Ingrese la cordenada y");
        y = entrada.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Las cordenadas estan ubicadas en el primer cuadrante");
        } else {
            if (x < 0 && y > 0) {
                System.out.println("Las cordenadas estan ubicadas en el segundo cuadrante");
            } else {
                if (x < 0 && y < 0) {
                    System.out.println("Las cordenadas estan ubicadas en el tercer cuadrante");
                } else {
                    if (x > 0 && y < 0) {
                        System.out.println("Las cordenadas estan ubicadas en el cuarto cuadrante");
                    }
                }
            }
        }
    }
}
