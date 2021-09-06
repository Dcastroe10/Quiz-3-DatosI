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
