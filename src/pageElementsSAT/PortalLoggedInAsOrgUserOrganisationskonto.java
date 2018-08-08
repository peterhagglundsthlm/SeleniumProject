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

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA HÖGSTA NIVÅN - STÄNG (KNAPP)
	public static final String Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetStäng = "#editDialogBody > section > div > div:nth-child(2) > div > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetStäng(WebDriver driver){

		element = driver.findElement(By.cssSelector("#editDialogBody > section > div > div:nth-child(2) > div > div.row-fluid.button-wrapper > div > a"));
		return element;
	}





	//ORGANISATIONSKONTO - ANVÄNDARE
	public static final String Organisationskonto_Användare = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"; {
	}
	public static WebElement Organisationskonto_Användare(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"));
		return element;
	}

	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE
	public static final String Organisationskonto_Användare_Bjud_In = "#organizationUserIndexSectionIdFormId > div > div.content > div.pull-right > a.btn.btn-primary.show-modal"; {
	}
	public static WebElement Organisationskonto_Användare_Bjud_In(WebDriver driver){

		element = driver.findElement(By.cssSelector("#organizationUserIndexSectionIdFormId > div > div.content > div.pull-right > a.btn.btn-primary.show-modal"));
		return element;
	}



	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - FÖRNAMN
	public static final String Organisationskonto_Användare_Bjud_In_Förnamn = "FirstName"; {
	}
	public static WebElement Organisationskonto_Användare_Bjud_In_Förnamn(WebDriver driver){

		element = driver.findElement(By.id("FirstName"));
		return element;
	}	

	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - EFTERNAMN
	public static final String Organisationskonto_Användare_Bjud_In_Efternamn = "LastName"; {
	}
	public static WebElement Organisationskonto_Användare_Bjud_In_Efternamn(WebDriver driver){

		element = driver.findElement(By.id("LastName"));
		return element;
	}	

	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - EPOST
	public static final String Organisationskonto_Användare_Bjud_In_Email = "Email"; {
	}
	public static WebElement Organisationskonto_Användare_Bjud_In_Email(WebDriver driver){

		element = driver.findElement(By.id("Email"));
		return element;
	}	

	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - ROLL
	public static final String Organisationskonto_Användare_Bjud_In_Roll = "selectedResponsibilityType"; {
	}
	public static WebElement Organisationskonto_Användare_Bjud_In_Roll(WebDriver driver){

		element = driver.findElement(By.id("selectedResponsibilityType"));
		return element;
	}	

	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - SKICKA
	public static final String Organisationskonto_Användare_Bjud_In_Skicka = "Submitter"; {
	}
	public static WebElement Organisationskonto_Användare_Bjud_In_Skicka(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}	
	
	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - CHECKBOX FÖR RADERA
		public static final String Organisationskonto_Användare_Bjud_In_Checkbox_Radera = "userModels_3__IsChecked"; {
		}
		public static WebElement Organisationskonto_Användare_Bjud_In_Checkbox_Radera(WebDriver driver){

			element = driver.findElement(By.cssSelector("#userModels_3__IsChecked"));
			return element;
		}

		
		//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - TA BORT KNAPP
				public static final String Organisationskonto_Användare_Ta_Bort = "DeleteUsers"; {
				}
				public static WebElement Organisationskonto_Användare_Ta_Bort(WebDriver driver){

					element = driver.findElement(By.id("DeleteUsers"));
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
