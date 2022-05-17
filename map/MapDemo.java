package map;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {

        /** key in HashMap is always unique */
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");
//        System.out.println(passportsAndNames);


//        passportsAndNames.put(162348, "Виктор Михайлович Стычкин");
//        System.out.println(passportsAndNames);

        /** In order to get a value, or remove a pair from a dictionary, we must pass to
         * the get() and remove() methods exactly the unique key corresponding to this value(соответствующий этому значению.).
         * There are no numbered indexes,as in arrays or lists,
         * in HashMap - the value is accessed by key. */


        /** Values in HashMap are accessed by key (but not vice versa -
         *  the key cannot be obtained by value, because values can be repeated)*/

//        String lidiaName = passportsAndNames.get(212133);
//        System.out.println(lidiaName);

        /** remove*/
//        passportsAndNames.remove(162348);
//        System.out.println(passportsAndNames);

        /** In the ArrayList and LinkedList classes, we could check if a list contains a particular element.

         HashMap also allows you to do this, and for both parts of the pair: it has methods`
         containsKey ()(checks for the presence of some key)
         and
         containsValue () (checks for the presence of a value).*/


//        System.out.println(passportsAndNames.containsKey(11111));
//        System.out.println(passportsAndNames.containsValue("Дональд Джон Трамп"));


        /** Another handy feature of HashMap is that you can separately get a list of all keys and all values.

         For this, the
         keySet()
         and
         values()
         methods are used:*/

//        Set<Integer> keys = passportsAndNames.keySet();
//        System.out.println("Keys: " + keys);
//
//        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
//        System.out.println("Values: " + values);


        /** size() and clear() methods */

//        System.out.println(passportsAndNames.size());
//        passportsAndNames.clear();
//        System.out.println(passportsAndNames);

        /** isEmpty */

//        if (!passportsAndNames.isEmpty()) {
//
//            System.out.println(passportsAndNames);
//
//        }

        /** putAll() */

//        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();
//
//        passportsAndNames2.put(917352, "Алексей Андреевич Ермаков");
//        passportsAndNames2.put(925648, "Максим Олегович Архаров");
//
//
//        passportsAndNames.putAll(passportsAndNames2);
//        System.out.println(passportsAndNames);



    }
}
