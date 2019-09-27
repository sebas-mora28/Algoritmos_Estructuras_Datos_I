package AbstractFactory;

public class FabricaSamsung implements FabricaAbstracta{

    @Override
    public Phone createPhone() {
        return new GalaxyS10();
    }

    @Override
    public Tablet createTablet() {
        return new GalaxyTab();
    }

}
