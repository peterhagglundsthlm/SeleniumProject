package driverAndCommands;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pageElementsSAT.PortalLoggedInAsUserLoggaUt;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class BeforeAfterTestBrowsers {

	public WebDriver driver;  long duration; double startTimeSuite; double durationSuite; double startTimeTest; double durationTest; 
	

	@BeforeSuite
	public void CheckTimeBeforeSuite() {
		StartDateAndTimeSuite.StartDateAndTimeSuitePrint();
		startTimeSuite = System.currentTimeMillis();
	}


	@Parameters({"browser",  "Username", "Password", "Environment", "Language", "projectTitle", "applicationType"})

	@BeforeClass

	public void Setup(
			@Optional String browser,
			@Optional String Username , 
			@Optional String Password, 
			@Optional String Environment, 
			@Optional String Language, 
			@Optional String projectTitle,
			@Optional String applicationType) {

		if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.silentOutput", "true");
			ChromeOptions ChromeOption = new ChromeOptions();
			ChromeOption.addArguments("start-maximized");
			LogManager.getLogManager().reset();
			driver = new ChromeDriver(ChromeOption);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			startTimeTest = System.currentTimeMillis();
			driver.get(Environment);
			LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, Username, Password);

			if (Language.equalsIgnoreCase("Engelska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToEnglishLoggedInPage(driver);

			if (Language.equalsIgnoreCase("Svenska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToSwedishLoggedInPage(driver);
		}

//		if (browser.equalsIgnoreCase("ChromeNotLoggedIn")) {
//
//			//System.out.println("\u001b[1;31mTestfallet inleds nu\u001b[0m");
//			System.setProperty("webdriver.chrome.silentOutput", "true");
//			ChromeOptions ChromeOption = new ChromeOptions();
//			ChromeOption.addArguments("start-maximized");
//			LogManager.getLogManager().reset();
//			driver = new ChromeDriver(ChromeOption);
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.get(Environment);
//			//			GetCurrentUrl.GetUrlAndPrintInConsole(driver, "This test case is performed on the following URL");
//
//
//		}
//
//		if (browser.equalsIgnoreCase("FireFox")) {
//
//			System.out.println("\u001b[1;31mTestfallet inleds nu\u001b[0m");
//			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
//			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
//			driver = new FirefoxDriver();
//			driver.manage().window().maximize();
//			LogManager.getLogManager().reset();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.get(Environment);
//			GetCurrentUrl.GetUrlAndPrintInConsole(driver);
//			SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
//			DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(SAT_Home_Page_Not_Logged_In.EnterUserName));
//			LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, Username, Password);
//
//			DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(PortalLoggedInAsUserLoggaUt.LoggaUt));
//
//			if (Language.equalsIgnoreCase("Engelska"))
//				LoggedInAsUserSwitchLanguage.SwitchLanguageToEnglishLoggedInPage(driver);
//
//			if (Language.equalsIgnoreCase("Svenska"))
//				LoggedInAsUserSwitchLanguage.SwitchLanguageToSwedishLoggedInPage(driver);
//		}
//
//		if (browser.equalsIgnoreCase("IExplorer")) {
//
//			System.setProperty("webdriver.ie.driver","C:\\Selenium 3.12.0\\IEDriver\\IEDriverServer_Win32_3.13.0\\IEDriverServer.exe");
//			driver = new InternetExplorerDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			DriverGetWebsite.OpenSatPortal(driver);
//			SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
//			LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, Username, Password);
//
//		}
//
//		if (browser.equalsIgnoreCase("Headless")) {
//
//			//System.out.println("\u001b[1;31mTestfallet inleds nu\u001b[0m");
//			System.setProperty("webdriver.chrome.silentOutput", "true");
//			ChromeOptions ChromeOption = new ChromeOptions();
//			ChromeOption.addArguments("start-maximized", "--headless");
//			LogManager.getLogManager().reset();
//			driver = new ChromeDriver(ChromeOption);
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.get(Environment);
//			//GetCurrentUrl.GetUrlAndPrintInConsole(driver, "This test case is performed on the following URL ");
//			SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
//			DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(SAT_Home_Page_Not_Logged_In.EnterUserName));
//			LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, Username, Password);
//
//			DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(PortalLoggedInAsUserLoggaUt.LoggaUt));
//
//			if (Language.equalsIgnoreCase("Engelska"))
//				LoggedInAsUserSwitchLanguage.SwitchLanguageToEnglishLoggedInPage(driver);
//
//			if (Language.equalsIgnoreCase("Svenska"))
//				LoggedInAsUserSwitchLanguage.SwitchLanguageToSwedishLoggedInPage(driver);
//
//		}
	}

	@AfterMethod
	public void ScreenShotWhenFail(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()){
			try{
				TakesScreenshot ts=(TakesScreenshot) driver;
				File src= ts.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(src, new File("C:\\SeleniumScreenshots", result.getInstanceName() + "." + result.getName() + (".png")));
			}
			catch(Exception e)
			{
				System.out.println("");
			}
		}
	}

	@AfterClass
	public void tearDown() throws Exception { 
		//EndDriver.DriverQuit(driver);	
		EndTimeSuiteAndTest.EndTimeTest(durationTest, startTimeTest);
	}

	@AfterSuite
	public void CheckTimeAfterSuite() {
		EndTimeSuiteAndTest.EndTimeSuite(duration, startTimeSuite);
	}
}