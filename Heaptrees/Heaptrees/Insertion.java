import java.util.*;
public class Insertion{
    int[] heap = new int[10];
    int size =0;

    void insert(int value){
        if(size == heap.length){
            System.out.println("Heap is full");
            return;
        }
        heap[size] = value;
        heapfyup(size);
        size++;
    }
    void heapfyup(int i){
        if(i==0){
            return;
        }
        if(heap[i]>heap[(i-1)/2]){
            int parent = (i-1)/2;
            int temp = heap[i];
            heap[i] = heap[parent];
            heap[parent] = temp;

        }
    }
    void display(){
        for(int i =0;i<size;i++){
            System.out.print(heap[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Insertion obj = new Insertion();
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int val = sc.nextInt();
            obj.insert(val);
        }
        obj.display();
    }
}


    


