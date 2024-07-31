package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id ="Email")private WebElement emailTB;
	
	@FindBy(id ="Password")private WebElement passwordlTB;
	
	@FindBy(id ="RememberMe")private WebElement rememberMeCheckBox;
	
	@FindBy(partialLinkText ="Forgot password?")private WebElement forgetPwdLink;
	
	@FindBy(xpath ="//input[@value='Log in']")private WebElement logInButton;
	@FindBy(partialLinkText ="Log out") private WebElement logOutButton;

	
	
	
	
	public void setLogOutButton(WebElement logOutButton) {
		this.logOutButton = logOutButton;
	}

	public WebElement getLogOutButton() {
		return logOutButton;
	}

	public WebElement getEmailTB() {
		return emailTB;
	}

	public WebElement getPasswordlTB() {
		return passwordlTB;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getForgetPwdLink() {
		return forgetPwdLink;
	}

	public WebElement getLogInButton() {
		return logInButton;
	}
	
	

}
