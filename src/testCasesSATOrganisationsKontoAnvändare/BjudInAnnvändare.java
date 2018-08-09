package testCasesSATOrganisationsKontoAnvändare;

import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class BjudInAnnvändare extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Anställning UTAN att kopiera redan tillagd post.";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	  
	}

	@Test
	public void CheckForOrganisationButton() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto(driver).click();
	}


	@Test (dependsOnMethods={"CheckForOrganisationButton"})
	public void ClickAnvändareButton() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare(driver).click();
	}


	@Test (dependsOnMethods={"ClickAnvändareButton"})
	public void BjudInAnvändareButton() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In(driver).click();
	}


	@Test (dependsOnMethods={"BjudInAnvändareButton"})
	public void BjudInAnvändareButtonFörnamn() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Förnamn(driver).sendKeys("Förnamn");

		String BjudInAnvändareButtonFörnamn = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Förnamn(driver).getAttribute("value");
		System.out.println("Förnamn = " + BjudInAnvändareButtonFörnamn); 
	}

	@Test (dependsOnMethods={"BjudInAnvändareButtonFörnamn"})
	public void BjudInAnvändareButtonEfternamn() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Efternamn(driver).sendKeys("Efternamn");

		String BjudInAnvändareButtonEfternamn = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Efternamn(driver).getAttribute("value");
		System.out.println("Efternamn = " + BjudInAnvändareButtonEfternamn);

	}

	@Test (dependsOnMethods={"BjudInAnvändareButtonEfternamn"})
	public void BjudInAnvändareButtonEmail() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Email(driver).sendKeys("email1@vr.se");

		String BjudInAnvändareButtonEmail = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Email(driver).getAttribute("value");
		System.out.println("Email = " + BjudInAnvändareButtonEmail);
	}


	@Test (dependsOnMethods={"BjudInAnvändareButtonEmail"})
	public void BjudInAnvändareButtonRoll() {

		Select ResponsibilityType = new Select (driver.findElement(By.id(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Roll)));
		Random randomOption = new Random();  
		int endOption = ResponsibilityType.getOptions().size(); 
		int number = randomOption .nextInt(endOption );  
		ResponsibilityType.selectByIndex(number);
	}


	@Test (dependsOnMethods={"BjudInAnvändareButtonRoll"})
	public void ClickAnvändareButtonSkicka() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Skicka(driver).click();
	}


	@Test (dependsOnMethods={"ClickAnvändareButtonSkicka"})
	public void AccepteraAlert() {

		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}


	@Test (dependsOnMethods={"AccepteraAlert"})
	public void CheckThatInvitationIsSent()  {

		if (driver.getPageSource().contains("Inbjudan skickad"))
		{ 
			System.out.println("Testet lyckats");

		} else {
			System.out.println("Testet misslyckats");
			Assert.fail();
			
		}
	}

	@Test (dependsOnMethods={"CheckThatInvitationIsSent"})
	public void ClickCheckBox() {

		WebElement test = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Checkbox_Radera(driver);


		((JavascriptExecutor) driver).executeScript("arguments[0].click();", test);

	}

	@Test (dependsOnMethods={"ClickCheckBox"})
	public void ClickTaBortButton() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Ta_Bort));
		
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Ta_Bort(driver).click();
	
		driver.switchTo().alert().accept();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}


