package ListasEnlazadasSimples;

public class Listas_Enlazada {

    private Nodo head;
    private int length;


    public Listas_Enlazada(){
        this.head = null;
        this.length = 0;

    }


    public boolean is_empty(){
        if(head==null){
            return true;
        }else{
            return false;
        }
    }

    public void addNodo(Object object){
        if(head==null){
            head= new Nodo(object);
        }else{
            Nodo temp = head;
            Nodo newNodo = new Nodo(object);
            newNodo.enlazarNodo(temp);
            head = newNodo;
        }

    }

    public void showdata(){
        Nodo nodo = head;
        while(nodo!=null){
            System.out.println(nodo.verDato());
            nodo = head.verSiguiente();
        }
    }
}