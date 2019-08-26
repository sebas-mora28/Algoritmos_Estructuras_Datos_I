package Theads;

public class Prueba extends Thread {
    int num;

    public Prueba(String nombreHilo){
        super(nombreHilo);

    }

    @Override
    public void run(){
        for(int i =0; i<=num; i++){
            System.out.println(2*(i^2) +6*i + -3 +" " + getName());
        }
    }

    /** Si se desea utilizar threads con parametros se debe de crear un nuevo metodo para asignar el valor
     de la condicion inical y se debe de establecer en la clase en donde se va a llmar el hilo, antes de empezar
     este */

    public void CondicionInicial(int valor){

        this.num = valor;
    }



}
