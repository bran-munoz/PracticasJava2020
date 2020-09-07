import java.util.Scanner;
public class ejercicio3 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Ejercicio 3 ");
        System.out.println("Introduzca dos al azar para evaluar cual es el mayor de ambos.");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        if(n1 > n2){
            System.out.println("El numero "+ n1 +" es mayor que el numero "+n2);
        }
        else {
            System.out.println("El numero "+ n2 +" es mayor que el numero "+n1);
        }
    }
}
