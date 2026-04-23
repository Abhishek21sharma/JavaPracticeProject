package Java8.Programs;

import java.util.HashSet;

public class LongestPalindromSubString {

    public static void main(String[] args) {
        //similar to longest Sub-string without repeated characters
        //in this approch however instead of checking if the string exists
        //we will check if the sub-string is palindom, if yes then take their length

        //s = babad
        //answer - bab
        //answer - aba
        //size: 3..

        //store in set
        //now check if the substring is palindorm ??

        int i = 0, j = 0;
        String s = "babad";
        HashSet<Character> set = new HashSet();

        while(i < s.length()){
            if(!set.contains(s.charAt(i))){

            }
        }
    }
}
