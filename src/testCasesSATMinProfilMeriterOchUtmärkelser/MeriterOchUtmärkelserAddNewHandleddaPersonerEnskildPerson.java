package testCasesSATMinProfilMeriterOchUtmärkelser;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class MeriterOchUtmärkelserAddNewHandleddaPersonerEnskildPerson extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Enskild handledd person";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
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
		
//		String FörnamnString = PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerFörnamn(driver).getAttribute("value");
//		System.out.println("Förnamn = " + FörnamnString); 
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonFörnamn"})
	public void LäggTillHandleddaPersonerEnskildPersonEfternamn() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerEfternamn(driver).sendKeys("Efternamn123");
		
//		String EfternamnString = PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerEfternamn(driver).getAttribute("value");
//		System.out.println("Efternamn = " + EfternamnString); 
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonEfternamn"})
	public void LäggTillHandleddaPersonerEnskildPersonSlutår() {

		Select Slutår = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSlutår)));
		Random randomOption = new Random();  
		int endOption = Slutår.getOptions().size(); 
		int number =  randomOption .nextInt(endOption);  
		Slutår.selectByIndex(number);
		
//		WebElement SlutårSelect = Slutår.getFirstSelectedOption();
//		String SlutårSelectValue = SlutårSelect.getText();
//		System.out.println("Slutår = " + SlutårSelectValue );
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonSlutår"})
	public void LäggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner() {

		Select TypAvHandleddaPersoner = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerTypAvHandleddaPerson)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = TypAvHandleddaPersoner.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		TypAvHandleddaPersoner.selectByIndex(number2);
		
//		WebElement TypAvHandleddaPersonerSelect = TypAvHandleddaPersoner.getFirstSelectedOption();
//		String TypAvHandleddaPersonerSelectValue = TypAvHandleddaPersonerSelect.getText();
//		System.out.println("Typ av handledda personer = " + TypAvHandleddaPersonerSelectValue);
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner"})
	public void LäggTillHandleddaPersonerEnskildPersonRoll() {

		Select Roll = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerRoll)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = Roll.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		Roll.selectByIndex(number3);
		
//		WebElement RollSelect = Roll.getFirstSelectedOption();
//		String RollSelectValue = RollSelect.getText();
//		System.out.println("Roll = " + RollSelectValue);
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonRoll"})
	public void LäggTillHandleddaPersonerEnskildPersonRollSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSparaEnskildPerson(driver).click();
	}


}