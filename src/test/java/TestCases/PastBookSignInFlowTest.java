package TestCases;

import PageElements.CreateBookPageElements;
import PageElements.LoginPageElements;
import Pages.CreateBookPage;
import Pages.HomePage;
import Pages.LoginPage;
import TestBase.TestbaseSetup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageElements.HomePageElements;

public class PastBookSignInFlowTest extends TestbaseSetup {

	private static final String EMAIL = "gayanatest@gmail.com";
	private static final String PASSWORD = "wGhdWfi4";


	@Test(priority = 1)
	public void LoginToTheApp() {
		logInFunction();
		homePageAction();
		logOutFunction();
		logInFunction();
		createBookPageFunction();
	}

	private void logInFunction(){
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.clickMenuButton();
		loginPage.clickSignInButton();
		String parentWindow = driver.getWindowHandle();
		BeforeWindowHandler();
		waitElementVisible(LoginPageElements.EMAIL_LINK);
		loginPage.clickEmailLink();
		loginPage.setEmail(EMAIL);
		loginPage.clickNextButton();
		waitElementVisible(LoginPageElements.PASSWORD_TEXT_FIELD);
		loginPage.setPassword(PASSWORD);
		loginPage.clickNextButton();
		AfterWindowHandler(parentWindow);
	}

	private void homePageAction(){
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		waitElementVisible(HomePageElements.HOME_PAGE_TITLE);
		String homePageTitle = homepage.getHomePageTitle();
		Assert.assertEquals(homePageTitle, "Create your PastBook in 1 minute!");
		System.out.println("Create your PastBook in 1 minute!");

		homepage.setPastBookTitle("My Favourite Photo book");
		homepage.clickCreatePastBookButton();

		waitElementVisible(HomePageElements.ADD_PICS_BUTTON);
		homepage.verifyAddPicturesButton();
	}

	private void logOutFunction(){
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.clickMenuButton();
		homepage.clickLogOutButton();

		waitElementVisible(HomePageElements.START_NOW_BUTTON);
		String startNowButtonText = homepage.getStartNowButtonText();
		Assert.assertEquals(startNowButtonText, HomePageElements.START_NOW_BUTTON_TEXT);
		System.out.println("Successfully Logout...");
	}

	private void createBookPageFunction(){
		CreateBookPage createBookPage = PageFactory.initElements(driver, CreateBookPage.class);
		waitElementVisible(CreateBookPageElements.ADD_PICS_BUTTON);
		createBookPage.verifyAddPicsButtonText();
	}


}


