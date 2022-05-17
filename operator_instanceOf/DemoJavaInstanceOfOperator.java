package operator_instanceOf;

public class DemoJavaInstanceOfOperator {

    public static void main(String[] args) {
        String name = "Bob";
        DemoJavaInstanceOfOperator obj = new DemoJavaInstanceOfOperator();


        boolean result1 = name instanceof String;
        System.out.println("name is an instance of String : " + result1);


        boolean result2 = obj instanceof DemoJavaInstanceOfOperator;
        System.out.println("obj is an instance of Main : " + result2);


        boolean result3 = obj instanceof Object;
        System.out.println("obj is an instance of Object : " + result3);

    }
}
