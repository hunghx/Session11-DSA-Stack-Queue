import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
       // Stack
        Stack<String> stack = new Stack<>();
        stack.push("Đi học");
        stack.push("Đi chơi");
        stack.push("Đi đá bóng");
        stack.push("Đi ngủ");
        stack.push("Thức dậy");
        while (!stack.empty()){
            // vừa lấy phần tử trên cungf vừa xóa khỏi danh sách
//            String string = stack.pop();
            String string = stack.peek();
            System.out.println(stack);
            System.out.println("công việc hiện tại là "+string);
            stack.remove(string);
        }

        // ứng dụng Stack
        // đảo ngược câu
        String  sequence = "Để nông dân biết code";
        String[] arrStr = sequence.split(" ");
        Stack<String> stringStack = new Stack<>();
        for (String str :arrStr) {
            stringStack.push(str);
        }
        String reverseStr = "";
        while (!stringStack.empty()){
            reverseStr+=stringStack.pop()+" ";
        }
        System.out.println(reverseStr);
        // chuyển đối số từ hệ thập phân sang hệ nhị phận
        Scanner sc = new Scanner(System.in);
        Stack<Integer> intStack = new Stack<>();
        System.out.println("Hãy nhập vào 1 số nguyên ");
        int so = sc.nextInt();
        while (true){
            int div = so/2;
            int mod = so%2;
            intStack.push(mod);
            // điều kiện dừng vòng lặp
            if(div==0){
                break;
            }
            so = div;
        }
        // lấy ra  các phần tử của stack
        while (!intStack.empty()){
            System.out.print(intStack.pop());
        }
//        System.out.println(intStack);

    }
}