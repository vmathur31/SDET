package FirstTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DayThreeFirst {
	 @Test    
	  public void executSessionOne(){
	          //First session of WebDriver
		 	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Chrome_driver_76.0.3809.68\\Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	          //Open URL
	          System.out.println("Test Case executSessionOne with Thread Id:- " + Thread.currentThread().getId());
	          driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	          Assert.fail();
	          //find user name text box and fill it	          
	          
	      }
	      
	  @Test    
	      public void executeSessionTwo(){
	          //Second session of WebDriver
		  	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Chrome_driver_76.0.3809.68\\Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	          //Open URL
	      System.out.println("Test Case executSessionTwo with Thread Id:- " + Thread.currentThread().getId());
	      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	      //find user name text box and fill it
	      
	      
	      }
	      
	  @Test    
	      public void executSessionThree(){
	          //Third session of WebDriver
		  	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Chrome_driver_76.0.3809.68\\Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	          //Open URL
	      System.out.println("Test Case executSessionThree with Thread Id:- "   + Thread.currentThread().getId());
	      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	      //find user name text box and fill it
	      
	      
	      }   

}
