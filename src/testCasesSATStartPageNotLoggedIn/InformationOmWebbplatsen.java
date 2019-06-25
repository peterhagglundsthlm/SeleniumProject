package testCasesSATStartPageNotLoggedIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class InformationOmWebbplatsen extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen " + "Om Webbplatsen " + "fungerar som tänkt";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
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
	public void ClicOmWebbplatsen() {

		SAT_Home_Page_Not_Logged_In.OmWebbplatsenButton(driver).click();
	}
	
	
	@Test (dependsOnMethods={"ClicOmWebbplatsen"})
	public void VerifyInformation() {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.OmWebbplatsenModal));
		
		if (driver.getPageSource().contains("är uppbyggd för att vara tillgänglig och användbar för så många som möjligt. Vi strävar efter att skriva på enkel och lättläst svenska."))
		{
//			System.out.println("Informationstexten Om Webbplatsen visas korrekt. Testet har lyckats");
		} else {
//			System.out.println("Informationstexten Om Webbplatsen visas INTE korrekt. Testet har misslyckats");
			Assert.fail();
		}
			
	}
}
