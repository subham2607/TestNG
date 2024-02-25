package Anotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase2 {
	
	
	@BeforeClass
	void beforeClass() {
		
		System.out.println("this will execute before the class starts");
	}
	
	@AfterClass
	void afterClass() {
		
		System.out.println("this will execute after the class");
	}
	
	
	@BeforeMethod
	void beforMethod() {
		//execute this method before any actual test method.
		System.out.println("Befor Method");
	}
	
	@AfterMethod
	void afterMethod() {
		//will execute multiple times after execution of any method.
		System.out.println("after every method");
	}
	
	@Test
	void test3() {
		
		System.out.println("This is Test3....");
	}
	@Test
	void test4() {
		System.out.println("This is Test4....");
	}
	@BeforeSuite
	void beforeSuite() {
		System.out.println("this will execute before the test suite is execute");
	}
	@AfterSuite
	void afterSuite() {
		System.out.println("this will execute after the test suite is execute");		
	}
}
