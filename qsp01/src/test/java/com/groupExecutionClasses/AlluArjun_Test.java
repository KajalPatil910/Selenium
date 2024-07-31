package com.groupExecutionClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlluArjun_Test {
	@Test(groups = {"TFI", "Pan India"})
	public void ExecutionScript1()
	{
		Reporter.log("ExecutionScript1",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/alluarjunonline/?hl=en");
		driver.quit();
	}

}
