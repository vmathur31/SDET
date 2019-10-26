package FirstTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver ;

	
	@Test
  public void f() {
		  System.out.println("Test Case executSessionOne with Thread Id:- "   + Thread.currentThread().getId());
	        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	        driver.findElement(By.cssSelector("[name='txtUsername']")).sendKeys("admin");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  String IEDriverPath = "drivers/IEDriverServer.exe";
      System.setProperty("webdriver.ie.driver", IEDriverPath);
      DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
      capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
      capabilities.setCapability("ignoreZoomSetting", true);
     // WebDriver driver; 
      driver = new InternetExplorerDriver(capabilities);
  }

  @AfterSuite
  public void afterSuite() {
  }

}
