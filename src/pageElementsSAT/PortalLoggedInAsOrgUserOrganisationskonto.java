package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsOrgUserOrganisationskonto {
	private static WebElement element = null;

	//ORGANISATIONSKONTO - KNAPPEN
	public static final String Organisationskonto = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuOrganizationAdmin.pull-right"; {
	}
	public static WebElement Organisationskonto(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuOrganizationAdmin.pull-right"));
		return element;
	}
	//ORGANISATIONSKONTO - INSTÄLLNINGAR
	public static final String Organisationskonto_Inställningar = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement Organisationskonto_Inställningar(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}
	//ORGANISATIONSKONTO - ANSÖKNINGAR OCH BIDRAG
	public static final String Organisationskonto_AnsökningarOchBidrag = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement Organisationskonto_AnsökningarOchBidrag(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - NEDLADDNING
	public static final String Organisationskonto_Nedladdning = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"; {
	}
	public static WebElement Organisationskonto_Nedladdning(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR
	public static final String Organisationskonto_Struktur = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"; {
	}
	public static WebElement Organisationskonto_Struktur(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA HÖGSTA NIVÅN
	public static final String Organisationskonto_Struktur_RedigeraHögstaNivån = "#contentBody > section > div.content > form > div > div > div > ul > li > div > div.span5 > div > div > a"; {
	}
	public static WebElement Organisationskonto_Struktur_RedigeraHögstaNivån(WebDriver driver){

		element = driver.findElement(By.cssSelector("#contentBody > section > div.content > form > div > div > div > ul > li > div > div.span5 > div > div > a"));
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA HÖGSTA NIVÅN - SVENSKT NAMN
	public static final String Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet = "OrganizationStructure_Name"; {
	}
	public static WebElement Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet(WebDriver driver){

		element = driver.findElement(By.id("OrganizationStructure_Name"));
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA HÖGSTA NIVÅN - ENGELSKT NAMN
	public static final String Organisationskonto_Struktur_RedigeraHögstaNivånEngelsktNamnPåNyEnhet = "OrganizationStructure_NameEN"; {
	}
	public static WebElement Organisationskonto_Struktur_RedigeraHögstaNivånEngelsktNamnPåNyEnhet(WebDriver driver){

		element = driver.findElement(By.id("OrganizationStructure_NameEN"));
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA HÖGSTA NIVÅN - LÄGG TILL (KNAPP)
	public static final String Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetKnapp = "#editDialogBodyFormId > div.row-fluid.button-wrapper > div"; {
	}
	public static WebElement Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetKnapp(WebDriver driver){

		element = driver.findElement(By.cssSelector("#editDialogBodyFormId > div.row-fluid.button-wrapper > div"));
		return element;
	}





	//ORGANISATIONSKONTO - ANVÄNDARE
	public static final String Organisationskonto_Användare = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"; {
	}
	public static WebElement Organisationskonto_Användare(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - BYT HEMVIST
	public static final String Organisationskonto_Byt_Hemvist = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"; {
	}
	public static WebElement Organisationskonto_Byt_Hemvist(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - FÖRESLAGEN HEMVIST
	public static final String Organisationskonto_Föreslagen_Hemvist = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a"; {
	}
	public static WebElement Organisationskonto_Föreslagen_Hemvist(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - RAPPORTERINGSÖVERSIKT
	public static final String Organisationskonto_Rapporteringsöversikt = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[8]/div/a"; {
	}
	public static WebElement Organisationskonto_Rapporteringsöversikt(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[8]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - RAPPORTERINGSSTRUKTUR
	public static final String Organisationskonto_Rapporteringsstruktur = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[9]/div/a"; {
	}
	public static WebElement Organisationskonto_Rapporteringsstruktur(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[9]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - SIGNERINGSÖVERSIKT
	public static final String Organisationskonto_Signeringsöversikt = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[10]/div/a"; {
	}
	public static WebElement Organisationskonto_Signeringsöversikt(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[10]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - SIGNERINGSSTRUKTUR
	public static final String Organisationskonto_Signeringsstruktur = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[11]/div/a"; {
	}
	public static WebElement Organisationskonto_Signeringsstruktur(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[11]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - ORGANISATIONSUTLYSNINGAR
	public static final String Organisationskonto_Organisationsutlysningar = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[12]/div/a"; {
	}
	public static WebElement Organisationskonto_Organisationsutlysningar(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[12]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - ORGANISATIONSANSÖKNINGAR
	public static final String Organisationskonto_Organisationsansökningar = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[13]/div/a"; {
	}
	public static WebElement Organisationskonto_Organisationsansökningar(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[13]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - UTBETALNINGAR
	public static final String Organisationskonto_Utbetalningar = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[14]/div/a"; {
	}
	public static WebElement Organisationskonto_Utbetalningar(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[14]/div/a"));
		return element;
	}


}
