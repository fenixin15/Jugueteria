public class Juguete {
    private String marca;
    private String nombre;
    private String descripcion;
    private String tipo;
    private String rangoEdad;
    private int cantidad;

    // Constructor
    public Juguete(String marca, String nombre, String descripcion, String tipo, String rangoEdad, int cantidad) {
        this.marca = marca;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.rangoEdad = rangoEdad;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
