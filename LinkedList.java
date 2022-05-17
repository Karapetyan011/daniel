public class LinkedList {


    private int size;
    private Node head;
    private Node tail;

    LinkedList() {
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void add(int value) {
        Node newObj = new Node(value, null, null);
        if (this.head == null) {
            this.head = newObj;
        } else {
            this.tail.setNext(newObj);
            newObj.setPrev(this.tail);
        }
        this.tail = newObj;
        size++;
    }


    public int get(int index) {
        if (index > size) {
            System.out.println("Error index grater then size.");
        }
        return findIndex(index).getValue();
    }

    public int replace(int index, int value) {
        if (index >= size) {
            System.out.println("Error index grater then size.");
            return -1;
        }
        Node newObj = new Node(value, null, null);
        Node element = findIndex(index);
        int sendValue = element.getValue();
        if (index == 0) {
            newObj.setPrev(element.getPrev());
            newObj.setNext(element.getNext());
            element.getNext().setPrev(newObj);
            this.head = newObj;
        } else if (index == size - 1) {
            newObj.setPrev(element.getPrev());
            newObj.setNext(element.getNext());
            element.getPrev().setNext(newObj);
            this.tail = newObj;
        } else {
            newObj.setPrev(element.getPrev());
            newObj.setNext(element.getNext());
            element.getPrev().setNext(newObj);
            element.getNext().setPrev(newObj);
        }
        return sendValue;
    }

    public void insert(int index, int value) {
        if (index >= size) {
            System.out.println("Error index grater then size.");
            return;
        }
        Node newObj = new Node(value, null, null);
        Node element = findIndex(index);
        if (index == 0) {
            newObj.setNext(element);
            element.setPrev(newObj);
            this.head = newObj;
        } else {
            element.getPrev().setNext(newObj);
            newObj.setPrev(element.getPrev());
            newObj.setNext(element);
            element.setPrev(newObj);
        }
        size++;
    }


    public void removeByIndex(int index) {
        if (index >= this.size) {
            System.out.println("Error index grater then size.");
            return;
        }
        Node element = findIndex(index);

        if (index == 0) {
            element.getNext().setPrev(element.getPrev());
            this.head = element.getNext();
        } else if (index == this.size - 1) {
            element.getPrev().setNext(element.getNext());
            this.tail = element.getPrev();
        } else {
            element.getNext().setPrev(element.getPrev());
            element.getPrev().setNext(element.getNext());
        }
        size--;
    }

    public int removeByValue(int val) {
        int index = -1;
        Node element = this.head;
        for (int i = 0; i < this.size; i++) {
            if (element.getValue() == val) {
                removeByIndex(i);
                index = i;
                break;
            }
            element = element.getNext();
        }
        return index;
    }

    public void print() {
        Node element = this.head;
        System.out.print("[");
        for (int i = 0; i < this.size-1; i++) {
            System.out.print(element.getValue() + ",");
            element = element.getNext();
        }
        System.out.print(element.getValue() + "]"); // for ']' symbol in print
        System.out.println();
    }

    private Node findIndex(int index) {
        Node element;
        if (index < size / 2) {
            element = this.head;
            for (int i = 0; i < index; i++) {
                element = element.getNext();
            }
        } else {
            element = this.tail;
            for (int i = this.size - 1; i > index; i--) {
                element = element.getPrev();
            }
        }
        return element;
    }

    static class Node {
        private int value;
        private Node next;
        private Node prev;

        Node(int val, Node next, Node prev) {
            this.value = val;
            this.next = next;
            this.prev = prev;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int el) {
            this.value = el;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node obj) {
            this.next = obj;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node obj) {
            this.prev = obj;
        }
    }
}

