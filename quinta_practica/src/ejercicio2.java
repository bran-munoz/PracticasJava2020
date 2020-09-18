public class ejercicio2 {

   /* 2- Declare una variable llamada [notas] que permita guardar 4 notas, asígnele los valores 90,88,92
    y 79 respectivamente.,*/

    public static void main(String[] args) {
        int[] notas = new int[4];

        notas[0] = 90;
        notas[1] = 88;
        notas[2] = 92;
        notas[3] = 79;

        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
    }


}
