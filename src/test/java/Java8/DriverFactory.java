package Java8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {
    //let's use the concept of supplier to init the driver
    //everything is static, expect 1 method
    //static block is called at the time of class loading
    //why everything is static and final --> it's because we're not accepting it to change
    //as these are the configs

    private static final Map<String,Supplier<WebDriver>> map = new HashMap<>();

    private static final Supplier<WebDriver> CHROME_SUPPLIER = () -> {
            System.setProperty("webdriver.geck.driver","");
            return new ChromeDriver();
    };

    private static final Supplier<WebDriver> SAFARI_SUPPLIER = () -> {return new FirefoxDriver();};

    private static final Supplier<WebDriver> FIREFOX_SUPPLIER = () -> {
        System.setProperty("webdriver.geck.driver","");
        return new FirefoxDriver();
    };

    static {
        map.put("chrome",CHROME_SUPPLIER);
        map.put("firefox",FIREFOX_SUPPLIER);
        map.put("safari" ,SAFARI_SUPPLIER);
    }

    // a single public method
    //we get the supplier and then invoke it using get() method
    public static WebDriver getDriver(String browserType){
       return map.get(browserType.toLowerCase()).get();
    }


}
