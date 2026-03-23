package POMDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	WebDriver driver; 
	
	@FindBy(xpath="//input[@id='username']")        
	private WebElement textBoxUserName;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement textBoxPassword;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement signInButton;
	
	@FindBy(xpath = "//div[contains(text(),'Your password is invalid!')]")
    private WebElement errorMsg;
	
	@FindBy(xpath = "//h1[text()='Logged In Successfully']")
    private WebElement successMsg;
	
	@FindBy(xpath = "(//a[normalize-space()='Log out'])[1]")
	private WebElement Logout;

	public LoginPage(WebDriver driver){               
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void SetEmail(String email) {
		textBoxUserName.sendKeys(email);
		
	}
	public void SetPasaword(String password) {
		
		textBoxPassword.sendKeys(password);
		
	}
	public void ClickSignIn() {
		
		signInButton.click();
	
	}
	
	public void ClickonLogout() {
		
		Logout.click();
	
	}
	
	
	public String getErrorMessage() {
        return errorMsg.getText();
    }
	
	 public String getSuccessMessage() {
	        return successMsg.getText();
	    }
	 
	 public boolean isSuccessDisplayed() {
	        try {
	            return successMsg.isDisplayed();
	        } catch (Exception e) {
	            return false;
	        }
	 }
}
