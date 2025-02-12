package string;

import java.util.Stack;

public class ValidParenthesis {
    static boolean validParenthesis(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(' ||str.charAt(i) == '[' ||str.charAt(i) == '{'){
                stack.push(str.charAt(i));
            }else{
                if (!stack.isEmpty() && (
                        (stack.peek() == '(' && str.charAt(i) == ')') ||
                                (stack.peek() == '{' && str.charAt(i) == '}') ||
                                (stack.peek() == '[' && str.charAt(i) == ']')
                        )){
                    stack.pop();
                }
                else{return false;}
            }

        }
return stack.empty();
    }
    public static void main(String[] args) {
        String str = "{[]()}";
        if (validParenthesis(str))
            System.out.println("true");
        else
            System.out.println("false");

    }
}
