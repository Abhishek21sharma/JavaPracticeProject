package Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(1);
        list.add(10);
        list.add(14);
        list.add(67);
        list.add(90);
        list.add(71);

        //using tradational method -
        //check for even number and print the sqaure
/*        for (Integer i:list
             ) {
            if(i%2==0)
                System.out.println("number: "+i+" Sqaure: "+i*i);
        }*/

        //same using stream
        //1 liner and very fast in execution
       // list.stream().filter(i->i%2==0).limit(3).map(i -> i*i).forEach(System.out::println);

        //usage of map like this: conditionl usage of map
        list.stream().map( i -> i%2==0?i+1:i).forEach(System.out::println);


        //filter -> conditional
        //map -> transformational

        //stream operation -->
        //1 . terminal operation (stream is consumed, cannot be re-used) (only 1 terminal operation per stream)
        //forEach,collect,count,min,max,findAny etc

        //2. Intermideiate opertaions (Returns new stream, lazy in nature) (can have multiple intermediate operations)
        //filter,map,limit,skip,distinct,platmap,sorted,peek etc

        //There is concept of parallel stream when data volume is too high

        //lazy --> because stream works only when a terminal operator is applied to a stream
        //if there is just intermediate operations added then stream basically won't execute


        //stream can be used as a traditional for loop using IntStream like below
       // IntStream.range(1,10)

    }
}
