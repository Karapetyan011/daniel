public class StackList {
    private static final int DEFAULT_LENGTH = 20;
    private int size;
    private Element head;
    private final int length;

    StackList() {
        length = DEFAULT_LENGTH;
    }

    StackList(int el) {
        length = el;
    }

    public int getSize() {
        return size;
    }

    public boolean isFully() {
        return size == length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int el) {
        if (!isFully()) {
            this.head = new Element(el, this.head);
            size++;
        } else {
            System.out.println("Stack is Fully");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            size--;
            int value = this.head.getValue();
            this.head = this.head.getNext();
            return value;
        } else {
            System.out.println("Stack is EMPTY");
            return -1;
        }
    }
}
