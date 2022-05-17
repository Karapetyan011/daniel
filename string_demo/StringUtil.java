package string_demo;

public class StringUtil {

    public static char[] toCharArray(String text) { // "BOB"
        return text.toCharArray(); // char[]{'B','O','B'}
    }

    public static String toString(char[] chars) { // char[]{'B','O','B'}
        return new String(chars); // "BOB"
    }

    /**
     * 123456 -> 654321
     * 1112333 -> 3332111
     */
    public static String reverse(String text) { //"123456"
        char[] chars = toCharArray(text);
        // char[] chars = char[]{'5','4','3','2','1'}

        for (int head = 0, tail = chars.length - 1; head < chars.length / 2; head++, tail--) {
            char tmp = chars[head];
            chars[head] = chars[tail];
            chars[tail] = tmp;
        }

        return toString(chars);
    }

    /**
     * "aassa jhagf  " -> "aassa jhagf"
     * "  aassa jhagf  " -> "aassa jhagf"
     * "  aassa jhagf" -> "aassa jhagf"
     */
    public static String trim(String text) {
        char[] chars = toCharArray(text);
        int i = 0;
        int j = chars.length - 1;
        while (chars[i] == ' ') {
            i++;
        }
        while (chars[j] == ' ') {
            j--;
        }
        char[] newChars = new char[j - i + 1];
        int o = 0;
        for (int k = i; k < j + 1; k++) {
            newChars[o++] = chars[k];
        }
        return toString(newChars);
    }

    /**
     * ("bla foo bla", "foo") -> 4
     * ("bla foo bla", "fgg") -> -1
     * ("bla foo bla", "bla") -> 0
     */
    public static int indexOf(String text, String sub) {
        char[] chars = toCharArray(text);
        char[] subChars = toCharArray(sub);
        a:
        for (int i = 0; i < chars.length; i++) {
            int sum = 0;
            for (int j = 0; j < subChars.length; j++) {
                if (chars[i] != subChars[j]) {
                    continue a;
                }
                while (j < subChars.length && chars[i + j] == subChars[j]) {
                    sum++;
                    j++;
                }
            }
            if (sum == subChars.length) {
                return i;
            }
        }
        return -1;
    }

    /**
     * ("abc abc abc df sdfgsd dfsdf", "abc") -> 3
     * ("abc abc abc df sdfgsd dfsdf", "a") -> 3
     * ("abc abc abc df sdfgsd dfsdf", "df") -> 4
     * ("abc abc abc df sdfgsd dfsdf", "adfdadf") -> 0
     */
    public static int count(String text, String sub) {
        char[] chars = toCharArray(text);
        char[] subChars = toCharArray(sub);
        int general = 0;
        a:
        for (int i = 0; i < chars.length; i++) {
            int sum = 0;
            for (int j = 0; j < subChars.length; j++) {
                if (chars[i] != subChars[j]) {
                    continue a;
                }
                while (j < subChars.length && chars[i + j] == subChars[j]) {
                    sum++;
                    j++;
                }
            }
            if (sum == subChars.length) {
                general++;
            }
        }
        return general;
    }

    /**
     * ("abc abc abc", "abc") -> [" ", " "]
     * ("abc abc abc", " ") -> ["abc", "abc", "abc"]
     * ("abc abc abc", "a") -> ["bc ", "bc ", "bc"]
     */
    public static String[] split(String text, String reg) {
        char[] chars = toCharArray(text);
        char[] subChars = toCharArray(reg);
        int count = count(text, reg);
        String[] a = new String[count + 1];
        int tmp = 0;
        StringBuilder str;
        int l = 0;

        a:
        for (int i = 0; i < chars.length; i++) {
            int sum = 0;
            for (int j = 0; j < subChars.length; j++) {
                if (chars[i] != subChars[j]) {
                    continue a;
                }
                while (j < subChars.length && chars[i + j] == subChars[j]) {
                    sum++;
                    j++;
                }
            }
            if (sum == subChars.length) {
                str = new StringBuilder();
                for (int k = tmp; k < i; k++) {
                    str.append(chars[k]);
                }
                a[l++] = str.toString();
                tmp = i + subChars.length;
            }
        }
        str = new StringBuilder();
        for (int k = tmp; k < chars.length; k++) {
            str.append(chars[k]);
        }
        a[l++] = str.toString();

        return a;
    }

    /**
     * ("absdflkdjsf", 2, 5) -> "sdf"
     * ("absdflkdjsf", 0, 3) -> "abs"
     */
    public static String substring(String text, int fromIndex, int toIndex) {
        char[] chars = toCharArray(text);
        StringBuilder str = new StringBuilder();
        if (fromIndex < chars.length && fromIndex > 0 && toIndex < chars.length && toIndex > 0) {
            for (int i = fromIndex; i < toIndex; i++) {
                str.append(chars[i]);
            }

            return str.toString();
        } else {
            return "Error: This string don`t have an index";
        }
    }

    /**
     * ("abababab", "a", "c") -> "cbcbcbcb"
     * ("abab6abab", "ab", "1") -> "11611"
     */
    public static String replace(String text, String oldStr, String newStr) {
        char[] chars = toCharArray(text);
        chars[1] = 0;
        //todo add code

        return toString(chars);
    }


    public static void main(String[] args) {
//        System.out.println("{" + trim("     Hello  World     ") + "}");
//        System.out.println(indexOf("Hello World", "ll"));
//        System.out.println(count("Hello World", "l"));
//        String[] arr = split("abc abc abc", "a");
//        System.out.print("{");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("}");
//
//        System.out.println(substring("Hello World", 2, 5));
        System.out.println(StringUtil.reverse("Helloooo"));
    }

}
