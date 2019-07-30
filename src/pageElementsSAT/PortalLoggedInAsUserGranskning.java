package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class PortalLoggedInAsUserGranskning {
	private static By element = null;

	//GRANSKNING - KNAPPEN
	public static By GranskningButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview");
		return element;
	}

	//GRANSKNING - GRANSKNING
	public static By Granskning_Granskning(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION
	public static By GranskningBetalningsinformation(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKENS LAND (DROPDOWN)
	public static By GranskningBetalningsinformationBankensLand(){

		By element = By.id("BankCountry");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BETALNINGSTYP (DROPDOWN)
	public static By GranskningBetalningsinformationBetalningstyp(){

		By element = By.id("PaymentAccountType");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKGIRO
	public static By GranskningBetalningsinformationBankgiro_Id(){

		By element = By.id("BankGiro");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - PLUSGIRO
	public static By GranskningBetalningsinformationPlusgiro(){

		By element = By.id("PostalGiro");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKENS NAMN
	public static By GranskningBetalningsinformationBankensNamn(){

		By element = By.id("BankName");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKADRESS
	public static By GranskningBetalningsinformationBankAdress(){

		By element = By.id("BankAddress");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKENS POSTNUMMER
	public static By GranskningBetalningsinformationBankensPostnummer(){

		By element = By.id("BankPostalNumber");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKENS POSTADRESS
	public static By GranskningBetalningsinformationBankensPostAdress(){

		By element = By.id("BankPostalAddress");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKKONTONUMMER
	public static By GranskningBetalningsinformationBankkontonummer(){

		By element = By.id("BankNumber");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - SKATTEPROCENT
	public static By GranskningBetalningsinformationSkatteprocent(){

		By element = By.id("TaxPercentage");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKKOD
	public static By GranskningBetalningsinformationBankkod(){

		By element = By.id("BankCode");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - KONTOINNEHAVARE
	public static By GranskningBetalningsinformationKontoinnehavare(){

		By element = By.id("Accountholder");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - CLEARINGNUMMER
	public static By GranskningBetalningsinformationClearingnummer(){

		By element = By.id("ClearingNumber");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - IBAN
	public static By GranskningBetalningsinformationIBAN(){

		By element = By.id("IBAN");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - SWIFT/BIC
	public static By GranskningBetalningsinformationSWIFTBIC(){

		By element = By.id("SWIFTBIC");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - TIN
	public static By GranskningBetalningsinformationTIN(){

		By element = By.id("TIN");
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - SPARA
	public static By GranskningBetalningsinformationSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//GRANSKNING - ARVODEN
	public static By GranskningArvoden(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a");
		return element;
	}





}
