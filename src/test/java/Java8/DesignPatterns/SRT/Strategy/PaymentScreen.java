package Java8.DesignPatterns.SRT.Strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class PaymentScreen {

    private WebDriver driver;

    //so here for Payment options we are not going to create
    //instance of individual payment class but rather
    //will create instance of the interface with reference as implementation class


    //work of this main page class
    //is to initialise the component classes and connect them
    //using getter() and setter() methods

    //so lets say if we have a componnet class named UserInformation

    private PaymentOption paymentOption;

    public PaymentScreen(final WebDriver driver){
        this.driver = driver;

        //PageFactory.initElements(this.driver,UserInformation.class);
    }

    //we're basically following SRT + Strategy pattern
    //this is the main page class which will combine or plug in other components
    //all other related component for this page will be here

    public void setPaymentOption(PaymentOption paymentOption){
        this.paymentOption = paymentOption;
        PageFactory.initElements(driver,this.paymentOption);
    }

    public void pay(Map<String,String> paymentDetails) {
        this.paymentOption.enterPaymentInformation(paymentDetails);
    }
}
