package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsOrgUserOrganisationskonto {
	private static WebElement element = null;

	//ORGANISATIONSKONTO - KNAPPEN
	public static final String Organisationskonto_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuOrganizationAdmin.pull-right"; {
	}
	public static WebElement Organisationskonto_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuOrganizationAdmin.pull-right"));
		return element;
	}
	//ORGANISATIONSKONTO - INSTÄLLNINGAR
	public static final String Organisationskonto_Inställningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement Organisationskonto_Inställningar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}
	//ORGANISATIONSKONTO - ANSÖKNINGAR OCH BIDRAG
	public static final String Organisationskonto_AnsökningarOchBidrag_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement Organisationskonto_AnsökningarOchBidrag_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - NEDLADDNING
	public static final String Organisationskonto_Nedladdning_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"; {
	}
	public static WebElement Organisationskonto_Nedladdning_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR
	public static final String Organisationskonto_Struktur_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"; {
	}
	public static WebElement Organisationskonto_Struktur_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - ANVÄNDARE
	public static final String Organisationskonto_Användare_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"; {
	}
	public static WebElement Organisationskonto_Användare_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - BYT HEMVIST
	public static final String Organisationskonto_Byt_Hemvist_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"; {
	}
	public static WebElement Organisationskonto_Byt_Hemvist_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - FÖRESLAGEN HEMVIST
	public static final String Organisationskonto_Föreslagen_Hemvist_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a"; {
	}
	public static WebElement Organisationskonto_Föreslagen_Hemvist_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - RAPPORTERINGSÖVERSIKT
	public static final String Organisationskonto_Rapporteringsöversikt_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[8]/div/a"; {
	}
	public static WebElement Organisationskonto_Rapporteringsöversikt_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[8]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - RAPPORTERINGSSTRUKTUR
	public static final String Organisationskonto_Rapporteringsstruktur_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[9]/div/a"; {
	}
	public static WebElement Organisationskonto_Rapporteringsstruktur_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[9]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - SIGNERINGSÖVERSIKT
	public static final String Organisationskonto_Signeringsöversikt_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[10]/div/a"; {
	}
	public static WebElement Organisationskonto_Signeringsöversikt_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[10]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - SIGNERINGSSTRUKTUR
	public static final String Organisationskonto_Signeringsstruktur_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[11]/div/a"; {
	}
	public static WebElement Organisationskonto_Signeringsstruktur_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[11]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - ORGANISATIONSUTLYSNINGAR
	public static final String Organisationskonto_Organisationsutlysningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[12]/div/a"; {
	}
	public static WebElement Organisationskonto_Organisationsutlysningar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[12]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - ORGANISATIONSANSÖKNINGAR
	public static final String Organisationskonto_Organisationsansökningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[13]/div/a"; {
	}
	public static WebElement Organisationskonto_Organisationsansökningar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[13]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - UTBETALNINGAR
	public static final String Organisationskonto_Utbetalningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[14]/div/a"; {
	}
	public static WebElement Organisationskonto_Utbetalningar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[14]/div/a"));
		return element;
	}


}
