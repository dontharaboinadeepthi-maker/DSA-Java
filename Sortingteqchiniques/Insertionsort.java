import java.util.*;
class Insertionsort{
    void insertion(int[] arr){
        for(int i =1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0&& arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = key;                                                                                           
                                                                                                            
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Insertionsort obj = new Insertionsort();
        System.out.println(" Before " + Arrays.toString(arr));
        obj.insertion(arr);
        System.out.println("after " + Arrays.toString(arr));


    }
}
