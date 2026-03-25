package POMDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTestScript {
	public static WebDriver driver;
	
	@BeforeClass
	public void openbrowser() {
	
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
@Test (priority=1)
	
	public void validLoginTest() {
			
		LoginPage lp = new LoginPage(driver);                    
		lp.SetEmail("student");
		lp.SetPasaword("Password123");
		lp.ClickSignIn();
		
		
	        String actual = lp.getSuccessMessage();
	        String expected = "Logged In Successfully";

	        Assert.assertEquals(actual, expected);

	        System.out.println("Login Successful with valide data");
	        
	        lp.ClickonLogout();
	}
	
@Test (priority=2)

public void invalidLoginTest() {
		
	LoginPage lp = new LoginPage(driver);                    
	lp.SetEmail("student");
	lp.SetPasaword("Password11111");
	lp.ClickSignIn();

	
	String actualMsg = lp.getErrorMessage();
    String expectedMsg = "Your password is invalid!";

    Assert.assertEquals(actualMsg, expectedMsg);
    System.out.println("Username or Passowrd invlaid not able to login");
    
    
	
}
	
	@AfterClass
	public void closebrowser() {

		driver.quit();
	}
}


