package testes;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends ApplicationManager {
    @Test
    public void loginPositiveTest(){
        boolean res=
      new HomePage(getDriver())
              .clickBtnLoginHeader()
              .typeloginForm("qa44@gmai.com","Qa@44Dan")
              .clickBtnLoginPositiv().isElementSearchPresent();

        Assert.assertTrue(res);
    }

}
