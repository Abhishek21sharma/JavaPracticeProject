package Java8.DesignPatterns.SRT.FactoryPattern;

public abstract class GooglePage {

    public abstract void launchURL();
    public abstract void search(String keyword);
    public abstract int getResultsCount();
}
