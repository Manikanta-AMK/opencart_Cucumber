package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homepage;
import pages.loginPage;

public class loginSteps_DDT {

	WebDriver driver;
	loginPage lp;    
	homepage hp;
	
	@Given("the user navigates to login page")
	public void the_user_navigates_to_login_page() {
		baseclass.getLogger().info("Goto my account-->Click on Login.. ");
    	hp = new homepage(baseclass.getDriver());
    	hp.clickMyAccount();
    	hp.clickLogin();
	}
	@Then("the user should be redirected to the MyAccount Page by passing email and password with excel row {string}")
	public void the_user_should_be_redirected_to_the_my_account_page_by_passing_email_and_password_with_excel_row(String username, String password) {
		lp = new loginPage(baseclass.getDriver());
    	lp.enterUsername(username);
    	lp.enterPassword(password);
	}
	
	@When("Click on login button")
    public void click_on_login_button_DDT() {
    	lp.clickLoginBtn();
    }
	
    @Then("User should be able to see my account text and logout link")
    public void user_should_be_able_to_see_my_account_text_and_logout_link_DDT() {
    	Assert.assertEquals(lp.txtMyAccountIsDisplayed(), true);
    	
    }
    
    @Then("click on logout link")
    public void click_on_logout_link_DDT() {
    	lp.clicklogoutlink();
    }
}
