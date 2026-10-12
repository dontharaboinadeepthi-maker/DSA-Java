import java.util.*;
class Selectionsort{
    void selectionsort(int[] arr){
        for(int start =0;start<arr.length-1;start++){
            int Minindex = start;
            for(int i = start+1;i<arr.length;i++){
                if(arr[i]<arr[Minindex]){
                    Minindex = i;
                }
            }
            int temp = arr[Minindex];
            arr[Minindex] = arr[start];
            arr[start] = temp;
            
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + "Elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        Selectionsort obj = new Selectionsort();
        System.out.println("Before :" + Arrays.toString(arr));
        obj.selectionsort(arr);
        System.out.println("After :" + Arrays.toString(arr));

    }
}