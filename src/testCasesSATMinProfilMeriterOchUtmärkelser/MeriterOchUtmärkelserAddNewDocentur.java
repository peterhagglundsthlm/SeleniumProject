package testCasesSATMinProfilMeriterOchUtmärkelser;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class MeriterOchUtmärkelserAddNewDocentur extends BeforeAfterTestBrowsers {


	String TestCaseInfo = "Loggar in som en projektledare och lägger till en Docentur123";


	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtmärkelser() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser(driver).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtmärkelser"})
	public void LäggTillDocentur() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturLäggTill(driver).click();
	}

	@Test (dependsOnMethods={"LäggTillDocentur"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSökOrganisation(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSökOrganisation(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSökOrganisation(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSparaSöktOrganisation(driver).click();
	}


	@Test (dependsOnMethods={"SelectOrganization"})
	public void Ämne() {

		//VÄLJER SLUMPMÄSSIGT I FÖRSTA DROPDOWN
		Select ämne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturÄmne1)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = ämne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		ämne1.selectByIndex(number);

		//VÄLJER SLUMPMÄSSIGT I ANDRA DROPDOWN
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturÄmne2));
		Select ämne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturÄmne2)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = ämne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		ämne2.selectByIndex(number2);

	}

	@Test (dependsOnMethods={"Ämne"})
	public void År() {

		//VÄLJER SLUMPMÄSSIGT I FÖRSTA DROPDOWN
		Select år = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturÅr)));
		Random randomOption3 = new Random();  
		int startOption3 = 0;
		int endOption3 = år.getOptions().size(); 
		int number = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		år.selectByIndex(number);
	}

	@Test (dependsOnMethods={"År"})
	public void SparaDocentur() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSpara(driver).click();
	}
}

