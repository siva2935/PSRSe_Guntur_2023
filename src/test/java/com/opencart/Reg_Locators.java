package com.opencart;

import org.openqa.selenium.By;

public class Reg_Locators {
	
	public static By firstname= By.name("firstname");
	
	public static By lastname= By.name("lastname");
	
	public static By email= By.xpath("//input[@id='input-email']");
	
	public static By password= By.name("password");
	
	public static By subscrible_yes= By.id("input-newsletter-yes");

	public static By subscrible2_no= By.id("input-newsletter-no");

	public static By checkbox= By.xpath("//input[@name='agree']");

	public static By ctnbutton= By.xpath("//button[normalize-space()='Continue']");
	
	public static By myaccount= By.xpath("//span[normalize-space()='My Account']");
	
	public static By regbutton= By.xpath("//a[normalize-space()='Register']");
	
	






	

	

}
