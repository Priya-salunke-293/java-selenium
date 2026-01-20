package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPom {
	
	@FindBy(xpath = "//button[@type='button' and contains(@class,'oxd-button--secondary')]")
	private WebElement add_btn;
	
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
	
	public AdminPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement addbtn() {
		return add_btn;
	}
	
	public WebElement userRole() {
		return userRole;
	}
	
	public WebElement staus() {
		return status;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement empName() {
		return empName;
	}
	
	public WebElement username() {
		return username;
	}
	
	public WebElement confirm_pass() {
		return confirm_pass;
	}
	
	public WebElement save() {
		return Save;
	}
	
}
