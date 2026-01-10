package Java8.Programs;

import java.util.Arrays;

public class KthLargestEleInArray {

    public static void main(String[] args) {
        //int[] arr = {10,11,5,4,7,8};
        //find 3rd largest - 8
        //find 2nd largest - 10

        //easy solution would be sort the array, remove duplicates then based on order return the elements
        int[] arr = {10,11,5,4,7,8};

        //        Arrays.sort(arr);
        //        System.out.println("third largest: "+ arr[arr.length-3]);

        //without sorting -->
        int max = 0;
        for(int i = 0; i< arr.length;i++)
        {
           max =  Math.max(max,arr[i]);

        }
        System.out.println(max);


    }
}
