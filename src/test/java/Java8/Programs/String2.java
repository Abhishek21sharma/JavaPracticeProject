package Java8.Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class String2 {

    public static void main(String[] args) {
        //Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.
        //Note: When you return '$' driver code will output -1.

        //Input: s = "geeksforgeeks"
        //Output: 'f'
        //Explanation: In the given string, 'f' is the first character in the string which does not repeat.

        //Input: s = "aabbccc"
        //Output: -1
        //Explanation: All the characters in the given string are repeating.


        //Input: s = "racecar"
        //Output: 'e'
        //Explanation: In the given string, 'e' is the only character in the string which does not repeat.

        String s = "geeksforgeeks";
        //to add it in a HashSet or HashMap if they are double?
        //linkedHashedMap as they mainted the insertion order
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (char c: map.keySet()) {
            if(map.get(c)==1){
                System.out.println("first non-repetive word is: "+c);
                break;
            }
        }

    }
}
