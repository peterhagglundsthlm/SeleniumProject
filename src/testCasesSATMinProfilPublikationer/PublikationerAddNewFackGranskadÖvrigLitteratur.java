package testCasesSATMinProfilPublikationer;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class PublikationerAddNewFackGranskadÖvrigLitteratur extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en fackgranskad ÖvrigLitteratur";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginVäljKlickaPublikation() {

		GemensammaMetoder.LoggainPublikation(driver);
	}

	@Test (dependsOnMethods={"LoginVäljKlickaPublikation"})
	public void DropDownÖvrigLitteratur() {

		GemensammaMetoder.PublikationFackgranskad(driver);
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			Publikationstyp.selectByVisibleText("Övrig litteratur");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			Publikationstyp.selectByVisibleText("Other literature");
		}
	}

	@Test (dependsOnMethods={"DropDownÖvrigLitteratur"})
	public void TitleAuthor() {

		GemensammaMetoder.TitelOchFörfattare(driver);
	}

	@Test (dependsOnMethods={"TitleAuthor"})
	public void Publisher() {

		GemensammaMetoder.FörlagOchPlats(driver);
	}

	@Test (dependsOnMethods={"Publisher"})
	public void InfoUtgivare() {
		// ISBN och övrigt
		GemensammaMetoder.ISBN_publikation(driver);
		GemensammaMetoder.Utgivare(driver);
	}

	@Test (dependsOnMethods={"InfoUtgivare"})
	public void InfoOpenAccess() {

		GemensammaMetoder.OpenAccess(driver);
	}

	@Test (dependsOnMethods = {"InfoOpenAccess"})
	public void Spara() {
		GemensammaMetoder.Spara(driver);
	}
}
