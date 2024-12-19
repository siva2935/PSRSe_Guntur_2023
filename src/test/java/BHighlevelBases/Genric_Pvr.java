package BHighlevelBases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Genric_Pvr {

	public WebDriver driver;

	public Actions action;
	

	

	public void generic(String str) throws Exception {
		action =new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath(str));
		action.moveToElement(element1).click().build().perform();
		Thread.sleep(2000);




	}

	@Test
	public void clickable() throws Exception {
		
	for (int i = 1; i < 20; i++) {
		 generic("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/nav/div/div[2]/div/div/div/div/div[1]/div["+i+"]");
		
	}
		
		

	}
	@BeforeTest
	public void beforeTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.pvrcinemas.com/pvr/format/imax");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
