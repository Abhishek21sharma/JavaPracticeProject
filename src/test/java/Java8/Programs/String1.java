package Java8.Programs;

import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {
        //Given an array of strings arr[].
        // Return the longest common prefix among each and every strings present in the array.
        // If there's no prefix common in all the strings, return "".

        //Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
        //Output: "gee"
        //Explanation: "gee" is the longest common prefix in all the given strings.

        //Input: arr[] = ["hello", "world"]
        //Output: ""
        //Explanation: There's no common prefix in the given strings.

        String[] arr = {"club", "clap", "clove"};
        //output="cl"

        String s = "";
        //brute force technique
/*        for(int i = 0 ; i<arr.length-1; i++)
        {
            if(arr[i].charAt(i) == arr[i+1].charAt(i))
                s=s+arr[i].charAt(i);
        }

        System.out.println(s);*/

        //better tech
        Arrays.sort(arr);
        //now comp first and last ele
        //as all other elements will be in same order
        //check the youtube link for explanation
        //https://www.youtube.com/watch?v=wtOQaovlvhY
        
        char[] first = arr[1].toCharArray();
        char[] last = arr[arr.length-1].toCharArray();

        for(int i = 0; i < first.length;i++)
        {
            if(!(first[i]==last[i]))
                break;
            s=s+first[i];
        }
        System.out.println(s);

        //there is very interesting solution here, so look here for solution
        //https://www.youtube.com/watch?v=bl8ue-dTxgs
    }
}
