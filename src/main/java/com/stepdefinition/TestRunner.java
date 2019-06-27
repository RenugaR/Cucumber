package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\GreenTech\\cucumber1\\src\\main\\resources\\CustomerIDtestrunner.feature",glue="com.stepdefiniton",
plugin= {"html:target","json:src/main/resources/report.json"},
dryRun=false,tags= {"@Customer"})
public class TestRunner {

}
