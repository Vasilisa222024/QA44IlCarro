package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LetTheCarWorkPage extends BasePage {
    public LetTheCarWorkPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10),
                this);
    }

    @FindBy(xpath = "//input[@id='pickUpPlace']")
    WebElement inputLocation;
    @FindBy(xpath = "//input[@id='make']")
    WebElement inputManufacture;
    @FindBy(xpath = "//input[@id='model']")
    WebElement inputModel;
    @FindBy(xpath = "//input[@id='year']")
    WebElement inputYear;
    @FindBy(xpath = "//select[@id='fuel']")
    WebElement inputFuel;
    @FindBy(xpath = "//input[@id='seats']")
    WebElement inputSeats;
    @FindBy(xpath = "//input[@id='class']")
    WebElement inputCarclass;
    @FindBy(xpath = "//input[@id='serialNumber']")
    WebElement inputRegNamber;
    @FindBy(xpath = "//input[@id='price']")
    WebElement inputPrice;
    @FindBy(xpath = "//textarea[@id='about']")
    WebElement inputAbout;
    @FindBy(xpath = "//input[@id='photos']")
    WebElement inputAddPhotos;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSubmit;
    @FindBy(xpath = "//button[@class='negative-button ng-star-inserted']")
    WebElement btnAddAnotherCar;
    @FindBy(xpath = "//button[@class='neutral-button ng-star-inserted']")
    WebElement btnSearchCar;
    @FindBy(xpath = "//button[@class='positive-button ng-star-inserted']")
    WebElement btnSShowCar;
@FindBy(xpath ="//div[@class='dialog-container']/h1")
WebElement masegeCarAdded;


    public LetTheCarWorkPage tipeLetTheCarWorkPageForm(String location, String manufacture,
                                                       String model, String year, String fuel, String sets, String carClass, String regNamber, String price, String about,
                                                       String addPhotos) {
        inputLocation.sendKeys(location);
        inputManufacture.sendKeys(manufacture);
        inputModel.sendKeys(model);
        inputYear.sendKeys(year);
        inputFuel.sendKeys(fuel);
        inputSeats.sendKeys(sets);
        inputCarclass.sendKeys(carClass);
        inputRegNamber.sendKeys(regNamber);
        inputPrice.sendKeys(price);
        inputAbout.sendKeys(about);
        inputAddPhotos.sendKeys(addPhotos);

return this;
    }
    public LetTheCarWorkPage clickBtnSubmit(){
        btnSubmit.click();
        return this;
    }

}
