package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class PortalLoggedInAsAdminFormulär {
	private static By element = null;

	//FORMULÄRKNAPPEN
	public static By FormulärButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(6)");
		return element;	
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET
	public static By KarolinskaInstitutet(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a");
		return element;	
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - FORMULÄR
	public static By KarolinskaInstitutetFormulär(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;	
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - SIDMALLAR
	public static By KarolinskaInstitutetSidmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - AVSNITTSMALLAR
	public static By KarolinskaAvsnittsmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - UNDERHÅLLSTABELLER
	public static By KarolinskaUnderhållstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - DATAINSTÄLLNINGAR
	public static By KarolinskaDataInställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMULÄR - KAROLINSKA UNIVERSITET - KONTROLLER

	public static By KarolinskaKontroller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FORMULÄR - FORMAS
	public static By Formas(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMULÄR - FORMAS - FORMULÄR

	public static By FormasFormulär(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FORMULÄR - FORMAS - SIDMALLAR
	public static By FormasSidmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FORMULÄR - FORMAS - AVSNITTSMALLAR
	public static By FormasAvsnittsmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMULÄR - FORMAS - UNDERHÅLLSTABELLER

	public static By FormasUnderhållstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMULÄR - FORMAS - DATAINSTÄLLNINGAR

	public static By FormasDatainställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMULÄR - FORMAS - KONTROLLER

	public static By FormasKontroller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}


	//FORMULÄR - VETENSKAPSRÅDET
	public static By Vetenskapsrådet(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - FORMULÄR
	public static By VetenskapsrådetFormulär(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - SIDMALLAR
	public static By VetenskapsrådetSidmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - AVSNITTSMALLAR
	public static By VetenskapsrådetAvsnittsmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - UNDERHÅLLSTABELLER
	public static By VetenskapsrådetUnderhållstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - DATAINSTÄLLNINGAR

	public static By VetenskapsrådetDataInställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMULÄR - VETENSKAPSRÅDET - KONTROLLER
	public static By VetenskapsrådetKontroller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FORMULÄR - FORTE

	public static By Forte(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMULÄR - FORTE - FORMULÄR
	public static By ForteFormulär(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FORMULÄR - FORTE - SIDMALLAR
	public static By ForteSidmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FORMULÄR - FORTE - AVSNITTSMALLAR
	public static By ForteAvsnittsmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMULÄR - FORTE - UNDERHÅLLSTABELLER
	public static By ForteUnderhållstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMULÄR - FORTE - DATAINSTÄLLNINGAR
	public static By ForteDatainställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMULÄR - FORTE - KONTROLLER
	public static By ForteKontroller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FORMULÄR - SKOLFI
	public static By Skolfi(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a");
		return element;
	}

	//FORMULÄR - SKOLFI - FORMULÄR

	public static By SkolfiFormulär(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FORMULÄR - SKOLFI - SIDMALLAR
	public static By SkolfiSidmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FORMULÄR - SKOLFI - AVSNITTSMALLAR
	public static By SkolfiAvsnittsmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMULÄR - SKOLFI - UNDERHÅLLSTABELLER
	public static By SkolfiUnderhållstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMULÄR - SKOLFI - DATAINSTÄLLNINGAR
	public static By SkolfiDatainställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMULÄR - SKOLFI - KONTROLLER
	public static By SkolfiKontroller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FORMULÄR - EPN
	public static By EPN(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a");
		return element;
	}

	//FORMULÄR - EPN - FORMULÄR
	public static By EPNFormulär(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FORMULÄR - EPN - SIDMALLAR
	public static By EPNSidmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FORMULÄR - EPN - AVSNITTSMALLAR
	public static By EPNAvsnittsmallar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FORMULÄR - EPN - UNDERHÅLLSTABELLER
	public static By EPNUnderhållstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FORMULÄR - EPN - DATAINSTÄLLNINGA
	public static By EPNDatainställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FORMULÄR - EPN - KONTROLLER
	public static By EpnKontroller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}


}
