package L0g4j;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.log4j.Logger;

/* Enables us to understand the application run.
   Log output can be saved that can be analyzed later.
   Helps in debugging, in case of test automation failures.
   Can also be used for auditing purposes to look at the application's health.

 * */



public class Myclass {

	static Logger log = Logger.getLogger(Myclass.class);

	public static void main(String[] args) throws Exception {

		PropertyConfigurator.configure("D:\\Swamy Testing\\Results Data\\Data\\log4j.properties");


		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);

		WebDriver driver = new ChromeDriver(options);

		JavascriptExecutor js = (JavascriptExecutor)driver;

		driver.get("https://www.browserstack.com/users/sign_in");
		log.info("Open browserstack");

		driver.manage().window().maximize();
		log.info("Maximize window size");

		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		log.info("enter username");
		Thread.sleep(3000);

		js.executeScript("document.getElementById('user_password').value='password';");
		log.info("enter password");
		Thread.sleep(3000);

		js.executeScript("document.getElementById('user_submit').click();");
		log.info("click on login");
		Thread.sleep(3000);


	}
}