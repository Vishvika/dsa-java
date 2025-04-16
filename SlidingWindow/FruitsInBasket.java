package SlidingWindow;

import java.util.HashMap;

public class FruitsInBasket {
    static int totalFruit(int[] fruits) {
        int maxLen =0 ;
        int windowStart = 0;
        HashMap<Integer, Integer> charFreqMp = new HashMap<>();

        for(int windowEnd=0; windowEnd<fruits.length; windowEnd++){
            int endInt = fruits[windowEnd];
            charFreqMp.put(endInt, charFreqMp.getOrDefault(endInt, 0)+1);

            while(charFreqMp.size() > 2){
                int startInt = fruits[windowStart];
                charFreqMp.put(startInt, charFreqMp.get(startInt)-1);

                if(charFreqMp.get(startInt) == 0){
                    charFreqMp.remove(startInt);
                }
                windowStart++;
            }
            maxLen=Math.max(maxLen, windowEnd - windowStart+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};
        System.out.println(totalFruit(fruits));
    }
}
