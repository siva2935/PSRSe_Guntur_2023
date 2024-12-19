package programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class B10_Autoit {
	public WebDriver driver;

	@Test
	public void fun() throws Exception {


		/*	WebElement ele1 = driver.findElement(By.xpath("//input[@id='uploadPicture']"));

		ele1.sendKeys("C:\\Users\\polis\\OneDrive\\Desktop\\IMG-20211220-WA0037.jpg");

		Thread.sleep(2000);  */





		WebElement  btn=driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"));
		Thread.sleep(2000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", btn);

		//Autoit command.
		Runtime.getRuntime().exec("C:\\Users\\polis\\OneDrive\\Desktop\\image.exe");
		




	}

	@BeforeTest 
	public void beforeTest() throws Exception {
  
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		// driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {

	}

}
