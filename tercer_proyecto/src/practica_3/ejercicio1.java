package practica_3;
import  java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args){

        /*Escriba un programa que imprima en pantalla los números enteros que existan entre los
        números cuales quiera que ingrese el usuario como inicio y fin. */
        Scanner input = new Scanner(System.in);

        System.out.println("Ejercicio 1");
        System.out.println("Introduzca 2 numero cuales quiera: ");

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int contador = 0;

        for(int i=0; n1 <= n2; n1++){
            i++;
            contador = i;
                System.out.println(n1);
        }
        System.out.printf("Dentro de los numero ingresados existen "+contador+" numeros.");
    }
}
