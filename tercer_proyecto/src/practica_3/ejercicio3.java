package practica_3;
import Helppers.helpper;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class ejercicio3 {

    public static void main(String[] args){

        /*- Cree un método que reciba como parámetro un nombre de usuario y una clave, y
        retorne verdadero solo cuando el usuario sea ‘admin’ y la clave ‘1234’. El programa
        debe pedir los datos hasta que sean verdaderos o haya realizado 3 intentos.*/

        verificacion();

    }

    public static void verificacion(){

        int intentos = 1;
        System.out.println("Ejercicio 3 ");

        while (intentos <=3){

            System.out.println("Ingrese su nombre de usuario: ");
            String name = helpper.entrada().nextLine();
            System.out.println("Ingrese su contraseña: ");
            String pass = helpper.entrada().nextLine();

            if(name.equals("admin") && pass.equals("1234")){
                System.out.println("Verdadero");
                break;
            }
            else if(intentos == 3){
                System.out.println("Intentos excedidos.");
                break;
            }
            else{
                System.out.println("Intente otra vez: ");
            }

            intentos ++;
        }
    }
}
