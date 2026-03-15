package Java8.Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ExamplePractice2 {

    public static void main(String[] args) {
        //return longest substring without repeated chars

        //abcabcbb
        //answer -> 3
        //explanation -> abc -> 3

        //classic sliding window
        int size = 0;
        int i = 0, j=0;
        String s = "abcabcbb";
        Map<Integer,Integer> map = new HashMap<>();


        //following is a brutefore method as it uses 2 loops
        //if we use hasset, we can do it using 1 loop only
        //that's the accepted way...
        while( i < s.length()){
            j = i+1;
            while (j < s.length()){
                if (s.charAt(i) != s.charAt(j)){
                    size = Math.max(size, j-i +1);
                    size++;
                    j++;
                }
                break;
            }
            map.put(size, map.getOrDefault(size,1)+1);

            //size = (size == ) ? size : 0;
            i++;
        }

        System.out.println("longest substring of size is : "+map);
    }

    public static void findLongestNonRepeatingSubString(String s){
        //abcabcbb
        //abcbbcbb
        int i = 0, j =0;
        int max = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while (j < s.length()){
            if(!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j));
                j++;
                max = Math.max(hashSet.size(),max);
            }
            else {
                hashSet.remove(s.charAt(i));
                i++;
            }
        }

    }

    public void isPalindron(){
        //abcba
        //
        String s = "abcba";
        //ignore any alphanumeric characters and ignoring cases
        String s2 = "A man, a plan, a canal: Panama";
        String s3 = s2.replaceAll(" ","").replaceAll("^(a-zA-Z0-9)","");
        int i=0;
        int j = s.length()-1;
        boolean flag = false;

        while(i<s.length()/2)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
            }
            else {
                break;
            }
        }
    }

 public static void removeDuplicateFromString(){
        String s = "abbaca";
        //remove bb -> as they are same and next to each other --> aaca
        //remove aa -> since they are same and next to each other --> ca
        //ca
        //no more prints.. so print this now..

        //stack is havily used in such cases.. as its easy to implement...

        char[] stack = new char[s.length()];
        int i = 0;
     for (int j = 0; j < s.length(); j++) {
         char current_char = s.charAt(j);

         if( i> 0 && stack[i-1] == current_char)
         {
             i--;
         }
         else{
             stack[i] = current_char;
             i++;
         }
     }
 }
}
