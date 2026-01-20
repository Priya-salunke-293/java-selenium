package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom {
	
	@FindBy(className = "oxd-main-menu-item")
	private WebElement admin;
	
	@FindBy(className = "oxd-userdropdown-tab")
	private WebElement profile_icon ;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout ;
	
	public HomePagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[text()='Time at Work']")
	private WebElement timaeAtWork;
	
	@FindBy(xpath = "//p[text()='My Actions']")
	private WebElement myActions;
	
	@FindBy(xpath = "//p[text()='Quick Launch']")
	private WebElement quickLaunch;
	
	@FindBy(xpath = "//button[@title='Assign Leave']")
	private WebElement assignLeave;
	
	@FindBy(xpath = "//button[@title='Leave List']")
	private WebElement leaveList;
	
	@FindBy(xpath = "//button[@title='Timesheets']")
	private WebElement timeSheets;
	
	@FindBy(xpath = "//button[@title='Apply Leave']")
	private WebElement applyLeave;
	
	@FindBy(xpath = "//button[@title='My Leave']")
	private WebElement myLeave;
	
	@FindBy(xpath = "//button[@title='My Timesheet']")
	private WebElement myTimeSheet;
	
	@FindBy(xpath = "//p[text()='Buzz Latest Posts']")
	private WebElement buzz_posts;
	
	@FindBy(xpath = "//p[text()='Employees on Leave Today']")
	private WebElement empOnLeave;
	
	@FindBy(xpath = "//p[text()='Employee Distribution by Sub Unit']")
	private WebElement empDistBySubUnit;
	
	@FindBy(xpath = "//p[text()='Employee Distribution by Location")
	private WebElement empDistByLoc;
	
	@FindBy(xpath = "//canvas[@id='46crm7Kk']")
	private WebElement subUnitPerc;
	
	@FindBy(xpath = "//canvas[@id='-i88_0wB']")
	private WebElement locPerc;
	
	@FindBy(xpath = "//span[@title='Engineering']")
	private WebElement legend;
	
	public WebElement admin() {
		return admin;
	}
	
	public WebElement profileIcon() {
		return profile_icon;
	}
	
	public WebElement logout() {
		return logout;
	}

	public WebElement timaeAtWork() {
		return timaeAtWork;
	}

	public WebElement myActions() {
		return myActions;
	}

	public WebElement quickLaunch() {
		return quickLaunch;
	}

	public WebElement assignLeave() {
		return assignLeave;
	}

	public WebElement leaveList() {
		return leaveList;
	}

	public WebElement timeSheets() {
		return timeSheets;
	}

	public WebElement applyLeave() {
		return applyLeave;
	}

	public WebElement myLeave() {
		return myLeave;
	}

	public WebElement myTimeSheet() {
		return myTimeSheet;
	}

	public WebElement getBuzz_posts() {
		return buzz_posts;
	}

	public WebElement empOnLeave() {
		return empOnLeave;
	}

	public WebElement empDistBySubUnit() {
		return empDistBySubUnit;
	}
	
	public WebElement empDistByLoc() {
		return empDistByLoc;
	}

	public WebElement subUnitPerc() {
		return subUnitPerc;
	}

	public WebElement locPerc() {
		return locPerc;
	}

	public WebElement legend() {
		return legend;
	}

}