package cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/cucumber/credentialsTest.feature", glue = { "cucumber" }, monochrome = true

)
public class CredentialTestRunner {

}
