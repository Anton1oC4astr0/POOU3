
package unidad3;

public class Hora{
    protected int hora, min;
    public Hora(int hora, int min){
        this.hora = hora;
        this.min = min;
        setHora(hora);
        setMin(min);
    }
    public void setHora(int hora){
        if (hora >= 0 && hora <= 23){
            this.hora = hora;
        }
    }
    public void setMin(int min){
        if (min >= 0 && min < 60){
            this.min = min;
        }
    }
    public void inc(){
        min++;
        if (min > 60) { 
            min = 0;
        }
         hora++;
            if (hora > 23) {
                hora = 0;
            }
    }
    @Override
    public String toString(){
        String res;
        res = hora + ":" + min;
        return res;
    }
}
