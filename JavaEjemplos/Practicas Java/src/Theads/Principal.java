package Theads;

public class Principal {

    public static void main(String[] args){

        Prueba hilo1 = new Prueba("hilo1");
        Prueba hilo2 = new Prueba("hilo2");


        hilo1.CondicionInicial(8);
        hilo2.CondicionInicial(15);

        hilo1.start();


        try{
            System.out.println("Se detuvo el hilo por un segundo");
            hilo1.sleep(1000);

        }catch (InterruptedException e){
            System.out.println("Ocurrio un error");
        }

        hilo2.start();
    }


}
