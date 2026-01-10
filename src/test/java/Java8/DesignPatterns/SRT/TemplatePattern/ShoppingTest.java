package Java8.DesignPatterns.SRT.TemplatePattern;

import Java8.DesignPatterns.SRT.FactoryPattern.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShoppingTest extends BaseTest {

    @Test
    public void shoppingTest(){}


    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                //create your classes here AmazonClass and pass product name
        };
    }

}
