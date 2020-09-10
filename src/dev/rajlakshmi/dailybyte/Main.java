package dev.rajlakshmi.dailybyte;

import dev.rajlakshmi.dailybyte.day1_day30.*;

public class Main {

    public static void main(String[] args) {
        ReverseString_Day1 day1 = new ReverseString_Day1();
        System.out.println(day1.reverseString("Cat"));
        System.out.println(day1.reverseString("The Daily Byte"));
        System.out.println(day1.reverseString("civic"));

        ValidPalindrome_Day2 day2 = new ValidPalindrome_Day2();
        System.out.println(day2.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(day2.isPalindrome("0P"));
        System.out.println(day2.isPalindrome("Civic"));

        VacuumCleanerRoute_Day3 day3 = new VacuumCleanerRoute_Day3();
        System.out.println(day3.isRouteValid("LR"));
        System.out.println(day3.isRouteValid("URURD"));
        System.out.println(day3.isRouteValid("RUULLDRD"));

        CorrectCapitalization_Day4 day4 = new CorrectCapitalization_Day4();
        System.out.println(day4.isCorrectCapitalized("USA"));
        System.out.println(day4.isCorrectCapitalized("LeetCode"));
        System.out.println(day4.isCorrectCapitalized("Google"));
        System.out.println(day4.isCorrectCapitalized("ggg"));
        // write your code here
    }
}
