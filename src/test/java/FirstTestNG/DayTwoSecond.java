package FirstTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@Test(retryAnalyzer = FirstTestNG.CustomRetryAnalyzer.class)
public class DayTwoSecond {
	@Test(priority=2, dependsOnMethods= {"Test1"})
	  public void Test2() {
	      
	      System.out.println("Test2");
//	      SYSTEM.OUT.PRINTLN("TEST CASE EXECUTSESSIONONE WITH THREAD ID:- " + THREAD.CURRENTTHREAD().GETID());
//	      DRIVER.GET("HTTPS://OPENSOURCE-DEMO.ORANGEHRMLIVE.COM/INDEX.PHP/AUTH/LOGIN");
//	      Driver.findElement(By.cssSelector("[name=txtUsername]")).sendKeys("admin");
	  }
	  
	  @Test(priority=1)
	  public void Test1()
	  {
	      Assert.fail();
		  System.out.println("Test1");
	  
	  }
	  
	  @Test(priority=3)
	  public void Test3()
	  {
	      System.out.println("Test3");
	  }
}
