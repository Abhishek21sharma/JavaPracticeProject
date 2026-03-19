package Java8.MoreJava8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMoreExamples {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("name!");
        students.add("RaiZZKK");
        students.add("oPiNOs");
        students.add("kkish");
        students.add("Jag");
        students.add("Joll");

        String s = students.stream().collect(Collectors.joining("-"));
        System.out.println(s);


        //How to debug stream pipline.
        //we can add in 'peek()' method..

        //stream reduce() function..
        //we have similar in JS as well::

        //limit() --> how many elements allowed
        //skip() -->

        List<Integer> list = Arrays.asList(1,2,3,4,9,1,22);
        Integer reduce = list.stream().
        //a is the result..
                //b is the stream element..
                reduce(1, (a, b) -> a * b);
            //initial val 1
        // a=1(initial), b = 1(stream)
        //a=1,b=2
        //a=


    }
}
