package qedgedemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoultXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("pavankarpe7@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pavan@123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div[3]/ul/li[2]/div/a/i")).click();
		// Partial xpaths is here
		driver.findElement(By.xpath("//div/div[3]/ul/li[2]/div/a/i")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
