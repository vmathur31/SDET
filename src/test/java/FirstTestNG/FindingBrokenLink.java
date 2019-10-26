package FirstTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingBrokenLink {

/**
* @param args
*/
public static void main(String[] args)
{
// TODO Auto-generated method stub E:\chromedriver_win32
	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Chrome_driver_76.0.3809.68\\Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("http://www.facebook.com/");

List MyLinks=driver.findElements(By.tagName("a"));

System.out.println("MyLink size-->"+MyLinks.size());

for(int i=0;i<MyLinks.size();i++)
{

    WebElement ele= (WebElement) MyLinks.get(i);

    //
    String url=ele.getAttribute("href");

    HTTPLinkstatusChecker(url);

}

}

public static void HTTPLinkstatusChecker(String linkUrl)
{
try
{
URL url = new URL(linkUrl);

HttpURLConnection objhttpURLConnection=(HttpURLConnection)url.openConnection();

objhttpURLConnection.setConnectTimeout(3000);

objhttpURLConnection.connect();

if(objhttpURLConnection.getResponseCode()!=200)
{
System.out.println(linkUrl+" Error*-* +"+objhttpURLConnection.getResponseCode());

}
{
//This syntax will print http response code.
System.out.println(linkUrl+" Perfect*-* "+objhttpURLConnection.getResponseCode());
//This syntax will print http response message
System.out.println(linkUrl+" *-* "+objhttpURLConnection.getResponseMessage());
}

} catch (Exception e) {

}
}

}

