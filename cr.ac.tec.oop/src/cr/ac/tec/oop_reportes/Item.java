package cr.ac.tec.oop_reportes;

public class Item {

    private static int consecutivo = 0;
    private String id;
    private String nombre;
    private String descripción;
    private float precio;


    public Item(String nombre, String descripción, float precio) {
        this.setNombre(nombre);
        this.setDescripción(nombre);
        this.setPrecio(precio);
        this.id = "item" + ++consecutivo;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}


