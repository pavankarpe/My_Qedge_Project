package qedgedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://google.com");
driver.navigate();
driver.close();

	
	
	
	
	
	
	
	
	}

}
