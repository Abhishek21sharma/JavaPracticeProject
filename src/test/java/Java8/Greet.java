package Java8;

//FI - must have 1 method only but can be of any return type
@FunctionalInterface
public interface Greet {

    //abstract method -> just 1 method with no return type
    void greet(String name);
}
