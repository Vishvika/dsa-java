package array;

//0->n
public class MissingNum {
    static int missingNum(int[] nums) {

        int xor1 = 0;
        int xor2 =0;
        for(int i =0; i<nums.length; i++){
            xor1 = xor1^(i+1);
            xor2 = xor2^nums[i];
        }
        return xor1^xor2;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int ans = missingNum(arr);
        System.out.println(ans);
    }
}
