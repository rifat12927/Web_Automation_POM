package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String homePageUrl= "https://demo.nopcommerce.com/";
    public String homePageTittle= "nopCommerce demo store";
    public By registerButton = By.xpath("//a[normalize-space()='Register']");
    public By loginButton = By.xpath("//a[@class='ico-login']");

}
