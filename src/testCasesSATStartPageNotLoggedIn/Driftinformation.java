package testCasesSATStartPageNotLoggedIn;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class Driftinformation extends BeforeAfterTestBrowsers {
	 

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen Drifinformation fungerar som tänkt";
	}

	@Test
	public void WaitForHomePageToLoad() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				SAT_Home_Page_Not_Logged_In.LoginButtonChrome());
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClickDriftinformation() {
		
		driver.findElement(
				SAT_Home_Page_Not_Logged_In.DriftinformationButton()).click();
	}

	@Test (dependsOnMethods={"ClickDriftinformation"})
	public void VerifyURL() throws InterruptedException {

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		
		Thread.sleep(1000);

		String URL = driver.getCurrentUrl();
		
		if (!URL.equals(("https://prismasupport.research.se/driftsinformation?_ga=2.181664807.1213798783.1565613149-608691525.1560174779")))
		{
			Assert.fail("Url stämmer inte");
		} 
	}
}