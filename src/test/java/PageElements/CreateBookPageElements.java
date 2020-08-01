package PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateBookPageElements {

    public static final String ADD_PICS_BUTTON = "//a[@class='btn btn-lg btn-primary']";

    @FindBy(xpath = ADD_PICS_BUTTON)
    public WebElement AddPicsButton;

}
