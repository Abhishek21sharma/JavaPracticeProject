package Java8.Programs;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseAStringUsingTwoPointer {

    public static void main(String[] args) {
        //You must do this by modifying the input array in-place with O(1) extra memory.
        //
        //
        //
        //Example 1:
        //
        //Input: s = ["h","e","l","l","o"]
        //Output: ["o","l","l","e","h"]
        //Example 2:
        //
        //Input: s = ["H","a","n","n","a","h"]
        //Output: ["h","a","n","n","a","H"]


        char[] s = {'H','a','n','n','a','h'};
        int a_pointer= 0;
        int b_pointer = s.length-1;



        while (a_pointer <= b_pointer){
            char temp = s[a_pointer];
            s[a_pointer] = s[b_pointer];
            s[b_pointer] = temp;
            a_pointer++;
            b_pointer--;
        }

        Stream.of(s).forEach(System.out::println);

        for (char c: s
             ) {
            System.out.println(c);
        }


    }
}
