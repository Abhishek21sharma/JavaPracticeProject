package Java8.DesignPatterns.SRT.Strategy;

public class StrategyPattern {

    //lets assume we have 3 payment options
    //by card,by netbanking,  PayPal etc
    //now we kown there will be more payment options in future
    //so we have handle it


    //how we implemented
    //paymentScreen(Main Page class ) --> PaymentOption (interface) --> credit card, netbanking (implementation class)


    //factory is creation --> how we create someting
    //strategy is behaviour --> change at run time


    //combing strategy + factory
    //create the new new objects using factory pattern and not from the main page class
    //and can change the behaviour in the midddle using interface and provinf implementation
    //class for the interface at run time


}
