package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static utilities.DriverSetup.getDriver;

public class BasePage {
    public WebDriverWait wait;
    public WebElement getElement(By locator){
        return waitForElementPresence(locator);
    }
    public void clickOnElement(By locator){
        getElement(locator).click();
    }
    public void inputElement(By locator, String text){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);

    }
    public String getElementText(By locator){
       return getElement(locator).getText();
    }

    public boolean isElementVisible(By locator){
        return getElement(locator).isDisplayed();
    }

    public WebElement waitForElementPresence(By locator){
        wait= new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public void waitForElementToClickable(By locator){
        wait= new WebDriverWait(getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void selectWithVisibleText(By selectLocator,String visibText){
        Select select= new Select(getElement(selectLocator));
        select.selectByVisibleText(visibText);
    }
    public void addScreenshotToReport(String name){
        Allure.addAttachment(name,new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
    }
}
