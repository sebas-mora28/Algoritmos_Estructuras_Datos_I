package ListasEnlazadasDobles;

public class Node {
    public Node next;
    public Node prev;
    public int data;


    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}
