package recursion;

public class Fibonacci {

    public static void main(String[] args) {
        // print fibonacci number by index
        Fibonacci fibonacci1 = new Fibonacci();
//        System.out.println(fibonacci1.fibonacci(0));
//        System.out.println(fibonacci1.fibonacci(1));
//        System.out.println(fibonacci1.fibonacci(2));
//        System.out.println(fibonacci1.fibonacci(3));
//        System.out.println(fibonacci1.fibonacci(4));
//        System.out.println(fibonacci1.fibonacci(5));
//        System.out.println(fibonacci1.fibonacci(6));


        // print fibonacci numbers with sequence
        for (int i = 0; i < 100; i++) {
            System.out.print(fibonacci1.fibonacci(i) + " ");
        }
    }

    // Fibonacci with recursion
    public int fibonacci(int index) {
        if (index <= 1) return index;

        return fibonacci(index - 1) + fibonacci(index - 2);
    }
}

class FibonacciSequence {

    public static void fibonacci(int index) {
        int firstTerm = 0;
        int secondTerm = 1;
        int fibonacciDigit;

        for (int i = 2; i < index; ++i) {
            System.out.print(firstTerm + " ");

            fibonacciDigit = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = fibonacciDigit;
        }
    }

    public static void main(String[] args) {
        FibonacciSequence.fibonacci(10);
//        double d = 2.0 - 1.1;
//        System.out.println(d);
    }
}

