import java.util.LinkedList;
import java.util.List;

public class MyQueue<E> {
    private LinkedList<E> elements ; // sử dụng linkedlist

    public MyQueue() {
        elements = new LinkedList<>();
    }

    public void enqueue(E e){
        elements.addFirst(e);
        // 4,3,2,1
    }
    public E dequeue(){
        return elements.removeLast();
    }
    public boolean isEmpty(){
        return elements.isEmpty();
    }
}
