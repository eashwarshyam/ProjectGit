package com.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage {
	public static WebDriver driver;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']") private WebElement closeLoginWindow;
	@FindBy(xpath = "//div[@class='eFQ30H'][2]") private WebElement ClickElectronics;
	@FindBy(xpath = "//span[@class='_2I9KP_']") private WebElement MousehoverElectronics;
	@FindBy(xpath = "//div[@class='_1fwVde'][1]") private List<WebElement> mobileprint;

	public LaunchPage(WebDriver driver2) {
		LaunchPage.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getCloseWindow() {
		return closeLoginWindow;
	}
	
	public WebElement getElecClick() {
		return ClickElectronics;
	}
	
	public WebElement getMousehover() {
		return MousehoverElectronics;
	}
	
	public List<WebElement> getTextPrint() {
		return (List<WebElement>) mobileprint;
	}
}