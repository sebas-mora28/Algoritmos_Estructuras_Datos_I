package Factory;

import java.util.Scanner;

public class Cars_factory {




    public static Car create_car(CarType d) {

        if (d == CarType.TOYOTA) {
            return new Toyota();
        } else if (d == CarType.NISSA) {
            return new Nissan();
        } else if (d == CarType.MAZDA) {
            return new Mazda();
        }
        return null;
    }



    enum CarType {
        TOYOTA,
        NISSA,
        MAZDA
    }
}
