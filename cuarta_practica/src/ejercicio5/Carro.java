package ejercicio5;

public class Carro {
    /*
    Cree una clase Carro, con un campo llamado _cantidadCombustible y un método que se llame
    Encender el cual en base a la gasolina disponible mostrara si el carro pudo o no avanzar. Cada
    vez que el método se ejecute, deberá restarse 1 a la gasolina disponible. La cantidad de gasolina
    debe establecerse al momento de instanciar un objeto de del tipo de la clase.
    */

    private int cantidadCombustible;

    public Carro(int cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    public void encender(){


        if (cantidadCombustible > 0){
            System.out.println("El vehiculo pudo avanzar!");
        }else {
            System.out.println("El vehiculo no pudo avanzar");
            System.out.println("Se termino la gasolina!");
        }

        cantidadCombustible--;

    }
}
