package FirstTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DayTwoThird {
	WebDriver driver ;
	
	@Test(priority=2, dependsOnMethods= {"Test1"})
	  public void Test2() {
	      
	      System.out.println("Test2");

	  }
	  
	  @Test(priority=1)
	  public void Test1() throws InterruptedException
	  {
		  driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Login");
		  Thread.sleep(20000);
	      driver.findElement(By.cssSelector("[name='wpName']")).sendKeys("admin");
		  //driver.findElement(By.xpath(".//input[@id='wpName1']")).sendKeys("admin");
		  //driver.findElement(By.xpath(".//input[@id='wpPassword1']")).sendKeys("admin123");
		  
		  
		  System.out.println("Test1");
	  
	  }
	  
	  @Test(priority=3)
	  public void Test3()
	  {
	      System.out.println("Test3");
	  }
	  
	  @BeforeSuite
	  public void beforeSuite() {
		  
		/*
		 * String IEDriverPath = "drivers/IEDriverServer.exe";
		 * System.setProperty("webdriver.ie.driver", IEDriverPath); DesiredCapabilities
		 * capabilities = DesiredCapabilities.internetExplorer();
		 * capabilities.setCapability(InternetExplorerDriver.
		 * INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		 * capabilities.setCapability("ignoreZoomSetting", true); // WebDriver driver;
		 * driver = new InternetExplorerDriver(capabilities);
		 */
		  String exePath = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome_proxy.exe";
	        System.setProperty("webdriver.chrome.driver", exePath);
		  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	      capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	      capabilities.setCapability("ignoreZoomSetting", true);
	     // WebDriver driver; 
//	      driver = new InternetExplorerDriver(capabilities);
	        driver = new ChromeDriver(capabilities);

	  }
}
