package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.basePage;

public class LoginpageRepo extends basePage{

    public LoginpageRepo(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath="//*[@class='orangehrm-login-branding']") WebElement applogo;
    @FindBy(xpath="//*[@name='username']") WebElement Username;
    @FindBy(xpath="//*[@name='password']") WebElement Password;
    @FindBy(xpath="//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']") WebElement loginButton;
    @FindBy(xpath="(//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']") WebElement dashbord;
    @FindBy(xpath="//*[text()='Admin']") WebElement adminModule;
    @FindBy(xpath="//*[@class=\"oxd-text oxd-text--h6 orangehrm-main-title\"]") WebElement addUser;
    @FindBy(xpath="//*[text()=\"User Role\"]//parent::div//following-sibling::div") WebElement userRole;
    @FindBy(xpath="//*[@class=\"oxd-main-menu-item active\"]") WebElement recruitment;
    @FindBy(xpath="//*[@class=\"oxd-text oxd-text--h5 oxd-table-filter-title\"]") WebElement candidates;
    @FindBy(xpath="//*[@class=\"oxd-text oxd-text--h6 orangehrm-main-title\"]") WebElement addCandidate;
    @FindBy(xpath="//*[@href=\"/web/index.php/pim/viewPimModule\"]") WebElement pimLink;
    @FindBy(xpath="//*[text()='Add Employee']") WebElement addEmployee;
    @FindBy(xpath="//*[text()='Employee Full Name']") WebElement elemployeeFullName;
    @FindBy(name="firstName") WebElement firstName;
    @FindBy(name="lastName") WebElement lastName;
    @FindBy(xpath="//*[@class=\"oxd-input-group__label-wrapper\"]//following-sibling::div//input[@class=\"oxd-input oxd-input--active\"]") WebElement employeeID;
    @FindBy(xpath="//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]") WebElement saveBtn;

    public boolean applicationLogo()
    {
        return applogo.isDisplayed();
    }

    public void enterUsernameAndPassword(String un, String pwd)
    {
        Username.sendKeys(un);
        Password.sendKeys(pwd);
    }

    public void clickLoginBtn()
    {
        loginButton.click();
    }

    public boolean adminModuleIsDisplayed()
    {
        return adminModule.isDisplayed();
    }

    public boolean  getDashboardTxt() {
        return dashbord.isDisplayed();
    }
}
