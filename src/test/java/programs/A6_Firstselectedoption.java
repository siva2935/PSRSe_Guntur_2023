package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class A6_Firstselectedoption {
	public WebDriver driver;
	

	@Test
	public void optionss() throws Exception {

		WebElement ele = new  Select(driver.findElement(By.id("day"))).getFirstSelectedOption();
		System.out.println(ele.getText());

		
		
		/*
		 * if (ele.getText().equalsIgnoreCase("16")) {
		 * 
		 * System.out.println("Passed default value is 16");
		 * 
		 * } else {
		 * 
		 * System.out.println("Doent missed its fail");
		 * 
		 * 
		 * }
		 */
	

		
		 
		 if (ele.getText().equalsIgnoreCase("24")) {
			 
			 System.out.println("24 is there its passs");
			
		} else {
			
			System.out.println("19 is not  there its Fail");

		}

	}

	@BeforeTest
	public void beforeTest() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/reg/?app_id=1140740696088074&logger_id");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}
}
