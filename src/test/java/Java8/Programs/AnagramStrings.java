package Java8.Programs;

import org.testng.annotations.Test;

import java.util.HashMap;

public class AnagramStrings {

    public static void main(String[] args) {
        //there are so many ways to check if strings are anagram or not
        //so strings are anagram if they have same freq. of characts but maybe at different locations

        String s1 = "anaipplo";
        String s2 = "aaanoppl";

        char[] s1Char =  s1.toCharArray();
        char[] s2Char = s2.toCharArray();

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for (int i = 0 ; i< s1Char.length ; i++)
        {
            if(map1.get(s1Char[i])!= null )
                map1.put(s1Char[i],map1.get(s1Char[i])+1);
            else
                map1.put(s1Char[i],1);

            if(map2.get(s2Char[i])!= null )
                map2.put(s2Char[i],map2.get(s2Char[i])+1);
            else
                map2.put(s2Char[i],1);

        }

        System.out.println(map1);
        System.out.println(map2);

       // return map1.equals(map2);
        System.out.println("Both maps equal ? "+ map1.equals(map2));

    }

    @Test
    public void isAnagram(){
        String s1 = "rabar";

        int i = 0;
        int j = s1.length();
        char[] s = s1.toCharArray();
        boolean isAng = true;
        while(i<j)
        {
            if(!(s[i]==s[j-1]) )
            {   isAng = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println("String is Anagram: "+isAng);
    }
}
