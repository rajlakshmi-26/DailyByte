/*
This question is asked by Amazon. Given a string representing your stones and another string representing a list of jewels, return the number of stones that you have that are also jewels.

Ex: Given the following jewels and stones...

jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0
*/
package dev.rajlakshmi.dailybyte.Week2;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones_Day9 {
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> hmap = new HashMap<>();
        int j = J.length(), s = S.length(), count = 0;
        for(int i=0; i<j; i++)
            hmap.put(J.charAt(i), i);
        for(int i=0; i<s; i++) {
            if(hmap.containsKey(S.charAt(i)))
                count++;
        }
        return count;
    }
}
