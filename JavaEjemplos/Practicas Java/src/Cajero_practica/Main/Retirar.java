package Cajero_practica.Main;

public class Retirar extends Principal{

    @Override
    public void operacion(){
        System.out.println("Cuanto desea retirar");
        retiro = datos.nextInt();
        saldo = saldo - retiro;
        System.out.println("--------------------------------");
        System.out.println("Transacción exitosa, retiraste" + retiro);
        System.out.println("Su saldo es de: " + saldo);
        System.out.println("--------------------------------");
    }

}
