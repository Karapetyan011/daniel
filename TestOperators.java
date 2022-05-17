public class TestOperators {

    String name ;
    String surname;

    public String toString() {
        return " Something ....";
    }

    public static void main(String[] args) {
        int [] arr = {3,4,5,6,7,8,9,10};

        TestOperators testOperators1 = new TestOperators();
        Object testOperators2 = new TestOperators();

        System.out.println(testOperators1.toString());
        System.out.println(testOperators2.toString());


//        for (int i = 0; i <arr.length-1 ; i++) {
//            System.out.println(arr[i]);
//        }

//        for (int i : arr){
//            System.out.println(i);
//        }


//
//        int i, k;
//
//
//        boolean tmp = false;
//
//        i = 10;
//
//        k = tmp ? -i : i;
//
//        System.out.println(k);
//
//
//        if (i < 0) {
//            k = -i;
//        } else {
//            k = i;
//        }


//        //inner for
//
//        book:
//        for (var i = 0; i < 3; i++) {  //
//
//            System.out.println("i : " + i);
//
//            second:
//            for (int j = 0; j < 2; j++) {  //
//
//                if (j == 1) {
//                    continue ;
//                }
//                System.out.println("j : " + j);
//
//                for (int k = 0; k < 4; k++) { //1
//                    System.out.println("k : " + k);
//                    if (k == 3) {
//                        continue book;
//                    }
//                }
//            }
//        }
//
//
////        int x = 5;
////        int y = 5;
////        int c;
//
//        //math operations
////        c = x + y;
////        System.out.println("+ operation  " + c);
////        c = x - y;
////        System.out.println("- operation  " + c);
////        c = x / y;
////        System.out.println("/ operation  " + c);
////        c = x * y;
////        System.out.println("* operation  " + c);
////        c = x % y;
////        System.out.println("% operation  " + c);
//
//        // increment
////        x++;
////        System.out.println("++ operation  " + x);
////
////        System.out.println("++ operation  "+ x++);
////
////        System.out.println("++ operation  "+ x++);
//
//
//        // decrement
//
////        System.out.println("-- operation  " + x--);
////
////        System.out.println("-- operation  " + x--);
////
////        System.out.println("-- operation  " + --x);
//
//
////        x += x;
////        System.out.println("+= operation  " + x);
////
////        x -= x;
////        System.out.println("-= operation  " + x);
////
////        x *= x;
////        System.out.println("*= operation  " + x);
//
////        x /= x;
////        System.out.println("/= operation  " + x);
////
////        x %= x;
////        System.out.println("%= operation  " + x);
//
//
////         shift operator
//        int x = 10;     //    [0,0,0,0,1,0,1,0] // 8
//        x = x >> 1;  //    [0,0,0,0,0,1,0,1] // 4
//        System.out.println(">>  operation  " + x);
//        x = x >> 1; //     [0,0,0,0,0,0,1,0] // 2
//        System.out.println(">>  operation  " + x);
//        x = x << 1; //     [0,0,0,0,0,1,0,0] // 4
//        System.out.println(">>  operation  " + x);
//        x = x << 2; //     [0,0,0,1,0,0,0,0] // 16
//        System.out.println(">>  operation  " + x);
//
//
//        x = x << 2;
//        System.out.println(">>  operation  " + x);

    }
}
