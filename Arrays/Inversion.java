//Alex is working on an array manipulation project. He needs to count the number of inversions in an array. An inversion occurs when two elements 
//in an array are out of order with respect to each other. For instance, 
//in the array [2, 4, 1, 3, 5], the pair (2, 1) is an inversion because 2 comes before 1.
import java.util.*;
class Inversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n  = sc.nextInt();
        int inversions = 0;
        System.out.println("enter the elements of the array");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    inversions++;

                }
                
            }
            
        }
        System.out.println("no.of inversions " + inversions);
        
    }
}