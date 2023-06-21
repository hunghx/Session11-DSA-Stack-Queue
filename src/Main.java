import java.util.*;


public class Main {
    public static void main(String[] args) {
       // Stack
//        Stack<String> stack = new Stack<>();
//        stack.push("Đi học");
//        stack.push("Đi chơi");
//        stack.push("Đi đá bóng");
//        stack.push("Đi ngủ");
//        stack.push("Thức dậy");
//        while (!stack.empty()){
//            // vừa lấy phần tử trên cungf vừa xóa khỏi danh sách
////            String string = stack.pop();
//            String string = stack.peek();
//            System.out.println(stack);
//            System.out.println("công việc hiện tại là "+string);
//            stack.remove(string);
//        }

        // ứng dụng Stack
        // đảo ngược câu
//        String  sequence = "Để nông dân biết code";
//        String[] arrStr = sequence.split(" ");
//        Stack<String> stringStack = new Stack<>();
//        for (String str :arrStr) {
//            stringStack.push(str);
//        }
//        String reverseStr = "";
//        while (!stringStack.empty()){
//            reverseStr+=stringStack.pop()+" ";
//        }
//        System.out.println(reverseStr);
//        // chuyển đối số từ hệ thập phân sang hệ nhị phận
//        Scanner sc = new Scanner(System.in);
//        Stack<Integer> intStack = new Stack<>();
//        System.out.println("Hãy nhập vào 1 số nguyên ");
//        int so = sc.nextInt();
//        while (true){
//            int div = so/2;
//            int mod = so%2;
//            intStack.push(mod);
//            // điều kiện dừng vòng lặp
//            if(div==0){
//                break;
//            }
//            so = div;
//        }
        // lấy ra  các phần tử của stack
//        while (!intStack.empty()){
//            System.out.print(intStack.pop());
//        }
//        System.out.println(intStack);

        // Queue
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Đi học");
        queue.offer("Đi chơi");
        queue.offer("Đi ngủ");
        queue.offer("Thức dậy");
        while (!queue.isEmpty()){
            // poll - vừa lấy vừa xóa không sinh ra ngoại lệ nếu null
            System.out.println(queue.poll());
            // peek - chỉ lấy ra và không xóa
//            System.out.println(queue.peek());
//            queue.remove();
        }

        // Sắp xêp cách phần tử trong danh sách theo thứ tự nào đó
        // comparator/ comparable

        List<Student> students = new ArrayList<>();
        students.add(new Student(4,"Chiến"));
        students.add(new Student(1,"Hùng"));
        students.add(new Student(3,"Minh"));
        students.add(new Student(2,"Cao"));
        System.out.println(students);

        // sắp xếp
        // sử dụng Comparable
//        Collections.sort(students);

        // sử dụng Comparator
//        students.sort(new SortComparator());
//        students.sort((o1,o2)->o2.name.compareTo(o1.name)); // biểu thức lamda
        Collections.sort(students);
       students.sort(Comparator.comparingInt(Student::getId));  // functionInterface
        System.out.println(students);

    }
}