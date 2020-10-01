package ejercicio3;

public class Aritmetica {

    protected double suma;
    protected double resta;
    protected double multiplicacio;
    protected double divicion;

    public double getDivicion(double n1, double n2) {
        divicion = n1 / n2;
        return divicion;
    }

    public double getMultiplicacio(double n1, double n2) {
        multiplicacio = n1 * n2;
        return multiplicacio;
    }

    public double getResta(double n1, double n2) {
        resta = n1 - n2;
        return resta;
    }

    public double getSuma(double n1, double n2) {
        suma = n1 + n2;
        return suma;
    }
}
