package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsUserGranskning {
	private static WebElement element = null;

	//GRANSKNING - KNAPPEN
	public static final String GranskningButton = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview"; {
	}
	public static WebElement GranskningButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview"));
		return element;
	}

	//GRANSKNING - GRANSKNING
	public static final String Granskning_Granskning = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a"; {
	}
	public static WebElement Granskning_Granskning(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION
	public static final String GranskningBetalningsinformation = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a"; {
	}
	public static WebElement GranskningBetalningsinformation(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKENS LAND (DROPDOWN)
	public static final String GranskningBetalningsinformationBankensLand = "BankCountry"; {
	}
	public static WebElement GranskningBetalningsinformationBankensLand(WebDriver driver){

		element = driver.findElement(By.id("BankCountry"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BETALNINGSTYP (DROPDOWN)
	public static final String GranskningBetalningsinformationBetalningstyp = "PaymentAccountType"; {
	}
	public static WebElement GranskningBetalningsinformationBetalningstyp(WebDriver driver){

		element = driver.findElement(By.id("PaymentAccountType"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKGIRO
	public static final String GranskningBetalningsinformationBankgiro_Id = "BankGiro"; {
	}
	public static WebElement GranskningBetalningsinformationBankgiro_Id(WebDriver driver){

		element = driver.findElement(By.id("BankGiro"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - PLUSGIRO
	public static final String GranskningBetalningsinformationPlusgiro = "PostalGiro"; {
	}
	public static WebElement GranskningBetalningsinformationPlusgiro(WebDriver driver){

		element = driver.findElement(By.id("PostalGiro"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKENS NAMN
	public static final String GranskningBetalningsinformationBankensNamn = "BankName"; {
	}
	public static WebElement GranskningBetalningsinformationBankensNamn(WebDriver driver){

		element = driver.findElement(By.id("BankName"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKADRESS
	public static final String GranskningBetalningsinformationBankAdress = "BankAddress"; {
	}
	public static WebElement GranskningBetalningsinformationBankAdress(WebDriver driver){

		element = driver.findElement(By.id("BankAddress"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKENS POSTNUMMER
	public static final String GranskningBetalningsinformationBankensPostnummer = "BankPostalNumber"; {
	}
	public static WebElement GranskningBetalningsinformationBankensPostnummer(WebDriver driver){

		element = driver.findElement(By.id("BankPostalNumber"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKENS POSTADRESS
	public static final String GranskningBetalningsinformationBankensPostAdress = "BankPostalAddress"; {
	}
	public static WebElement GranskningBetalningsinformationBankensPostAdress(WebDriver driver){

		element = driver.findElement(By.id("BankPostalAddress"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKKONTONUMMER
	public static final String GranskningBetalningsinformationBankkontonummer = "BankNumber"; {
	}
	public static WebElement GranskningBetalningsinformationBankkontonummer(WebDriver driver){

		element = driver.findElement(By.id("BankNumber"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - SKATTEPROCENT
	public static final String GranskningBetalningsinformationSkatteprocent = "TaxPercentage"; {
	}
	public static WebElement GranskningBetalningsinformationSkatteprocent(WebDriver driver){

		element = driver.findElement(By.id("TaxPercentage"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - BANKKOD
	public static final String GranskningBetalningsinformationBankkod = "BankCode"; {
	}
	public static WebElement GranskningBetalningsinformationBankkod(WebDriver driver){

		element = driver.findElement(By.id("BankCode"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - KONTOINNEHAVARE
	public static final String GranskningBetalningsinformationKontoinnehavare = "Accountholder"; {
	}
	public static WebElement GranskningBetalningsinformationKontoinnehavare(WebDriver driver){

		element = driver.findElement(By.id("Accountholder"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - CLEARINGNUMMER
	public static final String GranskningBetalningsinformationClearingnummer = "ClearingNumber"; {
	}
	public static WebElement GranskningBetalningsinformationClearingnummer(WebDriver driver){

		element = driver.findElement(By.id("ClearingNumber"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - IBAN
	public static final String GranskningBetalningsinformationIBAN = "IBAN"; {
	}
	public static WebElement GranskningBetalningsinformationIBAN(WebDriver driver){

		element = driver.findElement(By.id("IBAN"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - SWIFT/BIC
	public static final String GranskningBetalningsinformationSWIFTBIC = "SWIFTBIC"; {
	}
	public static WebElement GranskningBetalningsinformationSWIFTBIC(WebDriver driver){

		element = driver.findElement(By.id("SWIFTBIC"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - TIN
	public static final String GranskningBetalningsinformationTIN = "TIN"; {
	}
	public static WebElement GranskningBetalningsinformationTIN(WebDriver driver){

		element = driver.findElement(By.id("TIN"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION - SPARA
	public static final String GranskningBetalningsinformationSpara = "Submitter"; {
	}
	public static WebElement GranskningBetalningsinformationSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//GRANSKNING - ARVODEN
	public static final String GranskningArvoden = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a"; {
	}
	public static WebElement GranskningArvoden(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a"));
		return element;
	}





}
