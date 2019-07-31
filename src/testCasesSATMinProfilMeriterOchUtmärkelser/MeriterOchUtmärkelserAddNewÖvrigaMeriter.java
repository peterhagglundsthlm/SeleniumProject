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


public class MeriterOchUtmärkelserAddNewÖvrigaMeriter extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Övriga meriter";
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
	public void LäggTill() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterLäggTill()).click();
	}

	@Test (dependsOnMethods={"LäggTill"})
	public void StartårAndSlutÅr() {

		Select Startår = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterStartår());
		Random randomOptionStartår = new Random();  
		int endOptionStartår = Startår.getOptions().size(); 
		int numberStartår = randomOptionStartår .nextInt(endOptionStartår);  
		Startår.selectByIndex(numberStartår);

		Select Slutår = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSlutår());
		Slutår.selectByIndex(numberStartår + 1);
	}

	@Test (dependsOnMethods={"StartårAndSlutÅr"})
	public void TypAvMerit() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterTypAvMerit()).sendKeys("Test123");
	}

	@Test (dependsOnMethods={"TypAvMerit"})
	public void Beskrivning() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterBeskrivning()).sendKeys("En bra beskrivning");
	}

	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSpara()).click();
	}
}
