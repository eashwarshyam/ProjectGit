package com.stepdefinition;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.base.BaseClassMets;
import com.helper.FileReaderManager;
import com.helper.PageObjectManager;
import com.runner.RunnerFlipkart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepFlipkart extends BaseClassMets{
	
	public static WebDriver driver = RunnerFlipkart.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("Launch the Application")
	public void launch_the_application() throws IOException {
	    String loc = FileReaderManager.getInstance().getCrInstance().getUrl();
	    websitelaunch(loc);
	    System.out.println("Flipkart Launch");
	}
	
	@When("Click on Electronics")
	public void click_on_electronics() {
	    xpathClickWeb(pom.getLp().getCloseWindow());
	    System.out.println("********Close window********");
	    xpathClickWeb(pom.getLp().getElecClick());
	    System.out.println("*****Click Electronics******");
	}
	
	@When("Mouse hover Electronics")
	public void mouse_hover_electronics() {
		mouseHoverWeb(pom.getLp().getMousehover());
		System.out.println("***Mouse Hover to Mobiles***");
	}
	
	@Then("Print the Data")
	public void print_the_data() {
		getWebText(pom.getLp().getTextPrint());
		System.out.println("*****Print Mobiles List*****");
	}
}
