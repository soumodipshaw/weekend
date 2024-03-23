package Runner_class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Shaw\\git\\weekend\\Cucumber\\feature\\login.feature",glue = "step_defination", dryRun = false,plugin = {"pretty","html:report/facebook"})
public class Run {

}
