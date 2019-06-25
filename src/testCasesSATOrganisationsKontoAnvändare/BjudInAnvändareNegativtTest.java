package testCasesSATOrganisationsKontoAnvändare;

import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class BjudInAnvändareNegativtTest extends BeforeAfterTestBrowsers{
	String valueEmail;

	@BeforeClass
	public void beforeClass() {

		String TestCaseInfo = "Loggar in och försöker skicka en inbjudan till en användare. Utelämnar dock samtliga fält och ska då få felmeddelanden.";
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
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Förnamn(driver), ""); 
	}


	@Test (dependsOnMethods={"BjudInAnvändareButtonFörnamn"})
	public void BjudInAnvändareButtonEfternamn() {
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Efternamn(driver), ""); 
	}


	@Test (dependsOnMethods={"BjudInAnvändareButtonEfternamn"})
	public void BjudInAnvändareButtonEmail() {
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Bjud_In_Email(driver), ""); 
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

	//DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector("#FormId > div:nth-child(1) > div:nth-child(1) > div > span > span")) != null)

	@Test (dependsOnMethods={"ClickAnvändareButtonSkicka"})
	public void CheckErrorMessagesFörnamn()  {


		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector("#FormId > div:nth-child(1) > div:nth-child(1) > div > span > span"));
		if (driver.getPageSource().contains("Bjud in användare"))
		{
			//String valueFörnamn= driver.findElement(By.xpath("//*[@id=\"FormId\"]/div[1]/div[1]/div/span/span")).getText();
			//System.out.println("Felmeddelande på Svenska  "+valueFörnamn + " visas korrekt");
		}

		else if (driver.getPageSource().contains("Invite user"))
		{
			//String valueFörnamn= driver.findElement(By.xpath("//*[@id=\"FormId\"]/div[1]/div[1]/div/span/span")).getText();
			//System.out.println("Felmeddelande på Engelska  "+valueFörnamn + " visas korrekt");

		}
	}


	@Test (dependsOnMethods={"CheckErrorMessagesFörnamn"})
	public void CheckErrorMessagesEfternamn()  {


		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector("#FormId > div:nth-child(1) > div:nth-child(1) > div > span > span"));
		if (driver.getPageSource().contains("Bjud in användare"))
		{
			//String valueEfternamn= driver.findElement(By.xpath("//*[@id=\"FormId\"]/div[1]/div[1]/div/span/span")).getText();
			//System.out.println("Felmeddelande på Svenska  "+valueEfternamn + " visas korrekt");
		}

		else if (driver.getPageSource().contains("Invite user"))
		{
			//String valueEfternamn= driver.findElement(By.xpath("//*[@id=\"FormId\"]/div[1]/div[1]/div/span/span")).getText();
			//System.out.println("Felmeddelande på Engelska  "+valueEfternamn + " visas korrekt");

		}
	}


	@Test (dependsOnMethods={"CheckErrorMessagesEfternamn"})
	public void CheckErrorMessagesEpost()  {


		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector("#FormId > div:nth-child(1) > div:nth-child(1) > div > span > span"));
		if (driver.getPageSource().contains("Bjud in användare"))
		{
//			String valueEpost= driver.findElement(By.xpath("//*[@id=\"FormId\"]/div[1]/div[1]/div/span/span")).getText();
//			System.out.println("Felmeddelande på Svenska  "+valueEpost + " visas korrekt");
		}

		else if (driver.getPageSource().contains("Invite user"))
		{
//			String valueEpost= driver.findElement(By.xpath("//*[@id=\"FormId\"]/div[1]/div[1]/div/span/span")).getText();
//			System.out.println("Felmeddelande på Engelska  "+valueEpost + " visas korrekt");

		}
	}

}


