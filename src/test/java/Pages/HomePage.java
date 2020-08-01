package Pages;

import PageElements.HomePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    HomePageElements homePageElements;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        homePageElements = PageFactory.initElements(driver, HomePageElements.class);
    }


    public String getHomePageTitle(){
        return homePageElements.HomePageTitle.getText();
    }

    public void setPastBookTitle(String pastBookTitle){
        homePageElements.BookTitle.sendKeys(pastBookTitle);
    }

    public void clickCreatePastBookButton(){
        homePageElements.CreatePastBookButton.click();
    }

    public void verifyAddPicturesButton(){
        if (homePageElements.AddPicsButton.isDisplayed()) {
		    System.out.println("Click on Add pictures to create a beautiful photo album");
		}
    }

    public void clickMenuButton(){
        homePageElements.MenuButton.click();
    }

    public void clickLogOutButton(){
        homePageElements.SignOutButton.click();
    }

    public String getStartNowButtonText(){
        return homePageElements.StartNowButton.getText();
    }


}
