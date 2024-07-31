package genericUtils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterUsingDataProvider {
	
	@Test(dataProvider = "dataProviderMethod",dataProviderClass = DataProviderMethod.class)
	public void test(String Firstname,String Lastname ,String Email ,String Password ) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys(Firstname);
		driver.findElement(By.id("LastName")).sendKeys(Lastname);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Password);
		driver.findElement(By.id("register-button")).click();
		
		
	}

}
