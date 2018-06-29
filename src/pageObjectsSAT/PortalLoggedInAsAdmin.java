package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoggedInAsAdmin {
	private static WebElement element = null;

	//MIN PROFIL
	public static final String MinProfilButton_Xpath = "/html/body/div[5]/div[2]/div[2]/header/ul/li[1]/a"; {
	}
	public static WebElement MinProfilButton_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/ul/li[1]/a"));
		return element;
	}

	//MIN PROFIL - INSTÄLLNINGAR
	public static final String MinProfilButton_Inställningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement MinProfilButton_Inställningar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//MIN PROFIL - SWAMID-KONTO
	public static final String MinProfilButton_SWAMID_KONTO_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement MinProfilButton_SWAMID_KONTO_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//INTRESSENTREGISTER
	public static final String IntressentregisterButton_Xpath = "/html/body/div[5]/div[2]/div[2]/header/ul/li[2]/a"; {
	}
	public static WebElement IntressentregisterButton_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/ul/li[2]/a"));
		return element;
	}

	//INTRESSENTREGISTER - PERSONKONTO
	public static final String IntressentregisterButton_Personkonto_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement IntressentregisterButton_Personkonto_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//INTRESSENTREGISTER - ORGANISATIONSKONTO
	public static final String IntressentregisterButton_Organisationskonto_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement IntressentregisterButton_Organisationskonto_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//INTRESSENTREGISTER - ORGANISATIONSANSÖKNINGAR
	public static final String IntressentregisterButton_OrganisationsAnsökningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"; {
	}
	public static WebElement IntressentregisterButton_OrganisationsAnsökningar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"));
		return element;
	}

	//INTRESSENTREGISTER - BEREDNINGSGRUPPSMEDLEMMAR
	public static final String IntressentregisterButton_Beredningsgruppsmedlemmar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"; {
	}
	public static WebElement IntressentregisterButton_Beredningsgruppsmedlemmar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"));
		return element;
	}

	//INTRESSENTREGISTER - GRANSKARPOOL
	public static final String IntressentregisterButton_Granskarpool_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"; {
	}
	public static WebElement IntressentregisterButton_Granskarpool_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"));
		return element;
	}

	//INTRESSENTREGISTER - ARBETSGIVARE
	public static final String IntressentregisterButton_Arbetsgivare_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"; {
	}
	public static WebElement IntressentregisterButton_Arbetsgivare_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"));
		return element;
	}

	//BEREDNINGSGRUPPER
	public static final String BeredningsgrupperButton_Xpath = "/html/body/div[5]/div[2]/div[2]/header/ul/li[3]/a"; {
	}
	public static WebElement BeredningsgrupperButton_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/ul/li[3]/a"));
		return element;
	}

	//BEREDNINGSGRUPPER - ADMINISTRERA BEREDNINGSGRUPPER
	public static final String BeredningsgrupperButton_AdministreraBeredningsgrupper_Xpath = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a"; {
	}
	public static WebElement BeredningsgrupperButton_AdministreraBeredningsgrupper_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a"));
		return element;
	}

	//BEREDNINGSGRUPPER - BEREDNINGSGRUPPER
	public static final String BeredningsgrupperButton_Beredningsgrupper_Xpath = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a"; {
	}
	public static WebElement BeredningsgrupperButton_Beredningsgrupper_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a"));
		return element;
	}

	//BEREDNINGSGRUPPER - ARVODESHANTERING
	public static final String BeredningsgrupperButton_Arvodeshantering_Xpath = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a"; {
	}
	public static WebElement BeredningsgrupperButton_Arvodeshantering_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a"));
		return element;
	}

	//FORMULÄR
	public static final String FormulärButton_Xpath = "/html/body/div[5]/div[2]/div[2]/header/ul/li[6]/a"; {
	}
	public static WebElement FormulärButton_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/ul/li[6]/a"));
		return element;
	}

	//FINANSIÄR
	public static final String FinansiärButton_Xpath = "/html/body/div[5]/div[2]/div[2]/header/ul/li[5]/a"; {
	}
	public static WebElement FinansiärButton_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/ul/li[5]/a"));
		return element;
	}

	//PORTALADMINISTRATION
	public static final String PortaladministrationButton_Xpath = "/html/body/div[5]/div[2]/div[2]/header/ul/li[4]/a"; {
	}
	public static WebElement PortaladministrationButton_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/ul/li[4]/a"));
		return element;
	}

	//LOGGA UT
	public static final String LoggaUt_Xpath = "/html/body/div[5]/div[2]/div[2]/header/div/a"; {
	}
	public static WebElement LoggaUt_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/div/a"));
		return element;
	}



}




