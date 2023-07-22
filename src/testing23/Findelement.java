package testing23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import qedgedemo.exgettitle;

public class Findelement {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com");
	}
	@Test
	public void test() {
		driver.findElement(By.linkText("Site Map")).click();

		String actualTitle = driver.getTitle();
		String expecteTitle="Primus Bank";

		if(actualTitle.toLowerCase().contains(expecteTitle.toLowerCase()))
		{
			System.out.println("Test Pass::  "+expecteTitle+"  "+actualTitle);
			Reporter.log("Test Pass::  "+expecteTitle+"  "+actualTitle,true);
			Assert.assertEquals(actualTitle.toLowerCase(), expecteTitle.toLowerCase());
		}else
		{
			System.out.println("Test Fail::  "+expecteTitle+"  "+actualTitle);
			Reporter.log("Test Fail::  "+expecteTitle+"  "+actualTitle,true);
			Assert.assertEquals(actualTitle.toLowerCase(), expecteTitle.toLowerCase());
		}
		driver.findElement(By.linkText("Home")).click();


	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}


