package testCasesSATMinProfilUtbildning;


import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class UtbildningForskarUtbildningAddLicentiatexamen extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Licentiatexamen";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

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

//		System.out.println("Organisation = " + universitet);

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void TypAvForskarUtbildningAddLicentiatexamen() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning));
		driver.findElement(By.id("Type")).click();

		Select typ = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning)));
		
		if (driver.getPageSource().contains("Forskarutbildning"))  
		{
			typ.selectByVisibleText("Licentiatexamen");
		}
		if (driver.getPageSource().contains("Research education"))
		{
			typ.selectByVisibleText("Licentiate degree");
		}

//		WebElement TypAvExamen = typ.getFirstSelectedOption();
//		String Value = TypAvExamen.getText();
//		System.out.println("Typ av examen = " + Value);
	}


	@Test (dependsOnMethods={"TypAvForskarUtbildningAddLicentiatexamen"})
	public void Examensdatum() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum(driver).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumÅrDropdown));

		Select År = new Select (driver.findElement(By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumÅrDropdown)));
		Random randomÅr = new Random();  
		int endOption = År.getOptions().size(); 
		int numberÅr = randomÅr .nextInt(endOption);  
		År.selectByIndex(numberÅr);

		Select Månad = new Select (driver.findElement(By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumMånadDropdown)));
		Random randomMånad = new Random();  
		int endOptionMånad = Månad.getOptions().size(); 
		int numberMånad = randomMånad .nextInt(endOptionMånad);  
		Månad.selectByIndex(numberMånad);

		int RandomDatum = 1 + (int)(Math.random() * 28); 
		String Datum = Integer.toString(RandomDatum);
		driver.findElement(By.linkText(Datum)).click();

//		String Examensdatum = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum(driver).getAttribute("value");
//		System.out.println("Datum för examen = " + Examensdatum);

	}

	@Test (dependsOnMethods={"TypAvForskarUtbildningAddLicentiatexamen"})
	public void TypAvForskarUtbildningSelectSubjects() {

		//VÄLJER SLUMPMÄSSIGT I FÖRSTA DROPDOWN
		Select ämne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne1DropDownForskarUtbildning)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = ämne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		ämne1.selectByIndex(number);

//		WebElement FörstÄmne = ämne1.getFirstSelectedOption();
//		String ValueÄmne1 = FörstÄmne.getText();
//		System.out.println("Ämne 1 = " + ValueÄmne1);

		//VÄLJER SLUMPMÄSSIGT I ANDRA DROPDOWN
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne2DropDownForskarUtbildning));
		Select ämne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne2DropDownForskarUtbildning)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = ämne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		ämne2.selectByIndex(number2);

//		WebElement AndraÄmne = ämne2.getFirstSelectedOption();
//		String ValueÄmne2 = AndraÄmne.getText();
//		System.out.println("Ämne 2 = " + ValueÄmne2);

		//VÄLJER SLUMPMÄSSIGT I TREDJE DROPDOWN
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne3DropDownForskarUtbildning));
		Select ämne3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne3DropDownForskarUtbildning)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = ämne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		ämne3.selectByIndex(number3);

//		WebElement TredjeÄmne = ämne3.getFirstSelectedOption();
//		String ValueÄmne3 = TredjeÄmne.getText();
//		System.out.println("Ämne 3 = " + ValueÄmne3);
	}


	@Test (dependsOnMethods={"TypAvForskarUtbildningSelectSubjects"})
	public void WriteAvhandlingensTitelOrginalSpråk() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelOrginalspråk(driver).sendKeys("Test av avhandling");
		
//		String Orginalspråk = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelOrginalspråk(driver).getAttribute("value");
//		System.out.println("Avhandlingens titel på orginalspråk är = " + Orginalspråk);

	}

	@Test (dependsOnMethods={"WriteAvhandlingensTitelOrginalSpråk"})
	public void WriteAvhandlingensTitelEngelska() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelEngelska(driver).sendKeys("Test Dissertation title");
		
//		String Engelska = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelEngelska(driver).getAttribute("value");
//		System.out.println("Avhandlingens titel på engelska är = " + Engelska);

	}


	@Test (dependsOnMethods={"WriteAvhandlingensTitelEngelska"})
	public void ISSNISBNNummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_IssIsBnNummer(driver).sendKeys("12345678");
		
//		String ISBN = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_IssIsBnNummer(driver).getAttribute("value");
//		System.out.println("ISBN-Nummer är = " + ISBN);

	}

	@Test (dependsOnMethods={"ISSNISBNNummer"})
	public void FörnamnHandledare() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_FörnamnHandledare(driver).sendKeys("Per");
		
//		String FörnamnHandledare = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_FörnamnHandledare(driver).getAttribute("value");
//		System.out.println("Handledarens förnamn är = " + FörnamnHandledare);

	}

	@Test (dependsOnMethods={"FörnamnHandledare"})
	public void EfternamnHandledare() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_EfternamnHandledare(driver).sendKeys("Persson");
		
//		String EfternamnHandledare = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_EfternamnHandledare(driver).getAttribute("value");
//		System.out.println("Handledarens efternamn är = " + EfternamnHandledare);

	}

	@Test (dependsOnMethods={"EfternamnHandledare"})
	public void SparaForskarutbildningKnapp() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SparaForskarUtbildningButton(driver).click();
	}


}
