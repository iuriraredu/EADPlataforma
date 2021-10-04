package br.com.estagioyaman.runTest;

import br.com.estagioyaman.settings.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/",
        glue = {
                "br.com.estagioyaman.web",
                "br.com.estagioyaman.stepsDefinitions",
                "br.com.estagioyaman.hooks"
        },
        plugin = {
                "pretty",
                "json:test-output/cucumber.json"
        },
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@web"
)
public class RunTest extends BaseTest {
}