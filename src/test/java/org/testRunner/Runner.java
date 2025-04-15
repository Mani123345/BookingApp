package org.testRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Cancellation.feature",
glue = "org.stepdefinition",
dryRun = false,
plugin = {"pretty",
		"json:src\\test\\resources\\Reports\\JsonReports.json",
		"junit:src\\test\\resources\\Reports\\JunitReports.xml"}
		)
public class Runner {
     @AfterClass
      public static void afterClass() {
	     JVMReports.generateJVMReports("src\\test\\resources\\Reports\\JsonReports.json");
      }
}
