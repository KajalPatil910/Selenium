package genericUtils;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import elementRepository.BasePage;
import elementRepository.ElectronicsPage;
import elementRepository.LoginPage;

public class BaseClass implements IAutoConstants, ITestListener {

	public static WebDriver driver;
	public Flib flib;
	public BasePage bp;
	public LoginPage lp;
	public ElectronicsPage Ep;

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("before Suite", true);

	}

	@BeforeTest()
	public void beforeTest() {
		Reporter.log("before Test", true);

	}

	@Parameters("b")
	@BeforeClass
	public void launchingBrowser(@Optional("chrome") String bname) {
		Reporter.log("Launching Browser", true);
		{
			if (bname.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}

			else if (bname.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			}

			else if (bname.equalsIgnoreCase("Edge")) {
				driver = new ChromeDriver();
			}

			else if (bname.equalsIgnoreCase("Firefox")) {
				driver = new ChromeDriver();
			}

			else {

				Reporter.log("Invalid Browser name");
			}
			bp = new BasePage(driver);
			lp = new LoginPage(driver);
			Ep = new ElectronicsPage(driver);
			flib = new Flib();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(impliciteTimeOutp));
		}

	}

	@BeforeMethod
	public void navigateAndLoginToDWS() {
		Reporter.log("before Method", true);
		driver.get(flib.fetchDataFromPropertries(PropertyFilePath, "url"));
		lp.getLoginLink().click();
		lp.getEmailTB().sendKeys(flib.fetchDataFromPropertries(PropertyFilePath, "email"));
		lp.getPasswordlTB().sendKeys(flib.fetchDataFromPropertries(PropertyFilePath, "password"));
		lp.getLogInButton().click();

	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("after Method", true);
		lp.getLogOutButton().click();

	}

	@AfterClass()
	public void tearDownTheBrowser() {
		Reporter.log("tearDownTheBrowser", true);
		driver.close();
		driver.quit();

	}

	@AfterTest()
	public void afterTest() {
		Reporter.log("after Test", true);

	}

	@AfterSuite
	public void Aftersuite() {
		Reporter.log("after Suite", true);

	}

	/**
	 * Overrides methods
	 */

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(("TestCase--" + result.getName() + "--is Started"));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(("TestCase--" + result.getName() + "--is failed"));
		LocalDateTime ldt = LocalDateTime.now();
		String time = ldt.toString().replace(":", "-");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(screenshotpath + "screenshot.png" + time + ".png");

		try {
			FileHandler.copy(src, dest);
		} catch (Exception e) {

		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(("TestCase--" + result.getName() + "--is skipped"));
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log(("<Test>--" + context.getName() + "--is started"));
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(("<Test>--" + context.getName() + "--is finished"));
	}

}
