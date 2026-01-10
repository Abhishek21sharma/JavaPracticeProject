package Java8;

import java.util.function.Predicate;

public class predicateDemo {
    //predictate is to test a condition as it returns true/false (a bollen)
    //it accepts something and returns a bollen (based on the evaluation condition)

    public static void main(String[] args) {
        //no need to type return as it's  a single line lambda
        Predicate<Integer> isEven = n -> n%2 == 0;

        System.out.println("is the given number is EVEN??: " + isEven.test(6));
    }
}
