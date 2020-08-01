package PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {

    public static final String SIGN_IN_BUTTON = "//a[@class='icon-user']";
    public static final String EMAIL_LINK = "//div[@class='jumbotron']//div[@class='facebook-login']//a[@class='btn btn-link']";
    public static final String EMAIL_TEXT_FIELD = "//input[@name='email']";
    public static final String NEXT_BUTTON = "//button[@data-signin='email']";
    public static final String PASSWORD_TEXT_FIELD = "//input[@type='password']";
    public static final String FACE_BOOK_BUTTON = "//div[@class='jumbotron']//div[@class='facebook-login']";
    public static final String FACE_BOOK_WINDOW = "//html[@id='facebook']";
    public static final String MENU_BUTTON = "//span[@class='icon-hamburger-animated']";

    @FindBy(xpath = MENU_BUTTON)
    public  WebElement MenuButton;
	
	@FindBy(xpath = SIGN_IN_BUTTON)
    public  WebElement SignInButton;
	
	@FindBy(xpath = EMAIL_LINK)
    public  WebElement EmailLink;
	
	@FindBy(xpath = EMAIL_TEXT_FIELD)
    public  WebElement EmailTextField;

    @FindBy(xpath = NEXT_BUTTON)
    public  WebElement NextButton;

    @FindBy(xpath = PASSWORD_TEXT_FIELD)
    public  WebElement PasswordTextField;

    @FindBy(xpath = FACE_BOOK_BUTTON)
    public  WebElement FacebookButton;
	
	@FindBy(xpath = FACE_BOOK_WINDOW)
    public  WebElement FaceBookWindow;




















}
