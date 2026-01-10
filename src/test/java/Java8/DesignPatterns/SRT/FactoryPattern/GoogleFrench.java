package Java8.DesignPatterns.SRT.FactoryPattern;

import org.openqa.selenium.WebDriver;

public class GoogleFrench extends GooglePage{
    public GoogleFrench(WebDriver d) {
        super();
    }

    @Override
    public void launchURL() {

    }

    @Override
    public void search(String keyword) {

    }

    @Override
    public int getResultsCount() {
        return 0;
    }
}
