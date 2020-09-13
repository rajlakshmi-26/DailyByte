/*
This question is asked by Apple. Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string).
Note: neither binary string will contain leading 0s unless the string itself is 0

Ex: Given the following binary strings...

"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return  "1"
*/
package dev.rajlakshmi.dailybyte.Week1;

public class AddBinary_Day5 {
    public String addBinary(String a, String b) {
        int n1 = a.length() - 1, n2 = b.length() - 1, carry = 0;
        String res = "";
        while(n1 >= 0 || n2 >= 0) {
            int sum = ((n1 >= 0 && a.charAt(n1) == '1') ? 1 : 0) + ((n2 >= 0 && b.charAt(n2) == '1') ? 1 : 0) + carry;
            int rem = sum % 2;
            res = Integer.toString(rem) + res;
            carry = (sum >= 2) ? 1 : 0;
            n1--;
            n2--;
        }
        if(carry == 1)
            res = Integer.toString(carry) + res;
        return res;
    }
}
