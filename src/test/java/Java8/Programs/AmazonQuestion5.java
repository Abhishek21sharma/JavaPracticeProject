package Java8.Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Supplier;

public class AmazonQuestion5 {

    public static void main(String[] args) {
        //smallest missing +Ve number
        smallestMisPosNum1();

    }

    public static int smallestMisPosNum1(){
        int[] arr = {2, -3, 4, 1, 1, 7};
        boolean flag = false;
        int min =0;
        //output - 3
        //will check 1 to n what is not in array

        for (int i = 1 ;i< arr.length;i++){
            for(int j = 0;j< arr.length;j++)
            {
                if((i != arr[j])){
                    if(arr[j] > 0){
                    flag = true;
                    min = Math.min(min,i);//1
                    break;}
                }
            }
                if(flag)
                { //1
                    //1>2
                    min = Math.min(min,i);
                }
            }
        System.out.println("min +ve missing num is: "+min);
        return 0;
    }

    public static void smallestMissingPositiveNum(){
        //You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.
        //
        //Note: Positive number starts from 1. The array can have negative integers too.
        //
        //Examples:
        //
        //Input: arr[] = [2, -3, 4, 1, 1, 7]
        //Output: 3
        //Explanation: Smallest positive missing number is 3.

        //Input: arr[] = [5, 3, 2, 5, 1]
        //Output: 4
        //Explanation: Smallest positive missing number is 4.

        //Input: arr[] = [-8, 0, -1, -4, -3]
        //Output: 1
        //Explanation: Smallest positive missing number is 1.

        int[] arr = {2, -3, 4, 1, 1, 7};
        //output - 3
        //1st apprach - remove -ve, remove dup
        //sort array - check a[i] !=i -> missing is is i

        int i =0;
        int j = 0;
        int[] temp = new int[arr.length];
        while(i<arr.length)
        {
            if (arr[i]>0)
            {
                temp[j]=arr[i];
                j++;
            }
            i++;
        }

        int[] newArr= Arrays.stream(temp).distinct().sorted().toArray();

        for(int k = 0;k<newArr.length;k++){
            if(k!=newArr[k]) {
                System.out.println("missing ele is: " + k);
                break;
            }

        }
    }
}
