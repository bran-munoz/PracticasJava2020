import java.util.Scanner;

public class ejercicio1 {

    public static void  main(String[] args){

        Scanner entrada = new Scanner(System.in);

            System.out.println("Ingrese un numero, cual quiera: ");
            int valor = entrada.nextInt();

            if (valor % 2 == 0) {
                System.out.println("El numero " + valor + " es un numero par.");
            } else {
                System.out.println("El numero " + valor + " es un numero impar.");
            }
    }
}
