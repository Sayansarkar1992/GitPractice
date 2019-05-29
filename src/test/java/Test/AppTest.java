package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     * @return 
     */
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After MEthod");
	}
	@Test
    public void AppTestSuite(  )
    {
        System.out.println("This is appTest");
        System.out.println("This is another test");
        System.out.println("This is another test1");
        System.out.println("This is another test2");
        System.out.println("This is another test3");
        System.out.println("This is another test4");
    }
	@Test
	public void anotherTest() {
		System.out.println("Another Test");
	}



    /**
     * Rigourous Test :-)
     */
    
}
