package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.basePage;

public class loginPage extends basePage{

    public loginPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath="//*[@class='orangehrm-login-branding']") WebElement applogo;
    @FindBy(xpath="//input[@id='input-email']") WebElement Username;
    @FindBy(xpath="//input[@id='input-password']") WebElement Password;
    @FindBy(xpath="//input[@value='Login']") WebElement loginButton;
    @FindBy(xpath="//h2[normalize-space()='My Account']") WebElement txtMyAccount;
    @FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement logoutlink;
    
    public boolean applicationLogo()
    {
        return applogo.isDisplayed();
    }

    public void enterUsername(String un)
    {
        Username.sendKeys(un);
    }

    public void enterPassword(String pwd)
    {
        Password.sendKeys(pwd);
    }
    
    public void clickLoginBtn()
    {
        loginButton.click();
    }

    public boolean txtMyAccountIsDisplayed()
    {
        return txtMyAccount.isDisplayed();
    }

    public void clicklogoutlink()
    {
    	logoutlink.click();
    }
   
}
