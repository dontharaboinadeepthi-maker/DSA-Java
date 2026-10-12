import java.util.*;
class IntStack{
    int size;
    int[] arr;
    int top = -1;
    IntStack(int size){
        this.size = size;
        arr = new int[size];

    }
    boolean isEmpty(){
        return top == -1;
    }
    void push(int val){
        top++;
        arr[top] = val;
        
    }
    int pop(){
        int value = arr[top];
        top--;
        return value;

    }
    int peek(){
        return arr[top];
    }
}
public class PostfixEvaluation{
    void  evluate(String exp){
        IntStack obj = new IntStack(exp.length());
        char[] arr = exp.toCharArray();

        for(char ch:arr){
            if(ch == ' '){
                continue;
            }
            if (Character.isDigit(ch)) {
                obj.push(ch - '0');
            }
            
            else{
                if(ch == '+'){
                    int a = obj.pop();
                    int b = obj.pop();
                    obj.push(a+b);
                }
                else if(ch == '-'){
                    int a = obj.pop();
                    int b = obj.pop();
                    obj.push(b-a);
                }
                else if(ch == '*'){
                    int a = obj.pop();
                    int b = obj.pop();
                    obj.push(b*a);

                }
                else if(ch == '/'){
                    int a = obj.pop();
                    int b = obj.pop();
                    obj.push(b/a);
                }
            }
            
        }
        System.out.println("Result: " + obj.pop());

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the string");
        String exp = sc.nextLine();
        PostfixEvaluation obj1 = new PostfixEvaluation();
        obj1.evluate(exp);
        
    }
}



    
