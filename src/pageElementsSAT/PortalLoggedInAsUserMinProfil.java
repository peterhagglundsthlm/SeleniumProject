package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortalLoggedInAsUserMinProfil {
	static By element = null;


	//MIN PROFIL - KNAPPEN
	public static By MinProfil(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuMyProfile.active > a");
		return element;
	}

	//MIN PROFIL - START
	public static By MinProfil_Start(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a");
		return element;
	}

	//MIN PROFIL - PERSONUPPGIFTER
	public static By MinProfil_Personuppgifter(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a");
		return element;
	}

	//MIN PROFIL - UTBILDNING
	public static By MinProfil_Utbildning(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING
	public static By MinProfil_Utbildning_Forskarutbildning(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/ul/li[1]/a");
		return element;

	}
	//MIN PROFIL - UTBILDNING - KNAPP FÖR ATT LÄGGA TILL FORSKARUTBILDNING
	public static By MinProfil_Utbildning_LäggTillForskarutbildning(){

		By element = By.cssSelector("#researchEducationManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - UTBILDNING - KNAPP FÖR ATT LÄGGA TILL FORSKARUTBILDNING - SÖK ORGANISATION
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - UTBILDNING - LÄGG TILL FORSKARUTBILDNING - KNAPP FÖR ATT SPARA SÖKT ORGANISATION
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_SparaSöktOrganisationKnapp() {

		By element = By.tagName("button");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING TYP (DROPDOWN SELECT) 
	public static By MinProfil_Utbildning_TypDropDownForskarUtbildning() {
		By element = By.id("Type");
		return element;

	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN/DOKTORSEXAMEN - EXAMENSDATUM
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum() {

		By element = By.name("DateDoctorsDegree");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN/DOKTORSEXAMEN - EXAMENSDATUM - ÅR (DROPDOWN)
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumÅrDropdown() {

		By element = By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-year");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN/DOKTORSEXAMEN - EXAMENSDATUM - MÅNAD (DROPDOWN)
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumMånadDropdown() {

		By element = By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-month");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- DATUM FÖR NÄR FORSKNINGSKOMPETENS UPPNÅTTS
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumNärForskningskompetensUppnåtts() {

		By element = By.name("CompetenceAchievedDate");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- BESKRVINING AV KOMPETENS - SVENSKA
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensSV() {

		By element = By.id("DescriptionCompetenceSV");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- BESKRVINING AV KOMPETENS - ENGELSKA
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensEN() {

		By element = By.id("DescriptionCompetenceEN");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING Ämne1 (DROPDOWN SELECT) 
	public static By MinProfil_Utbildning_Ämne1DropDownForskarUtbildning() {

		By element = By.id("SubjectId_select_0");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING Ämne2 (DROPDOWN SELECT) 
	public static By MinProfil_Utbildning_Ämne2DropDownForskarUtbildning() {

		By element = By.id("SubjectId_select_1");
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING Ämne3 (DROPDOWN SELECT) 
	public static By MinProfil_Utbildning_Ämne3DropDownForskarUtbildning() {

		By element = By.id("SubjectId_select_2");
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - AVHANDLINGENS TITEL (ORGINALSPRÅK)
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelOrginalspråk() {

		By element = By.id("TitleDoctorsDegree");
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - AVHANDLINGENS TITEL (ENGELSKA)
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelEngelska() {

		By element = By.id("TitleDoctorsDegreeEN");
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - ISSN/ISBN-NUMMER
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_IssIsBnNummer() {

		By element = By.id("IsbnNumber");
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FÖRNAMN HANDLEDARE
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_FörnamnHandledare() {

		By element = By.id("FirstNameSupervisorDoctorsDegree");
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - EFTERNAMN HANDLEDARE
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_EfternamnHandledare() {

		By element = By.id("LastNameSupervisorDoctorsDegree");
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - SPARA FORSKARUTBILDNINGKNAPP
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_SparaForskarUtbildningButton() {

		By element = By.id("CreateExamPost");
		return element;
	}
	
	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - SPARA ForskningskompetensMotsvarandeDoktorsexamenKNAPP
	public static By MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamenButton() {

		By element = By.id("CreateCompetencePost");
		return element;
	}
	
	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ	
	public static By MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivå(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.active.menuItem-educationalhistory > div > ul > li:nth-child(2) > a");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - KNAPP FÖR ATT LÄGGA TILL LÄGG TILL
	public static By MinProfil_Utbildning_LäggTillUtbildningPåGrundOchAvanceradNivå(){

		By element = By.cssSelector("#basicEducationManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - ÅR FÖR EXAMEN
	public static By MinProfil_LäggTillUtbildning_UtbildningPåGrundOchAvanceradNivåÅrFörExamen(){

		By element = By.id("YearBasicDegree");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - EXAMENSINRIKTNING - ÄMNE1 (DROPDOWN SELECT) 
	public static By MinProfil_LäggTillUtbildning_Ämne1UtbildningPåGrundOchAvanceradNivå(){

		By element = By.id("BasicTrainingId_select_0");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - EXAMENSINRIKTNING - ÄMNE 2 (DROPDOWN SELECT) 
	public static By MinProfil_LäggTillUtbildning_Ämne2UtbildningPåGrundOchAvanceradNivå(){

		By element = By.id("BasicTrainingId_select_1");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - EXAMENSINRIKTNING - ÄMNE 3 (DROPDOWN SELECT) 
	public static By MinProfil_LäggTillUtbildning_Ämne3UtbildningPåGrundOchAvanceradNivå(){

		By element = By.id("BasicTrainingId_select_2");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - EXAMEN
	public static By MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåExamen(){

		By element = By.id("BasicEducationDegree");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - SPECIALISTKOMPETENS
	public static By MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetens(){

		By element = By.id("SpecialistTrainingId");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - SPECIALISTKOMPETENS ÅR
	public static By MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetensÅR(){

		By element = By.id("SpecialistTrainingYear");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - OMRÅDE/BESKRIVNING
	public static By MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåOmrådeBeskrivning(){

		By element = By.name("SpecialistTrainingDescription");
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ -SPARAKNAPP
	public static By MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSparaKnapp(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - KNAPP
	public static By MinProfil_Arbetsliv(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR
	public static By MinProfil_Arbetsliv_Anställningar(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[1]/a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - KNAPP LÄGG TILL ANSTÄLLNING
	public static By MinProfil_Arbetsliv_Anställningar_LäggTill(){

		By element = By.cssSelector("#employmentManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - SÖK ARBETSGIVARE
	public static By MinProfil_Arbetsliv_Anställningar_SökArbetsgivare(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - SPARA SÖKT ARBETSGIVARE
	public static By MinProfil_Arbetsliv_Anställningar_SparaSökArbetsgivare (){

		By element = By.xpath("//button[contains(text(), 'Spara val')]");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ANSTÄLLNING DROPDOWN
	public static By MinProfil_Arbetsliv_Anställningar_AnställningDropDown (){

		By element = By.id("Position");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ANSTÄLLNINGSFORM DROPDOWN
	public static By MinProfil_Arbetsliv_Anställningar_AnställningsFormDropDown (){

		By element = By.id("FormOfEmployment");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - DEL AV FORSKNING I ANSTÄLLNINGEN BASERAD PÅ HELTID (%)*
	public static By MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid(){

		By element = By.id("PartOfResearchInEmployment");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ANSTÄLLNINGENS BÖRJAN (YEAR)
	public static By MinProfil_Arbetsliv_Anställningar_AnställningensBörjanYear(){

		By element = By.name("StartDate.yearPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ANSTÄLLNINGENS BÖRJAN (MONTH)
	public static By MinProfil_Arbetsliv_Anställningar_AnställningensBörjanMonth(){

		By element = By.name("StartDate.monthPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ANSTÄLLNINGENS SLUT (YEAR)
	public static By MinProfil_Arbetsliv_Anställningar_AnställningensSlutYear(){

		By element = By.name("EndDate.yearPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ANSTÄLLNINGENS SLUT (MONTH)
	public static By MinProfil_Arbetsliv_Anställningar_AnställningensSlutMonth(){

		By element = By.name("EndDate.monthPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ÖVRIG INFORMATION
	public static By MinProfil_Arbetsliv_Anställningar_ÖvrigInformation(){

		By element = By.id("OtherInformation");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - SPARA ANSTÄLLNING
	public static By MinProfil_Arbetsliv_Anställningar_SparaAnställning(){

		By element = By.name("Submitter");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser
	public static By MinProfil_Arbetsliv_Postdoktorvistelser(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[2]/a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - LÄGG TILL KNAPP
	public static By MinProfil_Arbetsliv_PostdoktorvistelserLäggTill(){

		By element = By.cssSelector("#postDoctorialManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - SÖK ORGANISATION
	public static By MinProfil_Arbetsliv_PostdoktorvistelserSökOrganisation(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - SPARA SÖKt ORGANISATION
	public static By MinProfil_Arbetsliv_PostdoktorvistelserSparaSöktOrganisation(){

		By element = By.tagName("Button");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - ÄMNE 1 (DROPDOWN)
	public static By MinProfil_Arbetsliv_PostdoktorvistelserÄmne1(){

		By element = By.id("SubjectId_select_0");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - ÄMNE 2 (DROPDOWN)
	public static By MinProfil_Arbetsliv_PostdoktorvistelserÄmne2(){

		By element = By.id("SubjectId_select_1");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - ÄMNE 3 (DROPDOWN)
	public static By MinProfil_Arbetsliv_PostdoktorvistelserÄmne3(){

		By element = By.id("SubjectId_select_2");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSTART ÅR
	public static By MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartYear(){

		By element = By.name("PeriodStartDate.yearPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSLUT ÅR
	public static By MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndYear(){

		By element = By.name("PeriodStopDate.yearPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSTART MÅNAD
	public static By MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartMonth(){

		By element = By.name("PeriodStartDate.monthPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSLUT MÅNAD
	public static By MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndMonth(){

		By element = By.name("PeriodStopDate.monthPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - SPARA Postdoktorvistelser
	public static By MinProfil_Arbetsliv_PostdoktorvistelserSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN
	public static By MinProfil_Arbetsliv_Forskarutbyten(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[3]/a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - LÄGG TILL KNAPP
	public static By MinProfil_Arbetsliv_ForskarutbytenLäggTill(){

		By element = By.cssSelector("#ResearchExchangeManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - SÖK ORGANISATION
	public static By MinProfil_Arbetsliv_ForskarutbytenSökOrganisation(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - SPARA SÖKT ORGANISATION
	public static By MinProfil_Arbetsliv_ForskarutbytenSparaSöktOrganisation(){

		By element = By.tagName("Button");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - ÄMNE 1 (DROPDOWN)
	public static By MinProfil_Arbetsliv_ForskarutbyteÄmne1(){

		By element = By.id("ScbTableId_select_0");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - ÄMNE 2 (DROPDOWN)
	public static By MinProfil_Arbetsliv_ForskarutbyteÄmne2(){

		By element = By.id("ScbTableId_select_1");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - ÄMNE 3 (DROPDOWN)
	public static By MinProfil_Arbetsliv_ForskarutbyteÄmne3(){

		By element = By.id("ScbTableId_select_2");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - TYP (DROPDOWN)
	public static By MinProfil_Arbetsliv_ForskarutbyteTyp(){

		By element = By.id("Type");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSTART (YEAR) (DROPDOWN)
	public static By MinProfil_Arbetsliv_ForskarutbytenPeriodStartYear(){

		By element = By.name("StartDate.yearPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSTART (MONTH) (DROPDOWN)
	public static By MinProfil_Arbetsliv_ForskarutbytenPeriodStartMonth(){

		By element = By.name("StartDate.monthPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSLUT (YEAR) (DROPDOWN)
	public static By MinProfil_Arbetsliv_ForskarutbytenPeriodSlutYear(){

		By element = By.name("StopDate.yearPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSLUT (MONTH) (DROPDOWN)
	public static By MinProfil_Arbetsliv_ForskarutbytenPeriodSlutMonth(){

		By element = By.name("StopDate.monthPicker");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - SPARA FORSKARUTBYTE
	public static By MinProfil_Arbetsliv_ForskarutbytenSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEHÅLL I FORSKNINGEN
	public static By MinProfil_Arbetsliv_UppehållIForskningen(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[4]/a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEHÅLL I FORSKNINGEN - LÄGG TILL KNAPP
	public static By MinProfil_Arbetsliv_UppehållIForskningenLäggTill(){

		By element = By.cssSelector("#InterruptionInResearchManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEHÅLL I FORSKNINGEN - STARTDATUM
	public static By MinProfil_Arbetsliv_UppehållIForskningenStartDatum (){

		By element = By.name("StartDate");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEHÅLL I FORSKNINGEN - SLUTDATUM
	public static By MinProfil_Arbetsliv_UppehållIForskningenSlutDatum(){

		By element = By.name("EndDate");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEHÅLL I FORSKNINGEN - SLUTDATUM
	public static By MinProfil_Arbetsliv_UppehållIForskningenBeskrivning(){

		By element = By.id("Description");
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEHÅLL I FORSKNINGEN - SPARA
	public static By MinProfil_Arbetsliv_UppehållIForskningenSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER
	public static By MinProfil_Publikationer(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - PUBLIKATIONER
	public static By MinProfil_Publikationer_Publikationer(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/ul/li/a");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - LÄGG TILL
	public static By MinProfil_Publikationer_LäggTill(){

		By element = By.cssSelector("#PublicationManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - PUBLIKATIONSTYP
	public static By MinProfil_Publikationer_Publikationstyp(){

		By element = By.id("PublicationType");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FACKGRANSKADE (DROPDOWN) - Bidrag till bok, Bok, Konferensbidrag osv
	public static By MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown(){

		By element = By.id("PublicationFormPeerReviewed");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION -  INTE FACKGRANSKADE (DROPDOWN) - Bidrag till bok, Bok, Konferensbidrag osv
	public static By MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown(){

		By element = By.id("PublicationFormNotPeerReviewed");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - TITEL
	public static By MinProfil_Publikationer_VetenskapligPublikationTitel (){

		By element = By.id("Title");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FÖRFATTARE-KNAPP
	public static By MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp (){

		By element = By.id("btnAuthorAdd");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FÖRFATTARE-FÖRNAMN
	public static By MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(){

		By element = By.id("Authors_0__FirstName");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FÖRFATTARE-EFTERNAMN
	public static By MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(){

		By element = By.id("Authors_0__LastName");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - NAMN PÅ TIDSKRIFT
	public static By MinProfil_Publikationer_VetenskapligPublikationNamnPåTidskrift(){

		By element = By.id("JournalName");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - VOLYM
	public static By MinProfil_Publikationer_VetenskapligPublikationVolym(){

		By element = By.id("Volume");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - UTFÄRDANDENUMMER
	public static By MinProfil_Publikationer_VetenskapligPublikationUtfärdandenummer(){

		By element = By.id("IssueNumber");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - REDAKTÖR-KNAPP
	public static By MinProfil_Publikationer_VetenskapligPublikationRedaktörKnapp(){

		By element = By.id("btnEditorAdd");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - REDAKTÖR-NAMN
	public static By MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn(){

		By element = By.id("Editors_0__Name");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FÖRLAG
	public static By MinProfil_Publikationer_VetenskapligPublikationFörlag(){

		By element = By.id("PublishingHouse");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FÖRLAGSPLATS
	public static By MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(){

		By element = By.id("PublishingPlace");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FÖRSTA SIDNUMMER
	public static By MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer(){

		By element = By.id("FirstPageNumber");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SISTA SIDNUMMER
	public static By MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(){

		By element = By.id("LastPageNumber");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - ISBN
	public static By MinProfil_Publikationer_VetenskapligPublikationISBN(){

		By element = By.id("Isbn");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - DOI
	public static By MinProfil_Publikationer_VetenskapligPublikationDOI(){

		By element = By.id("Doi");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - UTGIVARE-STATUS(DROPDOWN)
	public static By MinProfil_Publikationer_VetenskapligPublikationStatus(){

		By element = By.id("MagazineStatus");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - KÄLLA FÖR PUBLIKATION (DROPDOWN)
	public static By MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation(){

		By element = By.id("SourceImportedDocument");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - KÄLLA ID
	public static By MinProfil_Publikationer_VetenskapligPublikationKällaID(){

		By element = By.id("Source");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - VAR TEXTEN PUBLICERAD I OPEN ACCESS (DROPDOWN)
	public static By MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown(){

		By element = By.id("OpenAccessStatus");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - LÄNK/EXTERN LÄNK FÖR PUBLICERING
	public static By MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(){

		By element = By.id("LinkExternal");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FORM AV OA (DROPDOWN)
	public static By MinProfil_Publikationer_VetenskapligPublikationFormAvOA(){

		By element = By.id("OAForm");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - DOKUMENTVERSION (DROPDOWN)
	public static By MinProfil_Publikationer_VetenskapligPublikationDokumentversion(){

		By element = By.id("DocumentVersion");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SAMMANFATTNING
	public static By MinProfil_Publikationer_VetenskapligPublikationSammanfattning(){

		By element = By.id("Abstract");
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SPARA KNAPP
	public static By MinProfil_Publikationer_VetenskapligPublikationSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER
	public static By MinProfil_MeriterOchUtmärkelser(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR
	public static By MinProfil_MeriterOchUtmärkelser_Docentur(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[1]/a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - LÄGG TILL KNAPP
	public static By MinProfil_MeriterOchUtmärkelser_DocenturLäggTill(){

		By element = By.cssSelector("#associateProfessorManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - SÖK ORGANISATION
	public static By MinProfil_MeriterOchUtmärkelser_DocenturSökOrganisation(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - SPARA SÖKT ORGANISATION
	public static By MinProfil_MeriterOchUtmärkelser_DocenturSparaSöktOrganisation(){

		By element = By.tagName("Button");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - ÄMNE1
	public static By MinProfil_MeriterOchUtmärkelser_DocenturÄmne1(){

		By element = By.id("SubjectId_select_0");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - ÄMNE2
	public static By MinProfil_MeriterOchUtmärkelser_DocenturÄmne2(){

		By element = By.id("SubjectId_select_1");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - ÅR
	public static By MinProfil_MeriterOchUtmärkelser_DocenturÅr(){

		By element = By.id("Year");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - SPARA
	public static By MinProfil_MeriterOchUtmärkelser_DocenturSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER
	public static By MinProfil_MeriterOchUtmärkelser_HandleddaPersoner(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[2]/a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - LÄGG TILL ENSKILD PERSON KNAPP
	public static By MinProfil_MeriterOchUtmärkelser_HandleddaPersonerLäggTillEnskildPersonKnapp(){

		By element = By.cssSelector("#supervisedPersonManagementSectionId > div.row-fluid.button-wrapper > div > a:nth-child(1)");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - SÖK LÄROSÄTE HANDLEDARE
	public static By MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSökOrganisationHandledare(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - SPARA SÖKT LÄROSÄTE HANDLEDARE
	public static By MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSparaSökOrganisationHandledare(){

		By element = By.tagName("Button");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - SÖK LÄROSÄTE STUDENT/DOKTORAND/POSTDOK
	public static By MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSökOrganisationStudent(){

		By element = By.name("Search.autoCompleteTextBox");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - SPARA SÖKT LÄROSÄTE STUDENT
	public static By MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSparaSökOrganisationStudent(){

		By element = By.tagName("Button");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - FÖRNAMN
	public static By MinProfil_MeriterOchUtmärkelser_HandleddaPersonerFörnamn(){

		By element = By.id("FirstName");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - FÖRNAMN
	public static By MinProfil_MeriterOchUtmärkelser_HandleddaPersonerEfternamn(){

		By element = By.id("LastName");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - SLUTÅR
	public static By MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSlutår(){

		By element = By.id("SupervisionEndYear");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - TYP AV HANDLEDDA PERSONER
	public static By MinProfil_MeriterOchUtmärkelser_HandleddaPersonerTypAvHandleddaPerson(){

		By element = By.id("TypeId");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - ROLL
	public static By MinProfil_MeriterOchUtmärkelser_HandleddaPersonerRoll(){

		By element = By.id("RoleId");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - SPARA ENSKILD PERSON
	public static By MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSparaEnskildPerson(){

		By element = By.id("Submitter");
		return element;
	}


	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS
	public static By MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrens(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[3]/a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - LÄGG TILL
	public static By MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensLäggTill(){

		By element = By.cssSelector("#ResearchGrantsAwardedInCompetitionManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - FINANSIÄR DROPDOWN 1
	public static By MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensFinansiärDropDown1(){

		By element = By.name("FunderId_select_0");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - FINANSIÄR DROPDOWN 2
	public static By MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensFinansiärDropDown2(){

		By element = By.name("FunderId_select_1");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - PROJEKTLEDARE
	public static By MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensProjektledare(){

		By element = By.id("Applicant");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - LAND
	public static By MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensLand(){

		By element = By.id("OtherCountry");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - PROJEKTTITEL
	public static By MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensProjekttitel(){

		By element = By.id("ProjectTitle");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - DNR
	public static By MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensDnr(){

		By element = By.id("DiaryNumber");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - STARTÅR
	public static By MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensStartår(){

		By element = By.id("PeriodStartYear");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - SLUTÅR
	public static By MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensSlutår(){

		By element = By.id("PeriodEndYear");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - DIN ROLL
	public static By MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensDinRoll(){

		By element = By.id("RoleId");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - TOTALT BELOPP (KR)
	public static By MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensTotaltBeloppKr(){

		By element = By.id("Amount");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - SPARA
	public static By MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensSpara(){

		By element = By.id("Create");
		return element;
	}




	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER
	public static By MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelser(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[4]/a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - LÄGG TILL
	public static By MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLäggTill(){

		By element = By.cssSelector("#AwardAndDistinctionManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - ÅR
	public static By MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserÅr(){

		By element = By.id("YearOfAward");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - LAND
	public static By MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLand(){

		By element = By.id("selectedCountryDropDown");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - NAMN PÅ PRISET/UTMÄRKELSEN
	public static By MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserNamnPåPriset(){

		By element = By.id("Award");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - UTFÄRDARE
	public static By MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserUtfärdare(){

		By element = By.id("Issuer");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - BESKRIVNING
	public static By MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserBeskrivning(){

		By element = By.id("Description");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - SPARA
	public static By MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER
	public static By MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriter(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[5]/a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER - LÄGG TILL
	public static By MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterLäggTill(){

		By element = By.cssSelector("#RelevantAndOtherMeritsManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER - STARTÅR
	public static By MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterStartår(){

		By element = By.id("StartYear");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER - SLUTÅR
	public static By MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSlutår(){

		By element = By.id("EndYear");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER - TYP AV MERIT
	public static By MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterTypAvMerit(){

		By element = By.name("OtherMerits");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER - BESKRIVNING
	public static By MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterBeskrivning(){

		By element = By.name("RelevantMerits");
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER - SPARA
	public static By MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSpara(){

		By element = By.name("Submitter");
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT
	public static By MinProfil_Immaterialrätt(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a");
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - IMMATERIALRÄTT
	public static By MinProfil_Immaterialrätt_Immaterialrätt(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/ul/li/a");
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - LÄGG TILL
	public static By MinProfil_ImmaterialrättLäggTill(){

		By element = By.cssSelector("#patentManagementSectionId > div.row-fluid.button-wrapper > div > a");
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - TYP
	public static By MinProfil_ImmaterialrättTyp(){

		By element = By.id("Type");
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - ID
	public static By MinProfil_ImmaterialrättId(){

		By element = By.id("IPNumber");
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - DATUM FÖR BEVILJANDE
	public static By MinProfil_ImmaterialrättDatumFörBeviljande(){

		By element = By.name("DateApproved");
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - DATUM FÖR BEVILJANDE - ÅR DROPDOWN I KALENDER
	public static By MinProfil_ImmaterialrättDatumFörBeviljandeKalenderÅrDropDown(){

		By element = By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-year");
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - DATUM FÖR BEVILJANDE - Månad DROPDOWN I KALENDER
	public static By MinProfil_ImmaterialrättDatumFörBeviljandeKalenderMånadDropDown(){

		By element = By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-month");
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - PRODUKTKLASSIFICERING 1
	public static By MinProfil_ImmaterialrättProduktKlassificering1(){

		By element = By.name("ProductClassificationId_select_0");
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - PRODUKTKLASSIFICERING 2
	public static By MinProfil_ImmaterialrättProduktKlassificering2(){

		By element = By.name("ProductClassificationId_select_1");
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - LICENSIERAD TILL ANNAN
	public static By MinProfil_ImmaterialrättLicensieradTillAnnan(){

		By element = By.id("LicensedToOtherPart");
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - LICENSIERAD TILL ANNAN DROPDOWN
	public static By MinProfil_ImmaterialrättLicensieradTillAnnanDropwDown(){

		By element = By.id("LicensedToOtherTypeId");
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - SPARA
	public static By MinProfil_ImmaterialrättSpara(){

		By element = By.id("Submitter");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS
	public static By MinProfil_Granskarkompetens(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMRÅDE 1
	public static By MinProfil_GranskarkompetensKIDForskningsområde1(){

		By element = By.id("competenceSelectors_0__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMRÅDE 2
	public static By MinProfil_GranskarkompetensKIDForskningsområde2(){

		By element = By.id("competenceSelectors_1__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMRÅDE 3
	public static By MinProfil_GranskarkompetensKIDForskningsområde3(){

		By element = By.id("competenceSelectors_2__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMRÅDE 4
	public static By MinProfil_GranskarkompetensKIDForskningsområde4(){

		By element = By.id("competenceSelectors_3__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMRÅDE 5
	public static By MinProfil_GranskarkompetensKIDForskningsområde5(){

		By element = By.id("competenceSelectors_4__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 1
	public static By MinProfil_GranskarkompetensKIDMetod1(){

		By element = By.id("competenceSelectors_5__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 2
	public static By MinProfil_GranskarkompetensKIDMetod2(){

		By element = By.id("competenceSelectors_6__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 3
	public static By MinProfil_GranskarkompetensKIDMetod3(){

		By element = By.id("competenceSelectors_7__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 4
	public static By MinProfil_GranskarkompetensKIDMetod4(){

		By element = By.id("competenceSelectors_8__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 5
	public static By MinProfil_GranskarkompetensKIDMetod5(){

		By element = By.id("competenceSelectors_9__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 1
	public static By MinProfil_GranskarkompetensKIDNyckelord1(){

		By element = By.id("competenceSelectors_10__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 2
	public static By MinProfil_GranskarkompetensKIDNyckelord2(){

		By element = By.id("competenceSelectors_11__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 3
	public static By MinProfil_GranskarkompetensKIDNyckelord3(){

		By element = By.id("competenceSelectors_12__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 4
	public static By MinProfil_GranskarkompetensKIDNyckelord4(){

		By element = By.id("competenceSelectors_13__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 5
	public static By MinProfil_GranskarkompetensKIDNyckelord5(){

		By element = By.id("competenceSelectors_14__SelectedItemId");
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - SPARA
	public static By MinProfil_GranskarkompetensKIDSpara(){

		By element = By.id("Submitter");
		return element;
	}
}


