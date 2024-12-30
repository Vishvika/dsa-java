package string;

import java.util.ArrayList;

public class IsSubstring {
    static void constructLps(String pat, int[] lps){
        int len=0;
        lps[0]=0;

        int i=1;
        while(i < pat.length()){
            if(pat.charAt(len)== pat.charAt(i)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len !=0){
                    len = lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
    }

    static ArrayList<Integer> search(String pat, String txt){
        int n = txt.length();
        int m = pat.length();

        int[] lps = new int[m];
        ArrayList<Integer> res = new ArrayList<>();

        constructLps(pat, lps);

        int i=0, j=0;

        while(i<n){
            if(txt.charAt(i) == pat.charAt(j)){
                i++;
                j++;

                if(m==j){
                    res.add(i-j);

                    j=lps[j-1];
                }
            }else{
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        String txt = "abcab";
        String pat = "ab";

        ArrayList<Integer> res = search(pat, txt);

        if(res.size()==0){
            System.out.println("[]");
        }
        else {
            for (int i = 0; i < res.size(); i++) {
                System.out.println(res.get(i) + " ");
            }
        }

    }
}
