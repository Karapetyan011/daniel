package string_builder;

public class TestStringBufferAndStringBuilder {

//    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//
//        sb.append(2)
//                .append("; ")
//                .append(false)
//                .append("; ")
//                .append(Arrays.asList(1, 2, 3))
//                .append("; ");
//
//        System.out.println(sb); // 2; false; [1, 2, 3];
//    }


//    public static void main(String[] args) {
//        String numbers = "0123456789";
//
//        StringBuffer sb = new StringBuffer(numbers);
//
//        System.out.println(sb.substring(3)); // 3456789
//        System.out.println(sb.substring(4, 8)); // 4567
//        System.out.println(sb.replace(3, 5, "ABCDE")); // 012ABCDE56789
//
//        sb = new StringBuffer(numbers); //0123456789
//        System.out.println(sb.reverse()); // 9876543210
//        sb.reverse();  // 0123456789
//
//        sb = new StringBuffer(numbers); //0123456789
//        System.out.println(sb.delete(5, 9)); // 012349
//        System.out.println(sb.deleteCharAt(1)); // 02349
//        System.out.println(sb.insert(1, "One")); // 0One2349
//    }

    public static void main(String[] args) {
        String numbers = "0123456789";

        StringBuilder sb = new StringBuilder(numbers);

        System.out.println(sb.substring(3)); //3456789
        System.out.println(sb.substring(4, 8)); //4567
        System.out.println(sb.replace(3, 5, "ABCDE")); //012ABCDE56789

        sb = new StringBuilder(numbers);
        System.out.println(sb.reverse()); //9876543210
        sb.reverse(); //0123456789

        sb = new StringBuilder(numbers);
        System.out.println(sb.delete(5, 9)); //012349
        System.out.println(sb.deleteCharAt(1)); //02349
        System.out.println(sb.insert(1, "One")); //0One2349

//        String name = "Bob";
//
//        StringBuilder stringBuffer = new StringBuilder();
//        System.out.println(stringBuffer.capacity());

    }
}
