public class DocumentoOfimatico {
    private String nombre;
    private Tamano tamano;
    private static enum Tamano{
        TAMANO,
        UNIDAD
    }

    public DocumentoOfimatico(String nombre, Tamano tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "DocumentoOfimatico{" +
                "nombre='" + nombre + '\'' +
                ", tamano=" + tamano +
                '}';
    }
}

