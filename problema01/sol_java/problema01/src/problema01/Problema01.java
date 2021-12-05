/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jooec
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int angulo1;
        int angulo2;
        int angulo3;
        int suma = 0;
        
        System.out.println("Escriba el primer angulo del triangulo");
        angulo1 = entrada.nextInt();
        
        System.out.println("Escriba el segundo angulo del triangulo");
        angulo2 = entrada.nextInt();
        
        System.out.println("Escriba el tercer angulo del triangulo");
        angulo3 = entrada.nextInt();
        
        suma = angulo1 + angulo2 + angulo3;
        
        if (suma ==90){
            System.out.println("El triangulo es de angulo recto");
        }else{
            if (suma <90){
            System.out.println("El triangulo es de angulo agudo");  
            }else{
            if (suma >90 && suma <180){
            System.out.println("El triangulo es de angulo obbtuso");
        
                }
            }
        }
    }
}
