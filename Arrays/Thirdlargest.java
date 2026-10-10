import java.util.*;
class Thirdlargest{
    void thirdlargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int thirdlargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                thirdlargest = secondlargest;
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest = arr[i];
            }

        }
        System.out.println("Thirdlargest  " + thirdlargest);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elemnts");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        } 
        
        Thirdlargest obj = new Thirdlargest();
        obj.thirdlargest(arr);

    }
}