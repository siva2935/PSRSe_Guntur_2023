package page_Object_model;

import org.openqa.selenium.By;

/* 
 * Page Object Model, also known as POM, is a design pattern 
 * in Selenium that creates an object repository for storing all web elements.
 *  It helps reduce code duplication and improves test case maintenance.
 *  
 *  
 *  What is Page Factory? Page Factory is a factory class in Selenium 
 *  for implementing the Page Object Model. It's an optimized version 
 *  of the POM for Selenium WebDriver, which follows the separation 
 *  techniques for handling the object repositories and the test cases. 
 *  It's a class that extends from the web driver classes.
 * 
 * */

public class Locators {

	//Login
	public static By username = By.id("login_field");

	public static By Password = By.id("password");

	public static By Sign = By.name("commit");





}
