package array;

public class Sort012 {
    private static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    static void sort012(int[] nums) {
        int low =0;
        int mid = 0;
        int high = nums.length-1;

        for(int i=0; i<nums.length; i++){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sort012(nums);
        for(int i =0; i< nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }
}
