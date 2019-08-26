package Factory;

import Singleton.Persona;

public class Main {

    public static void main(String[] args) {


        Car carro1 = new Cars_factory().create_car(Cars_factory.CarType.TOYOTA);
        carro1.info();

    }

}
