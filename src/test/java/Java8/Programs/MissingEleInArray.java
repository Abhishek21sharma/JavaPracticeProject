package Java8.Programs;

import java.util.Arrays;

public class MissingEleInArray {
    public static void main(String[] args) {
        //pls see basicApproach solution first
        bestApproach();
    }

    public static void bestApproach(){

        //Input: arr[] = [1, 2, 3, 5]
        //Output: 4
        //Explanation: All the numbers from 1 to 5 are present except 4.

        //Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
        //Output: 6
        //Explanation: All the numbers from 1 to 8 are present except 6.


        //without sorting an array , this can be solved by a math example -- please see the apporach below

        //Approach:
        //
        //To solve this problem of finding the missing number in an array, we can break it down as follows:
        //
        //Given an array arr of size n-1 containing distinct integers in the range of 1 to n, the key observation is that:
        //
        //The array represents a sequence of numbers from 1 to n with one number missing.
        //The sum of the first `n` natural numbers can be calculated using the formula:
        //   Sum(n) = n*(n+1)/2
        //By calculating the sum of the numbers in the array and subtracting it from Sum(n), we can find the missing number.
        //For example:

        //n = 5, arr[] = [1,2,3,5]
        //  The sum of numbers from 1 to 5 is 1 + 2 + 3 + 4 + 5 = 15.
        //  The sum of the array is 1 + 2 + 3 + 5 = 11.
        //  The missing number is 15 - 11 = 4.
        //n = 2, arr[] = [1]
        //  The sum of numbers from 1 to 2 is 1 + 2 = 3.
        //  The sum of the array is 1.
        //  The missing number is 3 - 1 = 2.

        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        // Calculate the sum of the first n natural numbers
        //n is size of array +1
        int n = arr.length+1;

        int totalSum = n * (n + 1) / 2;

        // Calculate the sum of elements in the array
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        // The missing number is the difference between the total sum and the array sum
        int missingNum = totalSum - arrSum;
        System.out.println(missingNum);


    }

    public static void basicApproach1(){
        //Input: arr[] = [1, 2, 3, 5]
        //Output: 4
        //Explanation: All the numbers from 1 to 5 are present except 4.

        //Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
        //Output: 6
        //Explanation: All the numbers from 1 to 8 are present except 6.

        //ok so array is simple +ve array
        //where it's not in order so have to find out what is missing
        //in normal human brain , we can sort it first?
        //check the first and last most ele
        //then loop through & see what's missing ?

        //like sort it then do if(!(a[i] == i))--> i is missing

        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        Arrays.sort(arr);

        int i = 0;
        while (i<arr.length)
        {
            if(!(arr[i]==(i+1))){
                System.out.println("missing ele is: "+(i+1));
                break;
            }
            i++;
        }

    }
}
