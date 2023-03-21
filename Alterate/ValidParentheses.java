package Assessment;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String string = "(a+b)(a-b)";
        boolean paren=isValidParentheses(string);
        boolean operation=isvalidOperation(string);
        if ( paren && operation) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    private static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++) {

            if(s.charAt(i)=='(') {
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')') {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
        }



    public static boolean isvalidOperation(String s) {
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' || s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (s.charAt(i - 1) >= 'a' && s.charAt(i - 1) <= 'z' && s.charAt(i + 1) >= 'a' && s.charAt(i - 1) <= 'z' && i < s.length() - 1 && i > 1) {
                    flag = true;
                } else {
                    return false;
                }
            }
        }
        return flag;
    }
}
