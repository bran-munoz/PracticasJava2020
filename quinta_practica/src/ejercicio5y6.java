

public class ejercicio5y6 {
    /*5- Realice un programa que calcule el producto vectorial de dos vectores A = (2,4,6) y B = (1,3,5)
      6- Con los vectores dados en el ejercicio anterior Calcule el producto escalar*/
    static int[] a = {2,4,6};
    static int[] b = {1,3,5};
    static int i, j, k;

    public static void main(String[] args) {
        System.out.println("Ejercicio 5 y 6: Producto vectorial y escalar.");
        System.out.println("De los vectores dados A = {2,4,6} y B = {1,3,5}");
        productoVectorial();
        productoEscalar();

    }

    public static void productoVectorial(){
        int producto[] = new int[3];
        i = (a[1]*b[2] - b[1]*a[2]);
        j = (a[0]*b[2] - b[0]*a[2]);
        k = (a[0]*b[1] - b[0]*a[1]);

        producto[0] = i;
        producto[1] = j;
        producto[2] = k;

        System.out.println("El producto de estos vectores es = {" + producto[0] + "," +producto[1] + "," + producto[2] + "}");
    }
    //A = (2,4,6) y B = (1,3,5)
    public static void productoEscalar(){
        i = (a[0] * b[0]);
        j = (a[1] * b[1]);
        k = (a[2] * b[2]);

        int producEscalar = i + j + k;

        System.out.println("El producto escalar de estos vectores es = " + producEscalar);
    }
}