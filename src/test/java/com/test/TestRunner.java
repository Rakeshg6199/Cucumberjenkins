package com.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.GenerateReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Administrator\\eclipse-workspace\\MavenTest\\src\\test\\resources\\FeatureFile\\test.feature", monochrome = true,
glue = "org.step", plugin = {
		"pretty", "json:src\\test\\resources\\cucumber.json" })

public class TestRunner {

	@AfterClass
	public static void afterClass() {
		GenerateReport.report();
	}
	
}
