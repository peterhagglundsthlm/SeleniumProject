package testCasesSATStartPageNotLoggedIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class InformationORCID extends BeforeAfterTestBrowsers {
	String Url; String NyURL;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen ORCID fungerar som förväntat";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
		Url = driver.getCurrentUrl();
	}

	@Test
	public void WaitForHomePageToLoad() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.LoginButtonChrome)); 
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClickInformation() {

		SAT_Home_Page_Not_Logged_In.InformationButton(driver).click();
	}

	@Test (dependsOnMethods={"ClickInformation"})
	public void ClickORCID() {

		SAT_Home_Page_Not_Logged_In.InformationORCIDButton(driver).click();
	}

	@Test (dependsOnMethods={"ClickORCID"})
	public void VerifyURL() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.InformationORCIDModal));

		NyURL = driver.getCurrentUrl();

		if (!NyURL.equals((Url + "#orcid")))
		{
			Assert.fail("Url stämmer inte");
		} 

	}
}