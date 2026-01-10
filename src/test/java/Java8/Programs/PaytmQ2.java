package Java8.Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PaytmQ2 {

    public static void main(String[] args) {
        //Common in 3 Sorted Arrays

        //You are given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
        //If there are no such elements return an empty array. In this case, the output will be -1.
        //Note: can you handle the duplicates without using any additional Data Structure?

        //Input: arr1 = [1, 5, 10, 20, 40, 80] , arr2 = [6, 7, 20, 80, 100] , arr3 = [3, 4, 15, 20, 30, 70, 80, 120]
        //Output: [20, 80]
        //Explanation: 20 and 80 are the only common elements in arr, brr and crr.

        //Input: arr1 = [1, 1, 1, 2, 2, 2], B = [1, 1, 2, 2, 2], arr3 = [1, 1, 1, 1, 2, 2, 2, 2]
        //Output: [1, 2]
        //Explanation: We do not need to consider duplicates


        //Expected Time Complexity: O(n)


        int[] arr1 = {1, 5, 10, 20, 40, 80,80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        //output [20,80]

        //using collection approach
        //https://www.youtube.com/watch?v=4-empwELoGo

        Map<Integer,Integer> map = new HashMap();

        //processing 1st array --> we will store each element value as 1 only
        for(int i:arr1)
            map.put(i,1);

        //processing  array 2 --> we will see if key already exisit then mae it 2, otherwise value as 1 only
        for (int j :arr2)
            if(!(map.get(j)==null))
                map.put(j,2);
        //processing 3rd array and increase the count to 3 if they already have a key
        for (int k :arr3)
            if(!(map.get(k)==null))
                map.put(k,3);

        System.out.println(map);

       for(int i: map.keySet())
           if(map.get(i)==3)
               System.out.println(i);



    }
}
