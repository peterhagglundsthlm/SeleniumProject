package testCasesSATMinProfilArbetsliv;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class ArbetslivAddNewUppeHålliForskningen extends BeforeAfterTestBrowsers {
	
	@BeforeClass
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och lägger till ett Uppehåll i forskningen";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {
		
		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv(driver).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void UppehållIForskningenLäggTill() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenLäggTill(driver).click();
	}

	@Test (dependsOnMethods={"UppehållIForskningenLäggTill"})
	public void StartDatum() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenStartDatum(driver).sendKeys("2017-05-19");
		
//		String StartDatumUppehall = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenStartDatum(driver).getAttribute("value");
//		System.out.println("Start Datum Uppehåll = " + StartDatumUppehall); 
	}

	@Test (dependsOnMethods={"StartDatum"})
	public void SlutDatum() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenSlutDatum(driver).sendKeys("2018-06-17");
		
//		String SlutDatumUppehall = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenSlutDatum(driver).getAttribute("value");
//		System.out.println("Slut Datum Uppehåll = " + SlutDatumUppehall); 
	}

	@Test (dependsOnMethods={"SlutDatum"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenBeskrivning(driver).sendKeys("test");
		
//		String Beskrivning = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenBeskrivning(driver).getAttribute("value");
//		System.out.println("Beskrivning fritext = " + Beskrivning); 
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void SparaVal() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenSpara(driver).click();
	}
}
