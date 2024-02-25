package Listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomListners.class)
public class ListenerTest {

	
	@Test
	void test1() {
		System.out.println("This is Test1");
		AssertJUnit.assertEquals("A", "A");
	}
	
	@Test
	void test2() {
		System.out.println("This is Test2");
		AssertJUnit.assertEquals("A", "B");
	}
	@Test
	void test3() {
		System.out.println("This is Test3");
		throw new SkipException("This is skip exception....");
	}
}
