package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//Feature/loginDDTExcel.feature"},  glue="stepdefination")

public class TestRunner {
}

