package array;

public class FindMaxConsecutiveOnes {
    static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxi = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                maxi = Math.max(maxi, count);

            }
            else{
                count = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        int res = findMaxConsecutiveOnes(nums);
        System.out.println(res);
    }
}
