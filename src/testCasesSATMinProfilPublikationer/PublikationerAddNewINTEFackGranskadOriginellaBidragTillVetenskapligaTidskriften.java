package testCasesSATMinProfilPublikationer;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.driverSelect;

public class PublikationerAddNewINTEFackGranskadOriginellaBidragTillVetenskapligaTidskriften extends BeforeAfterTestSetup {

	//TestCaseInfo =  "Loggar in som en projektledare och lägger till en INTE fackgranskad Originella bidrag till vetenskapliga tidskriften";

	@Test
	public void DropDownOriginellaBidragTillVetenskapligaTidskriften() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationIckeFackgranskad(driver);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown());

		Select VetenskapligPublikation = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			VetenskapligPublikation.selectByVisibleText("Originella bidrag till vetenskapliga tidskriften");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			VetenskapligPublikation.selectByVisibleText("Original contribution to science journal");
		}
	}

	@Test (dependsOnMethods = {"DropDownOriginellaBidragTillVetenskapligaTidskriften"})
	public void INTEfackgrTidskriftResten() throws InterruptedException {

		GemensammaMetoder.TitelOchFörfattare(driver);
		GemensammaMetoder.Tidskrifter(driver);
		GemensammaMetoder.Sidnummer(driver);
		GemensammaMetoder.Utgivare(driver);
		GemensammaMetoder.OpenAccess(driver);
		GemensammaMetoder.Spara(driver);
	}
}
