package Java8.Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HackerRank {

    public static void main(String[] args) {
        //System.out.println(firstNonRepeatingCharacter());
        //System.out.println(firstDuplicate());
        //Arrays.stream(sortedSquareArray()).forEach(System.out::println);
        infiniteRepeatedString();
    }


    public static char firstNonRepeatingCharacter(){
        //aaabcccdeeef -> b
        //abcbad ->c
        //abcabcabc -> ?

        //maybe go one by one and store in a map , if any key as char
        //has value  = 1 , return it

        String s = "aaabcccdebeef";
        String s1 = "abcbad";

        //complextity - 2 O(n)

        Map<Character,Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for( char c : map.keySet()){
            if(map.get(c) == 1){
                return c;
            }
        }
        return 0;

    }

    public static int firstDuplicate(){


        //first duplicate in an array of integers..
        //constraints.. : so the elements in the array is between 1-N , where N is size of the array

        //hashmap --?? , store the elements... and returns the first one which is dups.
        //[1,2,1,2,3,3] -->  1
        //[2,1,3,5,3,2,1] --> 3


        int[] arr = {2,1,3,5,3,2,1};

        Map<Integer,Integer> map = new HashMap<>();

        for (int a : arr) {
            map.put(a, map.getOrDefault(a,0)+1);
            if(map.get(a) > 1){
                return a;
            }
        }
        return  -1;
    }

    public static int firstDupUsingSET(){
        int[] arr = {2,1,3,5,3,2,1};
        //loop through the hasset and only add to it, if that doesn;t exisit.. if it exisits
        //means it a dup and return that..
        ///much easier than above approach..
        int[] arr1 = {2,1,3,5,3,2,1};
        HashSet<Integer> hashSet = new HashSet<>();

        for ( int a : arr1
             ) {
            if(hashSet.contains(a)){
                return  a;
            }
            else {
                hashSet.add(a);
            }

        }

        return -1;

    }

    public  static  int[] sortedSquareArray(){
        //input --> sorted array of number
        //output --> sqaure the array and return the sorted array

        //catch --> so , to start with array can have input..

        //[1,2,3] --> [1,2,9]
        //[-3,-2,-1] --> [1,4,9]

        //[-7,-3,-1,4,8,12] --> [1,9,16,49,64,144]...


        int[] arr = {-7,-3,-1,4,8,12};
        int[] b = new int[arr.length];


        //very basic solution is::
        //make square and then do arrays.sort(array);


        //it's a 2 pointer problem..
        //so we will check the +ve of first with the last..
        //compare it and if greater than fill it up..

        //since it's sorted it will work..

        int i =0;
        int j = arr.length-1;

        for (int k = j; k >=0 ; k--) {
            //we're filling the last ele first..
            //[-7,-3,-1,4,8,12] --> [1,9,16,49,64,144]...
            //0(1) 1(9) 2(16) 3(49) 4(64) 5(144)

            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                b[k] = arr[i] * arr[i];
                i++;
            }
            else {
                b[k] = arr[j] * arr[j];
                j--;
            }
        }
        return b;

    }





    public static char firstNonRepChar(){
        //find the first occ of the char..
        //find the last occ of char..
        //if first occ == last occ , then there is just one occ of the char..

        String s = "erwrwerweq";
        for (char c : s.toCharArray()) {
            if(s.indexOf(c) == s.lastIndexOf(c) ){
                return c;
            }
        }
        return 0;
    }

    public static int test1(int [][] arr){
        //diagonal sum - abs diff
        //1 2 3
        //4 5 6
        //7 8 9

        //let to right -> 1+5+9 = 15
        //right to left -> 3+5+7 = 17
        //abs diff : 15 - 17 = 2 (abs)

        int left_to_right  = 0;
        int right_to_left = 0;

        int rows = arr.length; //returns the total rows
        int columns = arr[0].length;  // returns the total columns..

        int i = 0, j =0 , k = 0, l = arr.length -1;
        while( i< rows && j < columns && k < rows && l >= 0){
            left_to_right += arr[i][j];
            right_to_left += arr[k][l];
            i++;
            j++;
            k++;
            l--;
        }

        return Math.abs(left_to_right -  right_to_left);
    }

    public static void infiniteRepeatedString(){
        //s = aba
        //n =10
        //output --> abaabaabaa
        //a = 4

       String s = "aba";


        //aba
        int n = 10;
        String s1 = "";
        char[] c = s.toCharArray();
        int i = 0;

        //do not use brute force search..
        //then we have to drive a match formula..
    }

    public static void reverseInterger(){
        //x=123
        //return 321

        int x = 123;
        int pop;
        int reversed = 0;

        while (x != 0){
            pop = x%10; //123/10 = 3 (it always gives the last digit..
            x = x/10; //123/10 = 12 (it always gives the remainder other than last digit..
            reversed = (reversed * 10) + pop ; //last digit first..
        }

    }
}
