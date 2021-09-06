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
    public static void main(String[] args) {
        Doublelinked lista = new Doublelinked();
        lista.insertar(23);
        lista.insertar(24);
        lista.insertar(25);
        lista.insertar(26);
        lista.insertar(27);
        lista.print_list();
        System.out.println("----------------------");
        lista.print_reversed();
        lista.size();

    }
}

