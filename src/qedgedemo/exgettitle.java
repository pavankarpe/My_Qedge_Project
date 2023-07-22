package qedgedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exgettitle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		String exptitle = "Google Images";
		driver.findElement(By.linkText("Images")).click();
		String acttitle = driver.getTitle();
		
		if (acttitle.equalsIgnoreCase(exptitle))
		{
			System.out.println("Test pass");
		}else
		{
			System.out.println("Test fail");
		}
		driver.close();
	}

}
