package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class PortalLoggedInAsAdminFinansiär {
	private static By element = null;


	//FINANSIÄRKNAPPEN
	public static By FinansiärButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(5)");
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET
	public static By KarolinskaInstitutet(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - FINANSIÄRSINTÄLLNINGAR
	public static By KarolinskaInstitutetFinansiärsinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - GRANSKARPOOLINSTÄLLNINGAR
	public static By KarolinskaInstitutetGranskarpoolinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - INTERNA ANVÄNDARE
	public static By KarolinskaInstitutetInternaAnvändare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - ARVODESINSTÄLLNINGAR
	public static By KarolinskaInstitutetArvodesinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - SINK-ADMINISTRATION
	public static By KarolinskaInstitutetSINKAdministration(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - SÖKNYCKLAR
	public static By KarolinskaInstitutetSöknycklar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - ORGANISATIONSKONTOANSÖKNINGAR
	public static By KarolinskaInstitutetOrganisationskontoansökningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - ORGANISATIONSKONTON
	public static By KarolinskaInstitutetOrganisationskonton(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a");
		return element;
	}

	//FINANSIÄR - KAROLINSKA INSTITUTET - INTERNA FÖRFRÅGNINGAR
	public static By KarolinskaInstitutetInternaFörfråningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a");
		return element;
	}

	//FINANSIÄR - FORMAS
	public static By Formas(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSIÄR - FORMAS - FINANSIÄRSINTÄLLNINGAR
	public static By FormasFinansiärsinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FINANSIÄR - FORMAS - GRANSKARPOOLINSTÄLLNINGAR

	public static By FormasGranskarpoolinställningar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSIÄR - FORMAS - INTERNA ANVÄNDARE
	public static By FormasInternaAnvändare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSIÄR - FORMAS - ARVODESINSTÄLLNINGAR
	public static By FormasArvodesinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSIÄR - FORMAS - SINK-ADMINISTRATION
	public static By FormasSINKAdministration(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSIÄR - FORMAS - SÖKNYCKLAR
	public static By FormasSöknycklar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSIÄR - FORMAS - ORGANISATIONSKONTOANSÖKNINGAR
	public static By FormasOrganisationskontoansökningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSIÄR - FORMAS - ORGANISATIONSKONTON
	public static By FormasOrganisationskonton(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a");
		return element;
	}

	//FINANSIÄR - FORMAS - INTERNA FÖRFRÅGNINGAR
	public static By FormasInternaFörfråningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a");
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET
	public static By Vetenskapsrådet(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - FINANSIÄRSINTÄLLNINGAR
	
	public static By VetenskapsrådetFinansiärsinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - GRANSKARPOOLINSTÄLLNINGAR
	public static By VetenskapsrådetGranskarpoolinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - INTERNA ANVÄNDARE
	public static By VetenskapsrådetInternaAnvändare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - ARVODESINSTÄLLNINGAR
	public static By VetenskapsrådetArvodesinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - SINK-ADMINISTRATION
	public static By VetenskapsrådetSINKAdministration(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - SÖKNYCKLAR
	public static By VetenskapsrådetSöknycklar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - ORGANISATIONSKONTOANSÖKNINGAR
	public static By VetenskapsrådetOrganisationskontoansökningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - ORGANISATIONSKONTON
	public static By VetenskapsrådetOrganisationskonton(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a");
		return element;
	}

	//FINANSIÄR - VETENSKAPSRÅDET - INTERNA FÖRFRÅGNINGAR
	public static By VetenskapsrådetInternaFörfråningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a");
		return element;
	}

	//FINANSIÄR - FORTE
	public static By Forte(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSIÄR - FORTE - FINANSIÄRSINTÄLLNINGAR
	
	public static By ForteFinansiärsinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FINANSIÄR - FORTE - GRANSKARPOOLINSTÄLLNINGAR
	public static By ForteGranskarpoolinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSIÄR - FORTE - INTERNA ANVÄNDARE
	public static By ForteInternaAnvändare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSIÄR - FORTE - ARVODESINSTÄLLNINGAR
	public static By ForteArvodesinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSIÄR - FORTE - SINK-ADMINISTRATION

	public static By ForteSINKAdministration(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSIÄR - FORTE - SÖKNYCKLAR
	public static By ForteSöknycklar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSIÄR - FORTE - ORGANISATIONSKONTOANSÖKNINGAR
	public static By ForteOrganisationskontoansökningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSIÄR - FORTE - ORGANISATIONSKONTON
	public static By ForteOrganisationskonton(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a");
		return element;
	}

	//FINANSIÄR - FORTE - INTERNA FÖRFRÅGNINGAR
	public static By ForteInternaFörfråningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a");
		return element;
	}

	//FINANSIÄR - SKOLFI
	public static By Skolfi(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSIÄR - SKOLFI - FINANSIÄRSINTÄLLNINGAR
	public static By SkolfiFinansiärsinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FINANSIÄR - SKOLFI - GRANSKARPOOLINSTÄLLNINGAR
	public static By SkolfiGranskarpoolinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSIÄR - SKOLFI - INTERNA ANVÄNDARE
	public static By SkolfiInternaAnvändare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSIÄR - SKOLFI - ARVODESINSTÄLLNINGAR
	public static By SkolfiArvodesinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSIÄR - SKOLFI - SINK-ADMINISTRATION
	public static By SkolfiSINKAdministration(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSIÄR - SKOLFI - SÖKNYCKLAR
	public static By SkolfiSöknycklar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSIÄR - SKOLFI - ORGANISATIONSKONTOANSÖKNINGAR
	public static By SkolfiOrganisationskontoansökningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSIÄR - SKOLFI - ORGANISATIONSKONTON
	public static By SkolfiOrganisationskonton(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a");
		return element;				 
	}

	//FINANSIÄR - SKOLFI - INTERNA FÖRFRÅGNINGAR
	public static By SkolfiInternaFörfråningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a");
		return element;
	}
	
	//FINANSIÄR - EPM
	public static By EPN(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSIÄR - EPM - FINANSIÄRSINTÄLLNINGAR

	public static By EPNFinansiärsinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li.first-sub-li.menu-tree-not-active > a");
		return element;
	}

	//FINANSIÄR - EPN - GRANSKARPOOLINSTÄLLNINGAR
	public static By EPNGranskarpoolinställningar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(2) > a");
		return element;
	}

	//FINANSIÄR - EPN - INTERNA ANVÄNDARE
	public static By EPNInternaAnvändare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(3) > a");
		return element;
	}

	//FINANSIÄR - EPN - ARVODESINSTÄLLNINGAR
	public static By EPNArvodesinställningar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(4) > a");
		return element;
	}

	//FINANSIÄR - EPN - SINK-ADMINISTRATION
	public static By EPNSINKAdministration(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(5) > a");
		return element;
	}

	//FINANSIÄR - EPN - SÖKNYCKLAR
	public static By EPNSöknycklar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(6) > a");
		return element;
	}

	//FINANSIÄR - EPN - ORGANISATIONSKONTOANSÖKNINGAR
	public static By EPNOrganisationskontoansökningar(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(7) > a");
		return element;
	}

	//FINANSIÄR - EPN - ORGANISATIONSKONTON

	public static By EPNOrganisationskonton(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(8) > a");
		return element;
	}

	//FINANSIÄR - EPN - INTERNA FÖRFRÅGNINGAR
	public static By EPNInternaFörfråningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(9) > a");
		return element;
	}

	//FINANSIÄR - EPN - AVGIFTSKATEGORIER
	public static By EPNAvgiftskategorier(){
		
		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.menu-tree-li.menu-top-border.menu-tree-active > ul > li:nth-child(10) > a");
		return element;
	}



}
