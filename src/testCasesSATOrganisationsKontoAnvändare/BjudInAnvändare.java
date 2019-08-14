package testCasesSATOrganisationsKontoAnvändare;

import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import pageElementsSAT.PortalLoggedInAsUserGranskning;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class BjudInAnvändare extends BeforeAfterTestBrowsers {

	@BeforeClass 	
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in och skickar en inbjudan till en användare. Efter genomfört test så raderas även posten i PP.";
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

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Förnamn()), "Förnamn"); 
	}


	@Test (dependsOnMethods={"BjudInAnvändareButtonFörnamn"})
	public void BjudInAnvändareButtonEfternamn() {

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Efternamn()), "Efternamn"); 
	}


	@Test (dependsOnMethods={"BjudInAnvändareButtonEfternamn"})
	public void BjudInAnvändareButtonEmail() {

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Email()), "email1@vr.se"); 
	}

	@Test (dependsOnMethods={"BjudInAnvändareButtonEmail"})
	public void BjudInAnvändareButtonRoll() {

		Select ResponsibilityType = driverSelect.DropDown(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Roll());

		Random randomOption = new Random();  
		int endOption = ResponsibilityType.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		ResponsibilityType.selectByIndex(number);
	}

	@Test (dependsOnMethods={"BjudInAnvändareButtonRoll"})
	public void ClickAnvändareButtonSkicka() {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Skicka()).click();	
	}


	@Test (dependsOnMethods={"ClickAnvändareButtonSkicka"})
	public void AccepteraAlert() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				By.xpath("//button[contains(text(), 'Ok')]"));

		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

	@Test (dependsOnMethods={"AccepteraAlert"})
	public void CheckThatInvitationIsSent()  {

		if (driver.getPageSource().contains("Inbjudan skickad") || driver.getPageSource().contains("Invitation sent"))  
		{

		}
		else
		{
			Assert.fail();
		}
	} 	

	@Test (dependsOnMethods={"CheckThatInvitationIsSent"})
	public void ClickCheckBox() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Checkbox_Radera());

		WebElement test = driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Checkbox_Radera()); ((JavascriptExecutor) driver).executeScript("arguments[0].click();", test);
	}

	@Test (dependsOnMethods={"ClickCheckBox"})
	public void ClickTaBortButton() {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Ta_Bort()).click();

		driver.switchTo().alert().accept();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));

		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}


