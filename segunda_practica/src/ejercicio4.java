import  java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int menu;
        int n1;
        int n2;

        System.out.println("Ejercicio 4 \n");
        System.out.println("Menú");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        menu = entrada.nextInt();

        if(menu == 1){
            System.out.println("Introduzca el primer numero:");
            n1 = entrada.nextInt();
            System.out.println("Introduzca el segundo numero:");
            n2 = entrada.nextInt();
            System.out.println("El resultado de la suma es: "+ (n1+n2));
        }else{
            System.out.println("Introduzca el primer numero:");
            n1 = entrada.nextInt();
            System.out.println("Introduzca el segundo numero:");
            n2 = entrada.nextInt();
            System.out.println("El resultado de la resta es: "+ (n1-n2));
        }
    }
}
