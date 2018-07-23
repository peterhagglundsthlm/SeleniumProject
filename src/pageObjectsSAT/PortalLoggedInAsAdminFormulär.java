package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsAdminFormulär {
	private static WebElement element = null;

	//FORMULÄRKNAPPEN
	public static final String FormulärButton_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(6)"; {

	}
	public static WebElement FormulärButton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(6)"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET
	public static final String KarolinskaInstitutet_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a"; {

	}
	public static WebElement KarolinskaInstitutet_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - FORMULÄR
	public static final String KarolinskaInstitutetFormulär_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {

	}
	public static WebElement KarolinskaInstitutetFormulär_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - SIDMALLAR
	public static final String KarolinskaInstitutetSidmallar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {

	}
	public static WebElement KarolinskaInstitutetSidmallar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - AVSNITTSMALLAR
	public static final String KarolinskaAvsnittsmallar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {

	}
	public static WebElement KarolinskaAvsnittsmallar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - UNDERHÅLLSTABELLER
	public static final String KarolinskaUnderhållstabeller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {

	}
	public static WebElement KarolinskaUnderhållstabeller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - DATAINSTÄLLNINGAR
	public static final String KarolinskaDataInställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {

	}
	public static WebElement KarolinskaDataInställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - KONTROLLER
	public static final String KarolinskaKontroller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {

	}
	public static WebElement KarolinskaKontroller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FORMULÄR - FORMAS
	public static final String Formas_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a"; {

	}
	public static WebElement Formas_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - FORMAS - FORMULÄR
	public static final String FormasFormulär_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {

	}
	public static WebElement FormasFormulär_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FORMULÄR - FORMAS - SIDMALLAR
	public static final String FormasSidmallar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {

	}
	public static WebElement FormasSidmallar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - FORMAS - AVSNITTSMALLAR
	public static final String FormasAvsnittsmallar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {

	}
	public static WebElement FormasAvsnittsmallar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - FORMAS - UNDERHÅLLSTABELLER
	public static final String FormasUnderhållstabeller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {

	}
	public static WebElement FormasUnderhållstabeller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - FORMAS - DATAINSTÄLLNINGAR
	public static final String FormasDatainställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {

	}
	public static WebElement FormasDatainställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - FORMAS - KONTROLLER
	public static final String FormasKontroller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {

	}
	public static WebElement FormasKontroller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}


	//FORMULÄR - VETENSKAPSRÅDET
	public static final String Vetenskapsrådet_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a"; {

	}
	public static WebElement Vetenskapsrådet_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - FORMULÄR
	public static final String VetenskapsrådetFormulär_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {

	}
	public static WebElement VetenskapsrådetFormulär_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - SIDMALLAR
	public static final String VetenskapsrådetSidmallar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {

	}
	public static WebElement VetenskapsrådetSidmallar_CSSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - AVSNITTSMALLAR
	public static final String VetenskapsrådetAvsnittsmallar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {

	}
	public static WebElement VetenskapsrådetAvsnittsmallar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - UNDERHÅLLSTABELLER
	public static final String VetenskapsrådetUnderhållstabeller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {

	}
	public static WebElement VetenskapsrådetUnderhållstabeller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - DATAINSTÄLLNINGAR
	public static final String VetenskapsrådetDataInställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {

	}
	public static WebElement VetenskapsrådetDataInställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - KONTROLLER
	public static final String VetenskapsrådetKontroller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {

	}
	public static WebElement VetenskapsrådetKontroller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FORMULÄR - FORTE
	public static final String Forte_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a"; {

	}
	public static WebElement Forte_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - FORTE - FORMULÄR
	public static final String ForteFormulär_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {

	}
	public static WebElement ForteFormulär_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FORMULÄR - FORTE - SIDMALLAR
	public static final String ForteSidmallar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {

	}
	public static WebElement ForteSidmallar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - FORTE - AVSNITTSMALLAR
	public static final String ForteAvsnittsmallar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {

	}
	public static WebElement ForteAvsnittsmallar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - FORTE - UNDERHÅLLSTABELLER
	public static final String ForteUnderhållstabeller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {

	}
	public static WebElement ForteUnderhållstabeller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - FORTE - DATAINSTÄLLNINGAR
	public static final String ForteDatainställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {

	}
	public static WebElement ForteDatainställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - FORTE - KONTROLLER
	public static final String ForteKontroller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {

	}
	public static WebElement ForteKontroller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FORMULÄR - SKOLFI
	public static final String Skolfi_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a"; {

	}
	public static WebElement Skolfi_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a"));
		return element;
	}

	//FORMULÄR - SKOLFI - FORMULÄR
	public static final String SkolfiFormulär_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {

	}
	public static WebElement SkolfiFormulär_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FORMULÄR - SKOLFI - SIDMALLAR
	public static final String SkolfiSidmallar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {

	}
	public static WebElement SkolfiSidmallar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - SKOLFI - AVSNITTSMALLAR
	public static final String SkolfiAvsnittsmallar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {

	}
	public static WebElement SkolfiAvsnittsmallar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - SKOLFI - UNDERHÅLLSTABELLER
	public static final String SkolfiUnderhållstabeller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {

	}
	public static WebElement SkolfiUnderhållstabeller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - SKOLFI - DATAINSTÄLLNINGAR
	public static final String SkolfiDatainställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {

	}
	public static WebElement SkolfiDatainställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - SKOLFI - KONTROLLER
	public static final String SkolfiKontroller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {

	}
	public static WebElement SkolfiKontroller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FORMULÄR - EPN
	public static final String EPN_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a"; {

	}
	public static WebElement EPN_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a"));
		return element;
	}

	//FORMULÄR - EPN - FORMULÄR
	public static final String EPNFormulär_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {

	}
	public static WebElement EPNFormulär_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FORMULÄR - EPN - SIDMALLAR
	public static final String EPNSidmallar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {

	}
	public static WebElement EPNSidmallar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - EPN - AVSNITTSMALLAR
	public static final String EPNAvsnittsmallar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {

	}
	public static WebElement EPNAvsnittsmallar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - EPN - UNDERHÅLLSTABELLER
	public static final String EPNUnderhållstabeller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {

	}
	public static WebElement EPNUnderhållstabeller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - EPN - DATAINSTÄLLNINGAR
	public static final String EPNDatainställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {

	}
	public static WebElement EPNDatainställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - EPN - KONTROLLER
	public static final String EpnKontroller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {

	}
	public static WebElement EpnKontroller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}


}
