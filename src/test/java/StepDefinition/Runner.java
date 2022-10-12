package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\featuref\\Login.feature",glue= {"StepDefinition"}, plugin= {"pretty","junit:target\\logRunner\\report"})
public class Runner {

}
