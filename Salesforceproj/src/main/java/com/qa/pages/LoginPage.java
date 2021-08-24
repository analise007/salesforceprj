package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;
import com.qa.elements.LoginPageElements;

public class LoginPage extends Base
{
	
	public LoginPage() {
		PageFactory.initElements(driver,LoginPageElements.class);
	}


}
