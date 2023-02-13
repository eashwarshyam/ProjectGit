package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.LaunchPage;

public class PageObjectManager {
	public static WebDriver driver;
	private LaunchPage lp;
	
	public PageObjectManager(WebDriver driver1) {
		this.driver = driver1;
	}
	
	public LaunchPage getLp() {
		lp = new LaunchPage(driver);
		return lp;
	}
}