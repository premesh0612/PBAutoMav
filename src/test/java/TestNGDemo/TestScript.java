package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScript {
@Test (dataProviderClass =TestNGDemo.TestData.class , dataProvider ="loginTestData")
	
	public void TestCase1 (String unmae , String pass) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement Emailid = driver.findElement(By.id("username"));
		
		Emailid.sendKeys(unmae);
		
			
		WebElement passw= driver.findElement(By.id("password"));
		passw.sendKeys(pass);
		
		
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		driver.close();
}

}
