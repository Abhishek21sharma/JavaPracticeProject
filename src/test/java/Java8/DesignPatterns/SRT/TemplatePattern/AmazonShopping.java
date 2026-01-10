package Java8.DesignPatterns.SRT.TemplatePattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonShopping extends ShoppingTemplate{
    private WebDriver driver;
    private WebDriverWait wait;
    private String product;

    @FindBy(id = "")
    private WebElement searchBox;

    @FindBy(css = "")
    private WebElement searchBtn;

    @FindBy(css = "")
    private WebElement item;

    public AmazonShopping(WebDriver driver,String product){
        this.driver = driver;
        this.product = product;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver,this);
    }

    @Override
    public void launchSite() {
        this.driver.get("https://amazone.com");

    }

    //find the element manually and do the checks

    @Override
    public void searchForProduct() {
        this.searchBox.sendKeys(this.product);
        this.searchBtn.click();
    }

    @Override
    public void selectProduct() {

    }

    @Override
    public void buy() {

    }
}
