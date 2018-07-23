package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoggedInAsAdminFinansiär {
	private static WebElement element = null;


	//FINANSIÄRKNAPPEN
	public static final String FinansiärButton_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(5)"; {
	}
	public static WebElement FinansiärButton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(5)"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET
	public static final String KarolinskaInstitutet_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a"; {
	}
	public static WebElement KarolinskaInstitutet_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - FINANSIÄRSINTÄLLNINGAR
	public static final String KarolinskaInstitutetFinansiärsinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement KarolinskaInstitutetFinansiärsinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - GRANSKARPOOLINSTÄLLNINGAR
	public static final String KarolinskaInstitutetGranskarpoolinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement KarolinskaInstitutetGranskarpoolinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - INTERNA ANVÄNDARE
	public static final String KarolinskaInstitutetInternaAnvändare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement KarolinskaInstitutetInternaAnvändare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - ARVODESINSTÄLLNINGAR
	public static final String KarolinskaInstitutetArvodesinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement KarolinskaInstitutetArvodesinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - SINK-ADMINISTRATION
	public static final String KarolinskaInstitutetSINKAdministration_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement KarolinskaInstitutetSINKAdministration_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - SÖKNYCKLAR
	public static final String KarolinskaInstitutetSöknycklar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement KarolinskaInstitutetSöknycklar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - ORGANISATIONSKONTOANSÖKNINGAR
	public static final String KarolinskaInstitutetOrganisationskontoansökningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement KarolinskaInstitutetOrganisationskontoansökningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - ORGANISATIONSKONTON
	public static final String KarolinskaInstitutetOrganisationskonton_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement KarolinskaInstitutetOrganisationskonton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - INTERNA FÖRFRÅGNINGAR
	public static final String KarolinskaInstitutetInternaFörfråningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement KarolinskaInstitutetInternaFörfråningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS
	public static final String Formas_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a"; {
	}
	public static WebElement Formas_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - FINANSIÄRSINTÄLLNINGAR
	public static final String FormasFinansiärsinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement FormasFinansiärsinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - GRANSKARPOOLINSTÄLLNINGAR
	public static final String FormasGranskarpoolinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement FormasGranskarpoolinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - INTERNA ANVÄNDARE
	public static final String FormasInternaAnvändare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement FormasInternaAnvändare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - ARVODESINSTÄLLNINGAR
	public static final String FormasArvodesinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement FormasArvodesinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - SINK-ADMINISTRATION
	public static final String FormasSINKAdministration_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement FormasSINKAdministration_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - SÖKNYCKLAR
	public static final String FormasSöknycklar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement FormasSöknycklar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - ORGANISATIONSKONTOANSÖKNINGAR
	public static final String FormasOrganisationskontoansökningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement FormasOrganisationskontoansökningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - ORGANISATIONSKONTON
	public static final String FormasOrganisationskonton_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement FormasOrganisationskonton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSIÄR - FORMAS - INTERNA FÖRFRÅGNINGAR
	public static final String FormasInternaFörfråningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement FormasInternaFörfråningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET
	public static final String Vetenskapsrådet_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a"; {
	}
	public static WebElement Vetenskapsrådet_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - FINANSIÄRSINTÄLLNINGAR
	public static final String VetenskapsrådetFinansiärsinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement VetenskapsrådetFinansiärsinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - GRANSKARPOOLINSTÄLLNINGAR
	public static final String VetenskapsrådetGranskarpoolinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement VetenskapsrådetGranskarpoolinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - INTERNA ANVÄNDARE
	public static final String VetenskapsrådetInternaAnvändare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement VetenskapsrådetInternaAnvändare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - ARVODESINSTÄLLNINGAR
	public static final String VetenskapsrådetArvodesinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement VetenskapsrådetArvodesinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - SINK-ADMINISTRATION
	public static final String VetenskapsrådetSINKAdministration_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement VetenskapsrådetSINKAdministration_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - SÖKNYCKLAR
	public static final String VetenskapsrådetSöknycklar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement VetenskapsrådetSöknycklar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - ORGANISATIONSKONTOANSÖKNINGAR
	public static final String VetenskapsrådetOrganisationskontoansökningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement VetenskapsrådetOrganisationskontoansökningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - ORGANISATIONSKONTON
	public static final String VetenskapsrådetOrganisationskonton_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement VetenskapsrådetOrganisationskonton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - INTERNA FÖRFRÅGNINGAR
	public static final String VetenskapsrådetInternaFörfråningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement VetenskapsrådetInternaFörfråningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSIÄR - FORTE
	public static final String Forte_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a"; {
	}
	public static WebElement Forte_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - FINANSIÄRSINTÄLLNINGAR
	public static final String ForteFinansiärsinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement ForteFinansiärsinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSIÄR - FORTE - GRANSKARPOOLINSTÄLLNINGAR
	public static final String ForteGranskarpoolinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement ForteGranskarpoolinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - INTERNA ANVÄNDARE
	public static final String ForteInternaAnvändare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement ForteInternaAnvändare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - ARVODESINSTÄLLNINGAR
	public static final String ForteArvodesinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement ForteArvodesinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - SINK-ADMINISTRATION
	public static final String ForteSINKAdministration_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement ForteSINKAdministration_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - SÖKNYCKLAR
	public static final String ForteSöknycklar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement ForteSöknycklar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - ORGANISATIONSKONTOANSÖKNINGAR
	public static final String ForteOrganisationskontoansökningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement ForteOrganisationskontoansökningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - ORGANISATIONSKONTON
	public static final String ForteOrganisationskonton_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement ForteOrganisationskonton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSIÄR - FORTE - INTERNA FÖRFRÅGNINGAR
	public static final String ForteInternaFörfråningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement ForteInternaFörfråningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI
	public static final String Skolfi_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a"; {
	}
	public static WebElement Skolfi_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - FINANSIÄRSINTÄLLNINGAR
	public static final String SkolfiFinansiärsinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement SkolfiFinansiärsinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - GRANSKARPOOLINSTÄLLNINGAR
	public static final String SkolfiGranskarpoolinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement SkolfiGranskarpoolinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - INTERNA ANVÄNDARE
	public static final String SkolfiInternaAnvändare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement SkolfiInternaAnvändare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - ARVODESINSTÄLLNINGAR
	public static final String SkolfiArvodesinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement SkolfiArvodesinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - SINK-ADMINISTRATION
	public static final String SkolfiSINKAdministration_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement SkolfiSINKAdministration_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - SÖKNYCKLAR
	public static final String SkolfiSöknycklar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement SkolfiSöknycklar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - ORGANISATIONSKONTOANSÖKNINGAR
	public static final String SkolfiOrganisationskontoansökningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement SkolfiOrganisationskontoansökningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - ORGANISATIONSKONTON
	public static final String SkolfiOrganisationskonton_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement SkolfiOrganisationskonton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSIÄR - SKOLFI - INTERNA FÖRFRÅGNINGAR
	public static final String SkolfiInternaFörfråningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement SkolfiInternaFörfråningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;

	}
	//FINANSIÄR - EPN
	public static final String EPN_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a"; {
	}
	public static WebElement EPN_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - EPN - FINANSIÄRSINTÄLLNINGAR
	public static final String EPNFinansiärsinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {
	}
	public static WebElement EPNFinansiärsinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FINANSIÄR - EPN - GRANSKARPOOLINSTÄLLNINGAR
	public static final String EPNGranskarpoolinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {
	}
	public static WebElement EPNGranskarpoolinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FINANSIÄR - EPN - INTERNA ANVÄNDARE
	public static final String EPNInternaAnvändare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {
	}
	public static WebElement EPNInternaAnvändare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FINANSIÄR - EPN - ARVODESINSTÄLLNINGAR
	public static final String EPNArvodesinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {
	}
	public static WebElement EPNArvodesinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FINANSIÄR - EPN - SINK-ADMINISTRATION
	public static final String EPNSINKAdministration_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {
	}
	public static WebElement EPNSINKAdministration_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FINANSIÄR - EPN - SÖKNYCKLAR
	public static final String EPNSöknycklar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {
	}
	public static WebElement EPNSöknycklar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FINANSIÄR - EPN - ORGANISATIONSKONTOANSÖKNINGAR
	public static final String EPNOrganisationskontoansökningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"; {
	}
	public static WebElement EPNOrganisationskontoansökningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a"));
		return element;
	}

	//FINANSIÄR - EPN - ORGANISATIONSKONTON
	public static final String EPNOrganisationskonton_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"; {
	}
	public static WebElement EPNOrganisationskonton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a"));
		return element;
	}

	//FINANSIÄR - EPN - INTERNA FÖRFRÅGNINGAR
	public static final String EPNInternaFörfråningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement EPNInternaFörfråningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}

	//FINANSIÄR - EPN - AVGIFTSKATEGORIER
	public static final String EPNAvgiftskategorier_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"; {
	}
	public static WebElement EPNAvgiftskategorier_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a"));
		return element;
	}



}
