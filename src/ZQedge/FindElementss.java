package ZQedge;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    //driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	driver.get("http://Orangehrm.qedgetech.com");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.className("button")).click();
	
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();

	//driver.findElement(By.partialLinkText("Welcome")).click();
	//driver.findElement(By.linkText("Logout")).click();
	
	//driver.close();
		
		
		
		
		
		
		
		
	}

}
