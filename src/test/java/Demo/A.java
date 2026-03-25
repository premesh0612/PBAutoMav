package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class A {

		public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='btn1']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement element = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='txt1'])[1]"))
		);
		element.sendKeys("kanchan bhatkar");
		
		
		Thread.sleep(1000);
		System.out.println("Done"); 
		
		
		
		
		
	}

}
