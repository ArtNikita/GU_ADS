package hw8;

import java.util.LinkedList;

public class HashTableImpl<K, V> implements HashTable<K, V> {

    static class Item<K, V> implements Entry<K, V> {
        private final K key;
        private V value;

        public Item(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }
    }

    private final LinkedList<Item<K, V>>[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTableImpl(int maxSize) {
        this.data = new LinkedList[maxSize];
    }

    private int hashFunc(K key) {
        return key.hashCode() % data.length;
    }

    @Override
    public boolean put(K key, V value) {
        int index = hashFunc(key);
        if (data[index] == null){
            data[index] = new LinkedList<>();
        }
        for (Item<K, V> item : data[index]) {
            if (item.getKey().equals(key)){
                item.setValue(value);
                return true;
            }
        }
        data[index].push(new Item<>(key, value));
        size++;
        return true;
    }

    @Override
    public V get(K key) {
        int index = hashFunc(key);
        if (data[index] == null){
            return null;
        }
        for (Item<K, V> item : data[index]) {
            if (item.getKey().equals(key)){
                return item.getValue();
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int index = hashFunc(key);
        if (data[index] == null) {
            return null;
        }
        for (int i = 0; i < data[index].size(); i++){
            if (data[index].get(i).getKey().equals(key)){
                Item<K, V> item = data[index].get(i);
                size--;
                data[index].remove(i);
                return item.getValue();
            }
        }
        return null;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size != 0;
    }

    protected int getStep(K key) {
        return 1;
    }

    @Override
    public void display() {
        System.out.println("----------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d = [%s]", i, data[i]);
            System.out.println();
        }
        System.out.println("----------");
    }
}