package Java8.Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AmazonQuestion3 {
    public static void main(String[] args) {
        //findMajorityEleInArray();
        findMajorityEleInArrayUsingStreams();
    }

    public static int findMajorityEleInArray(){
        /**
         * same as question 2 (Amazon Question2)
         * But this solution is in 1 loop
         * & of-course in a better way
         */
        int[] arr = {3, 1, 3, 3, 2};
        Map<Integer,Integer> map=new HashMap<>();

        for(int i : arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>arr.length/2)
                return i;
        }
        return -1;
    }


    public static int findMajorityEleInArrayUsingStreams(){
        int[] arr = {3, 1, 3, 3, 2};
        Map<Integer,Integer> map=new HashMap<>();

         Arrays.stream(arr).
                 map(n-> map.put(n,map.getOrDefault(n,0)+1))
                .filter(i->map.get(i)>arr.length/2)
                 .forEach(System.out::println);

        return  -1;
    }
}
