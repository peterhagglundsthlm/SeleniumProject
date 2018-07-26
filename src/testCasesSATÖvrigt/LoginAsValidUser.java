package testCasesSATÖvrigt;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsAdmin;

public class LoginAsValidUser extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Testar att logga in med riktiga inloggningsuppgifter. Kontrollerar att inloggning har skett korrekt.";

	@Test 
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);

		//LOGGAR IN SOM ADMIN MED GILTIGT INLOGGNING
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath(PortalLoggedInAsAdmin.LoggaUt));
		

	}
	@Test (dependsOnMethods={"LoginAsUser"})
	public void CheckIfLogOutButtonIsPresentVerifyLoginSuccess() {

		//KOLLAR OM LOGGA UT KNAPPEN ÄR SYNLIG PÅ SIDAN ELLER INTE. SKRIVER RESULTAT I CONSOLE.
		if (driver.findElements(By.xpath(PortalLoggedInAsAdmin.LoggaUt)) == null)
		{ 
			// If button is NOT present, the test fails
			Assert.fail(); 

		} else {
			//If button is present. Pass test
			System.out.println();
		}
	}

}





