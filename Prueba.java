
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
        //Metodos sobrecargados
        System.out.println("*************************************************");
        Persona persona1 = new Persona("Daniel", 33, 1.70f);
        persona1.comer();
        persona1.comer("pizza");  
        persona1.comer(3);

        System.out.println(); 

        Persona persona2 = new Persona();
        persona2.comer();
        persona2.comer("hamburguesa");
        persona2.comer(2);  
        //Constructor sobrecargado
        System.out.println("*************************************************");
        Persona persona3 = new Persona("Octavio", 24, 1.68f);
        System.out.println("Persona 3:");
        persona3.imprimir();  
        System.out.println(); 
        
        Persona persona4 = new Persona("Ana");
        System.out.println("Persona 4:");
        persona4.imprimir();  
        System.out.println();  
        
        Persona persona5 = new Persona(25);
        System.out.println("Persona 5:");
        persona5.imprimir();  
        System.out.println();  
        
        Persona persona6 = new Persona(1.80f);
        System.out.println("Persona 6:");
        persona6.imprimir();  
        System.out.println();  
        
        Persona persona7 = new Persona("Luis", 40);
        System.out.println("Persona 7:");
        persona7.imprimir();  
        System.out.println();  
        
        Persona persona8 = new Persona();
        System.out.println("Persona 8:");
        persona8.imprimir();  
    }
}