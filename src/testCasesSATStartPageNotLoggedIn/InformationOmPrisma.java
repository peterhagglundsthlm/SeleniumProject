package testCasesSATStartPageNotLoggedIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class InformationOmPrisma extends BeforeAfterTestBrowsers {
	String Url; String NyURL;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen information Om Prisma fungerar som tänkt";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
		Url = driver.getCurrentUrl();
	}

	@Test
	public void WaitForHomePageToLoad() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.LoginButtonChrome)); 
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClicInformation() {

		SAT_Home_Page_Not_Logged_In.InformationButton(driver).click();
	}


	@Test (dependsOnMethods={"ClicInformation"})
	public void ClickOmPrisma() {

		SAT_Home_Page_Not_Logged_In.InformationOmPrismaButton(driver).click();
	}


	@Test (dependsOnMethods={"ClickOmPrisma"})
	public void VerifyURL() {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.id(SAT_Home_Page_Not_Logged_In.InformationOmPrismaModal));

		NyURL = driver.getCurrentUrl();

		if (!NyURL.equals((Url + "#aboutprisma")))
		{
			Assert.fail("Url stämmer inte");
		} 

	}
}
