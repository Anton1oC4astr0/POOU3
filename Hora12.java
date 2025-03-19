
package unidad3;

public class Hora12 extends Hora{
    protected enum Meridiano{am,pm};
    Meridiano mer;
    public Hora12(int hora, int min, Meridiano mer){
        super(hora,min);
        this.mer = mer;
        setHora(hora);
    }
    @Override
    public void setHora(int hora){
        if (hora  > 0 && hora <= 12){
            this.hora = hora;
        }else{
            System.out.println("Hora fuera de rango");
        }
    }
    @Override
    public void inc(){
        super.inc();
        if (hora > 12){
            hora = 1;
            mer = mer == Meridiano.am? Meridiano.pm:Meridiano.am;//operador ternario ?
        }
    }
    @Override
    public String toString(){
        String res;
        res = super.toString();
        res += ":" + mer;
        return res;
    }
}
