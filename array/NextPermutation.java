package array;

public class NextPermutation {
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void nextPermutation(int[] nums){
        int n = nums.length;
        int idx = -1;
        for(int i = n-2; i >= 0; i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(nums, 0, n-1);
            return;
        }

        for(int i = n-1; i > idx; i--){
            if(nums[i]>nums[idx]){
                swap(nums, i, idx);
                break;
            }
        }
        reverse(nums, idx+1, n-1);

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
