package testCasesSATStartPageNotLoggedIn;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;
import reusableMethods.DriverWaitExpectedConditions;

public class InformationOmPrisma extends BeforeAfterTestSetup {
	String Url; String NyURL;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen information Om Prisma fungerar som tänkt";
		Url = driver.getCurrentUrl();
	}

	@Test
	public void WaitForHomePageToLoad() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				SAT_Home_Page_Not_Logged_In.LoginButtonChrome()); 
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClicInformation() {
		
		driver.findElement(
				SAT_Home_Page_Not_Logged_In.InformationButton()).click();
	}


	@Test (dependsOnMethods={"ClicInformation"})
	public void ClickOmPrisma() {

		driver.findElement(
				SAT_Home_Page_Not_Logged_In.InformationOmPrismaButton()).click();	
	}


	@Test (dependsOnMethods={"ClickOmPrisma"})
	public void VerifyURL() {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, 
				SAT_Home_Page_Not_Logged_In.InformationOmPrismaModal());
		
		NyURL = driver.getCurrentUrl();

		if (!NyURL.equals((Url + "#aboutprisma")))
		{
			Assert.fail("Url stämmer inte");
		} 

	}
}
