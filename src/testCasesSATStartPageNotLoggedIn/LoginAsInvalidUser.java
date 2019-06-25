package testCasesSATStartPageNotLoggedIn;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class LoginAsInvalidUser extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Försöker logga in med felaktiga inloggningsuppgifter. Kontrollerar att felmeddelande visas";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test 
	public void InputUserWithInvalidInfo() {
		
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
		SAT_Home_Page_Not_Logged_In.EnterUserName(driver).sendKeys("aasdad");
		SAT_Home_Page_Not_Logged_In.EnterPassword(driver).sendKeys("retert");
		SAT_Home_Page_Not_Logged_In.SubmitUserNameAndPassword(driver).click();

	}

	@Test (dependsOnMethods={"InputUserWithInvalidInfo"})
	public void CheckThatLogginInWithFalseInfoNotPossible() {

		//KONTROLLERAR OM TEXTEN OM FELAKTIG EPOST-ADRESS VISAS PÅ SIDAN
		if (driver.getPageSource().contains("Den angivna e-postadressen är inte korrekt"))
		{ 
			//Testet lyckas
//			System.out.println("Felmeddelande visas korrekt. Det är inte möjligt att logga in med felaktiga uppgifter");


		} else {
			//Testet misslyckas
//			System.out.println("Felmeddelandet visas inte korrekt");
			Assert.fail();



		}
	}

}

