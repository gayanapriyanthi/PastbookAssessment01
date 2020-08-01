package PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {

    public static final String START_NOW_BUTTON_TEXT = "START NOW";
    public static final String HOME_PAGE_TITLE = "//h1[text()='Create your PastBook in 1 minute!']";
    public static final String START_NOW_BUTTON = "//div[@class='content']//a[@class='btn btn-primary btn-lg btn-signin']";
    public static final String ALERT_CLOSE_BUTTON = "//div[@class='content alert alert-dismissable alert-success']//button";
    public static final String POPUP_CLOSE_BUTTON = "//div[@id='createOptions']//Button[@class='close']";
    public static final String BOOK_TITLE = "//input[@name='title']";
    public static final String CREATE_PAST_BOOK_BUTTON = "//button[@id='create-button']";
    public static final String ADD_PICS_BUTTON = "//a[@class='btn btn-lg btn-primary']";
    public static final String SIGN_OUT_BUTTON = "//a[@class='icon-off']";
    public static final String MENU_BUTTON = "//span[@class='icon-hamburger-animated']";



    @FindBy(xpath = HOME_PAGE_TITLE)
    public WebElement HomePageTitle;

    @FindBy(xpath = START_NOW_BUTTON)
    public  WebElement StartNowButton;

    @FindBy(xpath = ALERT_CLOSE_BUTTON)
    public  WebElement AlertCloseButton;

    @FindBy(xpath = POPUP_CLOSE_BUTTON )
    public  WebElement PopupCloseButton;

    @FindBy(xpath = BOOK_TITLE)
    public  WebElement BookTitle;

    @FindBy(xpath = CREATE_PAST_BOOK_BUTTON)
    public  WebElement CreatePastBookButton;

    @FindBy(xpath = ADD_PICS_BUTTON)
    public WebElement AddPicsButton;

    @FindBy(xpath = SIGN_OUT_BUTTON)
    public  WebElement SignOutButton;

    @FindBy(xpath = MENU_BUTTON)
    public  WebElement MenuButton;




}
