package com.cts.stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cts.baseclass.LibGlobal;
import com.cts.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends LibGlobal {
	
	public static LoginPage lpage;
	
	@Given("Launch the application")
	public void launch_the_application() {
		
		siteLaunch("https://www.facebook.com");
	    
	}
	@When("Enter valid username")
	public void enter_valid_username() {
	lpage=new LoginPage();
	txtFill(lpage.getTextUsername(), "david");
	   
	}
	@When("Enter valid password")
	public void enter_valid_password() {
		txtFill(lpage.getTextPassword(), "david");
	    
	}
	@When("click on login button")
	public void click_on_login_button() {
		buttonClick(lpage.getBtnLogin());
		System.out.println("changes");
	    
	}
	@Then("Verify appication is logged in or not")
	public void verify_appication_is_logged_in_or_not() {
		

		Assert.assertEquals("Log Into Facebooks",getTexts(driver.findElement(By.xpath("//div[text()=\'Log Into Facebook\']"))));
		
	}



	
	
	
	




}
