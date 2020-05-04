package hw3;

public class Deque extends Queue {
    public Deque(int size) {
        super(size);
    }

    public int removeLeft() {
        int temp = data[bottom--];
        if(bottom == -1)
            bottom = size - 1;
        items--;
        return temp;
    }

    public int peekLeft(){
        return data[bottom];
    }

    public void insertRight(int i){
        if(front == 0)
            front = size;
        data[--front] = i;
        items++;
    }
}
