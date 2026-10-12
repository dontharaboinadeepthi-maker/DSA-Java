class CircularQueue{
    int size;
    int[] arr;
    int front;
    int rear;

    CircularQueue(int size){
        arr = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }
    boolean isFull(){
        return (rear+1)%size == front;
    }
    boolean isEmpty(){
        return front == -1;
    }
    void insert(int x){
        if(isFull()){
            System.out.println("queue iis full");
            return;
        }
        if(isEmpty()){
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear] = x;
        
    }
    void delete(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("deleted  " + arr[front]);
        if(front == rear){
            front = -1;
            rear =-1;
        }
        else{
            front = (front+1)%size;
        }
    }
    void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;

        }
        int i = front;
        System.out.println("----> front ");
        while(true){
            System.out.println(arr[i] + " ");
            if(i == rear){
                break;
            }
            i = (i+1)%size;

        }
        System.out.println("<-----Rear");
    }
}
public class CircularQueueDemo{
    public static void main(String[] args){
        CircularQueue q = new CircularQueue(5);
        q.delete();
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.delete();
        q.delete();
        q.display();
        q.insert(40);
        q.insert(50);
        q.insert(60);
        q.display();
    }
}