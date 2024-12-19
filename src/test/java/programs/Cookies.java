package programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Cookies {
	public WebDriver driver;

	@Test
	public void cookies() {

		Set <Cookie>  allcookies= driver.manage().getCookies();
		System.out.println("size of cookies  :"+ allcookies.size());

		/*for( Cookie allc:allcookies) {

			System.out.println(allc.getName()+ " : "+allc.getValue());
		}*/
		
		System.out.println();


		System.out.println(driver.manage().getCookieNamed("session-id-time"));
		
		Cookie cobj= new Cookie("MY COOKIE", "254875456");
		
		driver.manage().addCookie(cobj);

		
		allcookies= driver.manage().getCookies();
		
		
		
		System.out.println("size of cookies  :"+ allcookies.size());
		
		for( Cookie allc:allcookies) {

			System.out.println(allc.getName()+ " : "+allc.getValue());
		}
		
		driver.manage().deleteCookie(cobj);
		allcookies= driver.manage().getCookies();
        System.out.println("size of cookies  :"+ allcookies.size());
        
        driver.manage().deleteAllCookies();
        allcookies= driver.manage().getCookies();
        System.out.println("size of cookies  :"+ allcookies.size());
		
		
		}

	
	@BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();




	}

	@AfterTest
	public void afterTest() {


	}

}
