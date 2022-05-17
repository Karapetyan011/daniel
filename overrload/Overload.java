package overrload;

public class Overload {
    public static void main(String[] args) {
        Overload overloadDemo = new Overload();
//        overloadDemo.test(8);
//        overloadDemo.test(4.2);
//        overloadDemo.test();
        overloadDemo.test(true,9.0);
    }

    void test() {
        System.out.println("HELLO () no argument test method!!!");
    }

    void test(int a) {
        System.out.println("HELLO (int a)  test method");
    }

    void test(String s) {
        System.out.println("HELLO (String s)  test method");
    }

    void test(int a, int b) {
        System.out.println("HELLO (int a, int b) test method : " + "a+b = " + (a + b));
    }

    void test(double d) {
        System.out.println("HELLO (double d)  test method");
    }

    double test(double d, boolean dummy) {
        System.out.println("HELLO (double d, boolean dummy)  test method");
        return d;
    }

    double test(boolean dummy, double d) {
        System.out.println("HELLO (boolean dummy, double d)  test method");
        return d;
    }
}
