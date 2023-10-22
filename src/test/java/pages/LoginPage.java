package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public String loginTittle= "nopCommerce demo store. Login";
    public By email=By.xpath("//button[@id='register-button']");
    public  By password= By.xpath("//input[@id='Password']");
    public By loginBtn= By.xpath("//button[normalize-space()='Log in']");
}
