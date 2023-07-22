package testing23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openingchrme {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://google.com");
	driver.findElement(By.linkText("Gmail")).click();
	String mg = driver.getCurrentUrl();
	//System.out.println(mg);
	if(mg.toLowerCase().contains("gmail"))
	{
		System.out.println("test pass");
	}else
	{
		System.out.println("test fail");
	}
	
	driver.close();
}
}

