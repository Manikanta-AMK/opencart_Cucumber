package stepdefination;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.baseclass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.accountRegistration;
import pages.homepage;
import pages.loginPage;


public class registrationSteps {

	 WebDriver driver;
     homepage hp;
     loginPage lp;
     accountRegistration accountreg;
     
	@Given("the user navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
	
		hp=new homepage(baseclass.getDriver());
    	hp.clickMyAccount();
        hp.clickRegister();
                   
	}

	@When("the user enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) {
		
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
	    
		accountreg=new accountRegistration(baseclass.getDriver());
		accountreg.setFirstName(dataMap.get("firstName"));
		accountreg.setLastName(dataMap.get("lastName"));
		accountreg.setEmail(baseclass.randomAlphaNumeric()+"@gmail.com");
		accountreg.setTelephone(dataMap.get("telephone"));
		accountreg.setPassword(dataMap.get("password"));
		accountreg.setConfirmPassword(dataMap.get("password"));
		
	}

	@When("the user selects Privacy Policy")
	public void user_selects_privacy_policy() {
		accountreg.setPrivacyPolicy();
	}

	@When("the user clicks on Continue button")
	public void user_clicks_on_continue_button() {
		accountreg.clickContinue();
	}

	@Then("the user account should get created successfully")
	public void user_account_should_get_created_successfully() {
		
		String confmsg=accountreg.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
 }
