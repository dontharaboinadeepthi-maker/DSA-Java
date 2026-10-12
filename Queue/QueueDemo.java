class Queue{
    int[] arr;
    int size;
    int rear;
    int front;
    Queue(int size){
        this.size = size;
        arr = new int[size];
        rear = -1;
        front = -1;
    }
    boolean isEmpty(){
        return front == -1;
    }
    boolean isFull(){
        return rear == size-1;
    }
    void insert(int x){
        if(isFull()){
            System.out.println("arr is full");
            return;
        }
        if(isEmpty()){
            front = 0;
            
        }
        rear++;
        arr[rear] = x;
        System.out.println("inserted " + x);
    }
    void delete(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("deleted" + arr[front]);
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front++;
        }
    }
    void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        for(int i = front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
}
public class QueueDemo{
    public static void main(String[] args){
        Queue obj = new Queue(5);
        obj.delete();
        obj.insert(20);
        obj.insert(30);
        
        obj.delete();
        obj.insert(50);
        obj.insert(60);
        obj.insert(70);
        obj.display();
    }
}