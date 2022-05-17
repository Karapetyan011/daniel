package iterator;

// Գրեք Iterator մասիվի վրայով

import java.util.Iterator;

class ArrayIterator<T> implements Iterator<T> {
    private final T[] array;
    private int index;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(array);
        System.out.println(arrayIterator.next());
        System.out.println(arrayIterator.next());
        System.out.println(arrayIterator.next());
        System.out.println(arrayIterator.next());
        System.out.println(arrayIterator.next());
        System.out.println(arrayIterator.next());
        System.out.println(arrayIterator.next());
        System.out.println(arrayIterator.next());
        System.out.println(arrayIterator.next());
        System.out.println(arrayIterator.next());
        System.out.println(arrayIterator.next());
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            System.out.println("ERROR");
            return null;
        } else {
            return array[index++];
        }
    }
}


//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//class ArrayIterator<T> implements Iterator<T> {
//
//    private final T[] array;
//    private int index = 0;
//
//    public ArrayIterator(T[] array) {
//        this.array = array;
//    }
//
//    @Override
//    public boolean hasNext() {
//        return index < array.length;
//    }
//
////    @Override
////    public T next() {
////        if (!hasNext())
////            throw new NoSuchElementException();
////        return array[index++];
////    }
//
//    @Override
//    public T next() {
//        if (!hasNext()) {
//            System.out.println("No Such Element");
//            return null;
//        }
//        return array[index++];
//    }

//public static void main(String[]args){
//        Integer[]intArray=new Integer[]{3,6,9,12,15,18};
//        ArrayIterator<Integer> arrayIterator=new ArrayIterator<>(intArray);
//        System.out.println(arrayIterator.next());
//        System.out.println(arrayIterator.next());
//        System.out.println(arrayIterator.next());
//        System.out.println(arrayIterator.next());
//        System.out.println(arrayIterator.next());
//        System.out.println(arrayIterator.next());
//        System.out.println(arrayIterator.next());
//        }
//        }

