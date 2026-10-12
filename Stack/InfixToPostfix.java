class CharStack {
    char[] arr;
    int top = -1;

    CharStack(int size) {
        arr = new char[size];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(char val) {
        top++;
        arr[top] = val;
    }

    char pop() {
        char value = arr[top];
        top--;
        return value;
    }

    char peek() {
        return arr[top];
    }
}

public class InfixToPostfix {

    // Higher number = higher precedence
    static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        if (op == '^') return 3;
        return -1; // for '(' or anything else
    }

    static String convert(String exp) {
        StringBuilder result = new StringBuilder();
        CharStack stack = new CharStack(exp.length());

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                // operand goes straight to the output
                result.append(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                // pop until the matching '('
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty()) {
                    stack.pop(); // discard '('
                }
            }
            else {
                // operator: pop operators of higher (or equal) precedence first
                // '^' is right-associative, so for '^' pop only strictly higher
                while (!stack.isEmpty()
                        && (precedence(stack.peek()) > precedence(ch)
                        || (precedence(stack.peek()) == precedence(ch) && ch != '^'))) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // pop whatever is left
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("a+b*c"));        // abc*+
        System.out.println(convert("(a+b)*c"));      // ab+c*
        System.out.println(convert("a+b*(c^d-e)"));  // abcd^e-*+
        System.out.println(convert("a-b-c"));        // ab-c-
        System.out.println(convert("a^b^c"));        // abc^^
    }
}