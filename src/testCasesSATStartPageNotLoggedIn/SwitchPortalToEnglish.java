package testCasesSATStartPageNotLoggedIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class SwitchPortalToEnglish extends BeforeAfterTestBrowsers {
	
	
  @Test
  public void WaitForHomePageToLoad() {
	  
	  DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath(SAT_Home_Page_Not_Logged_In.LoginButtonChrome)); 
	  
  }
  
  @Test (dependsOnMethods={"WaitForHomePageToLoad"})
  public void SwitchToEnglish() {
	  
	  SAT_Home_Page_Not_Logged_In.InEnglishButton(driver).click();
  }
  
  @Test (dependsOnMethods={"SwitchToEnglish"})
  public void VerifyThatLanguageIsEnglish() {
	  
	 if (driver.getPageSource().contains("Welcome to Prisma"))
	 {
		 System.out.println("Portalen har bytt spr�k till Engelska. Testet har lyckats");
	 }
	 else {
		 System.out.println("Portalen har inte bytt spr�k korrekt. Testet har misslyckats");
		 Assert.fail();
	 }
  }
}
