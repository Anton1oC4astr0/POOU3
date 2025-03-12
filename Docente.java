
package unidad3;

public class Docente extends Persona{
    float sueldo;
    public Docente(float sueldo, String nombre, int edad, float estatura){
        super(nombre, edad, estatura);
        this.sueldo = sueldo;
    }
}
