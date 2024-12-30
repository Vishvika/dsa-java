package string;

import java.util.Stack;

public class RevWords {
    static String revWords(String s){
        StringBuilder word = new StringBuilder();
        Stack<String> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }
            else if(word.length()>0){
                stack.push(word.toString());
                word.setLength(0);
            }
        }
        //last word
        if(word.length()>0){
            stack.push(word.toString());
        }

        StringBuilder res = new StringBuilder();

        while(!stack.isEmpty()){
            res.append(stack.pop());
            if(!stack.isEmpty()){
                res.append(" ");
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "My name is Vishvika";
        System.out.println(revWords(s));

    }
}
