package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {

	public static WebDriver driver;
	
	public static void LaunchURL(String uRL) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\MavenTest\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(uRL);
		driver.manage().window().maximize();
	}
	public static void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
	}
	
	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	
}
