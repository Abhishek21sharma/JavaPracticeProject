package Java8.DesignPatterns.SRT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchWidget extends AbstractComponent{


    private WebDriverWait wait ;

    @FindBy(name = "q")
    private WebElement searchBox;

    public SearchWidget(final WebDriver driver){
        super(driver);
    }

    public  void enter(String keyword){
        this.searchBox.clear();
        this.searchBox.sendKeys(keyword);
    }


    @Override
    public boolean isDisplayed() {
       return  this.wait.until(d-> this.searchBox.isDisplayed());
       //this.wait.until(ExpectedConditions.visibilityOf(this.searchBox));
       //return this.searchBox.isDisplayed();
    }
}
