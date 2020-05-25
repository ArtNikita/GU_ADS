package hw8;

public class Main {
    public static void main(String[] args) {
        HashTable<Product, Integer> hashTable = new HashTableImpl<>(4);
        hashTable.put(new Product(1, "A"), 150);
        hashTable.put(new Product(1, "B"), 250);
        hashTable.put(new Product(1, "C"), 350);
        hashTable.put(new Product(1, "D"), 450);
        hashTable.put(new Product(1, "E"), 550);
        hashTable.put(new Product(1, "F"), 650);
        hashTable.display();
        System.out.println(hashTable.size());
        hashTable.remove(new Product(1, "E"));
        System.out.println(hashTable.get(new Product(1,"C")));
        System.out.println(hashTable.get(new Product(1,"E")));
        hashTable.display();
        System.out.println(hashTable.size());
        hashTable.remove(new Product(1, "A"));
        hashTable.display();
        System.out.println(hashTable.size());
        hashTable.put(new Product(1, "A"), 1000);
        hashTable.put(new Product(1, "D"), 2000);
        hashTable.display();
    }
}
