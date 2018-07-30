package testCasesMinProfilArbetsliv;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class ArbetslivAddNewUppeHålliForskningen extends BeforeAfterTestBrowsers {
	
	String TestCaseInfo = "Loggar in som en projektledare och lägger till ett Uppehåll i forskningen";

	@Test
	public void LoginAsUser2() {

		System.out.println("Testfall = " + TestCaseInfo);
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
		
		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser2"})
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
	}

	@Test (dependsOnMethods={"StartDatum"})
	public void SlutDatum() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenSlutDatum(driver).sendKeys("2018-06-17");
	}

	@Test (dependsOnMethods={"SlutDatum"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenBeskrivning(driver).sendKeys("test");
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void SparaVal() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenSpara(driver).click();
	}
}
