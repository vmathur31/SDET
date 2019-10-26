package FirstMavenProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WorkingProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String IEDriverPath = "drivers/IEDriverServer.exe";
        System.setProperty("webdriver.ie.driver", IEDriverPath);
        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capabilities.setCapability("ignoreZoomSetting", true);
        WebDriver driver; 
        driver = new InternetExplorerDriver(capabilities);
        
          System.out.println("Test Case executSessionOne with Thread Id:- "   + Thread.currentThread().getId());
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.findElement(By.cssSelector("[name=txtUsername]")).sendKeys("admin");

	}

}
