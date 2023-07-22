package qedgedemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialXpath {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("http://snapdeal.com");
		//absoulut location xpath
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[3]/div[1]/div/i")).click();
		Thread.sleep(5000);
		//partial xpath
		driver.findElement(By.xpath("//section/div/div[1]/span/i")).click();
		
		
	}

}
