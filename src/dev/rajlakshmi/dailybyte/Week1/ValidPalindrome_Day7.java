/*
This question is asked by Facebook. Given a string and the ability to delete at most one character, return whether or not it can form a palindrome.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

Ex: Given the following strings...

"abcba", return true
"foobof", return true (remove the first 'o', the second 'o', or 'b')
"abccab", return false
*/
package dev.rajlakshmi.dailybyte.Week1;

public class ValidPalindrome_Day7 {
    boolean checkPalindrome(String s, int i, int j, int k) {
        if(i == s.length() || j == -1)
            return false;
        if(i > j)
            return true;
        if(s.charAt(i) == s.charAt(j))
            return checkPalindrome(s, i + 1, j - 1, k);
        if(k == 1)
            return checkPalindrome(s, i+1, j, k - 1) || checkPalindrome(s, i, j - 1, k - 1);
        return false;
    }
    public boolean validPalindrome(String s) {
        int n = s.length();
        if(n == 0 || n == 1 || n == 2)
            return true;
        int i = 0, j = n - 1, k = 1;
        return checkPalindrome(s, i, j, k);
    }
}
