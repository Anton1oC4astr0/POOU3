
package unidad3;

public class Alumno extends Persona{//extends - Alumno es una extenci�n de la clase persona(clase padre), hay una herencia.
int calif;
int numControl;
    public Alumno(int calif, int numControl, String nombre, int edad, float estatura){
        super(nombre, edad, estatura);
        this.calif = calif;
        this.numControl = numControl;
    }
    /*public void imprimirAlumno(){
        imprimir();
        System.out.println("No. de control: " + numControl);
        System.out.println("Calificaci�n: " + calif);
    }*/
/*@Override//Sobreescribir un metodo que ya existe, pero agregandole lo que hace falta
    public void imprimir(){
        super.imprimir();//Llama a imprimir de la clase padre, ya que tienen el mismo nombre
        System.out.println("No. de control: " + numControl);
        System.out.println("Calificaci�n: " + calif);
    }*/
    @Override
    public String toString(){
    return "Nombre: "+ nombre +"\nEdad: "+ edad +"\nEstatura: "+ estatura +"\nCalificaci�n: "+ calif +"\nNum. Control: "+ numControl;
    }
}
//Todas las clases se dereivan de Object (extends Object), aunque no se le ponga, esta implicito
/*toString: Es un m�todo de la clase base Object, que es la clase de la que heredan todas las clases en Java.
 Este m�todo tiene la finalidad de devolver una representaci�n en forma de cadena (string) del objeto.*/