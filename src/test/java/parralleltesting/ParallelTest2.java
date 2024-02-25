package parralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest2 {

	WebDriver driver;
	
	@Test
	void LoginTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/subhamkumar/RestAssured/chromedriver-mac-arm64/chromedriver");
		driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	
		
		Assert.assertEquals(driver.getTitle(),"Swag Labs");
		Thread.sleep(5000);
	}
	
	@AfterTest
	void tearDown() {
		driver.quit();
	}
}