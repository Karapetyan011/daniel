package string_demo;

public class StringDemo {

    public static void main(String[] args) {


        String a = "a";
        String b = "a";
        String c = new String("a");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
        System.out.println(a.equals(b));


//        /**
//         * STRING JOIN EXAMPLE
//         *   join(CharSequence delimiter, CharSequence... elements)
//         *   join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
//         *      Где delimiter — разделитель элементов, а elements — массив строк / экземпляр коллекции строк.
//         */
//
//        List<String> people2 = Arrays.asList(
//                "Philip J. Fry",
//                "Tauranga Leela",
//                "Bender Bending Rodriguez",
//                "Hubert Farnsworth",
//                "Hermes Conrad",
//                "John D. Goldberg",
//                "Amy Wong"
//        );
//
//        String peopleString = String.join("; ", people2);
//        System.out.println(peopleString);
//
//
//        /**
//         * STRING SPLIT EXAMPLE
//         *   Разбиение строки на массив строк
//         *   Эту операцию выполняет метод split(String regex)
//         *   В качестве разделителя выступает строковое регулярное выражение regex.
//         */
//
//        String people1 = "Philip J. Fry; Tauranga Leela; Bender Bending Rodriguez; Hubert Farnsworth; Hermes Conrad; John D. Goldberg; Amy Wong";
//
//        String[] peopleArray = people1.split("; ");
//        for (String human : peopleArray) {
//            System.out.println(human);
//        }
//
        /**
         * STRING indexOf EXAMPLE
         *   Определение позиции элемента в строке
         *
         *      indexOf(int ch)
         *      indexOf(int ch, int fromIndex)
         *      indexOf(String str)
         *      indexOf(String str, int fromIndex)
         *      lastIndexOf(int ch)
         *      lastIndexOf(int ch, int fromIndex)
         *      lastIndexOf(String str)
         *      lastIndexOf(String str, int fromIndex)
         *
         *      Где:
         *      ch — искомый символ (char)
         *      str — искомая строка
         *      fromIndex — позиция с которой нужно искать элемент
         *      методы indexOf — возвращают позицию первого найденного элемента
         *      методы lastIndexOf — возвращают позицию последнего найденного элемента
         *      Если искомый элемент не найден, методы вернут в строке -1.
         */
//
//        // A, K, Z, Я
//        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        System.out.println(alphabet.indexOf('A')); // 0
//        System.out.println(alphabet.indexOf('K')); // 10
//        System.out.println(alphabet.indexOf('Z')); // 25
//        System.out.println(alphabet.indexOf('Я')); // -1
//
//        /**
//         * STRING SUBSTRING EXAMPLE
//         *   Извлечение подстроки из строки
//         *   substring(int beginIndex)
//         *   substring(int beginIndex, int endIndex)
//         */
//
//        String filePath = "D:\\Movies\\Future.mp4";
//        System.out.println("filePath length is : " + filePath.length());
//        int lastFileSeparatorIndex = filePath.lastIndexOf('\\');
//        String fileName = filePath.substring(lastFileSeparatorIndex + 1);
//        System.out.println(fileName);
//
//
//        /**
//         * STRING toLowerCase / toUpperCase EXAMPLE
//         */
//
//        String fry = "    Philip J. Fry ";
//        System.out.println(fry.length());
////
//        String lowerCaseFry = fry.toLowerCase();
//        String upperCaseFry = fry.toUpperCase();
//
//        System.out.println(lowerCaseFry); // philip j. fry
//        System.out.println(upperCaseFry); // PHILIP J. FRY
//        String x = fry.trim();
//        String y = "Philip J. Fry";
//        System.out.println(x == y);

    }
}
