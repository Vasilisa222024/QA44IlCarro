package testes;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends ApplicationManager {
    @Test
    public void loginPositiveTest(){
Assert.assertTrue(
      new HomePage(getDriver())
              .clickBtnLoginHeader()
              .typeloginForm("qa44@gmai.com","Qa@44Dan")
           .clickBtnLoginPositiv()
              .isTextInElementPresent_LoginSuccess())
      ;

    }
    @Test
    public void loginNegativeTest_wronePassword(){
Assert.assertTrue(
                new HomePage(getDriver())
                        .clickBtnLoginHeader()
                        .typeloginForm("qa44@gmai.com","Qa@44Dan333")
                        .clickBtnLoginNegative()
                        .isTextInElementPresent_LoginFailed())

        ;

    }





}
