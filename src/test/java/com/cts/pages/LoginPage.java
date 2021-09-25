package com.cts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.baseclass.LibGlobal;

public class LoginPage extends LibGlobal  {
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email")
	private WebElement textUsername;
	
	@FindBy(id="pass")
	private WebElement textPassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;

	public WebElement getTextUsername() {
		return textUsername;
	}

	public WebElement getTextPassword() {
		return textPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	

}
