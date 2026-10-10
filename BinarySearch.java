import java.util.*;
class BinarySearch{
    void bsearch(int[] arr,int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == key){
                System.out.println("elemnt found");
                return;
            }
            else if(arr[mid]>key){
                high= mid-1;
            }
            else{
                low= mid+1;
            }
            
        }
        System.out.println("element not found");
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of elements");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("enter the elemnts of the array");
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("enter the key");
            int key = sc.nextInt();
            BinarySearch obj = new BinarySearch();
            obj.bsearch(arr,key);

    }
}