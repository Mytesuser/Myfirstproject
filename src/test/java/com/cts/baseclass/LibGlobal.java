package com.cts.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	public static WebDriver driver;

	public static void siteLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

	}

	public static void txtFill(WebElement element, String text) {

		element.sendKeys(text);
	}

	public static void buttonClick(WebElement element) {
		element.click();

	}

	public static String getTexts(WebElement element) {

		String text = element.getText();
		return text;

	}

	public static void switchFrameIndex(int index) {
		driver.switchTo().frame(index);

	}

	public static void switchFrameWebelement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void implWaits(int time) {

		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

}
