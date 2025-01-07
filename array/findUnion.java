package array;
import java.util.ArrayList;

public class findUnion {
        public static ArrayList<Integer> findUnion(int a[], int b[]) {
            int n = a.length;
            int m = b.length;
            ArrayList<Integer> res = new ArrayList<>();
            int i =0, j=0;

            while(i < n && j< m){
                if(i>0 && a[i-1] == a[i]){
                    i++;
                    continue;
                }
                if(j>0 && b[j-1] == b[j]){
                    j++;
                    continue;
                }
                if(a[i] < b[j]){
                    res.add(a[i]);
                    i++;
                }
                else if(a[i] > b[j]){
                    res.add(b[j]);
                    j++;
                }
                else{
                    res.add(a[i]);
                    i++;
                    j++;
                }
            }

            while(i < n){
                if(i > 0 && a[i - 1] == a[i]) {
                    i++;
                    continue;
                }
                res.add(a[i]);
                i++;
            }
            while( j<m){
                if(j>0 && b[j-1] == b[j]){
                    j++;
                    continue;
                }
                res.add(b[j]);
                j++;
            }
            return res;

        }

    public static void main(String[] args) {
        int[] a ={2, 2, 3, 4, 5};
        int[] b = {1, 1, 2, 3, 4};
        ArrayList<Integer> ans = findUnion(a, b);
        for(int i =0; i<ans.size(); i++){
            System.out.println(ans.get(i) + " ");
        }
    }
}
