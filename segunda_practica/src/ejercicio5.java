import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        /*Escriba un programa que dado un monto disponible de RD$18,765.43 pesos, pueda realizar
        retiros. El monto del retiro lo ingresará el usuario por teclado. El sistema debe evaluar si el
        monto solicitado se puede retirar (si el retiro excede al monto disponible, no se puede hacer el
                retiro) Al final debe mostrar por pantalla el monto disponible después del retiro.*/
        double montoDis = 18765.43;
        double montoRet;

        System.out.println("Ejercicio 5");
        while (montoDis != 0) {
            System.out.println("EL saldo disponible a retirar es " + montoDis);
            System.out.println("A continuacion ingrese el monto a retirar");
            montoRet = entrada.nextInt();

            if(montoRet > montoDis){
                System.out.println("El monto que desea retirar excede del monto disponible");
                break;
            }else {
                montoDis = montoDis - montoRet;
                System.out.println("El retiro se realizo satisfactoriamente");
                System.out.println("Su nuevo saldo es: "+montoDis);
            }
        }
    }
}
