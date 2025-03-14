
package unidad3;

public class Prueba{

    public static void main(String[] args){
        //Persona p1 = new Persona("Daniel", 33, 1.7f);
        //System.out.println("Nombre: " + p1.getNombre());
        Alumno a1 = new Alumno(100, 23280688, "Daniel", 33, 1.70f);
        System.out.println("Nombre: " + a1.getNombre());
        a1.comer();
        System.out.println("*************************************************");
        a1.imprimir();
        System.out.println("*************************************************");
        Docente d = new Docente();
        System.out.println("Estatura de clase derivada: " + d.estatura);
        System.out.println("Estatura de clase padre: " + d.atributoFlotante());
        //Los constructores no se heredan, se invocan
        System.out.println("*************************************************");
        Alumno a2 = new Alumno(80, 23280688, "Antonio", 20, 1.70f);
        System.out.println(a2);
    }
}