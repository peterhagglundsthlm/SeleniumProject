package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsAdminFormulär {
	private static WebElement element = null;

	//FORMULÄRKNAPPEN
	public static final String FormulärButton = "body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(6)"; {

	}
	public static WebElement FormulärButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(6)"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET
	public static final String KarolinskaInstitutet = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a"; {

	}
	public static WebElement KarolinskaInstitutet(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - FORMULÄR
	public static final String KarolinskaInstitutetFormulär = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {

	}
	public static WebElement KarolinskaInstitutetFormulär(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - SIDMALLAR
	public static final String KarolinskaInstitutetSidmallar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {

	}
	public static WebElement KarolinskaInstitutetSidmallar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - AVSNITTSMALLAR
	public static final String KarolinskaAvsnittsmallar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {

	}
	public static WebElement KarolinskaAvsnittsmallar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - UNDERHÅLLSTABELLER
	public static final String KarolinskaUnderhållstabeller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {

	}
	public static WebElement KarolinskaUnderhållstabeller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - DATAINSTÄLLNINGAR
	public static final String KarolinskaDataInställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {

	}
	public static WebElement KarolinskaDataInställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - KONTROLLER
	public static final String KarolinskaKontroller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {

	}
	public static WebElement KarolinskaKontroller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FORMULÄR - FORMAS
	public static final String Formas = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a"; {

	}
	public static WebElement Formas(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - FORMAS - FORMULÄR
	public static final String FormasFormulär = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {

	}
	public static WebElement FormasFormulär(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FORMULÄR - FORMAS - SIDMALLAR
	public static final String FormasSidmallar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {

	}
	public static WebElement FormasSidmallar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - FORMAS - AVSNITTSMALLAR
	public static final String FormasAvsnittsmallar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {

	}
	public static WebElement FormasAvsnittsmallar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - FORMAS - UNDERHÅLLSTABELLER
	public static final String FormasUnderhållstabeller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {

	}
	public static WebElement FormasUnderhållstabeller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - FORMAS - DATAINSTÄLLNINGAR
	public static final String FormasDatainställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {

	}
	public static WebElement FormasDatainställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - FORMAS - KONTROLLER
	public static final String FormasKontroller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {

	}
	public static WebElement FormasKontroller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}


	//FORMULÄR - VETENSKAPSRÅDET
	public static final String Vetenskapsrådet = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a"; {

	}
	public static WebElement Vetenskapsrådet(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - FORMULÄR
	public static final String VetenskapsrådetFormulär = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {

	}
	public static WebElement VetenskapsrådetFormulär(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - SIDMALLAR
	public static final String VetenskapsrådetSidmallar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {

	}
	public static WebElement VetenskapsrådetSidmallar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - AVSNITTSMALLAR
	public static final String VetenskapsrådetAvsnittsmallar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {

	}
	public static WebElement VetenskapsrådetAvsnittsmallar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - UNDERHÅLLSTABELLER
	public static final String VetenskapsrådetUnderhållstabeller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {

	}
	public static WebElement VetenskapsrådetUnderhållstabeller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - DATAINSTÄLLNINGAR
	public static final String VetenskapsrådetDataInställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {

	}
	public static WebElement VetenskapsrådetDataInställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - KONTROLLER
	public static final String VetenskapsrådetKontroller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {

	}
	public static WebElement VetenskapsrådetKontroller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FORMULÄR - FORTE
	public static final String Forte = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a"; {

	}
	public static WebElement Forte(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - FORTE - FORMULÄR
	public static final String ForteFormulär = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {

	}
	public static WebElement ForteFormulär(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FORMULÄR - FORTE - SIDMALLAR
	public static final String ForteSidmallar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {

	}
	public static WebElement ForteSidmallar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - FORTE - AVSNITTSMALLAR
	public static final String ForteAvsnittsmallar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {

	}
	public static WebElement ForteAvsnittsmallar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - FORTE - UNDERHÅLLSTABELLER
	public static final String ForteUnderhållstabeller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {

	}
	public static WebElement ForteUnderhållstabeller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - FORTE - DATAINSTÄLLNINGAR
	public static final String ForteDatainställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {

	}
	public static WebElement ForteDatainställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - FORTE - KONTROLLER
	public static final String ForteKontroller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {

	}
	public static WebElement ForteKontroller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FORMULÄR - SKOLFI
	public static final String Skolfi = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a"; {

	}
	public static WebElement Skolfi(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a"));
		return element;
	}

	//FORMULÄR - SKOLFI - FORMULÄR
	public static final String SkolfiFormulär = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {

	}
	public static WebElement SkolfiFormulär(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FORMULÄR - SKOLFI - SIDMALLAR
	public static final String SkolfiSidmallar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {

	}
	public static WebElement SkolfiSidmallar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - SKOLFI - AVSNITTSMALLAR
	public static final String SkolfiAvsnittsmallar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {

	}
	public static WebElement SkolfiAvsnittsmallar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - SKOLFI - UNDERHÅLLSTABELLER
	public static final String SkolfiUnderhållstabeller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {

	}
	public static WebElement SkolfiUnderhållstabeller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - SKOLFI - DATAINSTÄLLNINGAR
	public static final String SkolfiDatainställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {

	}
	public static WebElement SkolfiDatainställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - SKOLFI - KONTROLLER
	public static final String SkolfiKontroller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {

	}
	public static WebElement SkolfiKontroller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}

	//FORMULÄR - EPN
	public static final String EPN = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a"; {

	}
	public static WebElement EPN(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a"));
		return element;
	}

	//FORMULÄR - EPN - FORMULÄR
	public static final String EPNFormulär = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"; {

	}
	public static WebElement EPNFormulär(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a"));
		return element;
	}

	//FORMULÄR - EPN - SIDMALLAR
	public static final String EPNSidmallar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"; {

	}
	public static WebElement EPNSidmallar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a"));
		return element;
	}

	//FORMULÄR - EPN - AVSNITTSMALLAR
	public static final String EPNAvsnittsmallar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"; {

	}
	public static WebElement EPNAvsnittsmallar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a"));
		return element;
	}

	//FORMULÄR - EPN - UNDERHÅLLSTABELLER
	public static final String EPNUnderhållstabeller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"; {

	}
	public static WebElement EPNUnderhållstabeller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a"));
		return element;
	}

	//FORMULÄR - EPN - DATAINSTÄLLNINGAR
	public static final String EPNDatainställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"; {

	}
	public static WebElement EPNDatainställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a"));
		return element;
	}

	//FORMULÄR - EPN - KONTROLLER
	public static final String EpnKontroller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"; {

	}
	public static WebElement EpnKontroller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a"));
		return element;
	}


}
