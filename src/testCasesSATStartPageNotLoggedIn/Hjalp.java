package testCasesSATStartPageNotLoggedIn;

import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;
import reusableMethods.DriverWaitExpectedConditions;

public class Hjalp extends BeforeAfterTestSetup {
	
	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen Hjälp fungerar som tänkt";
	}

	@Test
	public void WaitForHomePageToLoad() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				SAT_Home_Page_Not_Logged_In.LoginButtonChrome()); 
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClickHjälp() {
		
		driver.findElement(
				SAT_Home_Page_Not_Logged_In.HjälpButton()).click();
	}

	@Test (dependsOnMethods={"ClickHjälp"})
	public void VerifyURL() throws InterruptedException {

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		
		Thread.sleep(1000);

		String Url = driver.getCurrentUrl();

		if (Url.contains("https://prismasupport.research.se"))
		{
	
		} 

	}
}
