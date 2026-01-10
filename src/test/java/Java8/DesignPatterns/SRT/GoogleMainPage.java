package Java8.DesignPatterns.SRT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {
    //this is the main page, so this will use the component(small feature) classes

    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestions searchSuggestions;

    public GoogleMainPage(final WebDriver driver){
        this.driver = driver;
        //create instances of the component pages and give it back
        this.searchSuggestions = PageFactory.initElements(driver,SearchSuggestions.class);
        this.searchWidget = PageFactory.initElements(driver,SearchWidget.class);
    }

    //implement main page method

    public void goTo(String URL){
        this.driver.get(URL);
    }

    //also since it's a main class it should return the component classes as well
    //means that who-ever needs component class, should go via this class only

    public SearchWidget getSearchWidget() {
        return this.searchWidget;
    }

    public SearchSuggestions getSearchSuggestions(){
        return this.searchSuggestions;
    }
}
