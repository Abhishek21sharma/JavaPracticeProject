package Java8.Programs;

import java.util.HashMap;
import java.util.Map;

public class AmazonQuestion2 {

    public static void main(String[] args) {
        //find the majority element in an array
        //Given an array arr. Find the majority element in the array. If no majority exists, return -1.
        //
        //A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

        //Input: arr[] = [3, 1, 3, 3, 2]
        //Output: 3
        //Explanation: Since, 3 is present more than n/2 times, so it is the majority element.

        //Input: arr[] = [2, 13]
        //Output: -1
        //Explanation: Since, no element is present more than n/2 times, so there is no majority element.

        //expected time complexity O(n)

        //int[] arr = {3, 1, 3, 3, 2};
        int[] arr = {2, 13};
        //an element is majority if ele is > arr.size()/2

        //i think i can store each element to a map and then get the key of each element and
        //see how many times each ele is appeared and which one is > arr.size/2 ??
        //ok let's try

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ;i++)
        {
            if(!(map.get(arr[i]) == null)){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
                map.put(arr[i],1);
        }



        boolean flag=true;
        for(Integer i : map.keySet()){
            if(map.get(i)>arr.length/2){
                flag=false;
                System.out.println("Majority element is: "+i);
            }
        }
        if(flag){
            System.out.println("No majority ele found: returning -1");
        }
        //so this solution has complexity of O(2n) --> we have used extra loop ...
        //also we haven't used any in-built java stream method

    }
}
