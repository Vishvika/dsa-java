package sorts;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int i,j, temp;
        boolean swapped;
        for( i=0; i<n-1; i++){
            swapped = false;
            for( j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped= true;
                }
            }
            if(swapped==false){
                break;}
        }

    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr);
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
