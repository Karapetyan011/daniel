package exception;

import java.util.LinkedList;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int divideByZero = 8 / 0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(" Finally block is always executed ");
        }
    }
}
