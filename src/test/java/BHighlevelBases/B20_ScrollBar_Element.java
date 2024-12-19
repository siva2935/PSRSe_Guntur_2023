package BHighlevelBases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B20_ScrollBar_Element {
	public WebDriver driver;
	  
	  @Test 
	  public void Scrollflow() {
	    
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		      
	  //Find element by link text and store in variable "Element" WebElement
	  WebElement Element = driver.findElement(By.linkText("Linux"));
	  
	  //This will scroll the page till the element is found
	 // js.executeScript("arguments[0].scrollIntoView();", Element);
	  js.executeScript("arguments[0].scrollIntoView();", Element);
	  
	 
	 
	  
	  }
	  
	  
	  
	  @BeforeTest 
	  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup(); 
	  driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/guru99home/");
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	  
	  }
	  
	  @AfterTest public void afterTest() {
	  
	  }
}
