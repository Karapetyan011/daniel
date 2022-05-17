public class Sort {
    public static void bubbleSort(int[] bubble) {
        int k;
        for (int i = 0; i < bubble.length - 1; i++) {
            for (int j = 0; j < bubble.length - 1 - i; j++) {
                if (bubble[j] > bubble[j + 1]) {
                    k = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = k;
                }
            }
        }
    }

    public static void print(int[] arg) {
        for (int x : arg) {
            System.out.print(x + ",");
        }
    }

    public static int maximum(int[] arg) {
        int max = arg[0];
        int box;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] > max) {
                max = arg[i];
            }
        }
        return max;
    }
}