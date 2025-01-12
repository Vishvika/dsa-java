package sorts;

public class SelectionSort {
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i =0; i< n-1; i++){
            int min_idx = i;
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSort(arr);
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
