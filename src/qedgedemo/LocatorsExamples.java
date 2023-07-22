package qedgedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExamples {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	driver.get("http://flights.qedgetech.com");
	driver.findElement(By.name("email")).sendKeys("pavankarpe7@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Pavan@123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
}
