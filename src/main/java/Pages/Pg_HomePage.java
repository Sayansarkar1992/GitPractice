package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pg_HomePage {
	public WebDriver driver;
	By type =By.xpath("//input[@name='q']");
	
	
	
	public Pg_HomePage(WebDriver driver) {
		
		this.driver=driver;
	}


	public WebElement homePage() {
		return driver.findElement(type);
		
	}

}
