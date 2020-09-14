package practica_3;
import Helppers.helpper;

public class ejercicio9 {
    /*Cree una aplicación de cajero automático para el banco ABC. El cajero tendrá un límite
    de billetes descrito a continuación: 9 de 1000, 19 de 500, 99 de 100*/

    public static void main(String[] args){

        cajero();
    }

    public static void cajero(){

        int billetes_mil = 0;
        int billetes_Quinientos = 0;


        System.out.println("Ejercicio 9");
        System.out.println("Cantidad disponible en el cajero: 28,400 ");
        System.out.println("Ingrese el monto que desea retirar del cajero: ");
        int monto_pedido = helpper.entrada().nextInt();

        if(monto_pedido > 28400){
            System.out.println("No hay billetes suficientes para esta operacion. ");
        }

        while (monto_pedido <= 28400) {

            System.out.println("Usted resivira: ");

            int limite_mil = monto_pedido % 1000;

            if (limite_mil >= 9) {
                monto_pedido = monto_pedido - 9000;
                System.out.println("9 billetes de mil");
            } else {
                billetes_mil = monto_pedido / 1000;
                monto_pedido = monto_pedido % 1000;
                System.out.println(billetes_mil + " billetes de mil");
            }

            int limite_quinientos = monto_pedido / 500;
            if (limite_quinientos >= 19) {
                monto_pedido = monto_pedido - 9500;
                System.out.println("19 billetes de 500");
            } else {
                billetes_Quinientos = monto_pedido / 500;
                monto_pedido = monto_pedido % 500;
                System.out.println(billetes_Quinientos + " billetes de quinientos");
            }

            System.out.println((monto_pedido / 100) + " billetes de cien");
            System.out.println("Gracias por preferirnos ");
            break;
        }
    }
}
