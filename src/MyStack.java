public class MyStack<E> {
    private final int INITIAL_CAPACITY = 16;
    private E[] elements; // array
    private int size ;

    public MyStack() {
        elements = (E[])new Object[INITIAL_CAPACITY];
    }
    public void push(E e){
        // kiểm tra và tăng giới hạn lên
        ensureCapacity();
        elements[size] = e;
        size++;
    }
    // tăng giới han số lượng phần tử mảng lên
    private void ensureCapacity() {
        if(size>=elements.length){
            E[] newElements  = (E[]) new Object[elements.length * 2 + 1];
            System.arraycopy(elements,0,newElements,0,size);
            elements= newElements;
        }
    }
    public E pop(){
        if(size == 0){
//            stack rỗng
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        // lấy ra phần tử được thêm cuối cùng
        E e = elements[size-1];
        // xóa phần tử sau khi đã lấy ra;
        elements[size-1] = null;
        size--;

        return e;
    }
    public boolean empty(){
        return size==0;
    }
}
