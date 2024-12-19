package BHighlevelBases;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;

/* Data Driven framework is used to drive test cases and suites from 
 * an external data feed. The data feed can be data sheets like xls, xlsx, and csv files.
 * A Data Driven Framework in Selenium is a technique of separating the “data set” from the actual “test case” (code). 
 * 
 * */



public class B18_DataDriven {
	public WebDriver driver;

	@Test
	public void data() throws Exception, Exception {
		
		//FileInputStream fi = new FileInputStream("D:\\Personal_swamykumar\\Test Data\\Power.xls");
		//Workbook wb = Workbook.getWorkbook(fi);
		//Sheet s = wb.getSheet("Gmail");
		
		FileInputStream fi = new FileInputStream("D:\\Swamy Testing\\Results Data\\Data\\siri.xls\\");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet s = wb.getSheet("Raju");
	
		driver.findElement(By.id("login_field")).sendKeys(s.getCell(0, 1).getContents());  //(0,1) 0 means colum 1 means row
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys(s.getCell(1, 1).getContents());
		Thread.sleep(10000);

		driver.findElement(By.name("commit")).click();
		
	
	}

	@BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://github.com/login?return_to=%2Flogins");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {

	}
  
}
