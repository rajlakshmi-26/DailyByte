/*
This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.

Ex: Given the following strings...

"LR", return true
"URURD", return false
"RUULLDRD", return true
 */
package dev.rajlakshmi.dailybyte.Week1;
public class VacuumCleanerRoute_Day3 {
    public boolean isRouteValid(String route) {
        int n = route.length(), x = 0, y = 0;
        for(int i=0; i<n; i++) {
            if(route.charAt(i) == 'U')
                y--;
            else if(route.charAt(i) == 'D')
                y++;
            else if(route.charAt(i) == 'L')
                x--;
            else if(route.charAt(i) == 'R')
                x++;
        }
        return (x == 0 && y == 0);
    }
}
