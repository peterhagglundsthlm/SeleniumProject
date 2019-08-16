package testCasesSATStartPageNotLoggedIn;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;
import reusableMethods.DriverWaitExpectedConditions;

public class SwitchPortalToEnglish extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att det är möjligt att byta språk till engelska";
	}

	@Test
	public void WaitForHomePageToLoad() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				SAT_Home_Page_Not_Logged_In.LoginButtonChrome());
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void SwitchToEnglish() {

		String href = "/Localization/SelectLanguage?languageName=EN&returnUrl=%2F";
		driver.get("https://testaprisma.vr.se" + href);
		
	}

	@Test (dependsOnMethods={"SwitchToEnglish"})
	public void VerifyThatLanguageIsEnglish() {

		if (driver.getPageSource().contains("Welcome to Prisma"))
		{

		}
		else {
			Assert.fail("Det gick inte att byta språk till engelska");
		}
	}
}
