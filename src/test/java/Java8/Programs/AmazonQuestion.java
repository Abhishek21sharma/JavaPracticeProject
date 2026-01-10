package Java8.Programs;

import java.util.HashSet;
import java.util.Set;

public class AmazonQuestion {

    public static void main(String[] args) {

        //https://www.geeksforgeeks.org/explore?page=1&category=Strings&sortBy=submissions


        findSubArr();
        //ok now this method works -- just google so it's the right method to solve this
        //findSubArrAnotherLogic();

           }

           public static void findSubArrAnotherLogic(){

        //using sliding window
        //lets see if we can use just single loop for this ??

               int[] arr = {1,2,3,7,5};
               int target = 12;
               int i = 0;int j = 0;
               int max = 0;
               while(i<arr.length){
                   max = max+ arr[i];
                   if(max == target)
                   {
                       System.out.println("sub-array is: ["+(i+1)+","+(j+1)+"]");
                       return;
                   }

                   i++;
               }
           }


           public static Set<Integer> findSubArr(){
               //Input: arr[] = [1,2,3,7,5], target = 12
               //Output: [2, 4]
               //Explanation: The sum of elements from 2nd to 4th position is 12.

               //Input: arr[] = [1,2,3,4,5,6,7,8,9,10], target = 15,
               //Output: [1, 5]
               //Explanation: The sum of elements from 1st to 5th position is 15.

               //Input: arr[] = [7,2,1], target = 2
               //Output: [2, 2]
               //Explanation: The sum of elements from 2nd to 2nd position is 2.

/*               int[] arr = {1,2,3,7,5};
               int target = 12;*/
               // 1,2,3,4,5 --> 2+3+7 = 12 --> starting from 2 to 4

               //another sliding window problem ??

               //int i = 0; int j = 0;
              // Set<Integer> set = new HashSet<>();
/*        while (i<arr.length)
        {

            set.add(arr[i]);
            i++;
            set.remove(arr[j]);
            j++;
        }*/
               //int[] arr = {1,2,3,7,5}

            /*   int[] arr = {1,2,3,7,5};
               int target = 12;*/

/*
               int[] arr= {1,2,3,4,5,6,7,8,9,10};
               int target = 15;
*/

               int[] arr = {7,2,1}; int target = 2;

               int max ;
               Set<Integer> set = new HashSet<>();
               for(int i = 0 ; i< arr.length;i++)
               {
                   max= 0;
                   for(int j = i; j<arr.length;j++)
                   {
                       //{1,2,3,7,5}
                       max = max+arr[j];//1+2+3+7.. 2+3+7=12

                       if(max == target)
                       {
                           System.out.println("sub-array is: ["+(i+1)+","+(j+1)+"]");
                           //do a return here not break
                           return set;
                       }
                       if(max > target)
                           break;
                   }
               }


               return set;
           }
}
