package ListasEnlazadasDobles;

public class ListaEnlazadaDoble {
    private Node first;
    private Node prev;



    public ListaEnlazadaDoble(){}


    public void addFirst(int element){
        if(this.first ==null){
            this.first = new Node(element);
        }else{
            Node n = new Node(element);
            n.next = this.first;
            this.first.prev = n;
            this.first = n;
        }
    }


    public void addLast(int element){
        if(this.first==null){
            this.first = new Node(element);
        }else{
            Node temp = this.first;
            while(temp.next != null){
                temp = temp.next;
            }
            Node newNode = new Node(element);
            newNode.next = temp;
            temp.prev = newNode;
        }
    }

    private void removeFirst(){

    }

    public void print(){
        Node node = this.first;
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }







}
