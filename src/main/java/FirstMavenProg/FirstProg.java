package FirstMavenProg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

WebDriver driver ;
        //String exePath = "./Resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome_proxy.exe");
        driver = new ChromeDriver();
        //Open URL
        System.out.println("Test Case executSessionOne with Thread Id:- "   + Thread.currentThread().getId());
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}

}
