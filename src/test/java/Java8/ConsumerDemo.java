package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    //it accepts a param but returns nothing

    Consumer<String> c = s -> System.out.println(s);
    Consumer<String> c1 = System.out::println;

    //can link 2 consumers together
    //like storing something to database or writing in a log file
    //can do bi-consumer

    //important example

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abhi");
        list.add("shek");

        Consumer<String> c2 = System.out::println;

        //foreach accepts a consumer
        list.forEach(c2);

        //so it can be directly written in method ref as foreach() a 'higher order function'
        //list.forEach(s-> System.out.println(s.toUpperCase()));

        //can we do this ??
        //i think no, as it will create a return type of string and a forach just accept
        //a consumer (no return type) , so whatever we use in consumer , should be of void type
        list.forEach(String::toUpperCase);
        //ofcourse it didn;t do anthing
    }


}
