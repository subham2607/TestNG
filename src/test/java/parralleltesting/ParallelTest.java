package parralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest {
	
	WebDriver driver;

	@Test
	void logoTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/subhamkumar/RestAssured/chromedriver-mac-arm64/chromedriver");
		driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]"));
		
		Assert.assertTrue(logo.isDisplayed());
		
		Thread.sleep(5000);

	}
	
	@Test
	void homePageTitle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/subhamkumar/RestAssured/chromedriver-mac-arm64/chromedriver");
		driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]"));
		
		Assert.assertEquals(driver.getTitle(),"Swag Labs");
		
		Thread.sleep(5000);
	}
	
	@AfterMethod
	void tearDown() {
		driver.quit();
	}
}
