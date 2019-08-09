package testCasesSATMinProfilPublikationer;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class PublikationerAddNewFackGranskadOriginellaBidragTillVetenskapligaTidskriften extends BeforeAfterTestBrowsers {

	//TestCaseInfo = "Loggar in som en projektledare och lägger till en fackgranskad Originella bidrag till vetenskapliga tidskriften";

	@Test
	public void DropDownOriginellaBidragTillVetenskapligaTidskriften() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationFackgranskad(driver);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		Select VetenskapligPublikation = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

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
	public void FackgranskadTidskriftResten() throws InterruptedException {

		GemensammaMetoder.TitelOchFörfattare(driver);
		GemensammaMetoder.Tidskrifter(driver);
		GemensammaMetoder.Sidnummer(driver);
		GemensammaMetoder.Utgivare(driver);
		GemensammaMetoder.OpenAccess(driver);
		GemensammaMetoder.Spara(driver);
	}
}