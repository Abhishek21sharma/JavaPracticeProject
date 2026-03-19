package Java8.MoreJava8Features;

public class PatternMatchingWithSwitch {

    //old way..

    public void oldWay(Object o ){
        if(o instanceof String){
            int i = ((String) o).length();
        }
        else if(o instanceof  Integer){
            int i  = (int) o;
        }
        //default statment..
    }

    //modern way..
    public String patternMatchingSwitch(Object o ){
        return switch (o){
            //look how cases handled it..
            case String s -> "String of length" +s.length();
            case Integer i -> "Integer: " +i;
            case null, default -> "not a string or int";
        };
    }
}
