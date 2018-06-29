package testCasesSAT;




import org.testng.Assert;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class LoginAsInvalidUser extends BeforeAfterTestBrowsers {


	@Test 
	public void InputUserWithInvalidInfo() {

		//FÖRSÖKER LOGGA IN MED OGILTIGA ANVÄNDARUPPGIFTER
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, "Ett falskt användarnamn", "Ett falskt lösenord");	
	}

	@Test (dependsOnMethods={"InputUserWithInvalidInfo"})
	public void CheckThatLogginInWithFalseInfoNotPossible() {

		//KONTROLLERAR OM TEXTEN OM FELAKTIG EPOST-ADRESS VISAS PÅ SIDAN
		if (driver.getPageSource().contains("Den angivna e-postadressen är inte korrekt"))
		{ 
			//Testet lyckas
			System.out.println();
			

		} else {
			//Testet misslyckas
			Assert.fail();
			
			

		}
	}

}

