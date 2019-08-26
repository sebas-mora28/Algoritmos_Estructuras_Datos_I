package Cajero_practica.Main;

public class Depositar extends Principal{

    @Override
    public void operacion(){
        System.out.println("Cuanto desea depositar");
        deposito = datos.nextInt();
        saldo = saldo + deposito;
        System.out.println("--------------------------------");
        System.out.println("Transacción exitosa, depositaste" + deposito);
        System.out.println("Su saldo es de: " + saldo);
        System.out.println("--------------------------------");
    }

}
