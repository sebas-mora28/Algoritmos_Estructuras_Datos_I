package cr.ac.tec.oop_reportes;

import java.util.Date;
import java.util.List;

public class Reporte_Finanzas extends Reporte_Base {
    public Reporte_Finanzas(String nombre, Date fecha, List<Item> items) {
        super(nombre, fecha, items);
    }


    @Override
    public void generarReporte(){
        super.generarReporte();
        System.out.println("--------------------------------------------");
        System.out.println("EL TOTAL ES: " + total());
    }

    private float total() {
        float total = 0;
        for(Item i: items){
            total += i.getPrecio();
        }
        return total;
    }


}
