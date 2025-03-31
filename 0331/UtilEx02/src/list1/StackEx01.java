package list1;

import java.util.Stack;

public class StackEx01 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("홍길동");
        stack.push("임꺽정");
        stack.push("장길산");

        System.out.println(stack);
        System.out.println(stack.size());

        stack.add("이몽룡");
        System.out.println(stack);
        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
