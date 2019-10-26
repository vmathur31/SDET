package FirstTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdefinition {
	
public static WebDriver driver = null;
    
    
    public Webdriverdefinition()
    {
        if(driver == null)
        {
                  //Mention path of chrome driver of your system
        	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Chrome_driver_76.0.3809.68\\Chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit Wait
              System.out.println("**Chrome driver initiated**");
        }
        else
        {
            System.out.println("**Chrome driver already instantiated**");
        }
    }
    
    public static WebDriver getdriver()
    {
        if (driver == null){
            return driver;
            }else{
            return driver;
            }
    }


}
