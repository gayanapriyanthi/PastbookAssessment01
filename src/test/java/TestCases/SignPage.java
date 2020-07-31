package TestCases;

import PageFactory.LoginPageElements;
import TestBase.TestbaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignPage extends TestbaseSetup {

	@Test(priority = 1)
	public void LoginToTheApp()
	{
		LoginPageElements loginInfo = PageFactory.initElements(driver,LoginPageElements.class);

		//User login
		loginInfo.MenuButton.click();
		loginInfo.SigninButton.click();
		String parentWindow = driver.getWindowHandle();
		BeforeWindowHandler();
		waitElementVisible("//div[@class='jumbotron']//div[@class='facebook-login']//a[@class='btn btn-link']");
		loginInfo.EmailLink.click();
		loginInfo.EmailTextfield.sendKeys("gayanaish92@gmail.com");
		loginInfo.NextButton.click();
		waitElementVisible("//input[@type='password']");
		loginInfo.PasswordTextfield.sendKeys("IxPLO9GI");
		loginInfo.NextButton.click();

		//Navigate to the pastbook page
		AfterWindowHandler(parentWindow);
		waitElementVisible("//h1[text()='Create your PastBook in 1 minute!']");
		String Homepagetitle=loginInfo.HomePageTitle.getText();
		Assert.assertEquals(Homepagetitle,"Create your PastBook in 1 minute!");
		System.out.println("Create your PastBook in 1 minute!");

		//Logout(Assume access token will expire with logout)
		loginInfo.MenuButton.click();
		loginInfo.SignoutButton.click();
		waitElementVisible("//a[@class='btn btn-primary btn-lg btn-signin']");
		String StartButton=loginInfo.StartNowButton.getText();
		Assert.assertEquals(StartButton,"START NOW");
		System.out.println("Successfully Logout...");


	}
	
	
}
