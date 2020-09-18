import java.util.Arrays;

public class ejercicio3 {
    /*Cree un programa que ordene los elementos del arreglo [9,15,1,14,8,7,6,5] en orden
    ascendente, muestre la suma y el promedio de todos sus elementos.*/
    static int[] arreglo = {9,15,1,14,8,7,6,5};

    public static void main(String[] args) {

        System.out.println("La suma de todos los numeros del arreglo es: " + sumaArreglo(arreglo));
        System.out.println("El promedio de estos numeros es: " + sumaArreglo(arreglo)/8);
        System.out.println("\nAhora se mostraran de forma acendente los numeros que contiene el arreglo = ");
        ordenarArreglo();

    }

    public static int sumaArreglo(int[] arreglo){
        int suma = 0;
        for (int i:arreglo) {
            suma += i ;
        }
        return suma;
    }

    public static void ordenarArreglo(){
        Arrays.sort(arreglo);

        for(int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}
