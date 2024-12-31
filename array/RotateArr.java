package array;
import java.util.ArrayList;
import java.util.Collections;

public class RotateArr {
    static void rev(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
    }

    static int[] rotateArr(int[] arr, int k){
        int n = arr.length;
        k %= n;

        rev(arr, 0, n-1);
        rev(arr, 0, k-1);
        rev(arr, k, n-1);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotateArr(arr, 3);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }
}
