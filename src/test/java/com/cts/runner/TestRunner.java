package com.cts.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)@CucumberOptions(features= {"src/test/resources/FacebookFeatures"}, glue={"com.cts.stepdef"},monochrome=true,tags= "@Sanity",plugin ={"pretty","html:src/test/resources/Reports","json:src/test/resources/Reports"},strict =true)
public class TestRunner {

}
