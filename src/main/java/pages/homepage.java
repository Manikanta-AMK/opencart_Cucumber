package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.basePage;

public class homepage extends basePage {

	public homepage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//span[text()='My Account']")	WebElement lnkMyaccount;
	@FindBy(linkText = "Register") WebElement lnkRegister;
	@FindBy(linkText = "Login") WebElement linkLogin;
	@FindBy(xpath="//input[@placeholder='Search']") 	WebElement txtSearchbox;
	@FindBy(xpath="//div[@id='search']//button[@type='button']") WebElement btnSearch;
	
	// Action Methods
	public void clickMyAccount() {
		lnkMyaccount.click();
	}

	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin()    // added in step6
	{
		linkLogin.click();
	}
	
	public void enterProductName(String pName)   //For Search Product Test
	{
		txtSearchbox.sendKeys(pName);
	}
	
	public void clickSearch()  //For Search Product Test
	{
		btnSearch.click();
	}
	
	
	
}
