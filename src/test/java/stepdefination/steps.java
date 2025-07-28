package stepdefination;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginpageRepo;

public class steps  {

	WebDriver driver;
	LoginpageRepo lprepo;
	
	    
//    @Before
//    public void setup()
//    {
//    	driver = new ChromeDriver();
//		lprepo = new LoginpageRepo(driver);
//    }
//
    

    @Given("Launch the Application")
    public void launch_the_application() {
    	driver = new ChromeDriver();
    	driver.get("https://tutorialsninja.com/demo/");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    

    @When("click on my account link and select login option")
    public void click_on_my_account_link_and_select_login_option() {
    	driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
    	driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
    }

    @When("Given the username and password \\(username: {string}, password: {string})")
    public void given_the_username_and_password_username_password(String username, String password) {
    	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
    	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
    }
    @When("Click on login button")
    public void click_on_login_button() {
    	driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @Then("User should be able to see my account text and logout link")
    public void user_should_be_able_to_see_my_account_text_and_logout_link() {
    	boolean txtMyAccount = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
    	Assert.assertEquals(txtMyAccount, true);
    	boolean linkLogout =  driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).isDisplayed();
    	Assert.assertEquals(linkLogout, true);
    	
    }
    
    @Then("click on logout link")
    public void click_on_logout_link() {
    	driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
    }
    
    @After
    public void methodName() {
        if(driver != null)
        {
            driver.quit();
        }
    }
}
