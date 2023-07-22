package ZQedge;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args)
	{
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    //driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
    
    driver.get("http://primusbank.qedgetech.com");
    driver.findElement(By.linkText("Site Map")).click();
    driver.findElement(By.linkText("About Us")).click();

    // Click on Link that available in page
    
	}

}
