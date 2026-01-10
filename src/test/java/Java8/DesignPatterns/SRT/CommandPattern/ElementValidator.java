package Java8.DesignPatterns.SRT.CommandPattern;

public abstract class ElementValidator {
    //so when we have a big page to vlidate, it's better to use it this way
    public abstract boolean validate();

}
