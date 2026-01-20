package AdminModule;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.Pom.HomePagePom;

import BaseClass.HomePageBase;

public class HomePageComponents extends HomePageBase{

	@Test
	public void tc_0031() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.timaeAtWork().isDisplayed(),"Time at Work is not displayed");
		Reporter.log("Time at Work is displayed successfully");
	}
	
	@Test
	public void tc_0032() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.myActions().isDisplayed(),"My Actions is not displayed");
		Reporter.log("My Actions is displayed successfully");
	}
	
	@Test
	public void tc_0033() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.quickLaunch().isDisplayed(),"Quick Launch is not displayed");
		Reporter.log("Quick Launch is displayed successfully");
	}
	
	@Test
	public void tc_0034() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.myLeave().isDisplayed(),"My Leave is not displayed");
		Reporter.log("My Leave is displayed successfully");
	}
	
	@Test
	public void tc_0035() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.myTimeSheet().isDisplayed(),"My Timesheet is not displayed");
		Reporter.log("My Timesheet is displayed successfully");
	}
	
	@Test
	public void tc_0036() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.applyLeave().isDisplayed(),"Apply Leaves is not displayed");
		Reporter.log("Apply Leave is displayed successfully");
	}
	
	@Test
	public void tc_0037() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.timeSheets().isDisplayed(),"Timesheets is not displayed");
		Reporter.log("Timesheets is displayed successfully");
	}
	
	@Test
	public void tc_0038() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.myLeave().isDisplayed(),"My leave is not displayed");
		Reporter.log("My leave is displayed successfully");
	}
	
	@Test
	public void tc_0039() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.getBuzz_posts().isDisplayed(),"Buzz latest Posts is not displayed");
		Reporter.log("Buzz latest posts is displayed successfully");
	}
	
	@Test
	public void tc_0040() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.empOnLeave().isDisplayed(),"Empolyee on Leave Today is not displayed");
		Reporter.log("Empolyee on Leave Today is displayed successfully");
	}
	
	@Test
	public void tc_0041() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.timaeAtWork().isDisplayed(),"Time at Work is not displayed");
		Reporter.log("Time at Work is displayed successfully");
	}
	
	@Test
	public void tc_0042() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.empDistByLoc().isDisplayed(),"Employee Distributed by Location is not displayed");
		Reporter.log("Employee Distributed by Location is displayed successfully");
	}
	
	@Test
	public void tc_0043() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.empDistBySubUnit().isDisplayed(),"Employee Distributed by Sub Unit is not displayed");
		Reporter.log("Employee Distributed by Sub Unit is displayed successfully");
	}
	
	@Test
	public void tc_0044() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.locPerc().isDisplayed(),"Location Percentage is not displayed");
		Reporter.log("Location Percentage is displayed successfully");
	}
	
	@Test
	public void tc_0045() {
		HomePagePom home = new HomePagePom(driver);
		assertTrue(home.legend().isDisplayed(),"Legends is not displayed");
		Reporter.log("Legends is displayed successfully");
	}
}
