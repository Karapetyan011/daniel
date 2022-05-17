package stack;

import java.util.Arrays;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();

        } catch (Exception e) {
            if(e.getMessage() == "Stack is empty"){
                System.out.println(555);
            }else if(e.getMessage() == "Stack is fully"){
                System.out.println(777);
            }else{
                System.err.println("Wrong realise");
            }

        }
    }
}
