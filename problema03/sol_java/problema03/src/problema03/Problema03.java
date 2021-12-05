/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jooec
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre = "";
        int tipo_empleado;
        double costoxh;
        double costoxhextra;
        double n_horas;
        double h_extra_1 = 1.5;
        double h_extra_2 = 2;
        double h_extra_3 = 2.5;
        double sueldo = 0;
        String datos = "";

        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el tipo de empleado");
        tipo_empleado = entrada.nextInt();

        System.out.println("Ingrese el numero de horas trabajadas");
        n_horas = entrada.nextDouble();

        System.out.println("Ingrese la cuota por hora");
        costoxh = entrada.nextDouble();
        sueldo = n_horas * costoxh;

    if (tipo_empleado == 1 && n_horas >40){
        sueldo = sueldo * h_extra_1;
            }else{
                if (tipo_empleado ==2 && n_horas >40){
                     sueldo = sueldo * h_extra_2;
                        }else{
                            if (tipo_empleado ==3 && n_horas >40){
                                sueldo = sueldo * h_extra_3;
                    }
                }
            }
    System.out.printf("Sueldo a pagar: %.2f",sueldo); // el programa solo pide imprimir sueldp
        }

    }
