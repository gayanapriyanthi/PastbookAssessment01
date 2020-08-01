package Pages;

import PageElements.LoginPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    LoginPageElements loginPageElements;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        loginPageElements = PageFactory.initElements(driver, LoginPageElements.class);
    }

    public void clickMenuButton(){
        loginPageElements.MenuButton.click();
    }

    public void clickSignInButton(){
        loginPageElements.SignInButton.click();
    }

    public void clickEmailLink(){
        loginPageElements.EmailLink.click();
    }

    public void setEmail(String email){
        loginPageElements.EmailTextField.sendKeys(email);
    }

    public void clickNextButton(){
        loginPageElements.NextButton.click();
    }

    public void setPassword(String password){
        loginPageElements.PasswordTextField.sendKeys(password);
    }

}
