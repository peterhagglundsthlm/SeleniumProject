package testCasesSATStartPageNotLoggedIn;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class Hjalp extends BeforeAfterTestBrowsers {
	

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Öppnar SAT startsidan och verfierar att knappen Hjälp fungerar som tänkt";
	}

	@Test
	public void WaitForHomePageToLoad() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, SAT_Home_Page_Not_Logged_In.LoginButtonChrome()); 
	}

	@Test (dependsOnMethods={"WaitForHomePageToLoad"})
	public void ClickHjälp() {
		
		driver.findElement(SAT_Home_Page_Not_Logged_In.HjälpButton()).click();
	}

	@Test (dependsOnMethods={"ClickHjälp"})
	public void VerifyURL() {

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		String Url = driver.getCurrentUrl();

		if (!Url.equals(("https://prismasupport.research.se/")))
		{
			Assert.fail("Url stämmer inte");
		} 

	}
}
