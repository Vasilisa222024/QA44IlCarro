package testes;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class RegisrtationTest extends ApplicationManager {

    @Test
    public void RegistrationPositivTest(){
boolean res=
        new HomePage(getDriver())
                .clickBtnSinUpHeader()
                .typeRegistrationForm
                        ("Dan","Gold","qa244@gmai.com","Qa2@44Dan")
                .clickCheckBoox().
             clickBtnRegistrationPositiv().isElementSearchPresent()
        ;
Assert.assertTrue(res);
    }




}
