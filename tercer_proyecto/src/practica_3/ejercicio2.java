package practica_3;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args){

        /*2- Realizar un programa que solicite al usuario un número indeterminado de números
        (mientras se tecleen números que no sean cero). Al salir el programa debe dar en
        pantalla el total de números dados y la suma de ellos.*/
        Scanner input = new Scanner(System.in);

        int contador = 0;
        int sumando = 0;
        System.out.println("*******************************************************************************");
        System.out.println("Ejercicio 2");
        System.out.println("Introduzca cuantos numeros quiera: \nPara detener el programa introduzca el numero 0.");
        System.out.println("*******************************************************************************");
        int n1 = input.nextInt();

        while(n1 != 0){
            contador ++;
            sumando += n1;
            n1 = input.nextInt();
        }
        System.out.printf("El total de numeros dados es: "+contador+"\n");
        System.out.printf("La suma de todos los numeros es: "+ sumando);
        System.out.println("\n*******************************************************************************");
    }
}
