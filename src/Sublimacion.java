public class Sublimacion {
    private String nombre;
    private String combinacion;
    private String categoria;
    private String efecto;

    public Sublimacion(String nombre, String combinacion, String categoria, String efecto) {
        setNombre(nombre);
        setCombinacion(combinacion);
        setCategoria(categoria);
        setEfecto(efecto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCombinacion() {
        return combinacion;
    }

    public void setCombinacion(String combinacion) {
        this.combinacion = combinacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    @Override
    public String toString() {
        return "Nombre de la subli: " + getNombre() + " combinacion de colores: "
                + getCombinacion() + " efecto: " + getEfecto() + " categoria: " + getCategoria();
    }
}
