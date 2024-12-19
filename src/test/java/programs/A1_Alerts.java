package programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


/* Maven is a tool which is used for building and managing Java Based Projects.
 * Basically to put it in simple words is a way to manage dependency for Java Based Project.
 * Maven can be used when building project with POM (Page Object Model) when working on big projects.
 * Easier and Uniform build process.
 * */

public class A1_Alerts {
	public WebDriver driver;

	@Test
	public void handlingalerts() throws Exception  {



		//click on clickme button
		driver.findElement(By.id("alertButton")).click();
		
	
	
		String str = driver.switchTo().alert().getText();

		System.out.println(str);

		Thread.sleep(3000);

		//handlingalert
		driver.switchTo().alert().accept();
		



	}

	@BeforeTest
	public void openurl() throws Exception {

		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium documents\\SeJava\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000); 
		driver.manage().window().maximize();






		//Implicitly wait: Sets the Time limit throughout of the program.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Explicitly Wait: Sets the Time limit for Particular Instance. WebDriverWait
		
		//WebDriverWait   wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]"))).click();


		//Deleting all data as Browser History 
		driver.manage().deleteAllCookies();

	}

	@AfterTest
	public void afterTest() {
		
		driver.close();


	}

}
