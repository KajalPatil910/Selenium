package genericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ActionUtiles {
	/**
	 * constructor of ActionUtiles class
	 */
	Actions actions;

	public ActionUtiles(WebDriver driver) {
		actions = new Actions(driver);
	}

	/**
	 * Clicks in the middle of the given element. Equivalent to:
	 * Actions.moveToElement(onElement).click()
	 * 
	 */
	public void clickElementp(WebElement ele) {
		actions.click(ele).perform();
	}
	

	/**
	 * Equivalent to calling: Actions.click(element).sendKeys(keysToSend). This
	 * method is different from WebElement.sendKeys(CharSequence) - see
	 * sendKeys(CharSequence) for details how
	 */
	public void passDataForElement(WebElement ele, CharSequence... data) {
		actions.sendKeys(ele, data).perform();
	}
	

	/**
	 * 
	 * Moves the mouse to the middle of the element. The element is scrolled into
	 * view and its location is calculated using getClientRects.
	 */
	public void mouseOverOnElement(WebElement ele) {
		actions.moveToElement(ele).perform();
	}

	
	/**
	 * 
	 * Performs a double-click at middle of the given element. Equivalent to:
	 * Actions.moveToElement(element).doubleClick()
	 * 
	 */

	public void doubleClickOnElement(WebElement ele) {
		actions.doubleClick(ele).perform();
	}

	
	/**
	 * Performs a context-click at middle of the given element. First performs a
	 * mouseMove to the location of the element.
	 */

	public void rightClickOnElement(WebElement ele) {
		actions.contextClick(ele).perform();
	}

	
	/**
	 * 
	 * A method is used to Click and hold at the location of the source element,
	 * moves to the location of the target element, then releases the mouse.
	 * 
	 */

	public void dragAndDropElement(WebElement src, WebElement dest) {
		actions.dragAndDrop(src, dest).perform();
	}

	
	/**
	 * A convenience method that performs click-and-hold at the location of the
	 * source element, moves by a given offset, then releases the mouse.
	 * 
	 */

	public void dragAndDropElementByOffsets(WebElement ele, int xoffset, int yoffset) {
		actions.dragAndDropBy(ele, xoffset, yoffset).perform();
	}

	
	/**
	 * Scrolls by provided amounts with the origin in the top left corner of the
	 * viewport. Parameters:•deltaX The distance along X axis to scroll using the
	 * wheel. A negative value scrolls left. •deltaY The distance along Y axis to
	 * scroll using the wheel. A negative value scrolls up. Returns:• A self
	 * reference
	 * 
	 */

	public void scrollBasedOnAxis(int xoffset, int yoffset) {
		actions.scrollByAmount(xoffset, yoffset).perform();
	}

	
	/**
	 * If the element is outside the viewport, scrolls the bottom of the element to
	 * the bottom of the view port.
	 * 
	 */

	public void scrollUntilElementVisible(WebElement ele) {
		actions.scrollToElement(ele).perform();
	}

	
	/**
	 * Scrolls by provided amount based on a provided origin. The scroll origin is
	 * either the center of an element or the upper left of the viewport plus any
	 * offsets. If the origin is an element,and the element is not in the viewport,
	 * the bottom of the element will first be scrolled to the bottom of the
	 * viewport.
	 * 
	 */

	public void scrollUntilElementVisible(WebElement ele, int xoffset, int yoffset) {
		ScrollOrigin origin = ScrollOrigin.fromElement(ele);
		actions.scrollFromOrigin(origin, xoffset, yoffset).perform();
	}

}
