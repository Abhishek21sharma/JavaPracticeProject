package Java8.Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExamplePractice {

    public static void main(String[] args) {

        //classic sliding window problem....


        //target = 7
        //nums= [2,3,1,2,4,3]
        //output = 2
        //minimal cont. sub-array, sum is greater than or equal to 7
        //[4,3]

        //brutforce method --> even that's not working for me... need to practice more #
//        int tar = 7;
//        int[] arr = {2,3,1,2,4,3};
//        int i = 0;
//        int j ;
//        int sum = 0 ;
//        int min_length = 0;
//        while(i <= arr.length)
//        {
//            j = i;
//            while (j < arr.length)
//            {
//                sum = sum+arr[j];// 0+2,2+3,5+1,6+2 =8 >= tar (length = j -  i =
//                if(sum >= tar)
//                {
//                    min_length = (j - i );
//                    break;
//                }
//                j++;
//            }
//            sum =0;
//            i++;
//        }
//        System.out.println("min length: "+min_length);
//

        //using sliding window :
        int L =0  , R = 0;
        int target = 7;
        int min = Integer.MAX_VALUE;//assigining arbitary max value to start with
        int sum =0;
        int[] num = {2,3,1,2,4,3};
        int n = num.length;

        while(R < n)
        {
            //add the current element
            sum += num[R];

            //contract window
            while(target <= sum){
                min = Math.min(min, R-L +1);
                sum -=num[L];
                L++;
            }
            R++;
        }

        min = (min == Integer.MAX_VALUE) ? 0 : min ;
        System.out.println("mim array is: "+min);
   }
}
