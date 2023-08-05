package _10_FridayProject;

import Utilities.BaseDriver_FridayProject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Elements_FridayProjects {

    public Elements_FridayProjects() {
        PageFactory.initElements(BaseDriver_FridayProject.driver,this);
    }

    @FindBy(id = "login2")
    public WebElement loginButton;

    @FindBy(id = "loginusername")
    public WebElement loginUsername;

    @FindBy(id = "loginpassword")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement loginButtonEnter;

    @FindBy(id = "nameofuser")
    public WebElement verificationOfHomePage;

    @FindBy(xpath = "//a[text()='Phones']")
    public WebElement phones;

    @FindBy(xpath = "//a[text() ='Samsung galaxy s6']")
    public WebElement verifyPhone;

    @FindBy(xpath = "//a[text() ='Laptops']")
    public WebElement laptop;

    @FindBy(xpath = "//a[text() ='Sony vaio i5']")
    public WebElement verifyLaptop;

    @FindBy(xpath = "//a[text() ='Monitors']")
    public WebElement monitors;

    @FindBy(xpath = "//a[text() ='ASUS Full HD']")
    public WebElement verifyMonitor;

    @FindBy(xpath = "//a[@id ='logout2']")
    public WebElement logout;

    @FindBy(id = "login2")
    public WebElement logoutVerify;

    @FindBy(xpath = "//a[text() ='Add to cart']")
    public WebElement addToCart;

    @FindBy(id = "cartur")
    public WebElement goToCart;

    @FindBy(xpath = "//td[text()='360']")
    public WebElement price;

    @FindBy(id = "totalp")
    public WebElement totalPrice;

    @FindBy(xpath = "//button[text()='Place Order']")
    public WebElement placeOrder;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='country']")
    public WebElement country;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "card")
    public WebElement creditCard;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id = "year")
    public WebElement year;

    @FindBy(xpath = "//button[text()='Purchase']")
    public WebElement purchase;

    @FindBy(xpath = "//p[text()='Amount: 360 USD']")
    public WebElement amount;

    @FindBy(xpath = "//p[text()='Card Number: 1234568474']")
    public WebElement cardNumber;

    @FindBy(xpath = "//p[text()='Name: eda']")
    public WebElement name2;

    @FindBy(xpath = "//p[text()='Date: 4/7/2023']")
    public WebElement date;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement okkay;





}
