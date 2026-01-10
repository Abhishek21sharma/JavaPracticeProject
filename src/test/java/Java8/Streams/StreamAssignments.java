package Java8.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAssignments {

    public static void main(String[] args) throws IOException {


        //read all lines of the file
        List<String> list = Files.readAllLines(Paths.get("test.txt"));

        //print the count of names starts with B
        int nameStartWithB = (int) list.stream().filter(s -> s.startsWith("B")).count();
        System.out.println(" --B-- "+nameStartWithB);

        //print the total number of characters for all names star ts with m
        //Maxy,Mike -> 8 characters

        int totalChars= list.stream().filter(s -> s.toLowerCase().startsWith("m"))
                .map(String::trim)
                .map(name -> name.length())
                .mapToInt(i -> i)
                .sum();
        System.out.println("--total chars with M-- "+totalChars);


        //remove - from Jo-An and replace with space, collect the in list

        List<String> list2 = list.stream().filter(n->n.contains("-")).map(s -> s.replace("-", ""))
                .collect(Collectors.toList());
        //list2.stream().forEach(System.out::println);

        //find the name with more number of characters and print it
        //Bob , Anaa -> print Anna

        OptionalInt max = list.stream().map(String::length)
                .mapToInt(i -> i)
                .max();
        System.out.println("max: "+ max.getAsInt());


        //or how to do it in better way
        String s1 = list.stream().max(Comparator.comparing(s -> s.length())).get();
        System.out.println(s1);

        //or above in a tradational way can be do like this
        Map<Integer,String> map = new HashMap<>();
        //store length of each string and string itself in a map

        list.stream().forEach( s -> map.put(s.length(),s));
        //for (String s: list) {
       //    map.put(s.length(),s) ;
        //}

        //select the minimum price Row and click the Verify button
        //this is from a table

    }
}
