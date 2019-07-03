package testCasesSATStartPageNotLoggedIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class BehandlingAvPersonUppgifter extends BeforeAfterTestBrowsers {
	String Url; String NyURL;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen Behandling av personuppgifter fungerar som tänkt";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
		Url = driver.getCurrentUrl();
	}

	@Test
	public void WaitForHomePageToLoad() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.LoginButtonChrome)); 
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClicBehandlingAvPersonuppgifter() {

		SAT_Home_Page_Not_Logged_In.BehandlingAvPersonuppgifterButton(driver).click();
	}

	@Test (dependsOnMethods={"ClicBehandlingAvPersonuppgifter"})
	public void VerifyBehandlingAvPersonuppgifter() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.BehandlingAvPersonuppgifterModal));

		NyURL = driver.getCurrentUrl();

		if (!NyURL.equals((Url + "#processingofpersonaldata")))
		{
			Assert.fail("Url stämmer inte");
		} 

	}
}






