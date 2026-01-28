package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	
	@FindBy(name = "username")
	private WebElement username ;
	
	@FindBy(css = "input[name = 'password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//p[text()='Forgot your password? ']")
	private WebElement forgot_pass;
	
	@FindBy(name="username")
	private WebElement forgot_username;
	
	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement cancel_btn;
	
	@FindBy(xpath = "//button[text()=' Reset Password ']")
	private WebElement reset_btn;
	
	@FindBy(xpath = "//h6[contains(text(),'Reset Password link sent')]")
    private WebElement resetSuccessMsg;

    
    @FindBy(xpath = "//span[text()='Required']")
    private WebElement resetRequiredMsg;
	
	public LoginPom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement username()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement loginButton()
	{
		return loginButton;
	}
	
	public WebElement forgot_pass()
	{
		return forgot_pass;
	}
	
	public WebElement forgot_username()
	{
		return forgot_username;
	}
	
	public WebElement cancel_btn()
	{
		return cancel_btn;
	}
	
	public WebElement reset_btn()
	{
		return reset_btn;
	}
	
	 public WebElement successMsg() {
	        return resetSuccessMsg;
	    }

	    public WebElement resetRequiredMsg() {
	        return resetRequiredMsg;
	    }
	

}