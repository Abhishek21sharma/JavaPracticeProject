package Java8.SingltonPattenWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

    //private static singleton instance to hold the static variable
    private static WebDriverSingleton instance = null;
    private WebDriver driver;

    //private constructor to prevent direct instantation
    private WebDriverSingleton() {
        //initiate webdriver here..
        System.setProperty("","");
        driver = new ChromeDriver();
    }

    //public static method to provide global access point
    public  static WebDriverSingleton getInstance(){
        if(instance == null){
            synchronized (WebDriverSingleton.class){
                if (instance == null)
                //double check for thread safety

                {
                    instance = new WebDriverSingleton();
                }
            }
        }
        return  instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Reset to null so it can be re-initialized if needed
        }
    }
}
