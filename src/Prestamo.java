import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    private ArrayList<Prestamo>prestamos;

    public Prestamo() {
        this.prestamos =new ArrayList<Prestamo>();
    }
    public String toString(){
        String cadena="";
         for (Prestamo contador : prestamos)
            cadena+=contador.toString()+ "\n";
         return cadena;
        }
}

