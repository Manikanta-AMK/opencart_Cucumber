package stepdefination;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homepage;
import pages.loginPage;

public class loginSteps  {

	WebDriver driver;
	loginPage lp;    
	homepage hp;

    @Given("Launch the Application and navigate to login page")
    public void launch_the_application() {
    	baseclass.getLogger().info("Goto my account-->Click on Login.. ");
    	hp = new homepage(baseclass.getDriver());
    	hp.clickMyAccount();
    	hp.clickLogin();
    }

    @When("Given the username and password \\(username: {string}, password: {string})")
    public void given_the_username_and_password_username_password(String username, String password) {
    	lp = new loginPage(baseclass.getDriver());
    	lp.enterUsername(username);
    	lp.enterPassword(password);
    }
    
    @When("Click on login button")
    public void click_on_login_button() {
    	lp.clickLoginBtn();
    }

    @Then("User should be able to see my account text and logout link")
    public void user_should_be_able_to_see_my_account_text_and_logout_link() {
    	Assert.assertEquals(lp.txtMyAccountIsDisplayed(), true);
    	
    }
    
    @Then("click on logout link")
    public void click_on_logout_link() {
    	lp.clicklogoutlink();
    }
    
    @After
    public void methodName() {
        if(driver != null)
        {
            driver.quit();
        }
    }
}
