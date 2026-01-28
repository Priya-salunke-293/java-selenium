package AdminModule;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import com.crm.FileUtility.ReadFromExcel;
import BaseClass.HomePageBase;
import com.crm.Pom.HomePagePom;

import com.crm.javaUtility.*;
import com.crm.Pom.AdminPom;

public class Admin extends HomePageBase {
	@Test(priority = 1 , enabled = false)
public void tc_0020() throws EncryptedDocumentException, IOException, InterruptedException {
		
	HomePagePom home = new HomePagePom(driver);
	home.admin().click();
	AdminPom admin = new AdminPom(driver);
	admin.addbtn().click();
	Actions act=new Actions(driver);
	act.click(admin.userRole()).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
	act.click(admin.staus()).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
	
	String password = ReadFromExcel.readExcelData("Sheet1", 1, 2);
	admin.password().sendKeys(password);
	Thread.sleep(2000);
	
	String empName=ReadFromExcel.readExcelData("Sheet1", 1, 3);
	admin.empName().sendKeys(empName);
	Thread.sleep(4000);
	
	act.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();	
	String username=GenerateDateAndTime.dynamicName(ReadFromExcel.readExcelData("Sheet1", 1, 4));
	System.out.println(username);
	admin.username().sendKeys(username);
	admin.confirm_pass().sendKeys(password);
	admin.save().click();
	Thread.sleep(3000);
	
	List<WebElement> adminUser = driver.findElements(By.xpath("//div[text()='"+username+"']"));
	assertTrue(adminUser.size()>0,"Admin is not created");
	Reporter.log("Admin is created Successfully....",true);
}
	
	
	@Test(priority = 2 , enabled = false)
	public void searchUserByEmployeeName() throws EncryptedDocumentException, IOException, InterruptedException {
	    AdminPom admin = new AdminPom(driver);
	    HomePagePom home = new HomePagePom(driver);
	    home.admin().click();
	    String empName=ReadFromExcel.readExcelData("Sheet1", 1, 3);
		admin.empName().sendKeys(empName);
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();	
		admin.usernameTxt().sendKeys(empName);
	    admin.searchBtn().click();

	    Assert.assertTrue(admin.resultRow().isDisplayed());
	}
	
	@Test(priority = 3, enabled = false)
	public void searchUserByUsername() throws EncryptedDocumentException, IOException {
		AdminPom admin = new AdminPom(driver);
	    HomePagePom home = new HomePagePom(driver);
	    home.admin().click();

	    String username=ReadFromExcel.readExcelData("Sheet1", 1, 4);
	    admin.usernameTxt().sendKeys(username);
	    admin.searchBtn().click();

	    Assert.assertTrue(admin.resultRow().isDisplayed());
	}
	
	@Test(priority = 4 , enabled = false)
	public void searchUserByRole() {
	    
		AdminPom admin = new AdminPom(driver);
	    HomePagePom home = new HomePagePom(driver);
	    home.admin().click();
	    admin.userRoleDropdown().click();
	    new Actions(driver).sendKeys(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();

	    admin.searchBtn().click();
	    Assert.assertTrue(admin.resultRow().isDisplayed());
	}
	
	@Test(priority = 4 , enabled = true)
	public void searchUserByStatus() {
		AdminPom admin = new AdminPom(driver);
	    HomePagePom home = new HomePagePom(driver);
	    home.admin().click();
	    admin.statusDropdown().click();
	    new Actions(driver).sendKeys(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();

	    admin.searchBtn().click();
	    Assert.assertTrue(admin.resultRow().isDisplayed());
	}
	
	@Test(priority = 6 , enabled = false)
	public void verifyResetButton() {
		AdminPom admin = new AdminPom(driver);
	    HomePagePom home = new HomePagePom(driver);
	    home.admin().click();

	    admin.usernameTxt().sendKeys("Admin");
	    admin.employeeNameTxt().sendKeys("manda");

	    admin.resetBtn().click();

	    Assert.assertEquals(admin.usernameTxt().getAttribute("value"), "");
	}

}