package break_loop;

public class BreakLoop1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Exit " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break; // loop exit, value 11 of variable j is 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("The cycles are complete.");
    }
}
