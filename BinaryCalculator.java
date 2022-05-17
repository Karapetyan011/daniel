public class BinaryCalculator {

    public static int and(int x, int y) {
        int[] arrX = toBinary1(x);  //        [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0]
        int[] arrY = toBinary1(y);  //        [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1]

        int[] res = new int[32];
        for (int i = 0; i < arrX.length; i++) {
            res[i] = arrX[i] & arrY[i];     // [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0]
        }
        return toDecimal(res);
    }


    public static int or(int x, int y) {
        int[] arrX = toBinary1(x);  //[0, 0, 0, 0, 0, 0.,,0, 0,,0, 0, 0, 1, 0]
        int[] arrY = toBinary1(y);  //[0, 1, 0, 0, 0, 0.,,0, 0,,0, 0, 1 1, 0]

        int[] res = new int[32];    // [0, 0, 0, 0, 0, 0,,,0, 0,,0, 0, 0, 1, 0]
        for (int i = 0; i < arrX.length; i++) {
            res[i] = arrX[i] | arrY[i];
        }
        return toDecimal(res);
    }

    public static int xor(int x, int y) {
        int[] arrX = toBinary1(x);
        int[] arrY = toBinary1(y);

        int[] res = new int[32];
        for (int i = 0; i < arrX.length; i++) {
            res[i] = arrX[i] ^ arrY[i];
        }
        return toDecimal(res);
    }

    public static int add(int x, int y) {
        int[] arrX = toBinary1(x);
        int[] arrY = toBinary1(y);

        int[] res = new int[32];

        int tmp = 0;
        for (int i = arrX.length - 1; i >= 0; i--) {
            int currVal = arrX[i] + arrY[i] + tmp;
            if (currVal < 2) {
                res[i] = currVal;
                tmp = 0;
            } else {
                res[i] = currVal & 1;
                tmp = 1;
            }
        }
        return toDecimal(res);
    }

    public static int sub(int x, int y) {
        return add(x, y * -1);
    }

    public static int pow(int x, int y) {
        int[] arrX = toBinary1(x);
        int[] arrY = toBinary1(y);

        int[] res = new int[32];

        for (int i = arrY.length - 1; i >= 0; i--) {
            int tmp = 0;
            for (int j = arrX.length - 1; j >= 0; j--) {
                int k = i - (31 - j);
                if (k >= 0) {
                    int value = tmp + res[k] + arrX[j] * arrY[i];
                    if (value < 2) {
                        res[k] = value;
                        tmp = 0;
                    } else {
                        res[k] = value & 1;
                        tmp = 1;
                    }
                }
            }
        }
        return toDecimal(res);
    }


    // function toBinary(mer 10-akan hamakargi tiv@ darcnel erkuakan function)
    // toBinary(int value){}

    // public static int[] toBinary(int value){
    //
    // return
    // }


    // public static int[] toBinary(int value){
    //  int[] arr = new int[32];

    // return arr;
    // }


    public static int[] toBinary1(int value) { //
        int[] arr = new int[32];  //    [0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        for (int i = 31; i >= 0; i--) {
            int x = 1 << i;           //[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]

            int res = value & x;      //[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]

            if (res == x) {
                arr[31 - i] = 1;  // arr[30] = 1
                continue;
            }
            arr[31 - i] = 0;  // arr[] = 0
        }
        return arr;
    }

    void test(){
       one: for (int i = 0; i < 10; i++) {
          two:  for (int j = 0; j < 20; j++) {
             three:   for (int k = 0; k < 30; k++) {
                    for (int l = 0; l < 40; l++) {
                        if(l==2){
                            continue  two;
                        }else if(l == 7){
                            continue one;
                        }else if(l == 39){
                            continue three;
                        }
                    }

                }

            }
        }
    }

    public static int[] toBinary2(int value) {
        int[] arr = new int[32];
        for (int i = 31; i >= 0; i--) {
            int res = (value >> i) & 1;
            arr[31 - i] = res;
        }
        return arr;
    }

//    [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0]

    // // [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0]
    public static int toDecimal(int[] arr) {
        int res = 0;
        boolean isNegative = arr[0] == 1; // false
        for (int i = 0; i < arr.length; i++) {
            int currVal = arr[i];  // 0
            int pow = 31 - i;    // 0
            if (isNegative) {
                if (currVal == 0) {
                    int posVal = 1 << pow;
                    res += posVal;
                }
            } else {
                if (currVal == 1) {
                    int posVal = 1 << pow;   // 2
                    res += posVal;  // res =res + posVal  res = 0 + 2 = 2  res = 2
                }
            }
        }
        if (isNegative) {
            res = (res + 1) * -1;
        }
        return res;
    }

    // values = ["hello", 2, 4.6, 'f', 3333333, true, 5, 7f, false, lexus];
    // Object value = values[3];
    // value[0] = 45;
    // value[0] = hhh;
    // value[0] = ttt;
    // print(values);

//
//    public static double[] getDoubleValues(Object[] values) {
//        double[] doublesArr = new double[values.length];
//
//        for (int i = 0; i < values.length; i++) {
//            if (values[2].isDouble()) {
//                int count = 0;
//                doublesArr[0] = (double) values[i];
//                count++;
//            }
//        }
//        return doublesArr;
//    }


    // values =[ 3.5, 5.5, 4.6, 8.9]

//    public static double[] getDoubleArray(Object[] values) {
//        double[] doublesArr = new double[values.length];  // [0.0, 0.0, 0.0, 0.0,]
//        int count = 0;
//
//        for (int i = 0; i < values.length; i++) {
//
//            if (values[i].isDouble()) {
//                doublesArr[count] = (double) values[i];
//                count++;
//            }
//        }
//        // doublesArr = [4.5, 5.5, 4.6, 8.9]
//        return doublesArr;   //[4.5, 5.5, 4.6, 8.9]
//    }
}