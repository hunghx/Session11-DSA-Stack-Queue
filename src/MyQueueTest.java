import java.util.HashSet;
import java.util.Set;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer>  myQueue= new MyQueue<>();
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        while (!myQueue.isEmpty()){
            System.out.println(myQueue.dequeue());
        }
        // SET
        Set<Student> students = new HashSet<>();
        Student st1 = new Student(1,"Hùng");
        Student st2 = new Student(1,"Hùng");
        Student st3 = new Student(2,"Nam");
        Student st4 = st1;
        System.out.println(st1);
        System.out.println(st4);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        System.out.println(students);

    }
}
