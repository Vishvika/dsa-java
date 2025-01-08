package array;

public class MaxSubarraySum {
    static int maxSubarraySum(int[] nums){
        int res = nums[0];
        int maxEnd = nums[0];

        for(int i = 1;i<nums.length; i++){
            maxEnd = Math.max(maxEnd + nums[i], nums[i]);
            res = Math.max(res, maxEnd);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySum(nums));
    }
}
