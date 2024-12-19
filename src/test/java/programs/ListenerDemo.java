package programs;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
//import org.testng.Assert;
import org.testng.annotations.Test;

//import static org.testng.Assert.assertEquals;
import io.github.bonigarcia.wdm.WebDriverManager;

/* Listeners in Selenium are classes that implement specific interfaces in order to 
track events that occur during the execution of Selenium tests. You can use them to 
perform additional actions or log information when specific events happen, such as a test
case starting or ending, or a test step passing or failing. */




@Listeners(programs.ListenerClass.class)
public class ListenerDemo {

	public WebDriver driver;

	@Test(priority = 1)
	public void login() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();

		System.out.println("Passed test Case");
		Assert.assertTrue(true);

		/*
		 * driver.findElement(By.name("username")).sendKeys("admin");
		 * driver.findElement(By.name("password")).sendKeys("Admin123");
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 */
		//Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		//System.out.println("Passed test Case");
	}

	@Test(priority = 2)
	public void testFail() {

		System.out.println("Failed test Case");
		Assert.assertTrue(false);
	}

	@Test(priority = 3)
	public void testSkipped() {

		System.out.println("Skipped test Case");
		throw new SkipException("skip exeption throw....");

	}


}
