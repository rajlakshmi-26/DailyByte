package dev.rajlakshmi.dailybyte.Week1;

public class CommonPrefix_Day6 {
    public String longestCommonPrefix(String[] A) {
        int n = A.length;
        if(n == 0 || n == 1)
            return (n == 0) ? "" : A[0];
        String res = "", reference = A[0];
        int k = 0;
        for(int i=0; i<reference.length(); i++) {
            char ch = reference.charAt(i);
            for(int j=1; j<n; j++) {
                if(i >= A[j].length() || ch != A[j].charAt(i))
                    return res;
            }
            res = res + ch;
        }
        return res;
    }
}
