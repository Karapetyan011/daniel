package stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private final int[] stack;
    private int tmp;

    public MyStack(int size) {
        stack = new int[size];
        tmp = -1;
    }

    void push(int item) throws StackException {
        if (tmp == stack.length - 1) {
            throw new StackException("Stack is fully");
        } else {
            stack[++tmp] = item;
        }
    }

    int pop() throws StackException {
        if (tmp < 0) {
            int x = 8/0;
            System.out.println(x);
            throw new StackException("Stack is empty");
        }
        return stack[tmp--];
    }
}


