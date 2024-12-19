package com.opencart;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Repositry {

	public static WebDriver driver;

	public static Actions action;



	public static void registerpage() throws Exception {

		action = new Actions(driver);


		driver.findElement(Reg_Locators.myaccount).click();

		WebElement reg=driver.findElement(Reg_Locators.regbutton);

		Thread.sleep(5000);

		action.moveToElement(reg).click().build().perform();

		driver.findElement(Reg_Locators.firstname).sendKeys(Text_Data.firstname);

		driver.findElement(Reg_Locators.lastname).sendKeys(Text_Data.lasttname);

		driver.findElement(Reg_Locators.password).sendKeys(Text_Data.password);

		driver.findElement(Reg_Locators.email).sendKeys(Text_Data.email);

		driver.findElement(Reg_Locators.email).sendKeys(Keys.TAB);

		JavascriptExecutor js =(JavascriptExecutor)driver;

		js.executeScript("document.getElementById(\"input-newsletter-yes\").click");

		//	driver.findElement(Reg_Locators.subscrible_yes).click();

		//	driver.findElement(Reg_Locators.checkbox).click();

		js.executeScript("document.getElementsByName(\"agree\")[0].click");

		//	driver.findElement(Reg_Locators.ctnbutton).click();

		js.executeScript("document.evaluate(\"//button[@type='submit']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click");




		Thread.sleep(10000);










	}



	@BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Text_Data.url);
		driver.manage().window().maximize();

	}



	@AfterTest
	public void afterTest() {

		driver.quit();


	}

}
