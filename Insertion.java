import java.util.*;
class Insertion{
    int[] heap = new int[10];
    int size =0;

    void insertion(int value){
        if(size == heap.length){
            System.out.println("the array is full");
            return;
        }
        heap[size] = value;
        heapify(size);
        size++;

    }
    void heapify(int i){
        if(i==0){
            return;
        }
        if(heap[i]>heap[(i-1)/2]){
            int parent = (i-1)/2;
            int temp = heap[parent];
            heap[parent] = heap[i];
            heap[i]= temp;
            heapify(parent);
        }
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.println(heap[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Insertion obj = new Insertion();
        System.out.println("enter the size of elements");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            obj.insertion(val);
        }
        obj.display();
    }
}