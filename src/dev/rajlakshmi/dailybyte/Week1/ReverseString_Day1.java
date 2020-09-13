/*

Question
---------
This question is asked by Google. Given a string, reverse all of its characters and return the resulting string.

Ex: Given the following strings...

“Cat”, return “taC”
“The Daily Byte”, return "etyB yliaD ehT”
“civic”, return “civic”

 */
package dev.rajlakshmi.dailybyte.Week1;

public class ReverseString_Day1 {

    public String reverseString(String input) {
        int n = input.length();
        String result = "";
        for(int i=n-1; i>=0; i--)
            result = result + input.charAt(i);
        return result;
    }

}

