package ListasEnlazadasDobles;

public class Main {

    public static void main(String[] args){
        ListaEnlazadaDoble lista = new ListaEnlazadaDoble();

        lista.addFirst(5);
        lista.addFirst(78);
        lista.addFirst(14);
        lista.addFirst(248);

        lista.print();
    }
}
