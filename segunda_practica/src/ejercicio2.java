import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();

        if(edad > 0 && edad < 10){
            System.out.println("Usted es un niño.");
        }
        else if(edad > 11 && edad < 17){
            System.out.println("Usted es un adolecente.");
        }
        else if(edad > 18 && edad < 38){
            System.out.println("Usted es un adulto.");
        }
        else if(edad > 39 && edad < 59){
            System.out.println("Usted es un adulto de mediana edad.");
        }
        else if(edad > 60){
            System.out.println("Usted es un adulto mayor.");
        }

    }
}
