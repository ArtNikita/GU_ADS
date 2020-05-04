package hw3;

public class Stack<E> {
    private int size;
    private E[] data;
    private int topElementIndex;

    public void push(E element){
        data[++topElementIndex] = element;
    }

    public E peek(){
        return data[topElementIndex];
    }

    public E pop(){
        return data[topElementIndex--];
    }

    public boolean isEmpty(){
        return topElementIndex  == -1;
    }

    public boolean isFull(){
        return topElementIndex + 1 == size;
    }

    public Stack(int size) {
        this.size = size;
        data = (E[]) new Object[size];
        topElementIndex = -1; //stack is empty
    }

    public Stack(E[] data) {
        this.data = (E[]) new Object[data.length];
        System.arraycopy(data, 0, this.data, 0, data.length);
        size = data.length;
        topElementIndex = data.length - 1;
    }

    public Stack( E[] data, int size) {
        if (data.length > size){
            size = data.length;
        }
        this.size = size;
        this.data = (E[]) new Object[size];
        topElementIndex = data.length - 1;
        System.arraycopy(data, 0, this.data, 0, data.length);
    }
}
