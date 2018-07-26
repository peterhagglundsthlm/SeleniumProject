package testCasesSATMinProfilMeriterOchUtmärkelser;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class MeriterOchUtmärkelserAddNewHandleddaPersonerEnskildPerson extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en projektledare och lägger till en Enskild handledd person";

	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtmärkelser() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser(driver).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtmärkelser"})
	public void LäggTillHandleddaPersonerEnskildPerson() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerLäggTillEnskildPersonKnapp(driver).click();
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPerson"})
	public void LäggTillHandleddaPersonerEnskildPersonFörnamn() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerFörnamn(driver).sendKeys("Förnamn3");
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonFörnamn"})
	public void LäggTillHandleddaPersonerEnskildPersonEfternamn() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerEfternamn(driver).sendKeys("Efternamn");
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonEfternamn"})
	public void LäggTillHandleddaPersonerEnskildPersonSlutår() {

		Select Slutår = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSlutår)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = Slutår.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Slutår.selectByIndex(number);
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonSlutår"})
	public void LäggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner() {

		Select TypAvHandleddaPersoner = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerTypAvHandleddaPerson)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = TypAvHandleddaPersoner.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		TypAvHandleddaPersoner.selectByIndex(number2);
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner"})
	public void LäggTillHandleddaPersonerEnskildPersonRoll() {

		Select Roll = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerRoll)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = Roll.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		Roll.selectByIndex(number3);
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonRoll"})
	public void LäggTillHandleddaPersonerEnskildPersonRollSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSparaEnskildPerson(driver).click();
	}


}