package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SingUpPage extends BasePage {
    public SingUpPage (WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),
                this);
    }

    @FindBy(xpath = "//input[@id='name']")
    WebElement inputName;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement inputLastName;
    @FindBy(xpath = "//input[@id='email']")
    WebElement inputEmail;
    @FindBy(xpath = "//input[@id='password']")
    WebElement inputPassword;
    @FindBy(xpath = "//label[@class='checkbox-label terms-label']")
    WebElement inputCheckBoox;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSingUp;
   // @FindBy(xpath = "//button[@class='positive-button ng-star-inserted']")
   // WebElement positivRegistered;???
     public SingUpPage typeRegistrationForm
             (String name,String lastName,String email,String password){
         inputName.sendKeys(name);
         inputLastName.sendKeys(lastName);
         inputEmail.sendKeys(email);
         inputPassword.sendKeys(password);
         return this;
     }
public SingUpPage clickCheckBoox(){
     inputCheckBoox.click();
     return this;
}

   public HomePage clickBtnRegistrationPositiv(){
         btnSingUp.click();
         return new  HomePage(driver);
   }
}
