package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage extends BasePage {
	@FindBy(partialLinkText ="Camera, photo") private WebElement cameraAndPhotoLink;
	
  @FindBy(partialLinkText="Cell phones") private WebElement cellPhonesLink;
  
  @FindBy(partialLinkText="Smartphone") private WebElement smartPhonesLink;
  
  
  @FindBy(id ="add-to-cart-button-43") private WebElement addTocartBuuton;
  
  
  public ElectronicsPage(WebDriver driver) {
	  super(driver);
	  

	  
  }


public WebElement getCameraAndPhotoLink() {
	return cameraAndPhotoLink;
}


public WebElement getCellPhonesLink() {
	return cellPhonesLink;
}


public WebElement getSmartPhonesLink() {
	return smartPhonesLink;
}


public WebElement getAddTocartBuuton() {
	return addTocartBuuton;
}
	

}
