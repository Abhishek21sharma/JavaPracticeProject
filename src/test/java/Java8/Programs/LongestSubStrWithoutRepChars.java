package Java8.Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubStrWithoutRepChars {

    public static void main(String[] args) {
        //print the longest substring without repeating chars
        //maybe print that and also the length as well
        //sliding window problem

        String s = "pwwkew";
        //for logic building while loop is way stronger than for loop
        //but make sure to do not enter to infinite loop when using while loop


        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;

        //pwwkew
        while(i < s.length())
        {
            ////System.out.println(s.charAt(i));
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
               // System.out.println(set);
                i++;
            }
            else {
                set.remove(s.charAt(j));
               // System.out.println(set);
                j++;
            }
        }


       /* int j = 0 ;
        int count = 1;

        for (int i = 0 ; i <  s.length() ; i++)
        while( j < s.length()){ //1

            if(s.charAt(j) != s.charAt(j+1)  ){
                count=count+1; //2
                j++;
                }
            else{
                j=i+1; //1
                break;}*/



    }



}
