package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage extends BasePage{
    public LoginPage (WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),
                this);}

    @FindBy(xpath = "//input[@id='email']")
    WebElement inputEmail;
    @FindBy(xpath = "//input[@id='password']")
    WebElement inputPassword;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement cleckYalla;

    public  LoginPage typeloginForm(String email,String password){
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        return this;
    }
    public HomePage clickBtnLoginPositiv(){
        cleckYalla.click();
        return new  HomePage(driver);
    }
}
