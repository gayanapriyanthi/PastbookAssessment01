package Pages;

import PageElements.CreateBookPageElements;
import PageElements.LoginPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateBookPage {

    WebDriver driver;
    CreateBookPageElements createPastBookElements;

    public CreateBookPage(WebDriver driver) {
        this.driver = driver;
        createPastBookElements = PageFactory.initElements(driver, CreateBookPageElements.class);
    }

    public void verifyAddPicsButtonText() {
        if (createPastBookElements.AddPicsButton.isDisplayed()) {
            System.out.println("Now you have successfully navigated to the previously existed page...");
        }
    }


}