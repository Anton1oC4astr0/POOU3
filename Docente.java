
package unidad3;

public class Docente extends Persona{
    float sueldo;
    String estatura;
    public Docente(){
        this.estatura = "mediana";
        this.sueldo = 15038.25f;
    }
    public float atributoFlotante(){
        return super.estatura;
    }
}