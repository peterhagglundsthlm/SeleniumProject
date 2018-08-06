package testCasesSATMinProfilUtbildning;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class UtbildningForskarUtbildningAddForskningskompetensMotsvarandeDoktorsexamen extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Forskningskompetens Motsvarande Doktorsexamen";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();

	}


	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickUtbildning() {


		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning(driver).click();

	}


	@Test (dependsOnMethods={"ClickUtbildning"})
	public void ClickForskarUtbildning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning(driver).click();
	}


	@Test (dependsOnMethods={"ClickForskarUtbildning"})
	public void AddForskarUtbildning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning(driver).click();
	}


	@Test (dependsOnMethods={"AddForskarUtbildning"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SparaSöktOrganisationKnapp(driver).click();
		
		String NamnPåUniversitet = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation(driver).getAttribute("value");
		System.out.println("Namn På Universitet = " + NamnPåUniversitet); 

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void TypAvForskarUtbildningAddForskningskompetensMotsvarandeDoktorsexamen() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning));
		driver.findElement(By.id("Type")).click();

		Select typ = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning)));
		typ.selectByVisibleText("Forskningskompetens motsvarande Doktorsexamen");
		
		WebElement Typ1 = typ.getFirstSelectedOption();
		String Value = Typ1.getText();
		System.out.println("Typ = " + Value ); 
	}


	@Test (dependsOnMethods={"TypAvForskarUtbildningAddForskningskompetensMotsvarandeDoktorsexamen"})
	public void Examensdatum() {


		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumNärForskningskompetensUppnåtts(driver).sendKeys("2018-05-15");
		
		String Datumförnärforskningskompetensuppnåtts = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumNärForskningskompetensUppnåtts(driver).getAttribute("value");
		System.out.println("Datum för när forskningskompetens uppnåtts  = " + Datumförnärforskningskompetensuppnåtts); 

	}

	@Test (dependsOnMethods={"Examensdatum"})
	public void TypAvForskarUtbildningSelectSubjects() throws InterruptedException {

		//VÄLJER SLUMPMÄSSIGT I FÖRSTA DROPDOWN
		Select ämne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne1DropDownForskarUtbildning)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = ämne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		ämne1.selectByIndex(number);
		
		WebElement ämneEtt = ämne1.getFirstSelectedOption();
		String Value1 = ämneEtt.getText();
		System.out.println("Ämne 1 = " + Value1 ); 
		
		
		//VÄLJER SLUMPMÄSSIGT I ANDRA DROPDOWN
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne2DropDownForskarUtbildning));
		Select ämne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne2DropDownForskarUtbildning)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = ämne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		ämne2.selectByIndex(number2);
		
		WebElement ämneTvå = ämne2.getFirstSelectedOption();
		String Value2 = ämneTvå.getText();
		System.out.println("Ämne 2 = " + Value2 ); 
		
		
		//VÄLJER SLUMPMÄSSIGT I TREDJE DROPDOWN
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne3DropDownForskarUtbildning));
		Select ämne3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne3DropDownForskarUtbildning)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = ämne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		ämne3.selectByIndex(number3);
		
		WebElement ämneTre = ämne3.getFirstSelectedOption();
		String Value3 = ämneTre.getText();
		System.out.println("Ämne 3 = " + Value3 );
	}

	@Test (dependsOnMethods={"TypAvForskarUtbildningSelectSubjects"})
	public void BeskrivningAvKompetensSvenska() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensSV(driver).sendKeys("TestSvenska");

		String BeskrivningAvKompetensSvenska = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensSV(driver).getAttribute("value");
		System.out.println("Beskrivning Av Kompetens Svenska  = " + BeskrivningAvKompetensSvenska);
	}

	@Test (dependsOnMethods={"BeskrivningAvKompetensSvenska"})
	public void BeskrivningAvKompetensEngelska() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensEN(driver).sendKeys("TestEngelska");

		String BeskrivningAvKompetensEngelska = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensEN(driver).getAttribute("value");
		System.out.println("Beskrivning Av Kompetens Engelska  = " + BeskrivningAvKompetensEngelska);


	}
}