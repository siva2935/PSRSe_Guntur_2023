package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4_Information_Commands {
	public WebDriver driver;

	@Test(priority = 1)
	public void gmail() throws Exception {

		String str1 = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(str1);

	}


	@Test(priority = 2)
	public void google_image() throws Exception {

		String str2 = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).getAttribute("alt");
		System.out.println(str2);


	}



	@Test(priority = 3)
	public void searchbutton() throws Exception {


		String str3 = driver.findElement(By.name("btnK")).getAttribute("value");
		System.out.println(str3);


	}


	@BeforeTest
	public void beforeTest()  {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();


	}

	@AfterTest
	public void afterTest() {


	}
}
