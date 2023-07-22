package testing23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoooo {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://gmail.com");
	//driver.navigate().to("http://gmail.com");
	driver.findElement(By.linkText("Help")).click();
	driver.close();
}

}
