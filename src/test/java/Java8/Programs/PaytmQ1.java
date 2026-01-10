package Java8.Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PaytmQ1 {

    public static void main(String[] args) {
        arrayDuplicates();
    }

    public static void arrayDuplicates(){
        //Given an array arr of integers,
        // find all the elements that occur more than once in the array.
        // Return the result in ascending order. If no element repeats, return an empty array.
        //Input: arr[] = [2, 3, 1, 2, 3]
        //Output: [2, 3]
        //Explanation: 2 and 3 occur more than once in the given array.

        //Input: arr[] = [0, 3, 1, 2]
        //Output: []
        //Explanation: There is no repeating element in the array, so the output is empty.

        int[] arr = {2, 3, 1, 2, 3};
        int[] temp = new int[arr.length];

        int i=0;
        Set<Integer> set = new HashSet<>();

        while(i< arr.length)
        {
            if(!set.contains(arr[i]))
                set.add(arr[i]);
            else
                temp[i] = arr[i];
            i++;
        }

        Arrays.stream(temp).filter(v->!(v==0)).forEach(System.out::println);


    }
}
