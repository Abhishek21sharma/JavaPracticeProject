package Java8.DesignPatterns.SRT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractComponent {
     public WebDriverWait wait;

     public AbstractComponent(final WebDriver driver){
          this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
          PageFactory.initElements(driver,this);
     }

     public abstract boolean isDisplayed();
}
