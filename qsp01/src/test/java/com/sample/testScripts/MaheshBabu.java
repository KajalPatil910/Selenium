package com.sample.testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MaheshBabu {
	@Test(groups= "TFI")
	public void EScript2()
	{
		Reporter.log("EScript2",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/urstrulymahesh/?hl=en");
		driver.quit();
	}

}
