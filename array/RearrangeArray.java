package array;

import java.util.ArrayList;

//put pos & neg elements in alternating order
public class RearrangeArray {
    static int[] rearrangeArray(int[] nums){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        int posIdx = 0, negIdx = 0;
        int i=0;
        while(posIdx < pos.size() && negIdx < neg.size()){
            if(i%2==0){
                nums[i++] = pos.get(posIdx++);
            }else{
                nums[i++] = neg.get(negIdx++);
            }
        }
        while (posIdx < pos.size())
            nums[i++] = pos.get(posIdx++);

        while (negIdx < neg.size())
            nums[i++] = neg.get(negIdx++);

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(nums);
        for(int i=0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }

}
