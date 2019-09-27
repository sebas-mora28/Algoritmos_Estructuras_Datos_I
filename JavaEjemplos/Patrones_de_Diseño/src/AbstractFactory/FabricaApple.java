package AbstractFactory;

public class FabricaApple implements FabricaAbstracta{
    @Override
    public Phone createPhone() {
        return new Iphone() ;
    }


    @Override
    public Tablet createTablet() {
        return new Ipad();
    }

}
