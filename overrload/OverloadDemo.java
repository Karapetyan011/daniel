package overrload;


class OverloadDemo extends Overload {


    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();
        demo.test();
        demo.test(9);
    }

    @Override
    void test() {
        System.out.println("Bye Bye");
    }

    @Override
    void test(int a) {
        System.out.println(8);
    }
}
