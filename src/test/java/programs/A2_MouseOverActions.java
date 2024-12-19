package programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_MouseOverActions {
	public WebDriver driver;
	public Actions action;



	@Test
	public void mouseOvver() throws Exception {

		action = new Actions(driver);


		WebElement ele = driver.findElement(By.linkText("SwitchTo"));

		//Action command
		action.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Windows")).click();
		Thread.sleep(5000);
		
		WebElement ele1=driver.findElement(By.xpath("//a[normalize-space()='Interactions']"));
		action.moveToElement(ele1).build().perform();
		WebElement ele2=driver.findElement(By.xpath("//a[normalize-space()='Drag and Drop']"));
		action.moveToElement(ele2).build().perform();
		driver.findElement(By.xpath("//a[normalize-space()='Static']")).click();
		Thread.sleep(5000);

		

	}

	@BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}


	@AfterTest
	public void afterTest() {
		
		driver.close();


	}


}
