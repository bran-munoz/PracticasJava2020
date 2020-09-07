import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args){
        /*Escriba un programa que solicite al usuario, cantidad de cuotas, y porcentaje de interés anual de
        un préstamo, calcule y muestre en pantalla la cuota mensual. (Amortizar mediante el sistema
        francés)*/

        Scanner entrada = new Scanner(System.in);

        double prestamo;
        int year;
        double porcentaje;
        double cuotaAnual;
        double form1;

        System.out.println("Ejercicio 6");
        System.out.println("Calculadora de cuotas mensuales de un prestamo.");
        System.out.println("Ingrese el monto del prestamo: ");
        prestamo = entrada.nextInt();
        System.out.println("Ingrese la cantidad de cuotas(Años para pagar: )"); //el sistema frances trabaja con cuotas anuales.
        year = entrada.nextInt();
        System.out.println("Ingrese el interes anual: ");
        porcentaje = entrada.nextDouble();

        porcentaje = porcentaje / 100;
        year = year * -1;
        form1 = 1 - Math.pow((1+porcentaje),year);

        cuotaAnual = (prestamo * (porcentaje / form1 ));
        System.out.printf("El monto anual a pagar es: %.2f",cuotaAnual);
        System.out.printf("\nEl monto mensual a pagar es: %.2f",cuotaAnual/12); //Se divide a 12 porque la formula
        //original esta basada en años y no en meses.


    }
}
