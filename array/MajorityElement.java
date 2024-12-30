package array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static int majorityElement(int[] arr){
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) +1);
        }
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue() > arr.length/2){
                return entry.getKey();
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,3,1,2,2};

        System.out.println(majorityElement(arr));
    }
}
