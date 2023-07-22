package qedgedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownlistelement {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
	    driver.findElement(By.name("q")).sendKeys("selenium");
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> keywordlist = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
	    System.out.println(keywordlist.size());
	    
	    for (WebElement element : keywordlist)
	    {
	    	System.out.println(element.getText());
	    	
	    }
	}

}
