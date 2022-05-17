package break_loop;

public class BreakLoop2 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Exit " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer; //exit from both loops
                System.out.print(j + " ");
            }
            System.out.println("This line will not be displayed");
        }
        System.out.println("The cycles are complete.");
    }

}
