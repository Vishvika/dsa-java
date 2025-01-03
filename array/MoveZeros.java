package array;

public class MoveZeros {
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        int j = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1){
            return;
        }

        for(int i = j+1; i<nums.length; i++){
            if(nums[i] != 0){
                swap(nums, i, j);
                j++;
            }
        }
        return ;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        MoveZeros m = new MoveZeros();
        m.moveZeroes(arr);
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
