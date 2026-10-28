//Input format :
//The first line contains two integers, R1 and C1, representing the number of rows and columns of the first matrix.
//The next R1 lines contain C1 space-separated integers, representing the elements of the first matrix.
//The next line contains two integers, R2 and C2, representing the number of rows and columns of the second matrix.
//The next R2 lines contain C2 space-separated integers, representing the elements of the second matrix.
import java.util.*;
class Multiplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the row");
        int r1 = sc.nextInt();
        System.out.println("enter thr coloum");
        int c1 = sc.nextInt();
         int[][] arr = new int[r1][c1];
        for(int i =0;i<r1;i++){
            for(int j = 0;j<c1;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the row");
        int r2 = sc.nextInt();
        System.out.println("enter the coloum");
        int c2 = sc.nextInt();
        int[][] arr1 = new int[r2][c2];
        for(int i =0;i<r2;i++){
            for(int j =0;j<c2;j++){
                arr1[i][j] = sc.nextInt();

            }
        }
        if(c1 != r2){
            System.out.println("the multiplication is not possible");
            return;
        }
        int[][] result = new int[r1][c1];
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c2;j++){
                for(int k = 0;k<c1;k++){
                    result[i][j] += arr[i][k]*arr1[k][j];
                }
            }
                
        }
        System.out.println("the multiplication of the result");
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c1;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        int[][] transpose = new int[c2][r1];
        for(int i=0;i<c2;i++){
            for(int j =0;j<r1;j++){
                transpose[j][i] = result[i][j];
            }
        }
        System.out.println("Transpose of a matrix is :");
        for(int i =0;i<c2;i++){
            for(int j = 0;j<r1;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}