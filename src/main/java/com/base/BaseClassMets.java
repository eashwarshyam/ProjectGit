package com.base;

import java.util.List;
//import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//import screen.VideoRecorder_utlity;

public class BaseClassMets {
	public static WebDriver driver;
	
		public static WebDriver browserLaunch(String browsername) {
			if (browsername.equalsIgnoreCase("chrome")) {
			//	System.setProperty("webdriver.chrome.driver", "E:\\Project\\JAVA Project\\SeleniumTraining\\sel drivers\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("firefox")){
				//System.setProperty("webdriver.gecko.driver", "E:\\Project\\JAVA Project\\SeleniumTraining\\sel drivers\\geckodriver.exe");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else {
				System.out.println("Try to Use Chrome or Firefox..! O/W add the browser in the baseclass");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
			
		}
		public static void websitelaunch(String url) {
			driver.get(url);
		}
		
		public static void pageForward() {
			driver.navigate().forward();
		}
		
		public static void pageRefresh() {
			driver.navigate().refresh();
		}
		
		public static void pageBackward() {
			driver.navigate().back();
		}
		
		public static void pageToNext(String url) {
			driver.navigate().to(url);
		}
		
		public static void xpath_Sendkeys(WebElement ele, String inputText) {
			ele.sendKeys(inputText);
		}
		
		public static void xpathClick(String xpathValue) {
			driver.findElement(By.xpath(xpathValue)).click();
		}
		
		public static void xpathClickWeb(WebElement xpathWebEle) {
			xpathWebEle.click();
		}
		
		public static void browserTabClose() {
			driver.close();// to close the current tab in browser.
		}
		
		public static void browserQuit() {
			driver.quit();// to close the entire browser.
		}
		
		public static void dropdown(WebElement element, String choice, int num_value, String text_value) {
			Select s = new Select(element);
			if (choice.equalsIgnoreCase("index")) {
				s.selectByIndex(num_value);
			}else if (choice.equalsIgnoreCase("value")) {
				s.selectByValue(text_value);
			}else if (choice.equalsIgnoreCase("text")) {
				s.selectByVisibleText(text_value);
			}else {
				System.out.println("Select the DropDown by Index or value or VisibleText");
			}
		}
		
		public static void simplealert() {
			driver.switchTo().alert().accept();
		}
		public static void confirmAlert(String okOrCancel) {
			if (okOrCancel.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().accept();
			}else {
				driver.switchTo().alert().dismiss();
			}
		}
		public static void promptAlert(String text, String okOrCancel) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);
			if (okOrCancel.equalsIgnoreCase("ok")) {
				alert.accept();
			}else {
				alert.dismiss();
			}
		}
		
		public static void mouseHoverWeb(WebElement xpathWebEle) {
			Actions act = new Actions(driver);
			act.moveToElement(xpathWebEle).perform();
		}
		
		public static void getWebText(List<WebElement> list) {
			int j=0 ;
			for (WebElement webElement : list) {
				System.out.println("  : " + webElement.getText());
			}
		}
		
		}
//		public static void videoRecStart(String FileName) throws Exception {
//			VideoRecorder_utlity.startRecord(FileName);
//		}
//		
//		public static void VideoRecStop() throws Exception {
//			VideoRecorder_utlity.stopRecord();
//		}
