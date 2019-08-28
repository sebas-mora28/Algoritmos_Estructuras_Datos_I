

public class Nodo {
    private Nodo siguiente;
    private Object object;



    public Nodo(Object object) {
        this.object = object;
    }


    public void enlazarNodo(Nodo nodo){

        siguiente = nodo;
    }

    public Object verDato(){

        return object;
    }


    public Nodo verSiguiente(){
        return this.siguiente;
    }
}





