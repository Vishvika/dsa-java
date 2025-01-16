package string;

public class LargestOddNum {
    static String largestOddNum(String s){
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) % 2 != 0){
                String ans = s.substring(0, i+1);
                return ans;
            }
        }
        return "";
    }
    public static void main(String[] args)
    {

        String s = "36722";

        String ans = largestOddNum(s);
        System.out.println(ans);
    }
}
