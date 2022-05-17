package Stacks.classChilds;

import parentClasses.Stack;

public class StackWithNode<T> extends Stack<T> {

    private static final int DEFAULT_LENGTH = 30;
    private Node head;
    private int length;
    private int cursor;

    public StackWithNode() {
        this.length = DEFAULT_LENGTH;
    }

    public StackWithNode(int length) {
        this.length = length;
    }

    public boolean isEmpty() {
        return this.cursor == 0;
    }

    public boolean isFully() {
        return this.cursor == this.length;
    }

    public int size() {
        return this.cursor;
    }

    public void push(T el) {
        if (this.isFully()) {
            System.out.println("StackOverflow Error.");
            return;
        }
        this.head = new Node(el, this.head);
        this.cursor++;
    }

    public T pop() {
        if (this.isEmpty()) {
            System.out.println("parentClasses.Stack empty Error.");
            return null;
        }
        this.cursor--;
        T value = (T)this.head.getValue();
        this.head = this.head.getNext();
        return value;
    }

    private static class Node<T> {
        private final T value;
        private final Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

    }
}
