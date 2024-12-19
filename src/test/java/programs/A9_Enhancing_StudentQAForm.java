package programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A9_Enhancing_StudentQAForm {
	public WebDriver driver;

	@Test
	public void improvement() throws Exception {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;




		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sambasiva Rao");

		driver.findElement(By.id("lastName")).sendKeys("TENALI");

		driver.findElement(By.id("userEmail")).sendKeys("sivalife78@gmail.com");
		Thread.sleep(3000);
		
		jsExecutor.executeScript("window.scrollTo(0,700)");
		Thread.sleep(3000);


		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("userNumber")).sendKeys("9888888888");
		Thread.sleep(3000);

		//Calender 
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(3000);

		//Selecting December
		new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"))).selectByVisibleText("December");
		Thread.sleep(3000);

		//Selecting year 1990		  
		new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))).selectByVisibleText("1990");
		Thread.sleep(3000);

		//Click on dec 25 Date.
		driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, December 25th, 1990']")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
		Thread.sleep(3000);

		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);



		jsExecutor.executeScript("window.scrollTo(0,700)");


		//hobbies
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		Thread.sleep(3000);

		//Select picture
		driver.findElement(By.cssSelector("#uploadPicture")).sendKeys("C:\\Users\\polis\\OneDrive\\Desktop\\IMG-20211220-WA0037.jpg");
		Thread.sleep(3000);

		//CurrentAddress
		driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad City Views");



		driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);


		driver.switchTo().activeElement().sendKeys("NCR");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);

		Thread.sleep(3000);


		driver.switchTo().activeElement().sendKeys("Delhi");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);

		Thread.sleep(3000);


		driver.switchTo().activeElement().sendKeys(Keys.TAB);




		driver.findElement(By.id("submit")).click();
		Thread.sleep(5000);




	}

	@BeforeTest
	public void beforeTest() throws Exception {


		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000); driver.manage().window().maximize();



	}

	@AfterTest
	public void afterTest() {

	}
}
