package AbstractFactory;

public class GalaxyTab implements Tablet {

    public GalaxyTab(){
        crearTablet();
    }

    @Override
    public void crearTablet() {
        System.out.println("Se ha creado una Samsung Galaxy Tab");

    }
}
