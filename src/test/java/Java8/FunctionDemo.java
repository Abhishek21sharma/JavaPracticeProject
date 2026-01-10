package Java8;

import java.util.function.Function;

public class FunctionDemo {
    //accepts something and returns something
    //used for transformation etc
    Function<Integer,Integer> fn = a -> a+5;
    Function<String,Integer> fn2 = a -> a.length()+10;
    Function<Integer,Integer> fnSquare = a -> a*a;
}
