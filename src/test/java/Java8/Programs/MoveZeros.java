package Java8.Programs;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        //Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
        //Note that you must do this in-place without making a copy of the array.
        //Example 1:
        //Input: nums = [0,1,0,3,12]
        //Output: [1,3,12,0,0]

        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);
    }


    public static void moveZeroes(int[] nums) {
//        int[] new_arr = new int[nums.length];
//        int k=0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if(!(0 == nums[i])){
//                new_arr[k] = nums[i];
//                k++;
//            }
//        }
//
//        Arrays.stream(new_arr).forEach(System.out::println);

           //Input: nums = [0,1,0,3,12]
          //Output: [1,3,12,0,0]

//        int i =0;
//        int j= nums.length;
//
//        while (i < nums.length){
//            if (!(nums[i]==0)){
//                nums[i]
//            }
//        }

        //it's similar to above
        //but it's more of 2 pointer problems..
        //where both the pointers be in the same
        //starting from same position

        int l = 0 , r = 1;
        while (r< nums.length){
            if(nums[l] !=0){
                l++;
                r++;
            }else if( nums[r] ==0){
                r++;
            }else {
                //swp ele's
                int temp =nums[r];
                nums[r] = nums [l];
                nums[l] = temp;
            }
        }

    }
}
