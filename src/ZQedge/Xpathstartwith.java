package ZQedge;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathstartwith {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("demo.qedge");
		driver.findElement(By.name("pass")).sendKeys("demo");
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
		*/
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.className("button")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		//List<WebElement> chklist = driver.findElement(By.xpath("//input[starts-with(@id="ohrmList_chkSelectRecord')]"));
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
