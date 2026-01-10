package Java8.Programs;

import java.util.*;

public class AmazonQuestion4 {

    public static void main(String[] args) {
        //uniquePairs();
        bestApproachUniquePairs();
    }

    static void bestApproachUniquePairs(){


        int[] arr = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        HashSet<Integer> set = new HashSet<>();

        for(Integer i: arr){
            set.add(i);
        }
        System.out.println(set);





    }


    static void uniquePairs(){
        //Given an integer array arr, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.
        //Note: The pairs must be returned in sorted order, the solution array should also be sorted, and the answer must not contain any duplicate pairs.

        //Input: arr = [-1, 0, 1, 2, -1, -4]
        //Output: [[-1, 1]]
        //Explanation: arr[0] + arr[2] = (-1)+ 1 = 0.
        //arr[2] + arr[4] = 1 + (-1) = 0.
        //The distinct triplets are [-1,1].

        //Input: arr = [6, 1, 8, 0, 4, -9, -1, -10, -6, -5]
        //Output: [[-6, 6],[-1, 1]]
        //Explanation: The distinct triplets are [-1, 1] and [-6, 6].
        //complexity --> O(nlogn)

        int[] arr = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < arr.length;i++){
            for(int j =i+1; j<arr.length-1;j++)
            {
                if(arr[i]+arr[j]==0){
                    list.add(arr[i]);
                    list.add(arr[j]);
                }
            }
        }
        System.out.println(list);

    }
}
