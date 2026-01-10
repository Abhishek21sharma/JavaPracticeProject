package Java8.DesignPatterns.SRT.TemplatePattern;

public abstract class ShoppingTemplate {
    //parent class have an algorithm and child class have to implement the steps


    public abstract void launchSite();
    public abstract void searchForProduct();
    public abstract void selectProduct();
    public abstract void buy();

    public void shop(){
        launchSite();
        searchForProduct();
        searchForProduct();
        buy();
    }

}
