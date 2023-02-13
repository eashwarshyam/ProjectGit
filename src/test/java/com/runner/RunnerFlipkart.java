package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.base.BaseClassMets;
import com.helper.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "src\\test\\java\\com\\featurefile\\flipkart.feature",
	glue = "com\\stepdefinition",
	monochrome = true,
	stepNotifications = true
	)

public class RunnerFlipkart extends BaseClassMets{
		public static WebDriver driver;
		@BeforeClass
		public static void launch() throws IOException {
			 String address = FileReaderManager.getInstance().getCrInstance().getBrowser();
					driver = browserLaunch(address);
		}
		@AfterClass
		public static void browserclose() {
			browserQuit();
		}
}