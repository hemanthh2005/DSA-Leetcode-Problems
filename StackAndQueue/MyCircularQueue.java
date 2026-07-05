package Hemanth.StackAndQueue;

//https://leetcode.com/problems/design-circular-queue/description/
//622

public class  MyCircularQueue{

    protected int[]data;
    protected static final int DEFAULT_SIZE=5;

    protected int front=0;
    protected int end=-1;
    protected int size=0;


    public MyCircularQueue(int k) {
        this.data=new int[k];
    }
    public MyCircularQueue(){
        this(DEFAULT_SIZE);
    }

    public boolean enQueue(int value) {
    if(isFull()){
        return false;
    }


    end=(end+1)%data.length;
        data[end]=value;
    size++;

    return true;
    }

    public boolean deQueue() {
        if (isEmpty()){
            return false;
        }

        front=(front+1)%data.length;
        size--;

        return true;
    }

    public int Front() {
        if (isEmpty()){
            System.out.println("Empty");
        }
        return data[front];
    }

    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        return data[end];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size==data.length;
    }
}

