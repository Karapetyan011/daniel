package map;

public class HashMap<K, V> implements Map<K, V> {

    private static final int DEFAULT_LENGTH = 16;
    private int size;
    private final Node<K, V>[] array;

    public HashMap() {
        this.array = new Node[DEFAULT_LENGTH];
    }

    public HashMap(int length) {
        if (length <= DEFAULT_LENGTH) {
            this.array = new Node[DEFAULT_LENGTH];
        } else {
            int i = length - 1;
            int sum = 0;
            while (i != 1) {
                i = i / 2;
                sum++;
            }
            i = 1;
            for (int j = 0; j < sum + 1; j++) {
                i = i * 2;
            }
            this.array = new Node[i];
        }
    }

    @Override
    public V get(K key) {
        int hashBox = key.hashCode();
        int index = hashBox & (array.length - 1);

        Node head = this.array[index];
        while (head != null) {
            if (head.key.equals(key)) {
                return (V) head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V push(K key, V value) {
        int hashBox = key.hashCode();
        int index = hashBox & (array.length - 1);

        Node head = this.array[index];
        V tmp = null;
        if (head == null) {
            Node<K, V> obj = new Node<>(key, value, null);
            this.array[index] = obj;
        } else {
            while (head != null) {
                if (head.key.equals(key)) {
                    tmp = (V) head.value;
                    head.value = value;
                    return tmp;
                }
                head = head.next;
            }
            head = this.array[index];
            Node<K, V> obj = new Node<>(key, value, head);
            this.array[index] = obj;
        }
        this.size++;
        return null;
    }

    public V remove(K key) {
        int hashBox = key.hashCode();
        int index = hashBox & (array.length - 1);

        Node head = this.array[index];
        Node tmp = head;
        V val = null;
        while (head != null) {
            if (head.key.equals(key)) {
                val = (V) head.value;
                if (head == tmp) {
                    this.array[index] = head.next;
                } else {
                    tmp.next = head.next;
                }
                this.size--;
                break;
            }
            tmp = head;
            head = head.next;
        }
        return val;
    }

    public boolean isHere(K key) {
        int hashBox = key.hashCode();
        int index = hashBox & (array.length - 1);

        Node head = this.array[index];
        while (head != null) {
            if (head.key.equals(key)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public int size() {
        return this.size;
    }


    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
