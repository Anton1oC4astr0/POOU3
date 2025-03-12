
package unidad3;

public class Prueba{

    public static void main(String[] args){
        //Persona p1 = new Persona("Daniel", 33, 1.7f);
        //System.out.println("Nombre: " + p1.getNombre());
        Alumno a1 = new Alumno(80, 23280688, "Antonio", 20, 1.70f);
        System.out.println("Nombre: " + a1.getNombre());
        a1.comer();
        System.out.println("*************************************************");
        a1.imprimirAlumno();
    }
}
