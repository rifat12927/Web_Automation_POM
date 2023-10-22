package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.DriverSetup;

public class TestHomePage extends DriverSetup {
    HomePage homepage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void testHomePageTittle() {
        getDriver().get(homepage.homePageUrl);
        Assert.assertEquals(getDriver().getTitle(), homepage.homePageTittle);

        getDriver().findElement(homepage.registerButton).click();
    }

    @Test
    public void testHomePageURL() {
        getDriver().get(homepage.homePageUrl);
        Assert.assertEquals(getDriver().getCurrentUrl(), homepage.homePageUrl);
    }

    @Test
    public void testHomePageRegistrationButton() {
        getDriver().get(homepage.homePageUrl);
        homepage.clickOnElement(homepage.registerButton);
        Assert.assertEquals(getDriver().getCurrentUrl(), registrationPage.registrationPageUrl);
    }
}
