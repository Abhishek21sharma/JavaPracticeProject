package Java8.DesignPatterns.SRT.Strategy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class NetBanking implements PaymentOption{

    @FindBy(id="bank")
    private WebElement bank;

    @FindBy(id = "account")
    private WebElement accNumber;

    @Override
    public void enterPaymentInformation(Map<String, String> paymentDetails) {
        //let's say if Bank details are a dropdown
        Select select = new Select(bank);
        select.selectByValue(paymentDetails.get("bank"));
        this.accNumber.sendKeys(paymentDetails.get("accNumber"));
    }
}
