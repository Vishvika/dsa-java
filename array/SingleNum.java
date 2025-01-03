package array;

import java.util.HashMap;
import java.util.Map;

public class SingleNum {
    static int singleNum(int[] nums){
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNum(nums));
    }
}
