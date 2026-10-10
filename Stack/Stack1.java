import java.util.*;
class Stack1{
    int size;
    int[] arr;
    int top=-1;

    Stack1(int size){
        this.size = size;
        arr = new int[size];
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top == arr.length-1;
    }
    void push(int value){
        if(isFull()){
            System.out.println("Array is full");
            return;
        }
        top++;
        arr[top] = value;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("array is empty");
            return -1;
        }
        int value = arr[top];
        top--;
        return value;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("array is empty");
            return -1;
        }
        return arr[top];
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        Stack1 s = new Stack1(size);
        s.push(12);
        s.push(13);
        s.push(17);
        s.push(8);
        s.push(9);
        s.display();
        System.out.println(s.peek());
        System.out.println(s.pop());

    }

}