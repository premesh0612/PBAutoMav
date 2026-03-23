package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NGDemo {

	@BeforeClass
	void login() {
		System.out.println("login");
	} 
	
	@AfterClass
	void logout() {
		System.out.println("logout");
	} 
	
	@Test
	void search() {
		System.out.println("search");
	}
	
	@Test
	void Asearch() {
		System.out.println("Adv search");
	}
	}

