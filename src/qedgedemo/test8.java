package qedgedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test8 
{
		public static void main(String[] args) 
		{
	
	 
			System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("http://google.com");
			
			/*driver.findElement(By.linkText("Gmail")).click();
			//String pgtitle = driver.getTitle();
			//System.out.println(pgtitle);
			String pgurl = driver.getCurrentUrl();
			System.out.println(pgurl);
			driver.close();
			*/
		}
}
