
package unidad3;

public class Persona{
    public String nombre;
    public int edad;
    float estatura;
    public Persona(String nombre, int edad, float estatura){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    public Persona(){
    this.nombre = "Antonio";
    this.edad = 20;
    this.estatura = 1.70f;
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
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }
}