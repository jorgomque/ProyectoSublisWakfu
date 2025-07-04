import java.util.ArrayList;
public class Archivo {
     private ArrayList<Sublimacion> lista;

    public Archivo() {
        this.lista = new ArrayList<>();
    }

    public void nuevaSubli(String nombre, String combinacion, String categoria, String efecto){
        this.lista.add(new Sublimacion(  nombre,  combinacion,  categoria, efecto));
    }
}
