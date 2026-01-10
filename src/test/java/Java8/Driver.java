package Java8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;


public class Driver {

    private WebDriver driver;
    //let's say we get browserType from common
    //by this way we removed the use of if/else never ending loop
    //we basically used MAP and supplier to get us the work done


    public void setDriver(String browserType){
        this.driver = DriverFactory.getDriver(browserType);
    }

    public void testElements(){
        //print text of each webelement
        //foreach here accepts 'consumer'

        this.driver.findElements(By.tagName("a")).forEach( e -> System.out.println(e.getText()));

        //usage of predicate (condition)
        //removeIf accepts 'predicate'
        //it removes from same list -> it returns boolean (or consider as void only)
        //adding the condition of 'removing blank'
        this.driver.findElements(By.tagName("a")).removeIf(e -> e.getText().trim().length() == 0);

        this.driver.findElements(By.tagName(""))
                .stream()
                .filter( e -> !(e.getText().contains("S")) && e.getText()!="")
                .map(e->e.getText().toUpperCase())
                .forEach(System.out::println);

        //another example of stream working with webElements

        this.driver.findElements(By.tagName("a"))
                .stream()
                //if element is enabled and displayed
                .filter( e -> e.isDisplayed() && e.isEnabled())
                //find the first occurance
                .findFirst()
                //if we found an entry then click on it
                .ifPresent(WebElement::click);


        //let's say it returns all buttons avialable on screen
        List<WebElement> buttons=driver.findElements(By.cssSelector(""));


        //more logic used in Nitro project -- see how they have used to click a button filter when locator is not obvious
        //also they have used just 1 method to click on any button
        String value = "buttonName";
        //but it's not clickable with buttonName rather unique
        //with another attribute

        WebElement buttonWithValue = buttons.stream()
                .filter(e -> value.equals(e.getAttribute("value")))
                .findFirst()
                .orElseThrow(() -> new AssertionError("Toggle button value not found "+ value));
        buttonWithValue.click();


        //another example in Nitro project for interesting usecase of 'map' function
        //so map transformation can be conditional sometimes as following
        List<List<String>> l = null; //lets say if it's a data-table coming from 'Cucumber+ feature file'
        l.stream()
                .skip(1) //as the first column is of 'header'
                .map(e -> e.get(1) == null ? e.get(0) : e.get(0)+"-"+e.get(1)) //look how claverly we have done the transformation in this case
                .collect(Collectors.toList());
        //usage of transformation based on a condition..
        //when we want to transform everything , means we do not want any filter
        //but still based on a condition wants to update the incoming data, use as above



        //learn from Nitro--> searching elements with css selectors
        //also check in any cucumber framework --> install cucumber+ plugin
        //check how we define different step definations as with params



    }

    public void webDriverWait(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //old way of writing waits
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("a"))));

       //with lambdas --> as until method accepts function
       //it returns 'driver - d' and we can wait until element is enabled etc

       wait.until(d -> this.driver.findElement(By.tagName("a")).isEnabled()) ;
    }
}
