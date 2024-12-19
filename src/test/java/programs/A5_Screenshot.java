package programs;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A5_Screenshot {
	public WebDriver driver;

	@Test
	public void alertscreen() throws Exception {

		driver.findElement(By.id("alertButton")).click();

		Thread.sleep(3000);

		String str = driver.switchTo().alert().getText();

		System.out.println(str);

		Thread.sleep(3000);
		driver.switchTo().alert().accept();



          

		String ATM ="sita";

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File("C:\\Users\\polis\\OneDrive\\Desktop\\siva\\"+ATM+".png"));
		
			
	


	}

	@BeforeTest
	public void beforeTest() throws Exception {

		WebDriverManager.chromedriver().setup();
 		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
 		driver.manage().window().maximize();

		String ATM ="ram";

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File("C:\\Users\\polis\\OneDrive\\Desktop\\siva\\"+ATM+".png"));
		
	


	}

	@AfterTest
	public void afterTest() throws Exception {


	}
}
