package pages;

import org.openqa.selenium.By;

public class RegistrationPage extends BasePage{
    public String registrationPageUrl="https://demo.nopcommerce.com/register?returnUrl=%2F";
    public String registrationPageTittle= "nopCommerce demo store. Register";
    public By genderMale= By.xpath("//input[@id='gender-male']");
    public By genderFemale= By.xpath("//input[@id='gender-female']");
    public By firstName= By.xpath("//input[@id='FirstName']");
    public By lastName= By.xpath("//input[@id='LastName']");
    public By dobDay = By.xpath("//select[@name='DateOfBirthDay']");
    public By dobMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    public By dobYear = By.xpath("//select[@name='DateOfBirthYear']");
    public By email = By.xpath("//input[@id='Email']");
    public By companyName=By.xpath("//input[@id='Company']");
    public By password= By.xpath("//input[@id='Password']");
    public By confirmPassword=By.xpath("//input[@id='ConfirmPassword']");
    public By registerBtn= By.xpath("//button[@id='register-button']");


}
