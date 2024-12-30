package string;

public class AreRotations {

    static int[] constructLps(String pat){
        int n = pat.length();
        int[] lps = new int[n];

        int len=0;
        lps[0]=0;
        int i=1;

        while(i<n){
            if(pat.charAt(i)== pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }

    static boolean areRotations(String s1, String s2){
        String txt = s1 + s1;

        int n = txt.length();
        int m = s2.length();

        int[] lps = constructLps(s2);
        int i=0, j=0;

        while(i<n) {
            if (s2.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }

            if (j == m) {
                return true;
            } else if (i < n && s2.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "bcdea";
        System.out.println(areRotations(s1, s2));
    }
}
