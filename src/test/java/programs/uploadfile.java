package programs;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class uploadfile {
	public WebDriver driver;

	@Test
	public void fun() throws Exception {

		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		//SENDKEYS
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("D:\\Swamy Testing\\Resumes\\Harish.doc");




		// USING ROBOT CLASS METHOD
		WebElement resume=driver.findElement(By.xpath("//input[@id='file-upload']"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].click();", resume);

		/* COPY THE PATH
		 * CTRL+V
		 * ENTER 
		 */

		Robot rb=new Robot();
		rb.delay(2000);
		// PATH THE FILE
		StringSelection bs=new StringSelection("D:\\Swamy Testing\\Resumes\\Harish.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(bs, null);

		//CRTL+V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		//ENTER

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease( KeyEvent.VK_ENTER);






	}

	@BeforeTest
	public void beforeTest() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();


		driver.get("https://www.foundit.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {

	}

}
