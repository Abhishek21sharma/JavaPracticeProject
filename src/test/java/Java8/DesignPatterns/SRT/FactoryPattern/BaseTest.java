package Java8.DesignPatterns.SRT.FactoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    //let's assume this class will give me WebDriver
    //in ideal case it maybe coming from springBoot beans or maybe from somehwere else

    public WebDriver driver;
    public BaseTest(){
         this.driver = new ChromeDriver();
    }
}
