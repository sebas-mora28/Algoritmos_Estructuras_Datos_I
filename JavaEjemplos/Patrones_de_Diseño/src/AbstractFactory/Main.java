package AbstractFactory;

public class Main {

    public static void main(String[] args){

        FabricaAbstracta modelo = new FabricaApple();

        Phone ToyotaModelo = modelo.createPhone();

        FabricaAbstracta modelo2 = new FabricaSamsung();

        Tablet tablet = modelo2.createTablet();


    }
}
