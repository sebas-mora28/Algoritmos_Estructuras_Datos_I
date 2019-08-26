package Factory;

public class Toyota implements Car {

    @Override
    public void info() {
        System.out.println("Se ha creado un TOYOTA" );
        System.out.println("El precio es de $45000" );
    }
}
