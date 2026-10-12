import java.util.*;
class Move0toend{
    void move(int[] arr){
        int pos = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n  = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        Move0toend obj = new Move0toend();
        System.out.println("before " + Arrays.toString(arr));
        obj.move(arr);
        System.out.println(" After " + Arrays.toString(arr));


    }
}