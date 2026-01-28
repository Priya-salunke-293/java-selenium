package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom {
	
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement admin;
	
	@FindBy(className = "oxd-userdropdown-tab")
	private WebElement profile_icon ;
	
	@FindBy(xpath = "(//a[@class='oxd-userdropdown-link'])[4]")
	private WebElement logout ;
	
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimMenu;
	
	@FindBy(xpath = "//span[text()='Leave']")
	private WebElement leave;
	
	public HomePagePom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement admin()
	{
		return admin;
	}
	
	public WebElement profileIcon()
	{
		return profile_icon;
	}
	
	public WebElement logout()
	{
		return logout;
	}
	
	public WebElement pimMenu()
	{
		return pimMenu;
	}
	
	public WebElement leaveMenu() {
		return leave;
	}

}