public class Element {
    private final int value;
    private final Element next;

    Element(int value, Element next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Element getNext() {
        return next;
    }
}
