//Reverse the expresion using the stack
import java.util.*;
class CharStack{
    int size;
    char[] arr;
    int top = -1;

    CharStack(int size){
        this.size = size;
        arr = new char[size];
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top == arr.length-1;
    }
    void push(char value){
        top++;
        arr[top] = value;
    }
    char pop(){
        char value = arr[top];
        top--;
        return value;
    }
    void peek(){
        System.out.println(arr[top] + " ");
    }
}
public class Reverse{
    void reverse(String exp){
        CharStack stack = new CharStack(exp.length());
        StringBuilder s = new StringBuilder();
        for(char ch:exp.toCharArray()){
            stack.push(ch);

        }
        while(!stack.isEmpty()){
            s.append(stack.pop());
        }
        System.out.println(s.toString());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the expression");
        String exp = sc.nextLine();
        Reverse obj = new Reverse();
        obj.reverse(exp);
    }



}
