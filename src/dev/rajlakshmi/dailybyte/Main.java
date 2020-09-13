package dev.rajlakshmi.dailybyte;

import dev.rajlakshmi.dailybyte.Week1.*;
import dev.rajlakshmi.dailybyte.Week2.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("******************************************");
        ReverseString_Day1 day1 = new ReverseString_Day1();
        System.out.println(day1.reverseString("Cat"));
        System.out.println(day1.reverseString("The Daily Byte"));
        System.out.println(day1.reverseString("civic"));

        System.out.println("******************************************");
        ValidPalindrome_Day2 day2 = new ValidPalindrome_Day2();
        System.out.println(day2.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(day2.isPalindrome("0P"));
        System.out.println(day2.isPalindrome("Civic"));

        System.out.println("******************************************");
        VacuumCleanerRoute_Day3 day3 = new VacuumCleanerRoute_Day3();
        System.out.println(day3.isRouteValid("LR"));
        System.out.println(day3.isRouteValid("URURD"));
        System.out.println(day3.isRouteValid("RUULLDRD"));

        System.out.println("******************************************");
        CorrectCapitalization_Day4 day4 = new CorrectCapitalization_Day4();
        System.out.println(day4.isCorrectCapitalized("USA"));
        System.out.println(day4.isCorrectCapitalized("LeetCode"));
        System.out.println(day4.isCorrectCapitalized("Google"));
        System.out.println(day4.isCorrectCapitalized("ggg"));

        System.out.println("******************************************");
        AddBinary_Day5 day5 = new AddBinary_Day5();
        System.out.println(day5.addBinary("1", "100101"));
        System.out.println(day5.addBinary("1111", "100101"));
        System.out.println(day5.addBinary("1", "0"));

        System.out.println("******************************************");
        CommonPrefix_Day6 day6 = new CommonPrefix_Day6();
        System.out.println(day6.longestCommonPrefix(new String[] {"flow","flower","flight"}));
        System.out.println(day6.longestCommonPrefix(new String[] {"aa","a"}));

        System.out.println("******************************************");
        TwoSum_Day8 day8 = new TwoSum_Day8();
        System.out.println(day8.twoSum(new int[] {4,2,6,5,2}, 4));
        System.out.println(day8.twoSum(new int[] {3, 9, 13, 7}, 8));
        // write your code here
    }
}