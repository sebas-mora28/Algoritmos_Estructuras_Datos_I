package AbstractFactory;

public class GalaxyS10 implements Phone{

    public GalaxyS10(){
        crearPhone();

    }

    @Override
    public void crearPhone() {
        System.out.println("Se ha creado un Galaxy S10");

    }
}
