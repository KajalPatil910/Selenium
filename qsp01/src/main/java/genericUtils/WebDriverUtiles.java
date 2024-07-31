package genericUtils;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverUtiles {
/**
 * Constructor of class WebDriverUtiles
 */
	WebDriver driver;

	public WebDriverUtiles(WebDriver driver) {
		this.driver = driver;
	}
/**
 * Get the title of the current page.
 * 
 */
	public void switchToWindowBasedOnTitle(String title) {
		Set<String> allwindowIds = driver.getWindowHandles();
		for (String windowId : allwindowIds) {
			driver.switchTo().window(windowId);
			if (driver.getTitle().equals(title)) {
				break;

			}

		}
	}
/**
 * Get a string representing the current URL that the browser is looking at. 
 */
	public void switchToWindowBasedOnURL(String url) {
		Set<String> allwindowIds = driver.getWindowHandles();
		for (String windowId : allwindowIds) {
			driver.switchTo().window(windowId);
			if (driver.getCurrentUrl().equals(url)) {
				break;

			}

		}
	}
/**
 * 
 */
	public void switchToAlertAndClickOnOk() {
		driver.switchTo().alert().accept();
	}
/**
 * 
 */
	public void switchToAlertAndClickOnCancel() {
		driver.switchTo().alert().dismiss();
	}
/**
 * 
 * @return
 */
	public String getAlertText() {
		return driver.switchTo().alert().getText();
	}
	/**
	 * 
	 * @param data
	 */

	public void passValueOnAlertTextBox(String data) {
		driver.switchTo().alert().sendKeys(data);
	}
	/**
	 * 
	 * @param index
	 */

	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * 
	 * @param nameOrId
	 */

	public void switchToFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	/**
	 * 
	 * @param ele
	 */

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	/**
	 * 
	 */

	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}
	/**
	 * 
	 */

	public void switchTodefaultContent() {
		driver.switchTo().defaultContent();
	}

}
