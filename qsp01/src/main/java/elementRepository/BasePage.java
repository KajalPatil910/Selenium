package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtils.BaseClass;

public class BasePage {
	

	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;
	
	@FindBy(partialLinkText = "Log in")
	 private WebElement loginLink;
	
	@FindBy(partialLinkText = "Shopping cart")
	 private WebElement shoppingCartLink;
	
	@FindBy(partialLinkText = "Wishlist")
	 private WebElement wishlistLink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookLink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computerpsLink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement apparelAndShoesLink;
	
	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitalDownloadsLink;
	
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLink;
	
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftCardsLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchBoxLink;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButtonLink;
	
	/** 	
	 * Getters
	 */
	
	
	/**
	 * This method is used to access the RegisterLink
	 * @return 
	 *    WebElement
	 */
    public WebElement getRegisterLink() {
    	
		return registerLink;
	}



	public WebElement getLoginLink() {
		return loginLink;
	}



	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}



	public WebElement getWishlistLink() {
		return wishlistLink;
	}



	public WebElement getBookLink() {
		return bookLink;
	}



	public WebElement getComputerpsLink() {
		return computerpsLink;
	}



	public WebElement getElectronicsLink() {
		return electronicsLink;
	}



	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}



	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}



	public WebElement getJewelryLink() {
		return jewelryLink;
	}



	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}



	public WebElement getSearchBoxLink() {
		return searchBoxLink;
	}



	public WebElement getSearchButtonLink() {
		return searchButtonLink;
	}



	public BasePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
}
