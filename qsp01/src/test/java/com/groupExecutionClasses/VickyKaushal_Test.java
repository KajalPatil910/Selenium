package com.groupExecutionClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VickyKaushal_Test {
	
	@Test(groups = "Bollywood")
	public void ExecutionScript4()
	{
		Reporter.log("ExecutionScript4",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/vickykaushal09/?hl=en");
		driver.quit();
	}

}
