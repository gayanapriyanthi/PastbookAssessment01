package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {
	
	@FindBy(xpath = "//span[@class='icon-hamburger-animated']")
    public  WebElement MenuButton;
	
	@FindBy(xpath = "//a[@class='icon-user']")
    public  WebElement SigninButton;
	
	@FindBy(xpath = "//a[@class='icon-off']")
    public  WebElement SignoutButton;
	
	@FindBy(xpath = "//div[@class='jumbotron']//div[@class='facebook-login']//a[@class='btn btn-link']")
    public  WebElement EmailLink;
	
	@FindBy(xpath = "//input[@name='email']")
    public  WebElement EmailTextfield;

    @FindBy(xpath = "//button[@data-signin='email']")
    public  WebElement NextButton;

    @FindBy(xpath = "//input[@type='password']")
    public  WebElement PasswordTextfield;

    @FindBy(xpath = "//div[@class='jumbotron']//div[@class='facebook-login']")
    public  WebElement FacebookButton;
	
	@FindBy(xpath = "//html[@id='facebook']")
    public  WebElement FacebookWindow;

    @FindBy(xpath = "//h1[text()='Create your PastBook in 1 minute!']")
    public  WebElement HomePageTitle;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-lg btn-signin']")
    public  WebElement StartNowButton;




	


	
	
	
}
