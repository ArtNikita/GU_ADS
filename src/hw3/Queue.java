package hw3;

class Queue{
    protected int size;
    protected int[] data;
    protected int front;
    protected int bottom;
    protected int items;

    public Queue(int size){
        this.size = size;
        data = new int[this.size];
        front = 0;
        bottom = -1;
        items = 0;
    }
    public void insert(int i){
        if(bottom == size -1)
            bottom = -1;
        data[++bottom] = i;
        items++;
    }

    public int remove(){
        int temp = data[front++];
        if(front == size)
            front = 0;
        items--;
        return temp;
    }

    public int peek(){
        return data[front];
    }
    public boolean isEmpty(){
        return (items==0);
    }

    public boolean isFull(){
        return (items== size);
    }

    public int size(){
        return items;
    }
}
