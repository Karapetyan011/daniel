package method;

public class MethodDemo {

    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();

        int sum1 = methodDemo.sum(7, 7);
        int sum2 = methodDemo.sum(3, 3);

        int sum3=methodDemo.sum(sum1, sum2);
        System.out.println(sum3);
    }

    void customPrint() {
        System.out.println("Print");
    }

    void customPrint(int tmp) {
        System.out.println(tmp);
    }

//    String sum(Person person) {
//        return person.name;
//    }

//    double sum(double x, double y) {
//        double sum = x + y;
//        return sum;
//    }

    int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }


}
