package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.HeaderMenuItem;

public class BasePage {
    static WebDriver driver;
    public  static void  setDriver(WebDriver wd){
        driver=wd;
    }

    //PAUSA
    public  void pause(int time){
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean  isTextInElementPresent(WebElement element, String text){
        return element.getText().contains(text);

    }
//public static <T extends BasePage>T clickButtonsOnHeader(HeaderMenuItem headerMenuItem){
        
//}


}
