package testCasesSATMinProfilPublikationer;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class PublikationerAddNewFackGranskadRedaktörerAntologi extends BeforeAfterTestBrowsers {

	//TestCaseInfo =  "Loggar in som en projektledare och lägger till en fackgranskad RedaktörerAntologi";	

	@Test 
	public void DropDownRedaktörerAntologi() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationFackgranskad(driver);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		Select VetenskapligPublikation = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			VetenskapligPublikation.selectByVisibleText("Redaktörer (antologi)");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			VetenskapligPublikation.selectByVisibleText("Editors (anthology)");
		}
	}

	@Test (dependsOnMethods={"DropDownRedaktörerAntologi"})
	public void RedaktörerAntologiResten() {

		GemensammaMetoder.Titel(driver);
		GemensammaMetoder.Redaktör(driver);
		GemensammaMetoder.FörlagOchPlats(driver);
		GemensammaMetoder.ISBN_publikation(driver);
		GemensammaMetoder.Utgivare(driver);
		GemensammaMetoder.OpenAccess(driver);
		GemensammaMetoder.Spara(driver);
	}
}


