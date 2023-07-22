package qedgedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceptiontrycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Praveenk");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	
		try {
				if (driver.findElement(By.linkText("Admin")).isDisplayed()) 
				{
					System.out.println("Employee Login Test Fail");
				}
		} catch (Exception e)
		{
			System.out.println("Employee Login Test Pass");
			System.out.println(e.getMessage()); 
			
		}
		
		
		
		
	}

}
