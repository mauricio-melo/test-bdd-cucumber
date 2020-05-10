package com.mmelo.testbdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.mmelo.testbdd"},
        features = "src/test/resources",
        plugin = {"pretty", "json:build/cucumber/cucumber-report.json"})
public class CucumberRunner {

}