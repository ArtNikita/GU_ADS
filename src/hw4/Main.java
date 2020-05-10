package hw4;

public class Main {
    public static void main(String[] args) {
        SimpleLinkedListImpl<Integer> sllInt = new SimpleLinkedListImpl();
        sllInt.insertFirst(1);
        sllInt.insertFirst(2);
        sllInt.insertFirst(3);
        sllInt.insertFirst(4);
        sllInt.insertFirst(5);

        System.out.println("display() method:");
        sllInt.display();

        System.out.println("\nIterator:");
        for (Integer integer : sllInt) {
            System.out.printf("%d ", integer);
        }
        System.out.println();

        SimpleLinkedListImpl<String> sllStr = new SimpleLinkedListImpl<>();
        sllStr.insertFirst("a");
        sllStr.insertFirst("b");
        sllStr.insertFirst("c");
        sllStr.insertFirst("d");

        System.out.println("\ndisplay() method:");
        sllStr.display();

        System.out.println("\nIterator:");
        for (String str : sllStr){
            System.out.printf("%s ", str);
        }
        System.out.println();
    }
}
