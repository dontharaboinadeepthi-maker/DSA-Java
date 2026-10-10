import java.util.*;
class Reverse{
    void reverse(int n){
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse=reverse*10+digit;
            n = n/10;
        }
        
        System.out.println("reverse of the elemnt " + reverse);


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter thr number");
        int n = sc.nextInt();
        Reverse obj = new Reverse();
        obj.reverse(n);

    }
}