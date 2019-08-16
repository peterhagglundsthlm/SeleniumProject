package automationSetup;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageElementsSAT.PortalLoggedInAsAdminAndUserLoggaUt;
import reusableMethods.DriverWaitExpectedConditions;

public class BeforeAfterTestSetup {

	public WebDriver driver;  long duration; double startTimeSuite; double durationSuite; double startTimeTest; double durationTest; 
	
	@BeforeSuite
	public void CheckTimeBeforeSuite() {
		
		CalculateTimeForTestcaseAndTestSuite.StartDateAndTimeSuitePrint();
		System.setProperty(org.slf4j.simple.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "WARN");
		startTimeSuite = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();

	}

	@BeforeClass @Parameters({"browser",  "Username", "Password", "Environment", "Language"})
	public void Setup(
			@Optional String browser,
			@Optional String Username , 
			@Optional String Password, 
			@Optional String Environment, 
			@Optional String Language)
	{
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
			DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
					PortalLoggedInAsAdminAndUserLoggaUt.LoggaUtButton());
			
			if (Language.equalsIgnoreCase("Engelska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToEnglishLoggedInPage(driver);

			if (Language.equalsIgnoreCase("Svenska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToSwedishLoggedInPage(driver);
		}

		if (browser.equalsIgnoreCase("ChromeNotLoggedIn")) {
			
			System.setProperty("webdriver.chrome.silentOutput", "true");
			ChromeOptions ChromeOption = new ChromeOptions();
			ChromeOption.addArguments("start-maximized");
			LogManager.getLogManager().reset();
			driver = new ChromeDriver(ChromeOption);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			startTimeTest = System.currentTimeMillis();
			driver.get(Environment);

		}
		/*

		if (browser.equalsIgnoreCase("FireFox")) {

			System.out.println("\u001b[1;31mTestfallet inleds nu\u001b[0m");
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			LogManager.getLogManager().reset();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(Environment);
			GetCurrentUrl.GetUrlAndPrintInConsole(driver);
			//SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
			//DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(SAT_Home_Page_Not_Logged_In.EnterUserName));
			LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, Username, Password);

			//DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(PortalLoggedInAsUserLoggaUt.LoggaUt));

			if (Language.equalsIgnoreCase("Engelska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToEnglishLoggedInPage(driver);

			if (Language.equalsIgnoreCase("Svenska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToSwedishLoggedInPage(driver);
		}

		if (browser.equalsIgnoreCase("IExplorer")) {

			System.setProperty("webdriver.ie.driver","C:\\Selenium 3.12.0\\IEDriver\\IEDriverServer_Win32_3.13.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			DriverGetWebsite.OpenSatPortal(driver);
			//SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
			LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, Username, Password);

		}
		
		*/

		if (browser.equalsIgnoreCase("Headless")) {
			
			System.setProperty("webdriver.chrome.silentOutput", "true");
			ChromeOptions ChromeOption = new ChromeOptions();
			ChromeOption.addArguments("start-maximized", "--headless");
			LogManager.getLogManager().reset();
			driver = new ChromeDriver(ChromeOption);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			startTimeTest = System.currentTimeMillis();
			driver.get(Environment);
			LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, Username, Password);
			DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
					PortalLoggedInAsAdminAndUserLoggaUt.LoggaUtButton());

			if (Language.equalsIgnoreCase("Engelska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToEnglishLoggedInPage(driver);

			if (Language.equalsIgnoreCase("Svenska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToSwedishLoggedInPage(driver);
		} 
	}

	@AfterMethod
	public void ScreenShotWhenFail(ITestResult result) {

		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH.mm");
		Date date = new Date();
		String straDate = dateFormat.format(date);

		if (ITestResult.FAILURE == result.getStatus()){
			try{
				TakesScreenshot ts=(TakesScreenshot) driver;
				File src= ts.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(src, new File("C:\\SeleniumScreenshots", 
						result.getInstanceName() + "." + result.getName() + " " + straDate + (".png")));
			}
			catch(Exception e) { } } }
	
	

	@AfterClass @Parameters ({"CloseDriver"})
	public void tearDown(@Optional String CloseDriver) { 
		
		if (CloseDriver.equalsIgnoreCase("Yes")) 
		{
			driver.quit();
		}		
		else {
			
		}
		
		String testCaseName = this.getClass().getSimpleName();
		CalculateTimeForTestcaseAndTestSuite.EndTimeTest(durationTest, startTimeTest, testCaseName);
		
	}

	@AfterSuite
	public void CheckTimeAfterSuite() {
		
		CalculateTimeForTestcaseAndTestSuite.EndTimeSuite(duration, startTimeSuite);
	}
}