//package Stacks.interfaceChilds;
//
//import parentClasses.Stack;
//import parentInterfaces.StackInterface;
//
//import java.util.*;
//
//public class StackWithArray<T> implements StackInterface<T> {
//
//    private static final int DEFAULT_LENGTH = 20;
//    private Object[] array;
//    private int cursor;
//
//    public StackWithArray() {
//        this.array = new Object[DEFAULT_LENGTH];
//    }
//
//    public StackWithArray(int length) {
//        this.array = new Object[length];
//    }
//
//    public boolean isEmpty() {
//        return this.cursor == 0;
//    }
//
//    public boolean isFully() {
//        return this.cursor == this.array.length;
//    }
//
//    public int size() {
//        return this.cursor;
//    }
//
//    public void push(T el) {
//        LinkedList list = new LinkedList();
//        if (this.isFully()) {
//            System.out.println("StackOverflow Error.");
//            return;
//        }
//        this.array[this.cursor++] = el;
//    }
//
//    public T pop() {
//        if (this.isEmpty()) {
//            System.out.println("parentClasses.Stack empty Error.");
//            return null;
//        }
//        return (T)this.array[--this.cursor];
//    }
//}