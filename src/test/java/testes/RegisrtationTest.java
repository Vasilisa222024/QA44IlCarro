package testes;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.Random;


public class RegisrtationTest extends ApplicationManager {

    @Test
    public void RegistrationPositivTest(){
int i=new Random().nextInt(1000);
String email="qafred"+i+"@gmai.com";

       Assert.assertTrue( new HomePage(getDriver())
                .clickBtnSinUpHeader()
                .typeRegistrationForm
                        ("Dan","Gold",email,"Qa2@44Dan")
               .clickCheckBoox()
               .clickBtnRegistrationPositiv()
               .isTextInElementPresent_regSuccess())

        ;

    }




}
