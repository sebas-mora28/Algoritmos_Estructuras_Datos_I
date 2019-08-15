package cr.ac.tec.oop_reportes;

import java.util.Date;
import java.util.List;

public class Reporte_Base {

    private String nombre;
    private Date fecha;
    protected List<Item> items;

    public Reporte_Base(String nombre, Date fecha, List<Item> items){
        this.nombre = nombre;
        this.fecha = fecha;
        this.items = items;
    }


    public void generarReporte() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(String.format("----------- Reporte: %s     fecha: %s ---------------", this.nombre, this.fecha));
        for(Item i : items){
            System.out.println(String.format(" %s\t%s\t%s\t%s", i.getId(), i.getNombre(), i.getDescripción(), i.getPrecio()));
        }
    }
}
