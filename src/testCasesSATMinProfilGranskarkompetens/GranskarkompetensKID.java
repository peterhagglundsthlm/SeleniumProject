package testCasesSATMinProfilGranskarkompetens;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.RandomDropDownOptionSelect;
import reusableMethods.driverSelect;


public class GranskarkompetensKID extends BeforeAfterTestSetup {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och väljer slumpmässiga värden i KID dropdowns under granskarkompetens";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickGranskarkompetens() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Granskarkompetens());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Granskarkompetens()).click();
	}

	@Test (dependsOnMethods={"ClickGranskarkompetens"})
	public void Forskningsområde1() {
		
		Select Forskningsområde1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsområde1());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Forskningsområde1, 1, 0);
	}

	@Test (dependsOnMethods={"Forskningsområde1"})
	public void Forskningsområde2() {
		
		Select Forskningsområde2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsområde2());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Forskningsområde2, 1, 0);

	}

	@Test (dependsOnMethods={"Forskningsområde2"})
	public void Forskningsområde3() {

		Select Forskningsområde3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsområde3());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Forskningsområde3, 1, 0);

	}

	@Test (dependsOnMethods={"Forskningsområde3"})
	public void Forskningsområde4() {

		Select Forskningsområde4 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsområde4());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Forskningsområde4, 1, 0);
	
	}

	@Test (dependsOnMethods={"Forskningsområde4"})
	public void Forskningsområde5() {

		Select Forskningsområde5 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDForskningsområde5());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Forskningsområde5, 1, 0);
		
	}

	@Test (dependsOnMethods={"Forskningsområde5"})
	public void Metod1() {

		Select Metod1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod1());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Metod1, 1, 0);
	
	}

	@Test (dependsOnMethods={"Metod1"})
	public void Metod2() {

		Select Metod2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod2());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Metod2, 1, 0);
	
	}

	@Test (dependsOnMethods={"Metod2"})
	public void Metod3() {

		Select Metod3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod3());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Metod3, 1, 0);
		
	}

	@Test (dependsOnMethods={"Metod3"})
	public void Metod4() {

		Select Metod4 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod4());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Metod4, 1, 0);
	
	}

	@Test (dependsOnMethods={"Metod4"})
	public void Metod5() {

		Select Metod5 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDMetod5());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Metod5, 1, 0);
	
	}

	@Test (dependsOnMethods={"Metod5"})
	public void Nyckelord1() {

		Select Nyckelord1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord1());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Nyckelord1, 1, 0);
	
	}

	@Test (dependsOnMethods={"Nyckelord1"})
	public void Nyckelord2() {

		Select Nyckelord2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord2());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Nyckelord2, 1, 0);

	}

	@Test (dependsOnMethods={"Nyckelord2"})
	public void Nyckelord3() {

		Select Nyckelord3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord3());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Nyckelord3, 1, 0);
		
	}

	@Test (dependsOnMethods={"Nyckelord3"})
	public void Nyckelord4() {

		Select Nyckelord4 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord4());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Nyckelord4, 1, 0);
		
	}

	@Test (dependsOnMethods={"Nyckelord4"})
	public void Nyckelord5() {

		Select Nyckelord5 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDNyckelord5());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Nyckelord5, 1, 0);
	
	}

	@Test (dependsOnMethods={"Nyckelord5"})
	public void Spara() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_GranskarkompetensKIDSpara()).click();
	}

	@Test (dependsOnMethods={"Spara"})
	public void ConfirmSave() {

		driver.switchTo().alert().accept();
	}


}