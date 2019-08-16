package testCasesSATMinProfilUtbildning;

import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.RandomDropDownOptionSelect;
import reusableMethods.SearchForOrganizationWhenButtonIdIsUnique;
import reusableMethods.driverSelect;

public class UtbildningAddUtbildningPåGrundOchAvanceradNivå extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Utbildning på grund- och avancerad nivå";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickUtbildning() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning()).click();
	}

	@Test (dependsOnMethods={"ClickUtbildning"})
	public void ClickUtbildningPåGrundOchAvanceradNivå() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivå());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivå()).click();
	}

	@Test (dependsOnMethods={"ClickUtbildningPåGrundOchAvanceradNivå"})
	public void UtbildningPåGrundOchAvanceradNivåAdd() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillUtbildningPåGrundOchAvanceradNivå());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillUtbildningPåGrundOchAvanceradNivå()).click();
	}

	@Test (dependsOnMethods={"UtbildningPåGrundOchAvanceradNivåAdd"})
	public void SelectOrganization() throws InterruptedException {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation());
		
		SearchForOrganizationWhenButtonIdIsUnique.EnterKeyInputs(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation(), "Uppsala Universitet");

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void ÅrFörExamen() {

		Select år = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_UtbildningPåGrundOchAvanceradNivåÅrFörExamen());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(år, 0, 0);
		
	}

	@Test (dependsOnMethods={"ÅrFörExamen"})
	public void ExamensinriktningSelectSubjects() {

		Select ämne1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne1UtbildningPåGrundOchAvanceradNivå());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne1, 1, 0);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne2UtbildningPåGrundOchAvanceradNivå());
		
		Select ämne2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne2UtbildningPåGrundOchAvanceradNivå());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne2, 1, 0);
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne3UtbildningPåGrundOchAvanceradNivå());
		
		Select ämne3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne3UtbildningPåGrundOchAvanceradNivå());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne3, 1, 0);
		
	}

	@Test (dependsOnMethods={"ExamensinriktningSelectSubjects"})
	public void Examen() {

		Select TypAvExamen = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåExamen());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(TypAvExamen, 2, 0);
		
	}

	@Test (dependsOnMethods={"Examen"})
	public void Specialistkompetens() {

		Select Specialistkompetens = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetens());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Specialistkompetens, 1, 0);
		
	}

	@Test (dependsOnMethods={"Specialistkompetens"})
	public void SpecialistkompetensÅr() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetensÅR());

		Select SpecialistkompetensÅr = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetensÅR());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(SpecialistkompetensÅr, 1, 0);

	}

	@Test (dependsOnMethods={"SpecialistkompetensÅr"})
	public void OmrådeBeskrivning() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåOmrådeBeskrivning()).sendKeys("Test123");
	}

	@Test (dependsOnMethods={"SpecialistkompetensÅr"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSparaKnapp()).click();
	}
}
