package Java8.Programs;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        //Input: nums = [2,7,11,15], target = 9
        //Output: [0,1]
        //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        //Input: nums = [3,2,4], target = 6
        //Output: [1,2]
        //6-3=3
        //6-2=4

        //Input: nums = [3,3], target = 6
        //Output: [0,1]

        int [] nums = {2,7,11,15};
        int target = 9 ;

        //store every character to map and it's difference from the target
        //check for the key if 9-2 = 7 ?? if map.get(7) ?
        //2 (key) & position as value 0 (value)
        //7 (key)


        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;


        for ( int a : nums) {
            if(null == map.get(target-a)){
                map.put(a,i);
            }
            else {
                System.out.println("elements are: "+a +" and: "+(target-a));
            }
            i++;
        }

    }
}
