package testCasesSATMinProfilMeriterOchUtmärkelser;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class MeriterOchUtmärkelserAddNewHandleddaPersonerEnskildPerson extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Enskild handledd person";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtmärkelser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser()).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtmärkelser"})
	public void LäggTillHandleddaPersonerEnskildPerson() {
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerLäggTillEnskildPersonKnapp()).click();
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPerson"})
	public void LäggTillHandleddaPersonerEnskildPersonFörnamn() {
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerFörnamn()).sendKeys("Förnamn3");
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonFörnamn"})
	public void LäggTillHandleddaPersonerEnskildPersonEfternamn() {
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerEfternamn()).sendKeys("Efternamn3");
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonEfternamn"})
	public void LäggTillHandleddaPersonerEnskildPersonSlutår() {

		Select Slutår = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSlutår());
		Random randomOption = new Random();  
		int endOption = Slutår.getOptions().size(); 
		int number =  randomOption .nextInt(endOption);  
		Slutår.selectByIndex(number);
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonSlutår"})
	public void LäggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner() {

		Select TypAvHandleddaPersoner = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerTypAvHandleddaPerson());
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = TypAvHandleddaPersoner.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		TypAvHandleddaPersoner.selectByIndex(number2);
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner"})
	public void LäggTillHandleddaPersonerEnskildPersonRoll() {

		Select Roll = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerRoll());
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = Roll.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		Roll.selectByIndex(number3);
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonRoll"})
	public void LäggTillHandleddaPersonerEnskildPersonRollSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSparaEnskildPerson()).click();
	}


}