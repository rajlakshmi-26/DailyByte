package dev.rajlakshmi.dailybyte.day1_day30;

public class ReverseString_Day1 {

    public String reverseString(String input) {
        int n = input.length();
        String result = "";
        for(int i=n-1; i>=0; i--)
            result = result + input.charAt(i);
        return result;
    }

}
