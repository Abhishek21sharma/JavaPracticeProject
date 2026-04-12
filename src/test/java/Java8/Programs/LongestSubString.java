package Java8.Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubString {

    public static void main(String[] args) {
        //longest sub-string without repeated character
        String s = "pwwkew";
        int length = 0;
        HashSet<Character> hashSet = new HashSet<>();
        int i = 0, j = 0;

        //it's a 2 pointer approach, or we could say sliding window , there is very rare difference between
        //the two approaches
        while( i < s.length()){
            if(!hashSet.contains(s.charAt(i))){
                hashSet.add(s.charAt(i));
                length = Math.max(length,hashSet.size());
                i++;
            }
            else {
                hashSet.remove(s.charAt(j));
                j++;
            }
        }

        String s1 = "";
        for (char c: hashSet
             ) {
            s1 = s1+c;
        }

        System.out.println("Longest substring of non-repeated characters is : "+s1);
        System.out.println("length is: "+length);

    }
}
