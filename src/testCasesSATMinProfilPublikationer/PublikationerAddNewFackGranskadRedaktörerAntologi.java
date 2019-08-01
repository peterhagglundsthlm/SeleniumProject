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


public class PublikationerAddNewFackGranskadRedaktörerAntologi extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en fackgranskad RedaktörerAntologi";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	//	@Test
	/*LoginAsUser, ClickPublikationer, LäggTillPublikationer
	 * 
	@Test
	public void LoginAsUser() {

		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickPublikationer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer(driver).click();
	}

	@Test (dependsOnMethods={"ClickPublikationer"})
	public void LäggTillPublikationer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_LäggTill(driver).click();
	}
	 */
	
	@Test
	public void LoginVäljKlickaPublikation() {

		GemensammaMetoder.LoggainPublikation(driver);
	}

	//	@Test (dependsOnMethods={"LoginVäljKlickaPublikation"})
	//	public void VäljPublikationsTyp() {
	//
	//		GemensammaMetoder.PublikationFackgranskad(driver);
	//	}

	@Test (dependsOnMethods={"LoginVäljKlickaPublikation"})
	public void DropDownRedaktörerAntologi() {

		GemensammaMetoder.PublikationFackgranskad(driver);
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			Publikationstyp.selectByVisibleText("Redaktörer (antologi)");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			Publikationstyp.selectByVisibleText("Editors (anthology)");
		}
	}

	@Test (dependsOnMethods={"DropDownRedaktörerAntologi"})
	public void RedaktörerAntologiTitel() {

		String titel = "Testtitel Antologi";

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(titel);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).getAttribute("value") != titel)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(titel);
		}
	}

	@Test (dependsOnMethods={"RedaktörerAntologiTitel"})
	public void RedaktörerAntologiRedaktörNamn() {

		GemensammaMetoder.Redaktör(driver);
	}

	//	@Test (dependsOnMethods={"RedaktörerAntologiRedaktörNamn"})
	/*Förlag och förlagsplats
	 * public void RedaktörerAntologiFörlag() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag(driver).sendKeys("TestFörlag");
	}

	@Test (dependsOnMethods={"RedaktörerAntologiFörlag"})
	public void RedaktörerAntologiFörlagsplats() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).sendKeys("Förlagsplats");
	}
	 */

	@Test (dependsOnMethods={"RedaktörerAntologiRedaktörNamn"})
	public void Publisher() {

		GemensammaMetoder.FörlagOchPlats(driver);
	}

	//	@Test (dependsOnMethods={"RedaktörerAntologiISBN"})
	/* DOI, Status, KällaPub, KällaID
	public void RedaktörerAntologiDOI() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys("123456");
	}

	@Test (dependsOnMethods={"RedaktörerAntologiDOI"})
	public void RedaktörerAntologiKällaFörPublikation() {

		Select KällaFörPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = KällaFörPublikation.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		KällaFörPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"RedaktörerAntologiKällaFörPublikation"})
	public void RedaktörerAntologiStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus)));
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"RedaktörerAntologiStatus"})
	public void RedaktörerAntologiKällaID() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).sendKeys("1234");
	}

	 * 
	 */

	@Test (dependsOnMethods={"Publisher"})
	public void InfoUtgivare() {
		// ISBN och övrigt
		GemensammaMetoder.ISBN_publikation(driver);
		GemensammaMetoder.Utgivare(driver);
	}

	//	@Test (dependsOnMethods={"RedaktörerAntologiKällaID"})
	/* Publicerad open access JA, Extern länk för publicering, Form av OA, Dokumentversion och OASammanfattning
	 * public void RedaktörerAntologiVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"RedaktörerAntologiVarTextenPubliceradIOpenAcessJa"})
	public void RedaktörerAntologiOpenAccessLänkExternLänkFörPublicering() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).sendKeys("Testlänk");
	}

	@Test (dependsOnMethods={"RedaktörerAntologiOpenAccessLänkExternLänkFörPublicering"})
	public void RedaktörerAntologiOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"RedaktörerAntologiOpenAccessFormAvOA"})
	public void RedaktörerAntologiOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
	}

	@Test (dependsOnMethods={"RedaktörerAntologiOpenAccessDokumentVersion"})
	public void RedaktörerAntologiOpenAcessSammanfattning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys("Jag skriver en riktigt bra sammanfattning");
	}

	 */

	@Test (dependsOnMethods={"InfoUtgivare"})
	public void InfoOpenAccess() {

		GemensammaMetoder.OpenAccess(driver);
	}

	@Test (dependsOnMethods = {"InfoOpenAccess"})
	public void Spara() {
		GemensammaMetoder.Spara(driver);
	}
	//	@Test (dependsOnMethods={"RedaktörerAntologiOpenAcessSammanfattning"})
	//	public void RedaktörerAntologiSpara() {
	//
	//		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
	//
	//		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
	//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
	//		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();


}


