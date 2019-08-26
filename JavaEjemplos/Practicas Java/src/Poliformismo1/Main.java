package Poliformismo1;

import Poliformismo2.Clase_Hija_resta;
import Poliformismo2.Clase_Hija_suma;
import Poliformismo2.Clase_Padre;

public class Main {

    public static void main(String[] args){

        Clase_Padre suma = new Clase_Hija_suma();
        suma.PedirDatos();
        suma.operacion();
        suma.MostrarResultados();


        Clase_Padre resta = new Clase_Hija_resta();
        resta.PedirDatos();
        resta.operacion();
        resta.MostrarResultados();
    }
}
