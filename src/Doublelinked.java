public class Doublelinked {

    private Node head = null;
    private Node end = null;
    private int lenght = 0;

    public void insertar (Object data) {
        Node nuevo = new Node(data);
        if (head == null) {
            head = nuevo;
            end = head;
            this.lenght++;
        } else {
            Node aux = end;
            end = nuevo;
            end.setPrevious(aux);
            aux.setNext(end);
            this.lenght++;
        }
    }

    public void dele_first(){
        head = head.getNext();
    }

    public void see(){
        System.out.println(head.getInfo());
    }


    public void print_list(){
        Node aux = head;
        while (aux != null){
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
    }

    public void print_reversed(){
        Node aux = end;
        while (aux!=null){
            System.out.println(aux.getInfo());
            aux = aux.getPrevious();
        }
    }

    public void size(){
        System.out.println(lenght);
    }



}

