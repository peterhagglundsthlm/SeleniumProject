package testCasesSATStartPageNotLoggedIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class SwitchPortalToEnglish extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att det är möjligt att byta språk till engelska";
	}

	@Test
	public void WaitForHomePageToLoad() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, SAT_Home_Page_Not_Logged_In.LoginButtonChrome());
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
