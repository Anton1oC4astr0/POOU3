
package unidad3;

public class Persona{
    public String nombre;
    public int edad;
    float estatura;
    //Sobrecarga de constructores
    public Persona(String nombre, int edad, float estatura){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 20;  // Valor predeterminado
        this.estatura = 1.70f;  // Valor predeterminado
    }
    // Constructor con solo edad
    public Persona(int edad) {
        this.nombre = "Desconocido";  // Valor predeterminado
        this.edad = edad;
        this.estatura = 1.70f;  // Valor predeterminado
    }
    // Constructor con solo estatura
    public Persona(float estatura) {
        this.nombre = "Desconocido";  // Valor predeterminado
        this.edad = 20;  // Valor predeterminado
        this.estatura = estatura;
    }
    // Constructor con nombre y edad
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = 1.70f;  // Valor predeterminado
    }
    public Persona(){
    this.nombre = "Antonio";
    this.edad = 20;
    this.estatura = 1.70f;
    }
    //Fin de sobrecarga de constructor
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
    //Sobrecarga del metodo comer 
    public void comer(){
        System.out.println(nombre + " está comiendo.");
    }
    public void comer(String comida) {
        System.out.println(nombre + " está comiendo " + comida + ".");
    }
    public void comer(int cantidad) {
        System.out.println(nombre + " está comiendo " + cantidad + " pzas.");
    }
    //Fin de sobrecarga
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