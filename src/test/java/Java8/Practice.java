package Java8;

import java.sql.SQLOutput;

public class Practice {
    //lambda expression is implementation of a functional interface



    public static void main(String[] args) {

        //following is the old style of creating method implemetation of a functional interface
        //functional interface - an interface with just 1 abstract method in it

        Greet hiGreet = new Greet() {
            @Override
            public void greet(String name) {
                System.out.println("..hi "+name);
            }
        };
        hiGreet.greet("abhi");

        Greet helloGreet = n -> System.out.println("..hello "+n);
        Greet helloGreet1 = System.out::println;

        helloGreet.greet("abhi");
        helloGreet1.greet("abhi");

        //look how this is written
        StringConversion stringConversionToUpperCase = s -> {
            return s.toUpperCase();
        };

        //implemented in a better & easy way
        //without return
        //without method param actually being used
        StringConversion stringConversion = String::toUpperCase;

        System.out.println(stringConversionToUpperCase.stringConversion(".. hi , mate .."));
        System.out.println(stringConversion.stringConversion("hello, mate"));

        //lambda can directly be used/called when calling a new method
        //this is called a 'higher order function'
        //it means that it can be used as run time implementation as well
        // so instead of writing somethng like
        Greet g = n -> System.out.println("Hey there buddy "+ n);
        test(g);

        //we can driectly pass the function as well
        test(System.out::println);
        test(s -> s.toUpperCase());
        test(s -> {
            System.out.println("Hello there "+s.toUpperCase()+ " greeting to you! ");
        });

        //a higher order function can also return lambda
        //and can be called from main method
         test1().greet("hey abhi");


         //method ref

        // a single line lambda can be called as
        //classname::methodname
        //the param (if any) will be auto assigned to method of class
        //String::toUpperCase
        //it is something like s-> s.toUpperCase();

    }


    //now look carefully, whoever is calling test() method has to provide the implementation as well (of Greet interface)
    public static void test(Greet g){
        g.greet("Abhi");
    }

    public static Greet test1(){
        return s -> System.out.println(s.toUpperCase());
    }
}
