package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class PortalLoggedInAsOrgUserOrganisationskonto {
	private static By element = null;

	//ORGANISATIONSKONTO - KNAPPEN
	public static By Organisationskonto(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuOrganizationAdmin.pull-right");
		return element;
	}
	//ORGANISATIONSKONTO - INSTÄLLNINGAR
	public static By Organisationskonto_Inställningar(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a");
		return element;
	}
	//ORGANISATIONSKONTO - ANSÖKNINGAR OCH BIDRAG
	public static By Organisationskonto_AnsökningarOchBidrag(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - NEDLADDNING
	public static By Organisationskonto_Nedladdning(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR
	public static By Organisationskonto_Struktur(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA HÖGSTA NIVÅN
	public static By Organisationskonto_Struktur_RedigeraHögstaNivån(){

		By element = By.cssSelector("#contentBody > section > div.content > form > div > div > div > ul > li > div > div.span5 > div > div > a");
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA HÖGSTA NIVÅN - SVENSKT NAMN
	public static By Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet(){

		By element = By.id("OrganizationStructure_Name");
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA HÖGSTA NIVÅN - ENGELSKT NAMN
	public static By Organisationskonto_Struktur_RedigeraHögstaNivånEngelsktNamnPåNyEnhet(){

		By element = By.id("OrganizationStructure_NameEN");
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA HÖGSTA NIVÅN - LÄGG TILL (KNAPP)
	public static By Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetKnapp(){

		By element = By.cssSelector("#editDialogBodyFormId > div.row-fluid.button-wrapper > div");
		return element;
	}

	//ORGANISATIONSKONTO - STRUKTUR - REDIGERA HÖGSTA NIVÅN - STÄNG (KNAPP)
	public static By Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetStäng(){

		By element = By.cssSelector("#editDialogBody > section > div > div:nth-child(2) > div > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//ORGANISATIONSKONTO - ANVÄNDARE
	public static By Organisationskonto_Användare(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE
	public static By Organisationskonto_Användare_Bjud_In(){

		By element = By.cssSelector("#organizationUserIndexSectionIdFormId > div > div.content > div.pull-right > a.btn.btn-primary.show-modal");
		return element;
	}

	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - FÖRNAMN
	public static By Organisationskonto_Användare_Bjud_In_Förnamn(){

		By element = By.id("FirstName");
		return element;
	}	

	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - EFTERNAMN
	public static By Organisationskonto_Användare_Bjud_In_Efternamn(){

		By element = By.id("LastName");
		return element;
	}	

	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - EPOST
	public static By Organisationskonto_Användare_Bjud_In_Email(){

		By element = By.id("Email");
		return element;
	}	

	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - ROLL
	public static By Organisationskonto_Användare_Bjud_In_Roll(){

		By element = By.id("selectedResponsibilityType");
		return element;
	}	

	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - SKICKA
	public static By Organisationskonto_Användare_Bjud_In_Skicka(){

		By element = By.id("Submitter");
		return element;
	}	

	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - CHECKBOX FÖR RADERA
	public static By Organisationskonto_Användare_Bjud_In_Checkbox_Radera(){

		By element = By.cssSelector("#userModels_3__IsChecked");
		return element;
	}

	//ORGANISATIONSKONTO - ANVÄNDARE - BJUD IN ANVÄNDARE - TA BORT KNAPP
	public static By Organisationskonto_Användare_Ta_Bort(){

		By element = By.id("DeleteUsers");
		return element;
	}

	//ORGANISATIONSKONTO - BYT HEMVIST
	public static By Organisationskonto_Byt_Hemvist(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - FÖRESLAGEN HEMVIST
	public static By Organisationskonto_Föreslagen_Hemvist(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - RAPPORTERINGSÖVERSIKT
	public static By Organisationskonto_Rapporteringsöversikt(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[8]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - RAPPORTERINGSSTRUKTUR
	public static By Organisationskonto_Rapporteringsstruktur(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[9]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - SIGNERINGSÖVERSIKT
	public static By Organisationskonto_Signeringsöversikt(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[10]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - SIGNERINGSSTRUKTUR
	public static By Organisationskonto_Signeringsstruktur(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[11]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - ORGANISATIONSUTLYSNINGAR
	public static By Organisationskonto_Organisationsutlysningar(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[12]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - ORGANISATIONSANSÖKNINGAR
	public static By Organisationskonto_Organisationsansökningar(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[13]/div/a");
		return element;
	}

	//ORGANISATIONSKONTO - UTBETALNINGAR
	public static By Organisationskonto_Utbetalningar(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[14]/div/a");
		return element;
	}


}
