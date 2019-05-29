package Test;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Pg_HomePage;


public class MainTest  {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@Test
	public void demoTest1() throws IOException {
		
	System.out.println("This is Test");		
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after suite");
	}
}
