package set;

import java.util.HashSet;
import java.util.Set;

public class MySet {

    static Integer x = 9;
    static Integer y = 9;
    static Short z = 9;
    static String name = "BOB";
    static String name1 = "BOB";
    Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
//        System.out.println(x == y);
//        System.out.println(x == z);
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
    }
}
