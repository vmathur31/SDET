package FirstTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PrintHref extends Webdriverdefinition {
  
	 @Test(priority=1)
	    public void login_Wiki()
	    {       
			
			  getdriver().get("https://en.wikipedia.org/wiki/Login");
			  WebDriverWait wait = new WebDriverWait(driver, 10);
		      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='search']")));; //explicit wait
			  getdriver().findElement(By.cssSelector("[name=search]")).sendKeys("Test Automation");
			  getdriver().findElement(By.cssSelector("[name=go]")).click();
			  		 
	    }
	    
	    @Test(priority=2)
	    public void Ckeck_Wiki()
	    {
	      String Header =  getdriver().findElement(By.cssSelector("[id=firstHeading]")).getText();
	      System.out.println("Heading of the page = " + Header);
	      Assert.assertEquals(Header,"Test automation");
	          }
	    
	    
	    @Test(priority=3)
	    public void pick_Link()
	    {
	    	List<WebElement> el = driver.findElements(By.tagName("a"));
	    	
	    	
			  for(WebElement link:el)
			  { 
				  System.out.println(link.getText() + " --> " +link.getAttribute("href"));
				  }
			 
	    }
}
