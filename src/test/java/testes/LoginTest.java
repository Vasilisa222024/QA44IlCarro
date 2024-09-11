package testes;

import manager.ApplicationManager;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends ApplicationManager {
    @Test
    public void loginPositiveTest(){
      new HomePage(getDriver())
              .clickBtnLoginHeader()
              .typeloginForm("qa44@gmai.com","Qa@44Dan")
              .clickBtnLoginPositiv()
                      ;

    }

}
