package testCasesSATOrganisationsKontoAnvändare;

import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class BjudInAnvändareNegativtTest extends BeforeAfterTestBrowsers{


	@BeforeClass
	public void beforeClass() {

		String TestCaseInfo = "Loggar in och försöker skicka en inbjudan till en användare. Utelämnar dock samtliga fält och ska då få felmeddelanden.";
	}

	@Test
	public void CheckForOrganisationButton() {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto()).click();
	}

	@Test (dependsOnMethods={"CheckForOrganisationButton"})
	public void ClickAnvändareButton() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare());

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare()).click();
	}

	@Test (dependsOnMethods={"ClickAnvändareButton"})
	public void BjudInAnvändareButton() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In());

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In()).click();
	}

	@Test (dependsOnMethods={"BjudInAnvändareButton"})
	public void BjudInAnvändareButtonFörnamn() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Förnamn());

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				driver.findElement(
						PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Förnamn()), ""); 
	}

	@Test (dependsOnMethods={"BjudInAnvändareButtonFörnamn"})
	public void BjudInAnvändareButtonEfternamn() {

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				driver.findElement(
						PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Efternamn()), ""); 
	}

	@Test (dependsOnMethods={"BjudInAnvändareButtonEfternamn"})
	public void BjudInAnvändareButtonEmail() {

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				driver.findElement(
						PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Email()), ""); 
	}

	@Test (dependsOnMethods={"BjudInAnvändareButtonEmail"})
	public void ClickAnvändareButtonSkicka() {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Skicka()).click();	
	}

	@Test (dependsOnMethods={"ClickAnvändareButtonSkicka"})
	public void CheckErrorMessages()  {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector("#FormId > div:nth-child(1) > div:nth-child(1) > div > span > span"));

		if (driver.getPageSource().contains("'Förnamn' krävs") && 
				(driver.getPageSource().contains("'Efternamn' krävs")) && 
				(driver.getPageSource().contains("'E-postadress' krävs"))) {
		} else if (driver.getPageSource().contains("'First name' is required") && 
				(driver.getPageSource().contains("'Last name' is required")) && 
				(driver.getPageSource().contains("'E-mail' is required"))) {
		} else {
			org.testng.Assert.fail();
		}
	}
}


