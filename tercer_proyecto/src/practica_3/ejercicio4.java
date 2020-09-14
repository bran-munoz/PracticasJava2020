package practica_3;
import Helppers.helpper;

public class ejercicio4 {

    public static void main(String[] args){
        /*- Cree un método (función) que reciba un numero como parámetro de entrada y retorne
         *  este número duplicado. Ejemplo: si ingresa 3, debe retornar 6.
         */
        System.out.println("Ejercicio 4");
        System.out.println("Introduzca un numero: ");
        int numero = helpper.entrada().nextInt();
        Multiplos(numero);

    }
    public static void Multiplos(int numero){
        int numeroF = numero * 2;

        System.out.println("El duplo de "+numero+ " es :"+numeroF);
    }
}
