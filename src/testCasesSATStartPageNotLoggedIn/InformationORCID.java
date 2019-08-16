package testCasesSATStartPageNotLoggedIn;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;
import reusableMethods.DriverWaitExpectedConditions;

public class InformationORCID extends BeforeAfterTestSetup {
	String Url; String NyURL;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen ORCID fungerar som förväntat";
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
	public void ClickORCID() {

		driver.findElement(
				SAT_Home_Page_Not_Logged_In.InformationORCIDButton()).click();
	}

	@Test (dependsOnMethods={"ClickORCID"})
	public void VerifyURL() throws InterruptedException {
		
		NyURL = driver.getCurrentUrl();

		if (!NyURL.equals((Url + "#orcid")))
		{
			Assert.fail("Url stämmer inte");
		} 

	}
}