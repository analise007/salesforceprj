package com.qa.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements
{
	
	@FindBy(name="username") public WebElement username;
	@FindBy(id="password") public WebElement password;
	@FindBy(id="Login") public WebElement login;
}
