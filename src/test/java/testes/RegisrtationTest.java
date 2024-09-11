package testes;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class RegisrtationTest extends ApplicationManager {

    @Test
    public void RegistrationPositivTest(){

        new HomePage(getDriver())
                .clickBtnSinUpHeader()
                .typeRegistrationForm
                        ("Dan","Gold","qa244@gmai.com","Qa2@44Dan")
                .clickCheckBoox().
             clickBtnRegistrationPositiv()
        ;

    }




}
