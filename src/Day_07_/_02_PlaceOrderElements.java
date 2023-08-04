package Day_07_;

import Utilities.BaseDriver;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02_PlaceOrderElements {

    public _02_PlaceOrderElements() {
        PageFactory.initElements(ParameterDriver.driver,this);

    }

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    public WebElement searchClick;

    @FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[7]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//a[@title='Shopping Cart']")
    public WebElement shoppingCartButton;

    @FindBy(xpath = "//span[text()='Checkout']")
    public WebElement checkOutButton;

    @FindBy(xpath = "//input[@id='button-payment-address']")
    public WebElement step2Cont;

    @FindBy(xpath = "//input[@id='button-shipping-address']")
    public WebElement step3Cont;

    @FindBy(xpath = "//input[@id='button-shipping-method']")
    public WebElement step4Cont;

    @FindBy(xpath = "//input[@name='agree']")
    public WebElement termsAndConditions;

    @FindBy(xpath = "//input[@id='button-payment-method']")
    public WebElement step5Cont;

    @FindBy(xpath = "//input[@id='button-confirm']")
    public WebElement confirmOrder;

    @FindBy(xpath = "//h1[text()='Your order has been placed!']")
    public WebElement orderHasBeenPlaced;

}
