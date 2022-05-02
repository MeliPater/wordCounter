package wordCounter.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/wordCounter.feature",
        tags = "@stories",
        glue = "wordCounter.stepdefinitions",
        plugin = {"pretty", "html:build/cucumber-html-report", "pretty:build/cucumber-report.json"}
)
//snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}