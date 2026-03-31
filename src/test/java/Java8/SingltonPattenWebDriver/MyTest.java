package Java8.SingltonPattenWebDriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MyTest {

    @Test
    public void testLogin(){
        //Access the shared instance
        WebDriver driver = WebDriverSingleton.getInstance().getDriver();
        driver.get("https://www.google.com/");
    }
}
