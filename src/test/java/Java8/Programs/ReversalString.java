package Java8.Programs;

import java.util.Arrays;

public class ReversalString {

    public static void main(String[] args) {
        //Input: s = " i like this program very much "
        //Output: "much very program this like i"
        //Explanation: After removing extra spaces and reversing the whole string (not individual words), the input string becomes "much very program this like i".


        String input = " i like this program very much ";
        String[] arr =  input.trim().split(" ");
        String s = "";
       for (int i =arr.length-1 ;i>=0;i--)
           s=s+" "+arr[i];

        System.out.println(s.trim());

    }
}
