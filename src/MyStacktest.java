public class MyStacktest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("HÙng");
        myStack.push("Nam");
        myStack.push("Minh");
        myStack.push("ÁNh");
        myStack.push("Đức");
        while (!myStack.empty()){
            System.out.println(myStack.pop());
        }
    }
}
