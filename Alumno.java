
package unidad3;

public class Alumno extends Persona{//extends - Alumno es una extención de la clase persona(clase padre)
int calif;
int numControl;
    public Alumno(int calif, int numControl, String nombre, int edad, float estatura){
        super(nombre, edad, estatura);
        this.calif = calif;
        this.numControl = numControl;
    }
    public void imprimirAlumno(){
        mostrarDatos();
        System.out.println("No. de control: " + numControl);
        System.out.println("Calificación: " + calif);
    }
}
