package driverAndCommands;

import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChromeSetup {
	public WebDriver driver; long startTime; long duration; long startTimeSuite; long durationSuite; 


	@Parameters({"browser",  "Username", "Password", "Environment", "Language"})

	public void BrowserChrome(@Optional String browser, @Optional String Username , @Optional String Password, @Optional String Environment, @Optional String Language) {

		
//		public class OpenChrome {
			//
//					  public static void main(String[] args) {
//					  // TODO Auto-generated method stub
//					  WebDriver driver;
//					  System.setProperty(“webdriver.chrome.driver”, “Full path of chromedriver.exe”);
//					  driver = new ChromeDriver();
//					  driver.get(“http://www.google.com&#8221;);
//					  }
//					  }
		
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
		
		if (Language.equalsIgnoreCase("Engelska"))
			LoggedInAsUserSwitchLanguage.SwitchLanguageToEnglishLoggedInPage(driver);

		if (Language.equalsIgnoreCase("Svenska"))
			LoggedInAsUserSwitchLanguage.SwitchLanguageToSwedishLoggedInPage(driver);

	}
}

