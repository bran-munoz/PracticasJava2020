package practica_3;
import Helppers.helpper;

public class ejercicio8 {
    /*Realizar un programa que reciba por teclado el sueldo de un empleado y le aplique los
    cálculos de ISR (ver tabla DGII), ARS, y AFP (investigar porcentajes)*/
    public static void main(String[] args){
        SueldoNeto();
    }

    public static void SueldoNeto(){
        double sueldo = helpper.entrada().nextDouble();
        double afp = sueldo * 0.0287;
        double ars = sueldo * 0.0304;
        double irs;
        double sueldo_neto = sueldo - (ars + afp);
        double sueldo_anual = sueldo_neto * 12;

        if(sueldo_anual <= 416220.00){
            System.out.println("Impuestos deducidos de su salario:");
            System.out.println("AFP: "+ afp);
            System.out.println("ARS: "+ ars);
            System.out.println("IRS: sted esta exento de este impuesto.");
        }
        if(sueldo_anual >= 416220.01 & sueldo_anual <= 624329.00){
            irs = (sueldo_anual - 416220.01) * 0.15;
            System.out.println("Impuestos deducidos de su salario:");
            System.out.println("AFP: "+ afp);
            System.out.println("ARS: "+ ars);
            System.out.printf("IRS: %.2f", irs/12);
        }
        if(sueldo_anual >= 624329.01 & sueldo_anual <= 867123.00){
            irs = (sueldo_anual - 624329.01) * 0.20 + 31216;
            System.out.println("Impuestos deducidos de su salario:");
            System.out.println("AFP: "+ afp);
            System.out.println("ARS: "+ ars);
            System.out.printf("IRS: %.2f", irs/12);
        }
        if(sueldo_anual >= 867123.01){
            irs = (sueldo_anual - 867123.01) * 0.25 + 79776;
            System.out.println("Impuestos deducidos de su salario:");
            System.out.println("AFP: "+ afp);
            System.out.println("ARS: "+ ars);
            System.out.printf("IRS: %.2f", irs/12);
        }
    }

}
