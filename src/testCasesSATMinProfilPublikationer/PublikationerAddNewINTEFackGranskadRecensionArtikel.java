package testCasesSATMinProfilPublikationer;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class PublikationerAddNewINTEFackGranskadRecensionArtikel extends BeforeAfterTestBrowsers {

	//TestCaseInfo =  "Loggar in som en projektledare och lägger till en INTE fackgranskad Recension artikel";

	@Test 
	public void DropDownRecensionArtikel() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationIckeFackgranskad(driver);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown());

		Select VetenskapligPublikation = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			VetenskapligPublikation.selectByVisibleText("Recension artikel");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			VetenskapligPublikation.selectByVisibleText("Review Article");
		}
	}

	@Test (dependsOnMethods = {"DropDownRecensionArtikel"})
	public void INTEfackgranskRecensionResten() throws InterruptedException {

		GemensammaMetoder.TitelOchFörfattare(driver);
		GemensammaMetoder.Tidskrifter(driver);
		GemensammaMetoder.Sidnummer(driver);
		GemensammaMetoder.Utgivare(driver);
		GemensammaMetoder.OpenAccess(driver);
		GemensammaMetoder.Spara(driver);
	}
}
