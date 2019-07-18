package testCasesSATStartPageNotLoggedIn;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class Driftinformation extends BeforeAfterTestBrowsers {
	 

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen Drifinformation fungerar som tänkt";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
		
	}

	@Test
	public void WaitForHomePageToLoad() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.LoginButtonChrome)); 
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClickDriftinformation() {

		SAT_Home_Page_Not_Logged_In.DriftinformationButton(driver).click();
	}


	@Test (dependsOnMethods={"ClickDriftinformation"})
	public void VerifyURL() {

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		String URL = driver.getCurrentUrl();
		
		if (!URL.equals(("https://prismasupport.research.se/driftsinformation")))
		{
			Assert.fail("Url stämmer inte");
		} 

	}
}