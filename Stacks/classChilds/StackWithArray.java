package Stacks.classChilds;

import parentClasses.Stack;

public class StackWithArray<R> extends Stack<R> {

    private static final int DEFAULT_LENGTH = 20;
    private final Object[] array;
    private int cursor;


    public StackWithArray() {
        this.array = new Object[DEFAULT_LENGTH];
    }

    public StackWithArray(int length) {
        this.array = new Object[length];
    }

    public static void main(String[] args) {
        StackWithArray<String> stack = new StackWithArray<>();


    }

    public boolean isEmpty() {
        return this.cursor == 0;
    }

    public boolean isFully() {
        return this.cursor == this.array.length;
    }

    public int size() {
        return this.cursor;
    }

    public void push(R el) {
        if (this.isFully()) {
            System.out.println("StackOverflow Error.");
            return;
        }
        this.array[this.cursor++] = el;
    }

    public R pop() {
        if (this.isEmpty()) {
            System.out.println("parentClasses.Stack empty Error.");
            return null;
        }
        return (R) this.array[--this.cursor];
    }
}