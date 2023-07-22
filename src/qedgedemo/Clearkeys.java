package qedgedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearkeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	
		if(driver.findElement(By.linkText("Admin")).isDisplayed()) 
		{
			System.out.println("test fail");
		}else
		{
			System.out.println("test pass");
			
			
		}
	
	
	
	
	}

}
