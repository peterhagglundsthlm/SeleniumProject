package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoggedInAsAdminFinansiär {
	private static WebElement element = null;


	//FINANSIÄRKNAPPEN
	public static final String FinansiärButton = "body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(5)"; {
	}
	public static WebElement FinansiärButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(5)"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET
	public static final String KarolinskaInstitutet = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a"; {
	}
	public static WebElement KarolinskaInstitutet(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - FINANSIÄRSINTÄLLNINGAR
	public static final String KarolinskaInstitutetFinansiärsinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement KarolinskaInstitutetFinansiärsinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - GRANSKARPOOLINSTÄLLNINGAR
	public static final String KarolinskaInstitutetGranskarpoolinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement KarolinskaInstitutetGranskarpoolinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - INTERNA ANVÄNDARE
	public static final String KarolinskaInstitutetInternaAnvändare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement KarolinskaInstitutetInternaAnvändare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - ARVODESINSTÄLLNINGAR
	public static final String KarolinskaInstitutetArvodesinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement KarolinskaInstitutetArvodesinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - SINK-ADMINISTRATION
	public static final String KarolinskaInstitutetSINKAdministration = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement KarolinskaInstitutetSINKAdministration(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - SÖKNYCKLAR
	public static final String KarolinskaInstitutetSöknycklar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement KarolinskaInstitutetSöknycklar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - ORGANISATIONSKONTOANSÖKNINGAR
	public static final String KarolinskaInstitutetOrganisationskontoansökningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement KarolinskaInstitutetOrganisationskontoansökningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - ORGANISATIONSKONTON
	public static final String KarolinskaInstitutetOrganisationskonton = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement KarolinskaInstitutetOrganisationskonton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - INTERNA FÖRFRÅGNINGAR
	public static final String KarolinskaInstitutetInternaFörfråningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement KarolinskaInstitutetInternaFörfråningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS
	public static final String Formas = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a"; {
	}
	public static WebElement Formas(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - FINANSIÄRSINTÄLLNINGAR
	public static final String FormasFinansiärsinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement FormasFinansiärsinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - GRANSKARPOOLINSTÄLLNINGAR
	public static final String FormasGranskarpoolinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement FormasGranskarpoolinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - INTERNA ANVÄNDARE
	public static final String FormasInternaAnvändare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement FormasInternaAnvändare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - ARVODESINSTÄLLNINGAR
	public static final String FormasArvodesinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement FormasArvodesinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - SINK-ADMINISTRATION
	public static final String FormasSINKAdministration = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement FormasSINKAdministration(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - SÖKNYCKLAR
	public static final String FormasSöknycklar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement FormasSöknycklar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - ORGANISATIONSKONTOANSÖKNINGAR
	public static final String FormasOrganisationskontoansökningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement FormasOrganisationskontoansökningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - ORGANISATIONSKONTON
	public static final String FormasOrganisationskonton = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement FormasOrganisationskonton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - INTERNA FÖRFRÅGNINGAR
	public static final String FormasInternaFörfråningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement FormasInternaFörfråningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET
	public static final String Vetenskapsrådet = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a"; {
	}
	public static WebElement Vetenskapsrådet(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - FINANSIÄRSINTÄLLNINGAR
	public static final String VetenskapsrådetFinansiärsinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement VetenskapsrådetFinansiärsinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - GRANSKARPOOLINSTÄLLNINGAR
	public static final String VetenskapsrådetGranskarpoolinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement VetenskapsrådetGranskarpoolinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - INTERNA ANVÄNDARE
	public static final String VetenskapsrådetInternaAnvändare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement VetenskapsrådetInternaAnvändare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - ARVODESINSTÄLLNINGAR
	public static final String VetenskapsrådetArvodesinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement VetenskapsrådetArvodesinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - SINK-ADMINISTRATION
	public static final String VetenskapsrådetSINKAdministration = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement VetenskapsrådetSINKAdministration(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - SÖKNYCKLAR
	public static final String VetenskapsrådetSöknycklar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement VetenskapsrådetSöknycklar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - ORGANISATIONSKONTOANSÖKNINGAR
	public static final String VetenskapsrådetOrganisationskontoansökningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement VetenskapsrådetOrganisationskontoansökningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - ORGANISATIONSKONTON
	public static final String VetenskapsrådetOrganisationskonton = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement VetenskapsrådetOrganisationskonton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - INTERNA FÖRFRÅGNINGAR
	public static final String VetenskapsrådetInternaFörfråningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement VetenskapsrådetInternaFörfråningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSIÄR - FORTE
	public static final String Forte = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a"; {
	}
	public static WebElement Forte(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - FINANSIÄRSINTÄLLNINGAR
	public static final String ForteFinansiärsinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement ForteFinansiärsinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSIÄR - FORTE - GRANSKARPOOLINSTÄLLNINGAR
	public static final String ForteGranskarpoolinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement ForteGranskarpoolinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - INTERNA ANVÄNDARE
	public static final String ForteInternaAnvändare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement ForteInternaAnvändare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - ARVODESINSTÄLLNINGAR
	public static final String ForteArvodesinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement ForteArvodesinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - SINK-ADMINISTRATION
	public static final String ForteSINKAdministration = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement ForteSINKAdministration(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - SÖKNYCKLAR
	public static final String ForteSöknycklar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement ForteSöknycklar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - ORGANISATIONSKONTOANSÖKNINGAR
	public static final String ForteOrganisationskontoansökningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement ForteOrganisationskontoansökningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - ORGANISATIONSKONTON
	public static final String ForteOrganisationskonton = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement ForteOrganisationskonton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - INTERNA FÖRFRÅGNINGAR
	public static final String ForteInternaFörfråningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement ForteInternaFörfråningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI
	public static final String Skolfi = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a"; {
	}
	public static WebElement Skolfi(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - FINANSIÄRSINTÄLLNINGAR
	public static final String SkolfiFinansiärsinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement SkolfiFinansiärsinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - GRANSKARPOOLINSTÄLLNINGAR
	public static final String SkolfiGranskarpoolinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement SkolfiGranskarpoolinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - INTERNA ANVÄNDARE
	public static final String SkolfiInternaAnvändare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement SkolfiInternaAnvändare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - ARVODESINSTÄLLNINGAR
	public static final String SkolfiArvodesinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement SkolfiArvodesinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - SINK-ADMINISTRATION
	public static final String SkolfiSINKAdministration = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement SkolfiSINKAdministration(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - SÖKNYCKLAR
	public static final String SkolfiSöknycklar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement SkolfiSöknycklar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - ORGANISATIONSKONTOANSÖKNINGAR
	public static final String SkolfiOrganisationskontoansökningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement SkolfiOrganisationskontoansökningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - ORGANISATIONSKONTON
	public static final String SkolfiOrganisationskonton = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement SkolfiOrganisationskonton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - INTERNA FÖRFRÅGNINGAR
	public static final String SkolfiInternaFörfråningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement SkolfiInternaFörfråningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;

	}
	//FINANSIÄR - EPN
	public static final String EPN = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a"; {
	}
	public static WebElement EPN(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - EPN - FINANSIÄRSINTÄLLNINGAR
	public static final String EPNFinansiärsinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement EPNFinansiärsinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSIÄR - EPN - GRANSKARPOOLINSTÄLLNINGAR
	public static final String EPNGranskarpoolinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement EPNGranskarpoolinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - EPN - INTERNA ANVÄNDARE
	public static final String EPNInternaAnvändare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement EPNInternaAnvändare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - EPN - ARVODESINSTÄLLNINGAR
	public static final String EPNArvodesinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement EPNArvodesinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - EPN - SINK-ADMINISTRATION
	public static final String EPNSINKAdministration = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement EPNSINKAdministration(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - EPN - SÖKNYCKLAR
	public static final String EPNSöknycklar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement EPNSöknycklar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - EPN - ORGANISATIONSKONTOANSÖKNINGAR
	public static final String EPNOrganisationskontoansökningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement EPNOrganisationskontoansökningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - EPN - ORGANISATIONSKONTON
	public static final String EPNOrganisationskonton = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement EPNOrganisationskonton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSIÄR - EPN - INTERNA FÖRFRÅGNINGAR
	public static final String EPNInternaFörfråningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement EPNInternaFörfråningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSIÄR - EPN - AVGIFTSKATEGORIER
	public static final String EPNAvgiftskategorier = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement EPNAvgiftskategorier(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}



}
