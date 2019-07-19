package backPack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/backPack/BackGround.feature",
plugin= {"pretty","json:target/cucumber.json"})
public class TestRunner {

}
