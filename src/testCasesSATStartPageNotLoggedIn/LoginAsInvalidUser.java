package testCasesSATStartPageNotLoggedIn;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;
import reusableMethods.DriverWaitExpectedConditions;

public class LoginAsInvalidUser extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Försöker logga in med felaktiga inloggningsuppgifter. Kontrollerar att felmeddelande visas";
	}

	@Test 
	public void InputUserWithInvalidInfo() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				SAT_Home_Page_Not_Logged_In.LoginButtonChrome());

		driver.findElement(
				SAT_Home_Page_Not_Logged_In.LoginButtonChrome()).click();
		driver.findElement(
				SAT_Home_Page_Not_Logged_In.EnterUserName()).sendKeys("zfzfz");
		driver.findElement(
				SAT_Home_Page_Not_Logged_In.EnterPassword()).sendKeys("fsfbdbd");
		driver.findElement(
				SAT_Home_Page_Not_Logged_In.SubmitUserNameAndPassword()).click();
	}

	@Test (dependsOnMethods={"InputUserWithInvalidInfo"})
	public void CheckThatLogginInWithFalseInfoNotPossible() {
		
		if (driver.getPageSource().contains("Den angivna e-postadressen är inte korrekt") || driver.getPageSource().contains("The stated e-mail address is not valid"))
		{ 

		} else {
			Assert.fail();
		}
	}
}

