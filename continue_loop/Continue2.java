package continue_loop;

public class Continue2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                System.out.println("does not print 4");
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
