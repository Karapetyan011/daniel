package recursion;

public class HanoiTower {


    public static void main(String[] args) {

        int count = 300;

        moveRing("A", "B", "C", count);
    }

    public static void moveRing(String a, String b, String c, int count) {
        if (count == 1) {
            System.out.println("for  " + a + "   to   ->   " + c);
        } else {
            moveRing(a, c, b, count - 1);
            System.out.println("for  " + a + "   to   ->   " + c);
            moveRing(b, a,c,  count - 1);
        }
    }
}

