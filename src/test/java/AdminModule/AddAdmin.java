package AdminModule;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.FileUtility.ReadFromExcel;
import com.crm.Pom.AdminPom;
import com.crm.Pom.HomePagePom;
import com.crm.javaUtility.GenerateDateAndTime;

import BaseClass.HomePageBase;

public class AddAdmin extends HomePageBase {
	
	@Test(enabled = true)
	public void tc_0020() throws EncryptedDocumentException, IOException, InterruptedException {
		
		HomePagePom home = new HomePagePom(driver);
		home.admin().click();
		AdminPom admin = new AdminPom(driver);
		admin.addbtn().click();
		
		Actions act = new Actions(driver);
		act.click(admin.userRole()).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
		
		act.click(admin.staus()).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
		
        String password = ReadFromExcel.readExcelData("Sheet1", 1, 2);
        admin.password().sendKeys(password);
        
        String empName = ReadFromExcel.readExcelData("Sheet1", 1, 3);
        admin.empName().sendKeys(empName);
        Thread.sleep(2000);
        
        act.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
        
        String username = GenerateDateAndTime.dynamicName(ReadFromExcel.readExcelData("Sheet1", 1, 4));
        admin.username().sendKeys(username);
        
        admin.confirm_pass().sendKeys(password);
        admin.save().click();
        
        List<WebElement> adminUser = driver.findElements(By.xpath("//div[text()='"+username+"']"));
        assertTrue(adminUser.size()>0, "Admin is not Created");
        Reporter.log("Admin is created Successfully...", true);
	}
}
