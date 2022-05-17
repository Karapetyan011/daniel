package map;

public interface Map<K, V> {
    V get(K key);

    V push(K key, V value);

    V remove(K key);

    int size();

    boolean isHere(K key);
}
