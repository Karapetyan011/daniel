package var_args;

import java.util.Arrays;

public class VarArgs {


    static void varArgsTestFunction(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void varArgsTestFunction(int v, int z) {
        System.out.println(v);
    }


    public static void main(String... args) {
        VarArgs.varArgsTestFunction(7, 8, 9, 10);
        VarArgs.varArgsTestFunction(8, 9);
        VarArgs.varArgsTestFunction(66, 77, 88);
        VarArgs.varArgsTestFunction(8);
        VarArgs.varArgsTestFunction(8);
        VarArgs.varArgsTestFunction(8, 9, 10);
    }
}
