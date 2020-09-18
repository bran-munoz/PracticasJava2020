import java.util.Scanner;

public class ejercicio4 {

    /*Cree un programa que permita almacenar en una sola variable la cantidad de números que
    especifique el usuario. Luego permita que el usuario sea quien asigne esos valores.*/

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros;

        System.out.println(" Ejercicio 4: Arreglos dados por el usuario.");
        System.out.println("Ingrese la cantidad de espacios que quiere tenga el arreglo: ");

        numeros = new int[entrada.nextInt()];

        for(int i=0;i < numeros.length; i++){
            System.out.println("Ingrese los numeros del arreglo.");
            int agregar = entrada.nextInt();
            numeros[i] = agregar;
        }

        System.out.println("\nUsted ingreso: ");
        for(int i:numeros){
            System.out.println(i);
        }
    }
}
