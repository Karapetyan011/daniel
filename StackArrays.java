public class StackArrays {
    private static final int LENGTH = 15;
    private static int size;
    private static int[] arr;

    public StackArrays() {
        arr = new int[LENGTH];
    }

    public StackArrays(int len) {
        arr = new int[len];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFully() {
        return size == arr.length;
    }

    public int size() {
        return size;
    }


    public int pushInStack(int el) {
        if (size == arr.length) {
            System.out.println("Stack is fully");
            return -1;
        } else {
            return arr[size++] = el;
        }
    }

    public int popFromStack() {
        if (size != 0) {
            return arr[--size];
        } else {
            return -1;
        }
    }

}
