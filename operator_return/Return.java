package operator_return;

public class Return {
    public static void main(String[] args) {

        System.out.println("Until return.");

        for (int i = 0; i < 100; i++) {
            System.out.println("i : " + i);
            for (int j = 0; j < 100; j++) {
                System.out.println("j : " + j);
                for (int k = 0; k < 100; k++) {
                    System.out.println("k : " + k);
                    if (k == 3) {
                        return;
                    }
                }

            }

        }

        System.out.println("This statement will not be executed.");
    }
}
