import java.util.*;
class Secondlargest{
    int largest = Integer.MIN_VALUE;
    int secondlargest = Integer.MIN_VALUE;
    void secondlargest(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!= largest){
                secondlargest = arr[i];
            }
            
        }
        System.out.println("Second largest " + secondlargest);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the size of the elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Secondlargest obj = new Secondlargest();
        obj.secondlargest(arr);
        


        
        
    }
}