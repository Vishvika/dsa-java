package string;

import java.util.HashMap;

public class IsomorphicStrs {
    static boolean isomorphicStrings(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for(int i=0; i<s.length();i++){
            if(!m1.containsKey(s.charAt(i))){
                m1.putIfAbsent(s.charAt(i), i);
            }
            if(!m2.containsKey(t.charAt(i))){
                m2.putIfAbsent(t.charAt(i), i);
            }
            if(!m1.get(s.charAt(i)).equals(m2.get(t.charAt(i)))){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isomorphicStrings("aab", "xiy") ? "True" : "False");
    }
}
