package Java8.DesignPatterns.SRT.CommandPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DismissalAlertValidator extends ElementValidator{

    private final WebElement dismissalAlert;

    public DismissalAlertValidator(final WebElement element){
        this.dismissalAlert = element;
    }


    @Override
    public boolean validate() {
        boolean result = this.dismissalAlert.isDisplayed(); //true
        //close the alert
        this.dismissalAlert.findElement(By.cssSelector("button.close")).click();
        boolean result2 = this.dismissalAlert.isDisplayed(); //false
        return result && (!result2);
    }
}
