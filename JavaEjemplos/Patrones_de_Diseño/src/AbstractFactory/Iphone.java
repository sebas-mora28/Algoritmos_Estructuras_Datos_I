package AbstractFactory;

public class Iphone implements Phone {

    public Iphone(){
        crearPhone();
    }
    @Override
    public void crearPhone() {
        System.out.println("Se ha creado un Iphone");
    }
}
