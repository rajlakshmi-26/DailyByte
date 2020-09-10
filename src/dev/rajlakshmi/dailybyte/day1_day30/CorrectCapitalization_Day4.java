/*
This question is asked by Google. Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, or only the first letter is capitalized.

Ex: Given the following strings...

"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
 */
package dev.rajlakshmi.dailybyte.day1_day30;

public class CorrectCapitalization_Day4 {
    public boolean isLetterCapital(char ch) {
        if(ch >= 65 && ch <= 90)
            return true;
        else
            return false;
    }
    public boolean isCorrectCapitalized(String s) {
        int n = s.length();
        if(n < 2)
            return true;
        boolean isCaps = isLetterCapital(s.charAt(1));
        if(!isLetterCapital(s.charAt(0)) && isCaps)
            return false;
        for(int i=2; i<n; i++) {
            char ch = s.charAt(i);
            if(isLetterCapital(ch) && !isCaps)
                return false;
            if(!isLetterCapital(ch) && isCaps)
                return false;
        }
        return true;
    }
}
