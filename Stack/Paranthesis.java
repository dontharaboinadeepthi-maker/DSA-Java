import java.util.*;
class Paranthesis{
    boolean checkbalanced(){ 
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        String s = sc.nextLine();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                if(ch == ')' || ch == ']' || ch == '}'){
                
                    char open = st.pop();
                    if((ch == ')' && open != '(') || (ch == ']' && open != '[') || (ch == '}' && open != '{')){
                        return false;
                    }

                }
            }
        }
        return st.isEmpty();

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Paranthesis obj = new Paranthesis();
        System.out.println(obj.checkbalanced());

    }
}