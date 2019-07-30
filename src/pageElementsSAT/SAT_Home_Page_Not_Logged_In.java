package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SAT_Home_Page_Not_Logged_In {
	private static By element = null;


	//LOGGA IN KNAPPEN PÅ STARTSIDAN
	public static By LoginButtonChrome(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > div > div:nth-child(1) > div > a.btn.btn-discreet.btn-login-left.show-modal");
		return element;
	}

	//FÄLTET DÄR MAN SKRIVER IN EMAIL NÄR MAN LOGGAR IN
	public static By EnterUserName(){

		By element = By.id("Email");
		return element;
	}

	//FÄLTET DÄR MAN SKRIVER IN LÖSENORD NÄR MAN LOGGAR IN
	public static By EnterPassword(){

		By element = By.id("Password");
		return element;
	}

	//LOGGA IN KNAPPEN SOM FINNS I MODALEN DÄR MAN SKRIVER EMAIL OCH LÖSENORD.
	public static By SubmitUserNameAndPassword(){

		By element = By.id("Submitter");
		return element;
	}

	//KNAPP FÖR ATT ÄNDRA SPRÅKET TILL ENGELSKA
	public static By InEnglishButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a");
		return element;
	}

	//KNAPP FÖR ATT ÄNDRA SPRÅKET TILL SVENSKA
	public static By PåSvenskaButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a");
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA BEHANDLING AV PERSONUPPGIFTER
	public static By BehandlingAvPersonuppgifterButton(){

		By element = By.cssSelector("#processingofpersonaldata");
		return element;
	}

	//BEHANDLING AV PERSONUPPGIFTER - MODAL
	public static By BehandlingAvPersonuppgifterModal(){

		By element = By.cssSelector("#editDialogBody > section > div > div.accordion-heading.greenTop > h1");
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA INFORMATION 
	public static By InformationButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(3) > div > a");
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA OM PRISMA (INFORMATION) 
	public static By InformationOmPrismaButton(){

		By element = By.cssSelector("#aboutprisma");
		return element;
	}

	//OM PRISMA - MODAL (INFORMATION) 
	public static By InformationOmPrismaModal(){

		By element = By.id("editDialog");
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA OM WEBBPLATSEN (INFORMATION) 
	public static By InformationOmWebbplatsenButton(){

		By element = By.cssSelector("#aboutwebsite");
		return element;
	}

	//OM WEBBPLATSEN - MODAL (INFORMATION) 
	public static By InformationOmWebbplatsenModal(){

		By element = By.cssSelector("#editDialogBody > section > div");
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA OM DRIFTINFORMATION (INFORMATION) 
	public static By InformationDriftinformationButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(3) > div > ul > li:nth-child(2) > a");
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA OM SWAMID (INFORMATION) 
	public static By InformationSWAMIDButton(){

		By element = By.id("swamid");
		return element;
	}

	//SWAMID - MODAL (INFORMATION) 
	public static By InformationSWAMIDModal(){

		By element = By.id("#editDialogBody");
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA OM ORCID (INFORMATION) 
	public static By InformationORCIDButton(){

		By element = By.id("orcid");
		return element;
	}

	//ORCID - MODAL (INFORMATION) 
	public static By InformationORCIDModal(){

		By element = By.id("#editDialogBody");
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA ANVÄNDARSTÖDET (HJÄLP) 
	public static By HjälpButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(2) > a");
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA DRIFTINFORMATION
	public static By DriftinformationButton(){

		By element = By.cssSelector("#start-page > section > div > div:nth-child(1) > div.span3 > div.operation-information > div > p:nth-child(2) > strong > a");
		return element;
	}
}








