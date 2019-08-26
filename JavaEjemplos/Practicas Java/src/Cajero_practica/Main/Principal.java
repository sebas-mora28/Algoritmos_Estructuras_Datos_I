package Cajero_practica.Main;

import java.util.Scanner;

public abstract class Principal {

    protected int deposito, retiro, saldo=500;
    private int flag=0, transferencia_elegida;
    public Scanner datos = new  Scanner(System.in);


    public void iniciar(){
        do{
            do{
                System.out.println("Escoga la operacion que desea elegir \n" +
                        "1. Consultador saldo  \n" +
                        "2. Deposita efectivo  \n" +
                        "3. Retirar efectivo  \n" +
                        "4. Salir");

                transferencia_elegida = datos.nextInt();

                if (transferencia_elegida >=1 && transferencia_elegida <=4){
                    if(transferencia_elegida == 1){
                        System.out.println("Su saldo es de: " + saldo);
                    }
                    if(transferencia_elegida == 2){
                        Principal retirar = new Retirar();
                        retirar.operacion();

                    }
                    if(transferencia_elegida == 3){
                        Principal depositar = new Depositar();
                        depositar.operacion();

                    }
                    if(transferencia_elegida == 4){
                        flag = 2;

                    }
                }else{
                    System.out.println("-------------------------------");
                    System.out.println("Operacion incorrecta, eliga nuevamente");
                    System.out.println("-------------------------------");
                }

            }while(flag==0);


        }while(flag !=2);
    }

    public abstract void operacion();
}
