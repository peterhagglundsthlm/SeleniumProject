package testCasesSAT;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsAdmin;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class LoginAsValidUser extends BeforeAfterTestBrowsers {


	@Test 
	public void LoginAsUser() {
	
		//LOGGAR IN SOM ADMIN MED GILTIGT INLOGGNING
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.KristoferKlarinAdminUserNameSAT, UserCredentials.KristoferKlarinAdminPasswordSAT);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsAdmin.LoggaUt_Xpath);

	}
	@Test (dependsOnMethods={"LoginAsUser"})
	public void CheckIfLogOutButtonIsPresentVerifyLoginSuccess() {

		//KOLLAR OM LOGGA UT KNAPPEN ÄR SYNLIG PÅ SIDAN ELLER INTE. SKRIVER RESULTAT I CONSOLE.
		if (driver.findElements(By.xpath(PortalLoggedInAsAdmin.LoggaUt_Xpath)) == null)
		{ 
			// If button is NOT present, the test fails
			Assert.fail(); 

		} else {
			//If button is present. Pass test
			System.out.println();
		}
	}

}





