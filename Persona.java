
package unidad3;

public class Persona{
    private String nombre;
    private int edad;
    private float estatura;
    public Persona(String nombre, int edad, float estatura){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public float getEstatura(){
        return estatura;
    }
    public void setEstatura(float estatura){
        this.estatura = estatura;
    }
    public void comer(){
        System.out.println("La persona está comiendo");
    }
    public void dormir(){
        System.out.println("La persona está durmiendo");
    }
    public void respirar(){
        System.out.println("La persona está respirando");
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }
}
