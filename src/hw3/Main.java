package hw3;

public class Main {
    public static void main(String[] args) {
        printReversedString("hello");
        printReversedString("world");
    }

    public static void printReversedString(String string){
        Character[] charArray = string.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        Stack<Character> stack =  new Stack<>(charArray);
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
