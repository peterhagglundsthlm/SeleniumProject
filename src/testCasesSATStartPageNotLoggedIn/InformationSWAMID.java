package testCasesSATStartPageNotLoggedIn;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class InformationSWAMID extends BeforeAfterTestBrowsers {
	String Url; String NyURL;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen SWAMID fungerar som tänkt";	
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
	public void ClickSWAMID() {
		
		driver.findElement(
				SAT_Home_Page_Not_Logged_In.InformationSWAMIDButton()).click();
	}

	@Test (dependsOnMethods={"ClickSWAMID"})
	public void VerifyURL() throws InterruptedException {

		NyURL = driver.getCurrentUrl();

		if (!NyURL.equals((Url + "#swamid")))
		{
			Assert.fail("Url stämmer inte");
		} 

	}
}