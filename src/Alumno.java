public class Alumno {
   /* La clase tiene un atributo tipo String y un atributo tipo array que almacena valores numéricos.*/
    private String nombre;
    private double[] calificaciones;

   /*El atributo tipo String almacenará el nombre del Alumnno.
     El atributo tipo array almacenará las calificaciones del alumno.*/
    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

   /*Este método calcula el promedio de las cinco calificaciones.
     Recibe el array con las calificaciones y regresa un valor numérico.*/
    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    /*Este método obtene la calificación final del participante y a partir del promedio asignará la calificación
      de acuerdo a la siguiente tabla
         Menor o igual a 50 F
         Mayor o igual a 51 y menor o igual a 60 E
         Mayor o igual a 61 y menor o igual a 70 D
         Mayor o igual a 71 y menor o igual a 80 C
         Mayor o igual a 81 y menor o igual a 90 B
         Mayor o igual a 91 y menor o igual a 100 A*/
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio >= 91 && promedio <= 100) {
            return 'A';
        } else if (promedio >= 81 && promedio <= 90) {
            return 'B';
        } else if (promedio >= 71 && promedio <= 80) {
            return 'C';
        } else if (promedio >= 61 && promedio <= 70) {
            return 'D';
        } else {
            return 'F';
        }
    }

    /* Este método imprimirá en pantalla los resultados del programa con el siguiente formato
       Nombre
       Promedio
       Calificación */
    public void imprimirResultados() {
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);

        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación Final: " + calificacionFinal);
    }
    /* Metodo main, como no se especifica si es necesario capturar en pantalla los datos se hacen las siguientes operaciones
    *   1.- Se inicializa el arreglo con las calificaciones
    *   2.- Se asigna el nombre del alumno
    *   3.- Se imprime el resultado*/
    public static void main(String[] args) {
        double[] calificaciones = { 90, 90, 100, 90, 90 };
        Alumno alumno = new Alumno("Manuel Iglesias", calificaciones);
        alumno.imprimirResultados();
    }
}