package page_Object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Repository {

	public static WebDriver driver;

	//login
	public static void login() throws Exception {


		driver.findElement(Locators.username).sendKeys(TestData.username);
		driver.findElement(Locators.Password).sendKeys(TestData.Password);

		driver.findElement(Locators.Sign).click();
		Thread.sleep(3000);

	}

	public static void alerts() {

		driver.switchTo().alert().accept();
	}


	public static void popupwins() {

		String winhandle = driver.getWindowHandle();

		driver.switchTo().window(winhandle);
	}






	@BeforeTest
	public static void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(TestData.url);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );  

	}

	@AfterTest
	public static void teardown() {

	}



}
