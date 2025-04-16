package SlidingWindow;

import java.util.HashMap;

public class LongestSubstr {
    static int longestSubstr(String str, int k){
        int windowStart=0;
        int maxLen =0;
        HashMap<Character, Integer> charFreqMap = new HashMap<>();
        for(int windowEnd=0; windowEnd<str.length(); windowEnd++){
            char endChar = str.charAt(windowEnd);
            charFreqMap.put(endChar, charFreqMap.getOrDefault(endChar, 0)+1);

            while(charFreqMap.size()>k){
                char startChar = str.charAt(windowStart);
                charFreqMap.put(startChar, charFreqMap.get(startChar)-1);

                if(charFreqMap.get(startChar)==0){
                    charFreqMap.remove(startChar);
                }
                windowStart++;
            }
            maxLen = Math.max(maxLen, windowEnd-windowStart+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "abdbacd";
        int k=3;
        System.out.println(longestSubstr(str, k));
    }
}
