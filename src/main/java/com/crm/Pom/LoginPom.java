package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
 
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name= "password")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login_btn;
	
	@FindBy(xpath = "//p[text() = 'Forgot your password? ']")
	private WebElement forgot_pass;
	
	//load the variables
    public LoginPom(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public WebElement username() {
    	return username;
    }
    
    public WebElement password() {
    	return password;
    }
    
    public WebElement loginBtn() {
    	return login_btn;
    }
    
    public WebElement forgot() {
    	return forgot_pass;
    }
    
}
