import java.util.*;
class HeaviestPackage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] stack = new int[n];
        int top = -1;

        for(int i = 0;i<n;i++){
            top++;
            stack[top] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        while(top>=0){
            int val = stack[top];
            top--;
            if(val>max){
                max = val;
            }
            
        }
        System.out.println(max);
    }
}