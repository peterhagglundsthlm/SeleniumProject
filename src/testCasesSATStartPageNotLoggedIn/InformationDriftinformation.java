package testCasesSATStartPageNotLoggedIn;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class InformationDriftinformation extends BeforeAfterTestBrowsers  {
	String Url; String NyURL;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen Drifinformation under information fungerar som tänkt";
		Url = driver.getCurrentUrl();
	}

	@Test
	public void WaitForHomePageToLoad() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				SAT_Home_Page_Not_Logged_In.LoginButtonChrome()); 
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClickInformation() {

		driver.findElement(
				SAT_Home_Page_Not_Logged_In.InformationButton()).click();
	}


	@Test (dependsOnMethods={"ClickInformation"})
	public void ClickDriftinformation() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				SAT_Home_Page_Not_Logged_In.InformationDriftinformationButton());
		
		driver.findElement(
				SAT_Home_Page_Not_Logged_In.InformationDriftinformationButton()).click();
	}

	@Test (dependsOnMethods={"ClickDriftinformation"})
	public void VerifyURL() throws InterruptedException {

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		
		Thread.sleep(1000);

		NyURL = driver.getCurrentUrl();

		if (!NyURL.equals(("https://prismasupport.research.se/driftsinformation?_ga=2.50985385.1213798783.1565613149-608691525.1560174779")))
		{
			Assert.fail("Url stämmer inte");
		} 

	}
}