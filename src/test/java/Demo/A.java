package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class A {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
    }

    @Test
    public void waitDemoTest() {

        driver.findElement(By.xpath("//button[@id='btn1']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='txt1'])[1]"))
        );

        element.sendKeys("kanchan bhatkar");

        System.out.println("kanchan bhatkar validation Done");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}