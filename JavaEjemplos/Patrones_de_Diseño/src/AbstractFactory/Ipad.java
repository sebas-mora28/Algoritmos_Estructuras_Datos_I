package AbstractFactory;

public class Ipad implements Tablet {


    public Ipad(){
        crearTablet();
    }
    @Override
    public void crearTablet() {
        System.out.println("Se crea una Ipad");
    }
}