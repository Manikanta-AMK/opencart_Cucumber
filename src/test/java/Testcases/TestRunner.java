package Testcases;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/Feature",
        glue = "com.OrangeHRM.stepdefination", // ✅ corrected package name
        plugin = {
                "pretty",
                "html:target/cucumber-reports",
                "json:target/cucumber-reports/cucumber.json"
        },
        monochrome = true,
        publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() { // ✅ corrected method name
        return super.scenarios();
    }
}
