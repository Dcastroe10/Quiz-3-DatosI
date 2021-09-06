public class Queue {
    private Doublelinked queue = new Doublelinked();
    public void Enqueue(Object data){
        this.queue.insertar(data);
    }

    public void Dequeue(){
        this.queue.dele_first();
    }

    public void Peak(){
        queue.see();
    }

    public void print(){
        this.queue.print_list();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.Enqueue(5);
        queue.Enqueue(8);
        queue.Enqueue(3);
        queue.Enqueue(12);
        queue.Enqueue(0);
        queue.Enqueue(89);
        queue.Enqueue(77);
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();
        queue.print();
    }
}

//Los resultados obtenidos son los esperados, se imprimen los números 12,0,89,77 en ese orden
//luego de agregar todos los números y desencolar 3
//esto debido a que cuando agregamos un elemento a la lista doblemente enlazada lo agregamos al final
// y cuando desencolamos un elemento sustituimos la cabeza de la lista por el siguiente nodo
