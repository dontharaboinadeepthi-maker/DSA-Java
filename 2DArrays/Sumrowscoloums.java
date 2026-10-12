import java.util.*;
class Sumrowscoloums{
    void sum(int[][] arr,int rows,int coloums){
        for(int i=0;i<rows;i++){
            int rowsum =0;
            for(int j=0;j<coloums;j++){
                rowsum += arr[i][j];
            }
            System.out.println("rowsum : " + rowsum);
        }

        for(int j=0;j<coloums;j++){
            int coloumsum = 0;
            for(int i=0;i<rows;i++){
                coloumsum += arr[i][j];
            }
            System.out.println("coloumsum " + coloumsum);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("enter the elements");
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    Sumrowscoloums obj = new Sumrowscoloums();
    obj.sum(arr,n,n);

}
