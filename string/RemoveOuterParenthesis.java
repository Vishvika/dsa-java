package string;

public class RemoveOuterParenthesis {

    static String removeOuterParenthesis(String s){
        int openCount =0, closeCount=0;
        String result = "";
        int start=0;

        for(int i=0; i< s.length(); i++){
            char c= s.charAt(i);
            if(c=='('){
                openCount++;
            }
            else if(c==')'){
                closeCount++;
            }
            if(openCount==closeCount){
                result += s.substring(start+1, i);
                start = i+1;
            }
        }
        return result;
    }

    public static void main(String[] args){
        String s = "(()())(())()";

        System.out.println(removeOuterParenthesis(s));

    }
}
