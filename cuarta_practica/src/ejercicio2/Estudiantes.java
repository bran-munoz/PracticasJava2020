package ejercicio2;

public class Estudiantes {
    /*Crear una clase llamada Estudiante con un campo llamado promedio, el cual solo podrá ser
    accedido mediante métodos accessores. El valor del promedio no puede estar por encima de
    100 que es la nota máxima.*/

    protected String nombre;
    protected String apellido;
    protected String curso;
    protected double promedio;

    public void Promedio(int nota1, int nota2, int nota3, int nota4){
        this.promedio = (nota1 + nota2 + nota3 + nota4) /4;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        System.out.println("Curso: "+ curso);
        System.out.println("Promedio: "+ promedio);
    }
}
