package testCasesSATStartPageNotLoggedIn;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class InformationDriftinformation extends BeforeAfterTestBrowsers  {
	String Url; String NyURL;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen Drifinformation under information fungerar som tänkt";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
		Url = driver.getCurrentUrl();
	}

	@Test
	public void WaitForHomePageToLoad() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(SAT_Home_Page_Not_Logged_In.LoginButtonChrome)); 
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClickInformation() {

		SAT_Home_Page_Not_Logged_In.InformationButton(driver).click();
	}


	@Test (dependsOnMethods={"ClickInformation"})
	public void ClickDriftinformation() {

		SAT_Home_Page_Not_Logged_In.InformationDriftinformationButton(driver).click();
	}


	@Test (dependsOnMethods={"ClickDriftinformation"})
	public void VerifyURL() {

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		NyURL = driver.getCurrentUrl();
		
		if (!NyURL.equals(("https://prismasupport.research.se/driftsinformation")))
		{
			Assert.fail("Url stämmer inte");
		} 

	}
}