package ZQedge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathmultiple {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
