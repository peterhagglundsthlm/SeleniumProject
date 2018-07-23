package testCasesSAT;

import java.util.Random;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUserMinProfil;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class ArbetslivAddNewPostdoktorvistelser extends BeforeAfterTestBrowsers {
	
	String TestCaseInfo = "Loggar in som en projektledare och lägger till en Postdoktorvistelser";
	
	@Test
	public void LoginAsUser() {
		
		System.out.println("Testfall = " + TestCaseInfo);
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.jagtestarprismaSATuserName, UserCredentials.jagtestarprismaSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Xpath);
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Xpath(driver).click();
	}


	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddPostdoktorvistelser() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserLäggTill_CSS(driver).click();
	}

	@Test (dependsOnMethods={"AddPostdoktorvistelser"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSökOrganisation_NAME(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSökOrganisation_NAME(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSökOrganisation_NAME(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSökOrganisation_Tagname(driver).click();
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void ÄmneDropDown() {

		Select ämne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserÄmne1_ID)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = ämne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		ämne1.selectByIndex(number);

		Select ämne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserÄmne2_ID)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = ämne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		ämne2.selectByIndex(number2);

		Select ämne3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserÄmne3_ID)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = ämne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		ämne3.selectByIndex(number3);
	}

	@Test (dependsOnMethods={"ÄmneDropDown"})
	public void PeriodStartOchSlutYear() {

		//Postdoktorvistelser START ÅR. PLOCKAS SLUMPMÄSSIGT
		Select PeriodStartYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartYear_Name)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodStartYear.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodStartYear.selectByIndex(number);

		//Postdoktorvistelser SLUT ÅT. HÄMTAR STARTÅR OCH LÄGGER TILL 1 ÅR 
		Select PeriodEndYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndYear_Name))); 
		PeriodEndYear.selectByIndex(number + 1);
	}

	@Test (dependsOnMethods={"PeriodStartOchSlutYear"})
	public void PeriodStartMonth() {

		Select PeriodStartMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartMonth_Name)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = PeriodStartMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodStartMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"PeriodStartMonth"})
	public void PeriodEndMonth() {

		Select PeriodEndMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndMonth_Name)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = PeriodEndMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodEndMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"PeriodEndMonth"})
	public void SparaPostdoktorvistelser() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSpara_ID(driver).click();
	}
}