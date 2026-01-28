package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.FileUtility.ReadFromProperties;
import com.crm.Pom.HomePagePom;
import com.crm.Pom.LoginPom;

public class HomePageBase {

    public static WebDriver driver;

    @BeforeClass
    public void preCondition() throws IOException {

        String browser = ReadFromProperties.readProperties("browser");
        String url = ReadFromProperties.readProperties("url");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } 
        else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        }
        else {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(url);
    }

    @BeforeMethod
    public void login() throws IOException {

        String user = ReadFromProperties.readProperties("username");
        String pwd = ReadFromProperties.readProperties("password");
        LoginPom login = new LoginPom(driver);
        login.username().sendKeys(user);
        login.password().sendKeys(pwd);
        login.loginButton().click();

    }

    @AfterMethod
    public void logout() {

        HomePagePom home = new HomePagePom(driver);
        home.profileIcon().click();
        home.logout().click();
        Reporter.log("Logout Successful", true);
    }

    @AfterClass
    public void postConditions() {
        driver.quit();
       
    }
}
