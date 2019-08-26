package Poliformismo2;

import java.util.Scanner;

public abstract class Clase_Padre {

    protected int Valor1, Valor2, resultado;
    protected Scanner datos = new Scanner(System.in);

    public void PedirDatos(){

        System.out.print("Ingrese el primero valor: ");
        Valor1 = datos.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        Valor2 = datos.nextInt();

    }

    public abstract void operacion();

    public void MostrarResultados() {
        System.out.println("El resultado de la operacion es: " + resultado);

    }
}
