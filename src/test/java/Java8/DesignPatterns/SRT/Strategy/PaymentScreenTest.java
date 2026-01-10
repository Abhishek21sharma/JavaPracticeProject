package Java8.DesignPatterns.SRT.Strategy;

import Java8.DesignPatterns.SRT.FactoryPattern.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Map;

public class PaymentScreenTest extends BaseTest {

    private PaymentScreen paymentScreen;

    @BeforeTest
    public void setPaymentScreen(){
        this.paymentScreen = new PaymentScreen(this.driver);
    }

    //lets say PAymentOption is coming from feature file along with Payment Details
    @Test
    public void paymentTest(PaymentOption paymentOption, Map<String,String> paymentDetails) {
        this.driver.get("");
        //now we can call the other classes if we have any and can call the methods to fill the info etc
        //so assume there is UserInformation class which is having method
        //to enterDetails() -> this is to enter name, mail etc , it will be called like this
        //mainPageClass.getterMethod Of component.class.actual method which will enter the details
        //this.paymentScreen.getUserInformation().enterDetails("name","mail@gmail.com");

        //setting the payment option at run time --> from feature file
        this.paymentScreen.setPaymentOption(paymentOption);
        //getting it here
        this.paymentScreen.pay(paymentDetails);
    }

}
