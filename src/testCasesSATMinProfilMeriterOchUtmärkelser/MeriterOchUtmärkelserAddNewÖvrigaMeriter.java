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


public class MeriterOchUtmärkelserAddNewÖvrigaMeriter extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Övriga meriter";
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
	public void LäggTill() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterLäggTill(driver).click();
	}

	@Test (dependsOnMethods={"LäggTill"})
	public void StartårAndSlutÅr() {

		Select Startår = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterStartår)));
		Random randomOptionStartår = new Random();  
		int endOptionStartår = Startår.getOptions().size(); 
		int numberStartår = randomOptionStartår .nextInt(endOptionStartår);  
		Startår.selectByIndex(numberStartår);
		
//		WebElement StartårSelect = Startår.getFirstSelectedOption();
//		String StartårSelectValue = StartårSelect.getText();
//		System.out.println("Startår = " + StartårSelectValue); 

		Select Slutår = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSlutår)));
		Slutår.selectByIndex(numberStartår + 1);
		
//		WebElement SlutårSelect = Slutår.getFirstSelectedOption();
//		String SlutårSelectValue = SlutårSelect.getText();
//		System.out.println("Slutår = " + SlutårSelectValue); 
	}

	@Test (dependsOnMethods={"StartårAndSlutÅr"})
	public void TypAvMerit() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterTypAvMerit(driver).sendKeys("Test123");

//		String TypAvMeritString = PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterTypAvMerit(driver).getAttribute("value");
//		System.out.println("Typ av merit = " + TypAvMeritString); 
	}

	@Test (dependsOnMethods={"TypAvMerit"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterBeskrivning(driver).sendKeys("En bra beskrivning");
		
//		String BeskrivningString = PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterBeskrivning(driver).getAttribute("value");
//		System.out.println("Beskrivning = " + BeskrivningString); 
	}

	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSpara(driver).click();
	}
}
