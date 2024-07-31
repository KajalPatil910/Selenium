package com.groupExecutionClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Vijay_Test {

	@Test(groups = {"TFI","Pan India"})
	public void EScript3()
	{
		Reporter.log("EScript3",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/thedeverakonda/?hl=en");
		driver.quit();
	}
}
