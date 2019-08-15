import cr.ac.tec.oop_reportes.Item;
import cr.ac.tec.oop_reportes.Reporte_Base;
import cr.ac.tec.oop_reportes.Reporte_Finanzas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Item> items = new ArrayList<>();

        for(int i=0; i<10; i++){
            items.add(new Item("Name", "Description", 500));
        }
        Reporte_Base reporte = new Reporte_Finanzas("1", new Date(), items);
        reporte.generarReporte();


    }
}
