package Java8.DesignPatterns.SRT.FactoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GoogleEng extends GooglePage{
    private WebDriver driver;
    private WebDriverWait wait;

    public GoogleEng(final WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="q")
    private WebElement searchButton;

    @FindBy(css = "div.rc")
    private List<WebElement> results;


    @Override
    public void launchURL() {
        this.driver.get("");
    }

    @Override
    public void search(String keyword) {
        this.searchButton.sendKeys(keyword);
        this.searchButton.click();
    }

    @Override
    public int getResultsCount() {
        return 0;
    }
}
