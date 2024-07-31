package genericUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptUtiles {

	WebDriver driver;
	JavascriptExecutor js;
	
	public JavaScriptUtiles(WebDriver driver) {
		this.driver =driver;
		js =(JavascriptExecutor)driver;
	}
	
	
}
