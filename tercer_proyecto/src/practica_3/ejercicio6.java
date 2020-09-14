package practica_3;
import Helppers.helpper;

public class ejercicio6 {
    /*Realizar un programa que presente un menú con las siguientes opciones (usar funciones)
1-Convertir grados a Celsius a Fahrenheit
2-Convertir dólar a pesos
3-Convertir metros a pies
4-Salir
    Cada vez que finalice una de estas acciones debe regresar al menú. El programa solo
    finalizará cuando el usuario elija la opción salir.*/


    public static void main(String[] args){
        int numeroMenu;

        Menu();
        numeroMenu = helpper.entrada().nextInt();

        do{
            if(numeroMenu == 1){
                GradosCelcius();
                Menu();
                numeroMenu = helpper.entrada().nextInt();
            }
            else if (numeroMenu == 2){
                ConvertDolar();
                Menu();
                numeroMenu = helpper.entrada().nextInt();
            }
            else if (numeroMenu == 3){
                ConvertMetros();
                Menu();
                numeroMenu = helpper.entrada().nextInt();
            }
            else if (numeroMenu > 4){
                System.out.println("***INGRESE UN NUMERO CORRECTO***");
                Menu();
                numeroMenu = helpper.entrada().nextInt();
            }
        }while (numeroMenu != 4);

    }
    // (C × 9/5) + 32
    public static void GradosCelcius(){
        System.out.println("Convertir grados a Celsius a Fahrenheit");
        System.out.printf("Introduzca los grados a convertir: ");
        double grados = helpper.entrada().nextInt();

        double calculo = (grados * 9/5 )+32;
        System.out.println(grados+"° Celsius son iguales a "+calculo+"° fahrenheit\n\n");

    }

    public static void ConvertDolar(){
        double calculo;
        System.out.println("Convertir Dolares a Pesos");
        System.out.printf("Introduzca el monto a convertir: ");
        double monto = helpper.entrada().nextInt();

        calculo = monto * 58.80;
        System.out.println(monto + " Dolares en Pesos son: "+ calculo+"\n\n");
    }

    public static void ConvertMetros(){
        System.out.println("Convertir metros a pies");
        System.out.printf("Introduzca los metros a convertir: ");
        double metro = helpper.entrada().nextInt();

        double pies = metro * 3.281;
        System.out.println(metro + " Metros son iguales a "+pies+ " pies.\n\n");
    }

    public static void Menu(){
        System.out.println("Ejercicio 6");
        System.out.println("1-Convertir grados a Celsius a Fahrenheit");
        System.out.println("2-Convertir dólar a pesos");
        System.out.println("3-Convertir metros a pies");
        System.out.println("4-Salir");
    }
}
