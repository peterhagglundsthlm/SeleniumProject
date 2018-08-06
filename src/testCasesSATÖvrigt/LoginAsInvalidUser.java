package testCasesSATÖvrigt;




import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;

public class LoginAsInvalidUser extends BeforeAfterTestBrowsers {

	@BeforeTest
	public void TestCaseInfo() {

		String TestCaseInfo = "Försöker logga in med felaktiga inloggningsuppgifter. Kontrollerar att felmeddelande visas";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}


	@Test 
	public void InputUserWithInvalidInfo() {

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

