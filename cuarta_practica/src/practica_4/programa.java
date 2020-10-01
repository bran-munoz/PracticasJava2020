package practica_4;

import ejercicio2.Estudiantes;
import ejercicio3.Aritmetica;
import ejercicio5.Carro;

import java.util.Scanner;

public class programa {

    public static void main(String[] args) {
        /*Aritmetica resultado1 = new Aritmetica();
        System.out.println(resultado1.getSuma(100,96));
        System.out.println(resultado1.getResta(100,96));
        System.out.println(resultado1.getMultiplicacio(100,96));
        System.out.println(resultado1.getDivicion(100,96));*/
        Scanner sn = new Scanner(System.in);
        int decicion;

        Carro vehiculo = new Carro(5);

        System.out.printf("Para probar el vehiculo pulse 1.");
        decicion = sn.nextInt();

        while (decicion == 1){

            vehiculo.encender();
            System.out.println("Desea probar otra vez? ");
            System.out.println("1. si");
            System.out.println("2. no");

            decicion = sn.nextInt();
        }

    }
}
