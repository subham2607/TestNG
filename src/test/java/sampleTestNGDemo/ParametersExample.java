package sampleTestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String browser, String app) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/subhamkumar/RestAssured/chromedriver-mac-arm64/chromedriver");
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			driver= new SafariDriver();
		}
		
		driver.get(app);		
	}
	@Test(priority = 1)
	void logoTest() {
		WebElement logo=driver.findElement(By.xpath("/html/body/nav/div/a/i"));
		Assert.assertTrue(logo.isDisplayed(),"Logo not displayed");
	}
	
	@Test(priority = 2)
	void homepageTitile() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Go REST","Title is not matched");
	}
}







