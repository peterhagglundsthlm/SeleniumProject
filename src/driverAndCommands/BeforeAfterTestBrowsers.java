package driverAndCommands;



import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pageElementsSAT.PortalLoggedInAsUserLoggaUt;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class BeforeAfterTestBrowsers {
	public WebDriver driver; long startTime; long duration; long startTimeSuite; long durationSuite; 


	@BeforeSuite
	public void CheckTimeBeforeSuite() {
		
//		startTimeSuite = System.currentTimeMillis();
//		DateFormat dateFormat = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss");
//		Date date = new Date();
//		System.out.println("Testsuiten startad " + dateFormat.format(date));	
		StartTime.StartTimeSuite(startTimeSuite);

	}

	@Parameters({"browser",  "Username", "Password", "Environment", "Language"})

	@BeforeClass
	public void Setup(@Optional String browser, @Optional String Username , @Optional String Password, @Optional String Environment, @Optional String Language) {

		if (browser.equalsIgnoreCase("Chrome")) {



			//System.out.println("\u001b[1;31mTestfallet inleds nu\u001b[0m");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			ChromeOptions ChromeOption = new ChromeOptions();
			ChromeOption.addArguments("start-maximized");
			LogManager.getLogManager().reset();
			driver = new ChromeDriver(ChromeOption);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//startTime = System.currentTimeMillis();
			driver.get(Environment);
			GetCurrentUrl.GetUrlAndPrintInConsole(driver);




			//GetCurrentUrl.GetUrlAndPrintInConsole(driver, "This test case is performed on the following URL ");


			//�ndrade loginlogiken s� allt g�rs fr�n en annan klass.. Prolemet �r hur man ska hantera parametern f�r olika milj�er. Kolla med Anna-Maja p� m�ndag 2019-07-22
			LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, Username, Password);
			
			

			//			SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
			//			DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(SAT_Home_Page_Not_Logged_In.EnterUserName));
			//			LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, Username, Password);
			//
			//			DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(PortalLoggedInAsUserLoggaUt.LoggaUt));

			if (Language.equalsIgnoreCase("Engelska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToEnglishLoggedInPage(driver);

			if (Language.equalsIgnoreCase("Svenska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToSwedishLoggedInPage(driver);
		}





		if (browser.equalsIgnoreCase("ChromeNotLoggedIn")) {

			//System.out.println("\u001b[1;31mTestfallet inleds nu\u001b[0m");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			ChromeOptions ChromeOption = new ChromeOptions();
			ChromeOption.addArguments("start-maximized");
			LogManager.getLogManager().reset();
			driver = new ChromeDriver(ChromeOption);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			startTime = System.currentTimeMillis();
			driver.get(Environment);
			//			GetCurrentUrl.GetUrlAndPrintInConsole(driver, "This test case is performed on the following URL");


		}

		if (browser.equalsIgnoreCase("FireFox")) {

			System.out.println("\u001b[1;31mTestfallet inleds nu\u001b[0m");
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			LogManager.getLogManager().reset();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			startTime = System.currentTimeMillis();
			driver.get(Environment);
			GetCurrentUrl.GetUrlAndPrintInConsole(driver);
			SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
			DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(SAT_Home_Page_Not_Logged_In.EnterUserName));
			LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, Username, Password);

			DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(PortalLoggedInAsUserLoggaUt.LoggaUt));

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
			SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
			LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, Username, Password);

		}

		if (browser.equalsIgnoreCase("Headless")) {

			//System.out.println("\u001b[1;31mTestfallet inleds nu\u001b[0m");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			ChromeOptions ChromeOption = new ChromeOptions();
			ChromeOption.addArguments("start-maximized", "--headless");
			LogManager.getLogManager().reset();
			driver = new ChromeDriver(ChromeOption);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			startTime = System.currentTimeMillis();
			driver.get(Environment);
			//GetCurrentUrl.GetUrlAndPrintInConsole(driver, "This test case is performed on the following URL ");
			SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
			DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(SAT_Home_Page_Not_Logged_In.EnterUserName));
			LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, Username, Password);

			DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(PortalLoggedInAsUserLoggaUt.LoggaUt));

			if (Language.equalsIgnoreCase("Engelska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToEnglishLoggedInPage(driver);

			if (Language.equalsIgnoreCase("Svenska"))
				LoggedInAsUserSwitchLanguage.SwitchLanguageToSwedishLoggedInPage(driver);
		}
	}

	@AfterClass
	public void tearDown() throws Exception { 
		EndDriver.DriverQuit(driver);		
//		duration = System.currentTimeMillis() - startTime;
//		float sekunder = duration/1000;
//		float minuter = sekunder/60;
//		//System.out.println("Detta testfall tog " + sekunder + " sekunder, start till slut. Det motsvarar ca " + minuter + " minuter");
//		//System.out.println("");
	}


	@AfterSuite
	public void CheckTimeAfterSuite() {
		
		EndTime.EndTimeSuite(duration, startTime);
		
//		durationSuite = System.currentTimeMillis() - startTimeSuite;
//		float sekunder = durationSuite/1000;
//		float minuter = sekunder/60;
//		System.out.println("Denna testsuite tog " + sekunder + " sekunder, start till slut. Det motsvarar ca " + minuter + " minuter");


	}

}