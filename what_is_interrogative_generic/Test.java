package what_is_interrogative_generic;

import java.util.Arrays;
import java.util.List;

public class Test {
    /** With <Object> */
//    public static void printList(List<Object> list) {
//        for (Object elem : list)
//            System.out.println(elem + " ");
//        System.out.println();
//    }


    /** With <?> */
    public static void printList(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("One", "Two", "three");
        printList(li);
//        printList(ls);
    }
}
