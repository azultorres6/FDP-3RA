/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_menu;

import java.util.Scanner;

/**
 *
 * @author Azul
 */
public class EVA3_3_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            imprimirMenu();
            opcion = teclado.nextInt();
            if(opcion ==1){
                    calcularPotencia();
            }else if (opcion ==2){

            }

        } while (opcion != 3);
    }

    public static void imprimirMenu() {
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Seleciona una opcion");
        System.out.println("1.Calcular una potencia");
        System.out.println("2.Sumar dos numeros");
        System.out.println("3.Salir del sistema ");
        System.out.println("Seleciona una opcion");
    }

    public static void calcularPotencia() {
        Scanner teclado = new Scanner(System.in);
        int base, exp;
        System.out.println("*****CALCULO DE UNA POTENCIA*****");
        System.out.println("Captura de base");
        base = teclado.nextInt();
        System.out.println("Captira del exponente");
        exp = teclado.nextInt();
        System.out.println(base + " elevado a " + exp + "= " + calcularPot(base, exp));
    }

    public static int calcularPot(int base, int expo) {
        int resu = 1;
        for (int i = 1; i < expo; i++) {
            resu = resu * base;

        }  
        return resu;
    }
}
        
  


