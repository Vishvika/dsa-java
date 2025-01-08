package array;

//Majority element Expected Solution
public class MooresVoting {
    private static int majorityElement(int[] nums){
        int n = nums.length;
        int count =0;
        int candidate = -1;

        for(int num: nums){
            if(count==0) {
                candidate = num;
                count = 1;
            } else if (candidate==num) {
                count++;
            }else {
                count--;
            }
        }
        for(int num : nums){
            if(candidate == num){
                count++;
            }
        }
        if(count>n/2){
            return candidate;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
