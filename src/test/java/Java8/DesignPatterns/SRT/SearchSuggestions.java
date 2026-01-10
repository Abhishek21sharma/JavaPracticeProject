package Java8.DesignPatterns.SRT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchSuggestions extends AbstractComponent{
    private WebDriverWait wait;

    @FindBy(css="li.sbct")
    private List<WebElement> suggestions;

    public SearchSuggestions(final WebDriver driver){
        super(driver);
    }

    public void clickSuggestionByIndex(){
        this.suggestions.stream().findFirst().ifPresent(WebElement::click);
    }


    @Override
    public boolean isDisplayed() {
        return this.wait.until(d -> this.suggestions.size() >=5);
    }
}
