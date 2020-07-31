package TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestbaseSetup {
	public static WebDriver driver;
	
	protected static void InitiateChromeDriver()
	{
		System.setProperty(("webdriver.chrome.driver"), System.getProperty("user.dir") + "/ChromeDriver/" + "chromedriver.exe");
		 
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
		
	}
	@BeforeSuite
	public void NavigatetoApplication(){
		InitiateChromeDriver();
		driver.navigate().to("https://moments.pastbook.com/");


	}
	public void waitElementVisible (String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	public void BeforeWindowHandler(){
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
	}

	public void AfterWindowHandler(String parentWindow){
		driver.switchTo().window(parentWindow);
	}

	@AfterSuite
	public static void quitBrowser(){
		driver.quit();
	}


}
