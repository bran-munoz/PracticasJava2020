package practica_3;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.jcp.xml.dsig.internal.SignerOutputStream;

public class ejercicio7 {

    /*Hacer un programa que genere las tablas de multiplicar de los números múltiplos de 5
    que hay entre 1 y 1000*/
    public static void main(String[] args) {
        for(int i=5;i <= 1000;i+=5){
            TablasMulti(i);
        }
    }

    public static void TablasMulti(int numero){
        System.out.println("***************************************************");
        System.out.println("Tabla del "+numero);
        System.out.println("1 X "+numero +" = "+ 1 * numero);
        System.out.println("2 X "+numero +" = "+ 2 * numero);
        System.out.println("3 X "+numero +" = "+ 3 * numero);
        System.out.println("4 X "+numero +" = "+ 4 * numero);
        System.out.println("5 X "+numero +" = "+ 5 * numero);
        System.out.println("6 X "+numero +" = "+ 6 * numero);
        System.out.println("7 X "+numero +" = "+ 7 * numero);
        System.out.println("8 X "+numero +" = "+ 8 * numero);
        System.out.println("9 X "+numero +" = "+ 9 * numero);
        System.out.println("10 X "+numero +" = "+ 10 * numero);
        System.out.println("11 X "+numero +" = "+ 11 * numero);
        System.out.println("12 X "+numero +" = "+ 12 * numero);
        System.out.println("***************************************************\n");
    }
}
