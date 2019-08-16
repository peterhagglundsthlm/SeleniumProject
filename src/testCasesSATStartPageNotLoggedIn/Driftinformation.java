package testCasesSATStartPageNotLoggedIn;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;
import reusableMethods.DriverWaitExpectedConditions;

public class Driftinformation extends BeforeAfterTestSetup {
	 

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen Drifinformation fungerar som tänkt";
	}

	@Test
	public void WaitForHomePageToLoad() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				SAT_Home_Page_Not_Logged_In.LoginButtonChrome());
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClickDriftinformation() {
		
		driver.findElement(
				SAT_Home_Page_Not_Logged_In.DriftinformationButton()).click();
	}

	@Test (dependsOnMethods={"ClickDriftinformation"})
	public void VerifyURL() throws InterruptedException {

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		
		Thread.sleep(1000);

		String URL = driver.getCurrentUrl();
	
		if (URL.contains("driftsinformation"))
		{
	
		} 
	}
}