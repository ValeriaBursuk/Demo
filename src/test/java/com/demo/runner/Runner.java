package com.demo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = "src/test/java/com/demo/step_definitions",
        dryRun = true,
        tags = ""
)


public class Runner {

}
