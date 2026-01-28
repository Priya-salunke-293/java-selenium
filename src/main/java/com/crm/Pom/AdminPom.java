package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPom {
	
	@FindBy(css = "button[class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addbtn;
	
	@FindBy(xpath = "//div[@class='oxd-select-wrapper']")
	private WebElement userRole ;
	
	@FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]")
	private WebElement status ;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password ;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement empName ;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username ;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement confirm_pass ;
	
	@FindBy(xpath = "//button[@type='submit' and text()=' Save ']")
	private WebElement Save ;
	
	 @FindBy(xpath = "//label[text()='Username']/following::input[1]")
	 private WebElement usernameTxt;

	 // User Role dropdown
	 @FindBy(xpath = "//label[text()='User Role']/following::div[@class='oxd-select-text'][1]")
	 private WebElement userRoleDropdown;
	 
	 // Employee Name input
	 @FindBy(xpath = "//label[text()='Employee Name']/following::input[1]")
	 private WebElement employeeNameTxt;

	 // Status dropdown
	 @FindBy(xpath = "//label[text()='Status']/following::div[@class='oxd-select-text'][1]")
	 private WebElement statusDropdown;

	 // Search button
	 @FindBy(xpath = "//button[@type='submit']")
	 private WebElement searchBtn;

	 // Reset button
	 @FindBy(xpath = "//button[text()=' Reset ']")
	 private WebElement resetBtn;

	 // Result row
	 @FindBy(xpath = "//div[@class='oxd-table-body']//div[@role='row']")
	 private WebElement resultRow;

	
	public AdminPom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement addbtn()
	{
		return addbtn;
	}
	
	public WebElement userRole()
	{
		return userRole;
	}
	public WebElement staus()
	{
		return status;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement empName()
	{
		return empName;
	}
	
	
	public WebElement username()
	{
		return username;
	}
	
	public WebElement confirm_pass()
	{
		return confirm_pass;
	}
	
	public WebElement save()
	{
		return Save;
	}
	
	public WebElement usernameTxt() { 
		return usernameTxt; 
	}
    public WebElement userRoleDropdown() { 
        	return userRoleDropdown;
    }
    public WebElement employeeNameTxt() { 
    	   return employeeNameTxt; 
    }
    public WebElement statusDropdown() {
    	   return statusDropdown; 
    }
    public WebElement searchBtn() { 
    	    return searchBtn; 
    }
    public WebElement resetBtn() { 
    	    return resetBtn; 
    }
    public WebElement resultRow() { 
    	   return resultRow; 
    	}

	
}