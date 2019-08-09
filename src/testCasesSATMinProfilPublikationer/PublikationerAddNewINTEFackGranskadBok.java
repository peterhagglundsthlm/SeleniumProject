package testCasesSATMinProfilPublikationer;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class PublikationerAddNewINTEFackGranskadBok extends BeforeAfterTestBrowsers {

	//TestCaseInfo =  "Loggar in som en projektledare och lägger till en INTE fackgranskad Bok";

	@Test 
	public void DropDownBokInteFackgranskad() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationIckeFackgranskad(driver);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown());

		Select VetenskapligPublikation = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			VetenskapligPublikation.selectByVisibleText("Bok");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			VetenskapligPublikation.selectByVisibleText("Book");
		}
	}

	@Test (dependsOnMethods = {"DropDownBokInteFackgranskad"})
	public void BokResten() throws InterruptedException {

		GemensammaMetoder.TitelOchFörfattare(driver);
		GemensammaMetoder.FörlagOchPlats(driver);
		GemensammaMetoder.ISBN_publikation(driver);
		GemensammaMetoder.Utgivare(driver);
		GemensammaMetoder.OpenAccess(driver);
		GemensammaMetoder.Spara(driver);
	}
}
