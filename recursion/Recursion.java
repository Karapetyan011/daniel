package recursion;

//  Recursion - Рекурсия
public class Recursion {

    static int factorial(int number) {
        int result;
        if (number <= 1) return 1;

        result = factorial(number - 1) * number;
        return result;
    }
}

class RecursionDemo {
    public static void main(String[] args) {
//        System.out.println("Factorial 2 = " + Recursion.factorial(2));
//        System.out.println("Factorial 3 = " + Recursion.factorial(3));
//        System.out.println("Factorial 4 = " + Recursion.factorial(4));
//        System.out.println("Factorial 5 = " + Recursion.factorial(5));
        System.out.println("Factorial 6 = " + Recursion.factorial(36));

    }
}
