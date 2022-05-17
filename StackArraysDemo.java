public class StackArraysDemo {
    public static void main(String[] args) {
        StackArrays st = new StackArrays(30);
        int i = 0, b;
        boolean a = true;
        while (a) {
            b = st.pushInStack(i++);
            if (b == -1) {
                a = false;
            }
        }
        int k = st.popFromStack();
        while (k != -1) {
            System.out.println(k);
            k = st.popFromStack();
        }
        if (k == -1) {
            System.out.println("The Stack is empty");
        }
    }
}
