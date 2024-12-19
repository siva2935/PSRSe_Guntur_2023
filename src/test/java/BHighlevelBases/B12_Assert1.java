package BHighlevelBases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

/* In the case of the “Assert” command, as soon as the validation fails the execution
 *  of that particular test method is stopped. Following that the test method is marked 
 *  as failed. Whereas, in the case of “Verify”, the test method continues execution
 *   even after the failure of an assertion statement 
 */

public class B12_Assert1 {
	public WebDriver
	driver;
	
  @Test
  public void fun() {
	  String Actuvaltitle= "Online Bus Ticket Booking";
	  		
	  String Exptitle = driver.getTitle();
	  System.out.println(Exptitle);
	  
	  System.out.println("welcome to selenium");
	  
	  Assert.assertEquals(Actuvaltitle, Exptitle);
	  
	  System.out.println("after assert equvals");
	  
	  System.out.println("final ststement");
	  
	 driver.close();
	
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
