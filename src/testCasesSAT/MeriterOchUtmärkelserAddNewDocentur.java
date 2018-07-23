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

public class MeriterOchUtmärkelserAddNewDocentur extends BeforeAfterTestBrowsers {


	String TestCaseInfo = "Loggar in som en projektledare och lägger till en Docentur";


	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		driver.manage().window().maximize();
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.jagtestarprismaSATuserName, UserCredentials.jagtestarprismaSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Xpath);
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtmärkelser() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtmärkelser"})
	public void LäggTillDocentur() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturLäggTill_Css(driver).click();
	}

	@Test (dependsOnMethods={"LäggTillDocentur"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSökOrganisation_Name(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSökOrganisation_Name(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSökOrganisation_Name(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSparaSöktOrganisation_Tagname(driver).click();
	}


	@Test (dependsOnMethods={"SelectOrganization"})
	public void Ämne() {

		//VÄLJER SLUMPMÄSSIGT I FÖRSTA DROPDOWN
		Select ämne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturÄmne1_Id)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = ämne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		ämne1.selectByIndex(number);

		//VÄLJER SLUMPMÄSSIGT I ANDRA DROPDOWN
		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturÄmne2_Id);
		Select ämne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturÄmne2_Id)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = ämne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		ämne2.selectByIndex(number2);

	}

	@Test (dependsOnMethods={"Ämne"})
	public void År() {

		//VÄLJER SLUMPMÄSSIGT I FÖRSTA DROPDOWN
		Select år = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturÅr_Id)));
		Random randomOption3 = new Random();  
		int startOption3 = 0;
		int endOption3 = år.getOptions().size(); 
		int number = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		år.selectByIndex(number);
	}

	@Test (dependsOnMethods={"År"})
	public void SparaDocentur() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSpara_Id(driver).click();
	}
}

