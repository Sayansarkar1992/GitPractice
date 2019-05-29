package Test1;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class SomeTest {
	
	@Test
	public void testunderAnotherPakage() {
		System.out.println("This test is under Test1 Package");
	}
	
	@Test
	public void testunderAnotherPakage2() {
		System.out.println("testunderAnotherPakage2");
	}
	
	@Test(groups="ui")
	public void uiGroupTest() {
		System.out.println("Test1");
	}
	@Test(groups="ui")
	public void uiGroupTest2() {
		System.out.println("Test2");
	}
	@BeforeGroups("ui")
	public void beforeGroup() {
		System.out.println("Before Group");
	}
	@AfterGroups("ui")
	public void afterGroup() {
		System.out.println("After group");
	}

}
