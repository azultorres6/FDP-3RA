/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author Mayeli
 */
public class EVA3_1_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int vall = 5, val2 = 10;
       // 1.Si necesito guardar el valor de retorno
       int resu = sumarEnteros(vall,val2); //Invocar el metodo
        System.out.println("Suma de 5 + 10 = " + resu);
       //2.NO necesito guardar el valor, un solo uso
        System.out.println("Suma de 5 + 10 = " + sumarEnteros(vall, val2));
       //3. Solo necesito ejecutar el metodo, no interesa el resultado 

    }
    //MÉTODO PARA SUMAR DOS ENTEROS
    //llamar a sus metodos usando verbo y escritura cameICas
    //1. Modificadores de acceso: public, protected, private, default
    //2. Static --> PARA USAR LOS METODOS DENTRO DEL MAIN
    //3. Valor de retorno: cualquier tipo de datp
    // vold --> si no quieren regresar un valor
    //4. nombre del metodo: mensajes
    //5. lista de parametros: pueden ser cero o N cantidad
    // 1     2      3       4             5
    public static  int sumarEnteros(int num1, int num2) {
        int  suma = num1 + num2;
        return suma;
      }
    }


