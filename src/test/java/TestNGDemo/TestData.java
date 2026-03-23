package TestNGDemo;

import org.testng.annotations.DataProvider;

public class TestData {
@DataProvider (name = "loginTestData")
	
	public static Object[][] login() {
		
		Object[][] x = {{"kiran@gmail.com","123456"},{"kirann@gmail.com","123456"},
				{"kiran@gmail.com","1234"},{"kiiran@gmail.com","126"}};
		
		return x;
		
	}

}
