package Java8.Programs;

import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {
        //anagramCheckUsingMap();
        anagramCheck();
    }

    static boolean anagramCheckUsingMap(){
        //string anagram
        //if strings have same characters with same number but maybe with different order
        //can i use hasmap maybe ? ok lets just try

        String s1 = "abaccb";
        String s2 = "abbbac"; //


        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();


        //if both string lenghts are not equal then ofcourse they're not anagram
        if (s1.length() != s2.length())
            return false;

//        for (char c: s1.toCharArray()) {
//            if(map1.get(c)!=null)
//                map1.put(c,map1.get(c)+1);
//            else
//                map1.put(c,1);
//        }
        //writing the above code in java 8 style
        s1.chars()
                .mapToObj(c -> (char) c)
                .forEach( c->
                           {
                            if(map1.get(c)!=null)
                                map1.put(c,map1.get(c)+1);
                            else
                                map1.put(c,1);
                            }
                );

        s2.chars()
                .mapToObj(c -> (char) c)
                .forEach( c->
                        {
                            if(map2.get(c)!=null)
                                map2.put(c,map2.get(c)+1);
                            else
                                map2.put(c,1);
                        }
                );

        if(map1.equals(map2)){
            System.out.println("Both strings are anagram");
            return true;
        }
        else{
            System.out.println("Strings are not anagram");
           return false;}
    }

    static boolean anagramCheck(){
        String s1 = "anagram";
        String s2 = "nagaram";

        if (s1.length() != s2.length())
            return false;

        //trick is to loop through each character of string
        //then save it in a char array
        //then for each occ of character : increase the count by 1
        int[] count_char = new int[25]; //as total 26 characters in alphabetes

        //following is a detailed for loop example

//        for (int i = 0; i<s1.length();i++)
//        {
//            System.out.println("character is: "+ s1.charAt(i));
//            System.out.println("index in array: count_char["+ (s1.charAt(i) - 'a')+"]");
//
//            a = count_char[s1.charAt(i) - 'a']++;
//            System.out.println("value at above index is: "+a );
//           // count_char[s1.charAt(i) - 'a'] ++; // 'a'-'a' = 97-97 = 0 , so
//            //count_char[0] = count_char[0] + 1;
//
//        }

        for (int i =0; i<s1.length();i++){

            count_char[s1.charAt(i) -'a']++;
            count_char[s2.charAt(i)-'a']--;

        }

        for (int count: count_char
             ) {
            if(count != 0)
                return false;
        }
        return true;
    }
}
