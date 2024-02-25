package sampleTestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExamples {

	WebDriver driver;
	@BeforeClass
	void setup() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/subhamkumar/RestAssured/chromedriver-mac-arm64/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://gorest.co.in");		
	}
	@Test
	void logoTest() {
		WebElement logo=driver.findElement(By.xpath("/html/body/nav/div/a/i"));
		Assert.assertTrue(logo.isDisplayed(),"Logo not displayed");
	}
}
