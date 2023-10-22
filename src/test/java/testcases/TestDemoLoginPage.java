package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DemoLoginPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class TestDemoLoginPage extends DriverSetup {
    DemoLoginPage demoLoginPage= new DemoLoginPage();

    @BeforeMethod
    public void navigateToLoginPage(){
        getDriver().get(demoLoginPage.loginPageURL);
    }
    @Test
    public void testLoginWithValidData(){
        demoLoginPage.inputElement(demoLoginPage.username,"standard_user");
        demoLoginPage.inputElement(demoLoginPage.password,"secret_sauce");
        demoLoginPage.clickOnElement(demoLoginPage.loginButton);
        demoLoginPage.addScreenshotToReport("After inputting valid data");
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
    }
    @Test(dataProvider = "invaliddata", dataProviderClass = DataSet.class)
    public void testWithInvalidData(String username,String password,String errormsg){
        demoLoginPage.inputElement(demoLoginPage.username,username);
        demoLoginPage.inputElement(demoLoginPage.password,password);
        demoLoginPage.clickOnElement(demoLoginPage.loginButton);
        demoLoginPage.addScreenshotToReport("After inputting invalid data");
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.saucedemo.com/");
        Assert.assertEquals(demoLoginPage.getElementText(demoLoginPage.error),errormsg);
    }

}