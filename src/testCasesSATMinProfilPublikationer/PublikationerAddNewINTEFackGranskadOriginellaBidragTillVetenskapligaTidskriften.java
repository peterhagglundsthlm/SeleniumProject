package testCasesSATMinProfilPublikationer;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class PublikationerAddNewINTEFackGranskadOriginellaBidragTillVetenskapligaTidskriften extends BeforeAfterTestBrowsers {
	
	@BeforeTest
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och lägger till en INTE fackgranskad Originella bidrag till vetenskapliga tidskriften";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}
	
	@Test
	public void LoginAsUser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
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

	@Test (dependsOnMethods={"LäggTillPublikationer"})
	public void VäljPublikationsTyp() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp)));
		Publikationstyp.selectByIndex(2);
	}

	@Test (dependsOnMethods={"VäljPublikationsTyp"})
	public void DropDownOriginellaBidragTillVetenskapligaTidskriften() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown)));
		Publikationstyp.selectByIndex(3);
	}

	@Test (dependsOnMethods={"DropDownOriginellaBidragTillVetenskapligaTidskriften"})
	public void OriginellaBidragTillVetenskapligaTidskriftenFörfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp(driver).click();
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenFörfattareKnapp"})
	public void OriginellaBidragTillVetenskapligaTidskriftenTitel() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys("TestTitel123");

	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenTitel"})
	public void OriginellaBidragTillVetenskapligaTidskriftenFörfattareFörnamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).sendKeys("Förnamn");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenFörfattareFörnamn"})
	public void OriginellaBidragTillVetenskapligaTidskriftenFörfattareEfternamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).sendKeys("Efternamn");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenFörfattareEfternamn"})
	public void OriginellaBidragTillVetenskapligaTidskriftenNamnPåTidskrift() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnPåTidskrift(driver).sendKeys("Tidsskrift");
	}
	
	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenNamnPåTidskrift"})
	public void OriginellaBidragTillVetenskapligaTidskriftenVolym() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym(driver).sendKeys("10");
	}
	
	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenVolym"})
	public void OriginellaBidragTillVetenskapligaTidskriftenUtfärdandenummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtfärdandenummer(driver).sendKeys("287");
	}
	
	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenUtfärdandenummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenFörstaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer(driver).sendKeys("1");
	}
	
	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenFörstaSidnummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenSistaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).sendKeys("99");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenSistaSidnummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenDOI() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys("123456");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenDOI"})
	public void OriginellaBidragTillVetenskapligaTidskriftenKällaFörPublikation() {

		Select KällaFörPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = KällaFörPublikation.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		KällaFörPublikation.selectByIndex(number);
	}
	
	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenKällaFörPublikation"})
	public void OriginellaBidragTillVetenskapligaTidskriftenStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus)));
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenStatus"})
	public void OriginellaBidragTillVetenskapligaTidskriftenKällaID() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).sendKeys("1234");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenKällaID"})
	public void OriginellaBidragTillVetenskapligaTidskriftenVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenVarTextenPubliceradIOpenAcessJa"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAccessLänkExternLänkFörPublicering() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).sendKeys("Testlänk");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAccessLänkExternLänkFörPublicering"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAccessFormAvOA"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAccessDokumentVersion"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAcessSammanfattning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys("Jag skriver en riktigt bra sammanfattning");
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAcessSammanfattning"})
	public void OriginellaBidragTillVetenskapligaTidskriftenSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath( "//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}
