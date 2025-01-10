package array;

import java.util.ArrayList;

public class Leaders {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> leaders = new ArrayList<>();
        boolean leader;
        for(int i=0; i< arr.length; i++){
            leader = true;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    leader = false;
                    break;
                }
            }
            if(leader == true ){
                leaders.add(arr[i]);
            }
        }
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> ans = leaders(arr);
        for(int i=0; i< ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
