package Anotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

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
	void test1() {
		
		System.out.println("This is Test1....");
	}
	@Test
	void test2() {
		System.out.println("This is Test2....");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("this will execute before the test");
	}
	@AfterTest
	void afterTest() {
		System.out.println("this will execute after the test");
	}
}


