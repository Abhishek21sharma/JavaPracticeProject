package Java8.Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FirstUniqueCharactersInString {

    public static void main(String[] args) {
        //Input: s = "loveleetcode"
        //
        //Output: 2
        //so, v -> 2 character ..

        int i = 0;
        String s = "loveleetcode";
        char[] c = s.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (char ch: c) {
            map.put(ch, (map.getOrDefault(ch,0))+1);
        }

//        map.entrySet().stream().filter( m -> m.getValue() == 1)
//                .findFirst().ifPresent(System.out::println);

        for (Character ch1: map.keySet()) {
            if (map.get(ch1) == 1) {
                System.out.println("index is: "+i);
                break;
            }
            i++;
        }

    }
}
