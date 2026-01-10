package Java8.DesignPatterns.SRT.DecoratorPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DashboardPAge {

    //demo site to use decorator pattern

    //decorator implementation is to -
    //change the behaviour of object at run time
    //demo site - https://vins-udemy.s3.amazonaws.com/ds/decorator.html
    //this site expose diff components for diff user roles

    private WebDriver driver;

    @FindBy(name="role")
    private WebElement role;

    @FindBy(css = "div.guest")
    private List<WebElement> guestComp;

    @FindBy(css = "div.superuser")
    private List<WebElement> superUserComp;

    @FindBy(css = "div.admin")
    private List<WebElement> adminComp;


    public DashboardPAge(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    public void goTo(){
        this.driver.get("--https---");
    }

    public void selectRole(String role){
        Select select = new Select(this.role);
        select.selectByValue(role);
    }

    public List<WebElement> getAdminComp(){
        return this.adminComp;
    }

    public List<WebElement> getGuestComp(){
        return this.guestComp;
    }


    public List<WebElement> getSuperUserComp(){
        return this.superUserComp;
    }


}
