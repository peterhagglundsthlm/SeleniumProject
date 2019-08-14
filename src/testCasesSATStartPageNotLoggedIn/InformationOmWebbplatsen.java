package testCasesSATStartPageNotLoggedIn;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class InformationOmWebbplatsen extends BeforeAfterTestBrowsers {
	String Url; String NyURL;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen Om Webbplatsen fungerar som tänkt";
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
	public void ClickOmWebbplatsen() {
		
		driver.findElement(
				SAT_Home_Page_Not_Logged_In.InformationOmWebbplatsenButton()).click();
	}


	@Test (dependsOnMethods={"ClickOmWebbplatsen"})
	public void VerifyURL() {
		
		DriverWaitExpectedConditions.WaitForElementToBeVisible(
				driver, SAT_Home_Page_Not_Logged_In.InformationOmWebbplatsenModal());

		NyURL = driver.getCurrentUrl();

		if (!NyURL.equals((Url + "#aboutwebsite")))
		{
			Assert.fail("Url stämmer inte");
		} 

	}
}
