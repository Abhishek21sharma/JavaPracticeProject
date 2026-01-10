package Java8.Programs;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayQuestions {

    public static void main(String[] args) {
      //  printArrayNegInBeg();
      //  printTopKRepWords();
        elePos();
    }

    static void elePos(){
        int[] arr = {1,2,2,3,3,3,4,5,6,6,7};
        int index_of_ele = 6;
        //using a single loop as the complexity is: O(n)
        int[] temp = {-1,1};
        int i = 0; int j = arr.length -1;
        while (i<=j){
            if (arr[i] == index_of_ele)
                temp[0]=i;
            i++;
            if((arr[j]==index_of_ele))
                temp[1]=j;
            j--;
        }
    }


    //{1,2,2,3,3,3,4,5,6,6,7}
    static void removeDupFromSortedArray(){
    int[] arr = {1,2,2,3,3,3,4,5,6,6,7};

    }


    static void printTopKRepWords(){
        String[] arr = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        HashMap<String,Integer> map = new HashMap<>();

        for(String s: arr){
            if(map.get(s) == null)
                map.put(s,1);
            else
                map.put(s,(map.get(s))+1);
        }

        System.out.println(map);
        //now return the String whose length is greatest

        int max=0;
        for(String s: map.keySet())
        {
            if(map.get(s) > max)
                max=map.get(s);
        }
        System.out.println(max);

        String s2= null;
        for(String s1: map.keySet())
        {
            if(map.get(s1) == max)
                s2 = s1;

        }

        System.out.println(s2);

    }

    static void printArrayNegInBeg(){
        int[] arr = {-1,-20,3,-5,9,-8};
        //expected: {-1,-20,-5,-8,3,9};

        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length ; i++)
        {
            if(arr[i]<0)
            {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0 ; i< arr.length; i++){
            if (arr[i]>0)
            {
                temp[j] = arr[i];
                j++;
            }
        }

        Arrays.stream(temp).forEach(System.out::println);

    }

    @Test
    public void twoSumOfArray(){
        //nums = {2,7,11,15}, target = 9
        //ans: [0,1]
        //explain - nums[0] + nums[1] == 9 (target) so returns array of {0,1}

        //another two pointer maybe
        int[] nums = {2,3,1,5,7};
        int target = 10;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <(nums.length)-1 ; i++)
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target)
                {
                    list.add(i);
                    list.add(j);
                    break;
                }
            }
        System.out.println(list);
    }

    @Test
    public void twoSumOfArrayBestApproach(){
        //nums = {16,4,23,8,15,42,1,2}, target = 19
        //ans: [1,4]
        //explain - nums[1] + nums[4] == 19 (target) so returns array of {0,1}


        //best solution is using hashmap
        //look at the target and find the complement of it by substracting it with
        //the first value & store it in the map if value doesn't find
        //otherwise just returns it if value find

       //step1 //19-16 = 3 (so store key as 16 and it's index 0 as value  as because  3 (As a key) doesn't exists in the hashmap)
       //step2 //19-4 = 15 ((so store key as 4 and it's index 1 as 15 (As a key) doesn't exists in the hashmap)
        //19-23 = -4 (....)
        //19-8 = 11 (....)
        //19-15 = 4( now we can see map.get(4) exists in step 2 , so answer would be
        //value of step 2 (index 1 ) and current index (index4)

        //https://www.youtube.com/watch?v=7jDS9KQEDbI

        int[] nums = {16,4,23,8,15,42,1,2};
        int target = 19;
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.get(target-nums[i]) != null){
                int[] a = {map.get(target-nums[i]),i};
                break;
            }
            map.put(nums[i],i);
        }




    }
}
