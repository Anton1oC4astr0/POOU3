
package unidad3;

public class pruebaHora{

    public static void main(String[] args){
        /*Hora h = new Hora(11, 30);
        System.out.println(h);
        for (int i = 0; i <= 60; i++){
            h.inc(); 
        }
        System.out.println(h);
        h.setHora(20);
        System.out.println(h);*/
        /*Hora h = new Hora12(12, 30, Hora12.Meridiano.am);
        System.out.println(h);
        for (int i = 0; i <= 60; i++){
            h.inc();
        }
        System.out.println(h);
        h.setHora(20);
        System.out.println(h);*/
        HoraExacta h1 = new HoraExacta(11, 30, 58);
        HoraExacta h2 = new HoraExacta(11, 30, 58);
        /*System.out.println(h);
        for (int i = 0; i <= 60; i++){
            h.inc();
        }
        System.out.println(h);
        h.setHora(20);
        System.out.println(h);*/
        if (h1.equals(h2)){
            System.out.println("Hora, minuto y segundo iguales");
        }else{
            System.out.println("NO son iguales");
        }
    }
}
