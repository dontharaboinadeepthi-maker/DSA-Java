class Deque{
    int[] arr;
    int size;
    int front;
    int rear;
    Dequeue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    boolean isEmpty(){
        return front = -1;
    }
    boolean isFull(){
        return (rear+1)%size == front;
    }
    void insertRear(int x){
        if(isFull()){
            System.out.println("Deque overflow");
            return;
        }
        if(isEmpty()){
            front = 0;
        }
        rear = (rear +1)%size;
        arr[rear] = x;
        System.out.println(x + "inserted at rear");
    }
    void insertFront(int x){
        if(isFull()){
            front = 0;
            rear = 0;
        }
        else{
            front = (front-1+size)%size;
        }
        arr[front] = x;
        System.out.println(x + "inserted at front");
    }
}