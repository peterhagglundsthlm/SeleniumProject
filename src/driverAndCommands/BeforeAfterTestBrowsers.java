package driverAndCommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class BeforeAfterTestBrowsers {
	public static WebDriver driver;
	
	
	@Parameters({"browser",  "Username", "Password" })
	@BeforeClass
	public void Setup(String browser, String Username , String Password) {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			DriverGetWebsite.OpenSatPortal(driver);
			SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
			LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, Username, Password);
			
		}

		if (browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Selenium 3.12.0\\Geckodriver\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			DriverGetWebsite.OpenSatPortal(driver);
			SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
			LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, Username, Password);
		
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
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			DriverGetWebsite.OpenSatPortal(driver);
			SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
			LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, Username, Password);
	
		}

		
	}


	@AfterClass
	public void tearDown() throws Exception { 
		//EndDriver.DriverQuit(driver);
		
	}

}