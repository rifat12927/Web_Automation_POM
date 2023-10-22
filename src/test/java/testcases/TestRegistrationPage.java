package testcases;

import org.testng.annotations.Test;
import pages.RegistrationPage;
import utilities.DriverSetup;

public class TestRegistrationPage extends DriverSetup {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void testRegistrationProcess(){
        getDriver().get(registrationPage.registrationPageUrl);
        registrationPage.clickOnElement(registrationPage.genderMale);
        registrationPage.inputElement(registrationPage.firstName,"Sayed Anwar");
        registrationPage.inputElement(registrationPage.lastName,"Rifat");
        registrationPage.selectWithVisibleText(registrationPage.dobDay,"17");
        registrationPage.selectWithVisibleText(registrationPage.dobMonth,"June");
        registrationPage.selectWithVisibleText(registrationPage.dobYear,"1999");
        registrationPage.inputElement(registrationPage.email,"user@gmail.com");
        registrationPage.inputElement(registrationPage.companyName,"ABC Ltd");
        registrationPage.inputElement(registrationPage.password,"1234567");
        registrationPage.inputElement(registrationPage.confirmPassword,"1234567");
        registrationPage.clickOnElement(registrationPage.registerBtn);
    }
}
