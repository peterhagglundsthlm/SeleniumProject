package testCasesSATStartPageNotLoggedIn;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;
import reusableMethods.DriverWaitExpectedConditions;

public class BehandlingAvPersonUppgifter extends BeforeAfterTestSetup {
	String Url; String NyURL;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen Behandling av personuppgifter fungerar som tänkt";
		Url = driver.getCurrentUrl();
	}

	@Test
	public void WaitForHomePageToLoad() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(
				driver, SAT_Home_Page_Not_Logged_In.LoginButtonChrome());
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClicBehandlingAvPersonuppgifter() {
		
		driver.findElement(
				SAT_Home_Page_Not_Logged_In.BehandlingAvPersonuppgifterButton()).click();
	}

	@Test (dependsOnMethods={"ClicBehandlingAvPersonuppgifter"})
	public void VerifyBehandlingAvPersonuppgifter() throws InterruptedException {
		
		NyURL = driver.getCurrentUrl();

		if (!NyURL.equals((Url + "#processingofpersonaldata")))
		{
			Assert.fail("Url stämmer inte");
		} 

	}
}






