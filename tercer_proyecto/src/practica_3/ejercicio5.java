package practica_3;
import Helppers.helpper;

public class ejercicio5 {

    public static void main(String[] args){
        /*Hacer una función que reciba un numero de mes y retorne el nombre del mes
        correspondiente a ese número. Ejemplo, si ingresa 4, debe retornar ABRIL*/

        System.out.println("Ejercicio 5");
        System.out.println("Los meses del año.");
        System.out.printf("Ingrese un numero: ");
        int numeroMes = helpper.entrada().nextInt();

        if(numeroMes > 0 & numeroMes < 13)
            Meses(numeroMes);
        else{
            System.out.println("El numero ingresado no corresponde a ningun mes del año.");
        }
    }

    public static void Meses(int nunMes){

        switch (nunMes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
        }
    }
}
