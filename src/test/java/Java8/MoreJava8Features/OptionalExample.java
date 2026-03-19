package Java8.MoreJava8Features;

import java.util.Optional;

public class OptionalExample {

    //it's included as part of java 8..

    public static void main(String[] args) {
        //avoid null pointer exception and un-necessary null checks..

        //main use case -->>
        //it will check if the value is nullable or not..

        Optional<String>  optional  = Optional.ofNullable("hello");
        System.out.println(optional.get()); //return the value

        //use it with
        if(optional.isPresent()){
            System.out.println("do something...");
        }

        //Very USEFUL Check to handle NULL scenarios and add a DEFAULT for it
        optionalOrElse("aabc");
        optionalOrElse(null);
    }


    //very usefull..
    public static void optionalOrElse(String s){
        //if something is not present or null
        //then use this instead...
        Optional op = Optional.ofNullable(s);
        //VERY USEFUL METHOD to handle NULL use cases..
        Object s2 = op.orElse("Default String");
        System.out.println(s2);

    }

    //to add custom exception for null cases..
    public static void optioanlOrElseThrow(String s) throws Throwable {
        Optional op = Optional.ofNullable(s);
        Object s2 = op.orElseThrow(() -> new RuntimeException("our own custom exception msg"));
        System.out.println(s2);
    }

    //another good method to do a fail safe checks..
    public static void optionalIfPresent(String s) {
       Optional op = Optional.ofNullable(s);
       //if present then do something..
    }

    public static String getStudentName(){
        //assume this will come from api or from somewhere else..

        String s = null;
        //return  s; // in this case.. it will throw null

        //if (s!=null){} else{}
        //now this if else can be combined in 'optional block'..

        //fail safe check..
        Optional optional= Optional.ofNullable(s);//we can use all stream() methods on the back of it..
        if(optional.isPresent()){
            return "";
        }
        return "";




    }
}
