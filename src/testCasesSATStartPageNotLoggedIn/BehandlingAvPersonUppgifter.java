package testCasesSATStartPageNotLoggedIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class BehandlingAvPersonUppgifter extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen " + "Behandling av personuppgifter " + "fungerar som tänkt";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
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
	public void VerifyBehandlingAvPersonuppgifter() {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.BehandlingAvPersonuppgifterModal));
		
		if (driver.getPageSource().contains("I enlighet med den allmänna dataskyddsförordningen (EU 2016/679), GDPR, och kompletterande nationell lagstiftning lämnas följande information för behandlingen av dina personuppgifter i Prisma"))
		{
			System.out.println("Informationstexten om behandling av personuppgifter visas korrekt. Testet har lyckats");
		} else {
			System.out.println("Informationstexten om behandling av personuppgifter visas INTE korrekt. Testet har misslyckats");
			Assert.fail();
		}
			
	}
}
