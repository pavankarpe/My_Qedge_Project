package ZQedge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://google.com");
	driver.findElement(By.linkText("Gmail")).click();
	//String pgtitle = driver.getTitle();
    String pgurl = driver.getCurrentUrl();
	System.out.println(pgurl);
		
		
		
		
		
		
		
		
	}

}
