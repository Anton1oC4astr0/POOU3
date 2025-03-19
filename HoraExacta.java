
package unidad3;

public class HoraExacta extends Hora{
    int seg;
    public HoraExacta(int hora, int min, int seg){
        super(hora, min);
        this.seg = seg;
        setSeg(seg);
    }
    public void setSeg(int seg){
        if (seg >= 0 && seg < 60){
            this.seg = seg;
        }
    }
    @Override
    public void inc(){
        seg++;
        if (seg > 60){
            this.seg = 0;
            super.inc();
        }
    }
    @Override
    public String toString(){
        String res = super.toString();
        res += ":" + seg;
        return res;
    }
    @Override
    public boolean equals(Object obj){
        HoraExacta otra = (HoraExacta)obj;
        boolean iguales;
        if (this.hora == otra.hora && this.min == otra.min && this.seg == otra.seg){
            iguales = true;
        }else{
            iguales = false;
        }
        return iguales;
    }
}
