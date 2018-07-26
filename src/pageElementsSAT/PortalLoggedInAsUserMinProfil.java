package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoggedInAsUserMinProfil {
	private static WebElement element = null;


	//MIN PROFIL - KNAPPEN
	public static final String MinProfil = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuMyProfile.active > a"; {
	}
	public static WebElement MinProfil(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuMyProfile.active > a"));
		return element;
	}

	//MIN PROFIL - START
	public static final String MinProfil_Start = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement MinProfil_Start(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//MIN PROFIL - PERSONUPPGIFTER
	public static final String MinProfil_Personuppgifter = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement MinProfil_Personuppgifter(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING
	public static final String MinProfil_Utbildning = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"; {
	}
	public static WebElement MinProfil_Utbildning(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING
	public static final String MinProfil_Utbildning_Forskarutbildning = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/ul/li[1]/a"; {
	}
	public static WebElement MinProfil_Utbildning_Forskarutbildning(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/ul/li[1]/a"));
		return element;

	}
	//MIN PROFIL - UTBILDNING - KNAPP FÖR ATT LÄGGA TILL FORSKARUTBILDNING
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning = "#researchEducationManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning(WebDriver driver){

		element = driver.findElement(By.cssSelector("#researchEducationManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - KNAPP FÖR ATT LÄGGA TILL FORSKARUTBILDNING - SÖK ORGANISATION
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - LÄGG TILL FORSKARUTBILDNING - KNAPP FÖR ATT SPARA SÖKT ORGANISATION
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning_SparaSöktOrganisationKnapp= "button"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_SparaSöktOrganisationKnapp(WebDriver driver) {

		element = driver.findElement(By.tagName("button"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING TYP (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_TypDropDownForskarUtbildning = "Type"; {
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN/DOKTORSEXAMEN - EXAMENSDATUM
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum = "DateDoctorsDegree"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum(WebDriver driver) {

		element = driver.findElement(By.name("DateDoctorsDegree"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN/DOKTORSEXAMEN - EXAMENSDATUM - ÅR (DROPDOWN)
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumÅrDropdown = "#ui-datepicker-div > div > div > select.ui-datepicker-year"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumÅrDropdown(WebDriver driver) {

		element = driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-year"));
		return element;
	}
	
	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - LICENTIATEXAMEN/DOKTORSEXAMEN - EXAMENSDATUM - MÅNAD (DROPDOWN)
		public static final String MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumMånadDropdown = "#ui-datepicker-div > div > div > select.ui-datepicker-month"; {
		}
		public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatumMånadDropdown(WebDriver driver) {

			element = driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-month"));
			return element;
		}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- DATUM FÖR NÄR FORSKNINGSKOMPETENS UPPNÅTTS
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumNärForskningskompetensUppnåtts = "CompetenceAchievedDate"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumNärForskningskompetensUppnåtts(WebDriver driver) {

		element = driver.findElement(By.name("CompetenceAchievedDate"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- BESKRVINING AV KOMPETENS - SVENSKA
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensSV = "DescriptionCompetenceSV"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensSV(WebDriver driver) {

		element = driver.findElement(By.id("DescriptionCompetenceSV"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FORSKNINGSKOMPETENS MOSVARANDE DOKTORSEXAMEN- BESKRVINING AV KOMPETENS - ENGELSKA
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensEN = "DescriptionCompetenceEN"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensEN(WebDriver driver) {

		element = driver.findElement(By.id("DescriptionCompetenceEN"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING Ämne1 (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_Ämne1DropDownForskarUtbildning = "SubjectId_select_0"; {
	}
	public static WebElement MinProfil_Utbildning_Ämne1DropDownForskarUtbildning(WebDriver driver) {

		element = driver.findElement(By.id("SubjectId_select_0"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING Ämne2 (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_Ämne2DropDownForskarUtbildning = "SubjectId_select_1"; {
	}
	public static WebElement MinProfil_Utbildning_Ämne2DropDownForskarUtbildning(WebDriver driver) {

		element = driver.findElement(By.id("SubjectId_select_1"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - FORSKARUTBILDNING Ämne3 (DROPDOWN SELECT) 
	public static final String MinProfil_Utbildning_Ämne3DropDownForskarUtbildning = "SubjectId_select_2"; {
	}
	public static WebElement MinProfil_Utbildning_Ämne3DropDownForskarUtbildning(WebDriver driver) {

		element = driver.findElement(By.id("SubjectId_select_2"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - AVHANDLINGENS TITEL (ORGINALSPRÅK)
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelOrginalspråk = "TitleDoctorsDegree"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelOrginalspråk(WebDriver driver) {

		element = driver.findElement(By.id("TitleDoctorsDegree"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - AVHANDLINGENS TITEL (ENGELSKA)
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelEngelska = "TitleDoctorsDegreeEN"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelEngelska(WebDriver driver) {

		element = driver.findElement(By.id("TitleDoctorsDegreeEN"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - ISSN/ISBN-NUMMER
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning_IssIsBnNummer = "IsbnNumber"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_IssIsBnNummer(WebDriver driver) {

		element = driver.findElement(By.id("IsbnNumber"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - FÖRNAMN HANDLEDARE
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning_FörnamnHandledare = "FirstNameSupervisorDoctorsDegree"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_FörnamnHandledare(WebDriver driver) {

		element = driver.findElement(By.id("FirstNameSupervisorDoctorsDegree"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - EFTERNAMN HANDLEDARE
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning_EfternamnHandledare = "LastNameSupervisorDoctorsDegree"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_EfternamnHandledare(WebDriver driver) {

		element = driver.findElement(By.id("LastNameSupervisorDoctorsDegree"));
		return element;
	}

	////MIN PROFIL - UTBILDNING - FORSKARUTBILDNING - SPARA FORSKARUTBILDNINGKNAPP
	public static final String MinProfil_Utbildning_LäggTillForskarutbildning_SparaForskarUtbildningButton = "CreateExamPost"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillForskarutbildning_SparaForskarUtbildningButton(WebDriver driver) {

		element = driver.findElement(By.id("CreateExamPost"));
		return element;
	}


	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ	
	public static final String MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivå = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.active.menuItem-educationalhistory > div > ul > li:nth-child(2) > a"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivå(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li.active.menuItem-educationalhistory > div > ul > li:nth-child(2) > a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - KNAPP FÖR ATT LÄGGA TILL LÄGG TILL
	public static final String MinProfil_LäggTillUtbildning_UtbildningPåGrundOchAvanceradNivå = "#basicEducationManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Utbildning_LäggTillUtbildningPåGrundOchAvanceradNivå(WebDriver driver){

		element = driver.findElement(By.cssSelector("#basicEducationManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - ÅR FÖR EXAMEN
	public static final String MinProfil_LäggTillUtbildning_UtbildningPåGrundOchAvanceradNivåÅrFörExamen = "YearBasicDegree"; {
	}
	public static WebElement MinProfil_LäggTillUtbildning_UtbildningPåGrundOchAvanceradNivåÅrFörExamen(WebDriver driver){

		element = driver.findElement(By.id("YearBasicDegree"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - EXAMENSINRIKTNING - ÄMNE1 (DROPDOWN SELECT) 
	public static final String MinProfil_LäggTillUtbildning_Ämne1UtbildningPåGrundOchAvanceradNivå = "BasicTrainingId_select_0"; {
	}
	public static WebElement MinProfil_LäggTillUtbildning_Ämne1UtbildningPåGrundOchAvanceradNivå(WebDriver driver){

		element = driver.findElement(By.id("BasicTrainingId_select_0"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - EXAMENSINRIKTNING - ÄMNE 2 (DROPDOWN SELECT) 
	public static final String MinProfil_LäggTillUtbildning_Ämne2UtbildningPåGrundOchAvanceradNivå = "BasicTrainingId_select_1"; {
	}
	public static WebElement MinProfil_LäggTillUtbildning_Ämne2UtbildningPåGrundOchAvanceradNivå(WebDriver driver){

		element = driver.findElement(By.id("BasicTrainingId_select_1"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - EXAMENSINRIKTNING - ÄMNE 3 (DROPDOWN SELECT) 
	public static final String MinProfil_LäggTillUtbildning_Ämne3UtbildningPåGrundOchAvanceradNivå = "BasicTrainingId_select_2"; {
	}
	public static WebElement MinProfil_LäggTillUtbildning_Ämne3UtbildningPåGrundOchAvanceradNivå(WebDriver driver){

		element = driver.findElement(By.id("BasicTrainingId_select_2"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - EXAMEN
	public static final String MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåExamen = "BasicEducationDegree"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåExamen(WebDriver driver){

		element = driver.findElement(By.id("BasicEducationDegree"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - SPECIALISTKOMPETENS
	public static final String MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetens = "SpecialistTrainingId"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetens(WebDriver driver){

		element = driver.findElement(By.id("SpecialistTrainingId"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - SPECIALISTKOMPETENS ÅR
	public static final String MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetensÅR = "SpecialistTrainingYear"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetensÅR(WebDriver driver){

		element = driver.findElement(By.id("SpecialistTrainingYear"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ - OMRÅDE/BESKRIVNING
	public static final String MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåOmrådeBeskrivning = "SpecialistTrainingDescription"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåOmrådeBeskrivning(WebDriver driver){

		element = driver.findElement(By.name("SpecialistTrainingDescription"));
		return element;
	}

	//MIN PROFIL - UTBILDNING - UTBILDNING PÅ GRUND OCH AVANCERAD NIVÅ -SPARAKNAPP
	public static final String MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSparaKnapp = "Submitter"; {
	}
	public static WebElement MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSparaKnapp(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV
	public static final String MinProfil_Arbetsliv = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"; {
	}
	public static WebElement MinProfil_Arbetsliv(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"));
		return element;

	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR
	public static final String MinProfil_Arbetsliv_Anställningar = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[1]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anställningar(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[1]/a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - KNAPP LÄGG TILL ANSTÄLLNING
	public static final String MinProfil_Arbetsliv_Anställningar_LäggTill = "#employmentManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anställningar_LäggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#employmentManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - SÖK ARBETSGIVARE
	public static final String MinProfil_Arbetsliv_Anställningar_SökArbetsgivare = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anställningar_SökArbetsgivare(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - SPARA SÖKT ARBETSGIVARE
	public static final String MinProfil_Arbetsliv_Anställningar_SparaSökArbetsgivare = "//button[contains(text(), 'Spara val')]"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anställningar_SparaSökArbetsgivare (WebDriver driver){

		element = driver.findElement(By.xpath("//button[contains(text(), 'Spara val')]"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ANSTÄLLNING DROPDOWN
	public static final String MinProfil_Arbetsliv_Anställningar_AnställningDropDown = "Position"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anställningar_AnställningDropDown (WebDriver driver){

		element = driver.findElement(By.id("Position"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ANSTÄLLNINGSFORM DROPDOWN
	public static final String MinProfil_Arbetsliv_Anställningar_AnställningsFormDropDown = "FormOfEmployment"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anställningar_AnställningsFormDropDown (WebDriver driver){

		element = driver.findElement(By.id("FormOfEmployment"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - DEL AV FORSKNING I ANSTÄLLNINGEN BASERAD PÅ HELTID (%)*
	public static final String MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid = "PartOfResearchInEmployment"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid(WebDriver driver){

		element = driver.findElement(By.id("PartOfResearchInEmployment"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ANSTÄLLNINGENS BÖRJAN (YEAR)
	public static final String MinProfil_Arbetsliv_Anställningar_AnställningensBörjanYear = "StartDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anställningar_AnställningensBörjanYear(WebDriver driver){

		element = driver.findElement(By.name("StartDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ANSTÄLLNINGENS BÖRJAN (MONTH)
	public static final String MinProfil_Arbetsliv_Anställningar_AnställningensBörjanMonth = "StartDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anställningar_AnställningensBörjanMonth(WebDriver driver){

		element = driver.findElement(By.name("StartDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ANSTÄLLNINGENS SLUT (YEAR)
	public static final String MinProfil_Arbetsliv_Anställningar_AnställningensSlutYear = "EndDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anställningar_AnställningensSlutYear(WebDriver driver){

		element = driver.findElement(By.name("EndDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ANSTÄLLNINGENS SLUT (MONTH)
	public static final String MinProfil_Arbetsliv_Anställningar_AnställningensSlutMonth = "EndDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anställningar_AnställningensSlutMonth(WebDriver driver){

		element = driver.findElement(By.name("EndDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - ÖVRIG INFORMATION
	public static final String MinProfil_Arbetsliv_Anställningar_ÖvrigInformation = "OtherInformation"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anställningar_ÖvrigInformation(WebDriver driver){

		element = driver.findElement(By.id("OtherInformation"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - ANSTÄLLNINGAR - SPARA ANSTÄLLNING
	public static final String MinProfil_Arbetsliv_Anställningar_SparaAnställning = "Submitter"; {
	}
	public static WebElement MinProfil_Arbetsliv_Anställningar_SparaAnställning(WebDriver driver){

		element = driver.findElement(By.name("Submitter"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser
	public static final String MinProfil_Arbetsliv_Postdoktorvistelser = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[2]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Postdoktorvistelser(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[2]/a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - LÄGG TILL KNAPP
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserLäggTill = "#postDoctorialManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserLäggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#postDoctorialManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - SÖK ORGANISATION
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserSökOrganisation = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserSökOrganisation(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - SPARA SÖKt ORGANISATION
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserSparaSöktOrganisation = "Button"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserSparaSöktOrganisation(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - ÄMNE 1 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserÄmne1 = "SubjectId_select_0"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserÄmne1(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_0"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - ÄMNE 2 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserÄmne2 = "SubjectId_select_1"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserÄmne2(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_1"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - ÄMNE 3 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserÄmne3 = "SubjectId_select_2"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserÄmne3(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_2"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSTART ÅR
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartYear = "PeriodStartDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartYear(WebDriver driver){

		element = driver.findElement(By.name("PeriodStartDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSLUT ÅR
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndYear = "PeriodStopDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndYear(WebDriver driver){

		element = driver.findElement(By.name("PeriodStopDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSTART MÅNAD
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartMonth = "PeriodStartDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartMonth(WebDriver driver){

		element = driver.findElement(By.name("PeriodStartDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - PERIODSLUT MÅNAD
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndMonth = "PeriodStopDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndMonth(WebDriver driver){

		element = driver.findElement(By.name("PeriodStopDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - Postdoktorvistelser - SPARA Postdoktorvistelser
	public static final String MinProfil_Arbetsliv_PostdoktorvistelserSpara = "Submitter"; {
	}
	public static WebElement MinProfil_Arbetsliv_PostdoktorvistelserSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN
	public static final String MinProfil_Arbetsliv_Forskarutbyten = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[3]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_Forskarutbyten(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[3]/a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - LÄGG TILL KNAPP
	public static final String MinProfil_Arbetsliv_ForskarutbytenLäggTill = "#ResearchExchangeManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenLäggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#ResearchExchangeManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - SÖK ORGANISATION
	public static final String MinProfil_Arbetsliv_ForskarutbytenSökOrganisation = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenSökOrganisation(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - SPARA SÖKT ORGANISATION
	public static final String MinProfil_Arbetsliv_ForskarutbytenSparaSöktOrganisation = "Button"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenSparaSöktOrganisation(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - ÄMNE 1 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbyteÄmne1 = "ScbTableId_select_0"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbyteÄmne1(WebDriver driver){

		element = driver.findElement(By.id("ScbTableId_select_0"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - ÄMNE 2 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbyteÄmne2 = "ScbTableId_select_1"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbyteÄmne2(WebDriver driver){

		element = driver.findElement(By.id("ScbTableId_select_1"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - ÄMNE 3 (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbyteÄmne3 = "ScbTableId_select_2"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbyteÄmne3(WebDriver driver){

		element = driver.findElement(By.id("ScbTableId_select_2"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - TYP (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbyteTyp = "Type"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbyteTyp(WebDriver driver){

		element = driver.findElement(By.id("Type"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSTART (YEAR) (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbytenPeriodStartYear = "StartDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenPeriodStartYear(WebDriver driver){

		element = driver.findElement(By.name("StartDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSTART (MONTH) (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbytenPeriodStartMonth = "StartDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenPeriodStartMonth(WebDriver driver){

		element = driver.findElement(By.name("StartDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSLUT (YEAR) (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbytenPeriodSlutYear = "StopDate.yearPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenPeriodSlutYear(WebDriver driver){

		element = driver.findElement(By.name("StopDate.yearPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - PERIODSLUT (MONTH) (DROPDOWN)
	public static final String MinProfil_Arbetsliv_ForskarutbytenPeriodSlutMonth = "StopDate.monthPicker"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenPeriodSlutMonth(WebDriver driver){

		element = driver.findElement(By.name("StopDate.monthPicker"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - FORSKARUTBYTEN - SPARA FORSKARUTBYTE
	public static final String MinProfil_Arbetsliv_ForskarutbytenSpara = "Submitter"; {
	}
	public static WebElement MinProfil_Arbetsliv_ForskarutbytenSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEHÅLL I FORSKNINGEN
	public static final String MinProfil_Arbetsliv_UppehållIForskningen = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[4]/a"; {
	}
	public static WebElement MinProfil_Arbetsliv_UppehållIForskningen(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/ul/li[4]/a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEHÅLL I FORSKNINGEN - LÄGG TILL KNAPP
	public static final String MinProfil_Arbetsliv_UppehållIForskningenLäggTill = "#InterruptionInResearchManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Arbetsliv_UppehållIForskningenLäggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#InterruptionInResearchManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEHÅLL I FORSKNINGEN - STARTDATUM
	public static final String MinProfil_Arbetsliv_UppehållIForskningenStartDatum = "StartDate"; {
	}
	public static WebElement MinProfil_Arbetsliv_UppehållIForskningenStartDatum (WebDriver driver){

		element = driver.findElement(By.name("StartDate"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEHÅLL I FORSKNINGEN - SLUTDATUM
	public static final String MinProfil_Arbetsliv_UppehållIForskningenSlutDatum = "EndDate"; {
	}
	public static WebElement MinProfil_Arbetsliv_UppehållIForskningenSlutDatum(WebDriver driver){

		element = driver.findElement(By.name("EndDate"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEHÅLL I FORSKNINGEN - SLUTDATUM
	public static final String MinProfil_Arbetsliv_UppehållIForskningenBeskrivning = "Description"; {
	}
	public static WebElement MinProfil_Arbetsliv_UppehållIForskningenBeskrivning(WebDriver driver){

		element = driver.findElement(By.id("Description"));
		return element;
	}

	//MIN PROFIL - ARBETSLIV - UPPEHÅLL I FORSKNINGEN - SPARA
	public static final String MinProfil_Arbetsliv_UppehållIForskningenSpara = "Submitter"; {
	}
	public static WebElement MinProfil_Arbetsliv_UppehållIForskningenSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER
	public static final String MinProfil_Publikationer = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"; {
	}
	public static WebElement MinProfil_Publikationer(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - PUBLIKATIONER
	public static final String MinProfil_Publikationer_Publikationer = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/ul/li/a"; {
	}
	public static WebElement MinProfil_Publikationer_Publikationer(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/ul/li/a"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - LÄGG TILL
	public static final String MinProfil_Publikationer_LäggTill = "#PublicationManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_Publikationer_LäggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#PublicationManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - PUBLIKATIONSTYP
	public static final String MinProfil_Publikationer_Publikationstyp = "PublicationType"; {
	}
	public static WebElement MinProfil_Publikationer_Publikationstyp(WebDriver driver){

		element = driver.findElement(By.id("PublicationType"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FACKGRANSKADE (DROPDOWN) - Bidrag till bok, Bok, Konferensbidrag osv
	public static final String MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown = "PublicationFormPeerReviewed"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown(WebDriver driver){

		element = driver.findElement(By.id("PublicationFormPeerReviewed"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION -  INTE FACKGRANSKADE (DROPDOWN) - Bidrag till bok, Bok, Konferensbidrag osv
	public static final String MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown = "PublicationFormNotPeerReviewed"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown(WebDriver driver){

		element = driver.findElement(By.id("PublicationFormNotPeerReviewed"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - TITEL
	public static final String MinProfil_Publikationer_VetenskapligPublikationTitel = "Title"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationTitel (WebDriver driver){

		element = driver.findElement(By.id("Title"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FÖRFATTARE-KNAPP
	public static final String MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp = "btnAuthorAdd"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp (WebDriver driver){

		element = driver.findElement(By.id("btnAuthorAdd"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FÖRFATTARE-FÖRNAMN
	public static final String MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn = "Authors_0__FirstName"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(WebDriver driver){

		element = driver.findElement(By.id("Authors_0__FirstName"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FÖRFATTARE-EFTERNAMN
	public static final String MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn = "Authors_0__LastName"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(WebDriver driver){

		element = driver.findElement(By.id("Authors_0__LastName"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - NAMN PÅ TIDSKRIFT
	public static final String MinProfil_Publikationer_VetenskapligPublikationNamnPåTidskrift = "JournalName"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationNamnPåTidskrift(WebDriver driver){

		element = driver.findElement(By.id("JournalName"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - VOLYM
	public static final String MinProfil_Publikationer_VetenskapligPublikationVolym = "Volume"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationVolym(WebDriver driver){

		element = driver.findElement(By.id("Volume"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - UTFÄRDANDENUMMER
	public static final String MinProfil_Publikationer_VetenskapligPublikationUtfärdandenummer = "IssueNumber"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationUtfärdandenummer(WebDriver driver){

		element = driver.findElement(By.id("IssueNumber"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - REDAKTÖR-KNAPP
	public static final String MinProfil_Publikationer_VetenskapligPublikationRedaktörKnapp = "btnEditorAdd"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationRedaktörKnapp(WebDriver driver){

		element = driver.findElement(By.id("btnEditorAdd"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - REDAKTÖR-NAMN
	public static final String MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn = "Editors_0__Name"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn(WebDriver driver){

		element = driver.findElement(By.id("Editors_0__Name"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FÖRLAG
	public static final String MinProfil_Publikationer_VetenskapligPublikationFörlag = "PublishingHouse"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationFörlag(WebDriver driver){

		element = driver.findElement(By.id("PublishingHouse"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FÖRLAGSPLATS
	public static final String MinProfil_Publikationer_VetenskapligPublikationFörlagsplats = "PublishingPlace"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(WebDriver driver){

		element = driver.findElement(By.id("PublishingPlace"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FÖRSTA SIDNUMMER
	public static final String MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer = "FirstPageNumber"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer(WebDriver driver){

		element = driver.findElement(By.id("FirstPageNumber"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SISTA SIDNUMMER
	public static final String MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer = "LastPageNumber"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(WebDriver driver){

		element = driver.findElement(By.id("LastPageNumber"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - ISBN
	public static final String MinProfil_Publikationer_VetenskapligPublikationISBN = "Isbn"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationISBN(WebDriver driver){

		element = driver.findElement(By.id("Isbn"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - DOI
	public static final String MinProfil_Publikationer_VetenskapligPublikationDOI = "Doi"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationDOI(WebDriver driver){

		element = driver.findElement(By.id("Doi"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - UTGIVARE-STATUS(DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationStatus = "MagazineStatus"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationStatus(WebDriver driver){

		element = driver.findElement(By.id("MagazineStatus"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - KÄLLA FÖR PUBLIKATION (DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation = "SourceImportedDocument"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation(WebDriver driver){

		element = driver.findElement(By.id("SourceImportedDocument"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - KÄLLA ID
	public static final String MinProfil_Publikationer_VetenskapligPublikationKällaID = "Source"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationKällaID(WebDriver driver){

		element = driver.findElement(By.id("Source"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - VAR TEXTEN PUBLICERAD I OPEN ACCESS (DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown = "OpenAccessStatus"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown(WebDriver driver){

		element = driver.findElement(By.id("OpenAccessStatus"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - LÄNK/EXTERN LÄNK FÖR PUBLICERING
	public static final String MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering = "LinkExternal"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(WebDriver driver){

		element = driver.findElement(By.id("LinkExternal"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - FORM AV OA (DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationFormAvOA = "OAForm"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationFormAvOA(WebDriver driver){

		element = driver.findElement(By.id("OAForm"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - DOKUMENTVERSION (DROPDOWN)
	public static final String MinProfil_Publikationer_VetenskapligPublikationDokumentversion = "DocumentVersion"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationDokumentversion(WebDriver driver){

		element = driver.findElement(By.id("DocumentVersion"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SAMMANFATTNING
	public static final String MinProfil_Publikationer_VetenskapligPublikationSammanfattning = "Abstract"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationSammanfattning(WebDriver driver){

		element = driver.findElement(By.id("Abstract"));
		return element;
	}

	//MIN PROFIL - PUBLIKATIONER - VETENSKAPLIG PUBLIKATION - SPARA KNAPP
	public static final String MinProfil_Publikationer_VetenskapligPublikationSpara = "Submitter"; {
	}
	public static WebElement MinProfil_Publikationer_VetenskapligPublikationSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER
	public static final String MinProfil_MeriterOchUtmärkelser = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR
	public static final String MinProfil_MeriterOchUtmärkelser_Docentur = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[1]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_Docentur(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[1]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - LÄGG TILL KNAPP
	public static final String MinProfil_MeriterOchUtmärkelser_DocenturLäggTill = "#associateProfessorManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_DocenturLäggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#associateProfessorManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - SÖK ORGANISATION
	public static final String MinProfil_MeriterOchUtmärkelser_DocenturSökOrganisation = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_DocenturSökOrganisation(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - SPARA SÖKT ORGANISATION
	public static final String MinProfil_MeriterOchUtmärkelser_DocenturSparaSöktOrganisation = "Button"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_DocenturSparaSöktOrganisation(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - ÄMNE1
	public static final String MinProfil_MeriterOchUtmärkelser_DocenturÄmne1 = "SubjectId_select_0"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_DocenturÄmne1(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_0"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - ÄMNE2
	public static final String MinProfil_MeriterOchUtmärkelser_DocenturÄmne2 = "SubjectId_select_1"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_DocenturÄmne2(WebDriver driver){

		element = driver.findElement(By.id("SubjectId_select_1"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - ÅR
	public static final String MinProfil_MeriterOchUtmärkelser_DocenturÅr = "Year"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_DocenturÅr(WebDriver driver){

		element = driver.findElement(By.id("Year"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - DOCENTUR - SPARA
	public static final String MinProfil_MeriterOchUtmärkelser_DocenturSpara = "Submitter"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_DocenturSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER
	public static final String MinProfil_MeriterOchUtmärkelser_HandleddaPersoner = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[2]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_HandleddaPersoner(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[2]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - LÄGG TILL ENSKILD PERSON KNAPP
	public static final String MinProfil_MeriterOchUtmärkelser_HandleddaPersonerLäggTillEnskildPersonKnapp = "#supervisedPersonManagementSectionId > div.row-fluid.button-wrapper > div > a:nth-child(1)"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_HandleddaPersonerLäggTillEnskildPersonKnapp(WebDriver driver){

		element = driver.findElement(By.cssSelector("#supervisedPersonManagementSectionId > div.row-fluid.button-wrapper > div > a:nth-child(1)"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - SÖK LÄROSÄTE HANDLEDARE
	public static final String MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSökOrganisationHandledare = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSökOrganisationHandledare(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - SPARA SÖKT LÄROSÄTE HANDLEDARE
	public static final String MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSparaSökOrganisationHandledare = "Button"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSparaSökOrganisationHandledare(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - SÖK LÄROSÄTE STUDENT/DOKTORAND/POSTDOK
	public static final String MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSökOrganisationStudent = "Search.autoCompleteTextBox"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSökOrganisationStudent(WebDriver driver){

		element = driver.findElement(By.name("Search.autoCompleteTextBox"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - SPARA SÖKT LÄROSÄTE STUDENT
	public static final String MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSparaSökOrganisationStudent = "Button"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSparaSökOrganisationStudent(WebDriver driver){

		element = driver.findElement(By.tagName("Button"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - FÖRNAMN
	public static final String MinProfil_MeriterOchUtmärkelser_HandleddaPersonerFörnamn = "FirstName"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_HandleddaPersonerFörnamn(WebDriver driver){

		element = driver.findElement(By.id("FirstName"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - FÖRNAMN
	public static final String MinProfil_MeriterOchUtmärkelser_HandleddaPersonerEfternamn = "LastName"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_HandleddaPersonerEfternamn(WebDriver driver){

		element = driver.findElement(By.id("LastName"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - SLUTÅR
	public static final String MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSlutår = "SupervisionEndYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSlutår(WebDriver driver){

		element = driver.findElement(By.id("SupervisionEndYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - TYP AV HANDLEDDA PERSONER
	public static final String MinProfil_MeriterOchUtmärkelser_HandleddaPersonerTypAvHandleddaPerson = "TypeId"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_HandleddaPersonerTypAvHandleddaPerson(WebDriver driver){

		element = driver.findElement(By.id("TypeId"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - ROLL
	public static final String MinProfil_MeriterOchUtmärkelser_HandleddaPersonerRoll = "RoleId"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_HandleddaPersonerRoll(WebDriver driver){

		element = driver.findElement(By.id("RoleId"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - HANDLEDDA PERSONER - SPARA ENSKILD PERSON
	public static final String MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSparaEnskildPerson = "Submitter"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSparaEnskildPerson(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}


	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS
	public static final String MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrens = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[3]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrens(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[3]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - LÄGG TILL
	public static final String MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensLäggTill = "#ResearchGrantsAwardedInCompetitionManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensLäggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#ResearchGrantsAwardedInCompetitionManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - FINANSIÄR DROPDOWN 1
	public static final String MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensFinansiärDropDown1 = "FunderId_select_0"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensFinansiärDropDown1(WebDriver driver){

		element = driver.findElement(By.name("FunderId_select_0"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - FINANSIÄR DROPDOWN 2
	public static final String MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensFinansiärDropDown2 = "FunderId_select_1"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensFinansiärDropDown2(WebDriver driver){

		element = driver.findElement(By.name("FunderId_select_1"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - PROJEKTLEDARE
	public static final String MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensProjektledare = "Applicant"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensProjektledare(WebDriver driver){

		element = driver.findElement(By.id("Applicant"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - LAND
	public static final String MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensLand = "OtherCountry"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensLand(WebDriver driver){

		element = driver.findElement(By.id("OtherCountry"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - PROJEKTTITEL
	public static final String MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensProjekttitel = "ProjectTitle"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensProjekttitel(WebDriver driver){

		element = driver.findElement(By.id("ProjectTitle"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - DNR
	public static final String MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensDnr = "DiaryNumber"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensDnr(WebDriver driver){

		element = driver.findElement(By.id("DiaryNumber"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - STARTÅR
	public static final String MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensStartår = "PeriodStartYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensStartår(WebDriver driver){

		element = driver.findElement(By.id("PeriodStartYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - SLUTÅR
	public static final String MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensSlutår = "PeriodEndYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensSlutår(WebDriver driver){

		element = driver.findElement(By.id("PeriodEndYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - DIN ROLL
	public static final String MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensDinRoll = "RoleId"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensDinRoll(WebDriver driver){

		element = driver.findElement(By.id("RoleId"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - TOTALT BELOPP (KR)
	public static final String MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensTotaltBeloppKr = "Amount"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensTotaltBeloppKr(WebDriver driver){

		element = driver.findElement(By.id("Amount"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - BIDRAG ERHÅLLNA I KONKURRENS - SPARA
	public static final String MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensSpara = "Create"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrensSpara(WebDriver driver){

		element = driver.findElement(By.id("Create"));
		return element;
	}




	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER
	public static final String MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelser = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[4]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelser(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[4]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - LÄGG TILL
	public static final String MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLäggTill = "#AwardAndDistinctionManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLäggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#AwardAndDistinctionManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - ÅR
	public static final String MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserÅr = "YearOfAward"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserÅr(WebDriver driver){

		element = driver.findElement(By.id("YearOfAward"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - LAND
	public static final String MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLand = "selectedCountryDropDown"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLand(WebDriver driver){

		element = driver.findElement(By.id("selectedCountryDropDown"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - NAMN PÅ PRISET/UTMÄRKELSEN
	public static final String MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserNamnPåPriset= "Award"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserNamnPåPriset(WebDriver driver){

		element = driver.findElement(By.id("Award"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - UTFÄRDARE
	public static final String MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserUtfärdare = "Issuer"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserUtfärdare(WebDriver driver){

		element = driver.findElement(By.id("Issuer"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - BESKRIVNING
	public static final String MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserBeskrivning = "Description"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserBeskrivning(WebDriver driver){

		element = driver.findElement(By.id("Description"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - PRISER OCH UTMÄRKELSER - SPARA
	public static final String MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserSpara = "Submitter"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}




	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER
	public static final String MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriter = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[5]/a"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriter(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/ul/li[5]/a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER - LÄGG TILL
	public static final String MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterLäggTill = "#RelevantAndOtherMeritsManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterLäggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#RelevantAndOtherMeritsManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER - STARTÅR
	public static final String MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterStartår = "StartYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterStartår(WebDriver driver){

		element = driver.findElement(By.id("StartYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER - SLUTÅR
	public static final String MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSlutår = "EndYear"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSlutår(WebDriver driver){

		element = driver.findElement(By.id("EndYear"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER - TYP AV MERIT
	public static final String MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterTypAvMerit = "OtherMerits"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterTypAvMerit(WebDriver driver){

		element = driver.findElement(By.name("OtherMerits"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER - BESKRIVNING
	public static final String MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterBeskrivning = "RelevantMerits"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterBeskrivning(WebDriver driver){

		element = driver.findElement(By.name("RelevantMerits"));
		return element;
	}

	//MIN PROFIL - MERITER OCH UTMÄRKELSER - ÖVRIGA MERITER - SPARA
	public static final String MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSpara = "Submitter"; {
	}
	public static WebElement MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSpara(WebDriver driver){

		element = driver.findElement(By.name("Submitter"));
		return element;
	}




	//MIN PROFIL - IMMATERIALRÄTT
	public static final String MinProfil_Immaterialrätt = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a"; {
	}
	public static WebElement MinProfil_Immaterialrätt(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/a"));
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - IMMATERIALRÄTT
	public static final String MinProfil_Immaterialrätt_Immaterialrätt = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/ul/li/a"; {
	}
	public static WebElement MinProfil_Immaterialrätt_Immaterialrätt(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[7]/div/ul/li/a"));
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - LÄGG TILL
	public static final String MinProfil_ImmaterialrättLäggTill = "#patentManagementSectionId > div.row-fluid.button-wrapper > div > a"; {
	}
	public static WebElement MinProfil_ImmaterialrättLäggTill(WebDriver driver){

		element = driver.findElement(By.cssSelector("#patentManagementSectionId > div.row-fluid.button-wrapper > div > a"));
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - TYP
	public static final String MinProfil_ImmaterialrättTyp = "Type"; {
	}
	public static WebElement MinProfil_ImmaterialrättTyp(WebDriver driver){

		element = driver.findElement(By.id("Type"));
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - ID
	public static final String MinProfil_ImmaterialrättId = "IPNumber"; {
	}
	public static WebElement MinProfil_ImmaterialrättId(WebDriver driver){

		element = driver.findElement(By.id("IPNumber"));
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - DATUM FÖR BEVILJANDE
	public static final String MinProfil_ImmaterialrättDatumFörBeviljande = "DateApproved"; {
	}
	public static WebElement MinProfil_ImmaterialrättDatumFörBeviljande(WebDriver driver){

		element = driver.findElement(By.name("DateApproved"));
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - PRODUKTKLASSIFICERING 1
	public static final String MinProfil_ImmaterialrättProduktKlassificering1 = "ProductClassificationId_select_0"; {
	}
	public static WebElement MinProfil_ImmaterialrättProduktKlassificering1(WebDriver driver){

		element = driver.findElement(By.name("ProductClassificationId_select_0"));
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - PRODUKTKLASSIFICERING 2
	public static final String MinProfil_ImmaterialrättProduktKlassificering2 = "ProductClassificationId_select_1"; {
	}
	public static WebElement MinProfil_ImmaterialrättProduktKlassificering2(WebDriver driver){

		element = driver.findElement(By.name("ProductClassificationId_select_1"));
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - LICENSIERAD TILL ANNAN
	public static final String MinProfil_ImmaterialrättLicensieradTillAnnan = "LicensedToOtherPart"; {
	}
	public static WebElement MinProfil_ImmaterialrättLicensieradTillAnnan(WebDriver driver){

		element = driver.findElement(By.id("LicensedToOtherPart"));
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - LICENSIERAD TILL ANNAN DROPDOWN
	public static final String MinProfil_ImmaterialrättLicensieradTillAnnanDropwDown = "LicensedToOtherTypeId"; {
	}
	public static WebElement MinProfil_ImmaterialrättLicensieradTillAnnanDropwDown(WebDriver driver){

		element = driver.findElement(By.id("LicensedToOtherTypeId"));
		return element;
	}

	//MIN PROFIL - IMMATERIALRÄTT - SPARA
	public static final String MinProfil_ImmaterialrättSpara = "Submitter"; {
	}
	public static WebElement MinProfil_ImmaterialrättSpara(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}



	//MIN PROFIL - GRANSKARKOMPETENS
	public static final String MinProfil_Granskarkompetens = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a"; {
	}
	public static WebElement MinProfil_Granskarkompetens(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMRÅDE 1
	public static final String MinProfil_GranskarkompetensKIDForskningsområde1 = "competenceSelectors_0__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDForskningsområde1(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_0__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMRÅDE 2
	public static final String MinProfil_GranskarkompetensKIDForskningsområde2 = "competenceSelectors_1__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDForskningsområde2(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_1__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMRÅDE 3
	public static final String MinProfil_GranskarkompetensKIDForskningsområde3 = "competenceSelectors_2__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDForskningsområde3(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_2__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMRÅDE 4
	public static final String MinProfil_GranskarkompetensKIDForskningsområde4 = "competenceSelectors_3__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDForskningsområde4(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_3__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - FORSKNINGSOMRÅDE 5
	public static final String MinProfil_GranskarkompetensKIDForskningsområde5 = "competenceSelectors_4__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDForskningsområde5(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_4__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 1
	public static final String MinProfil_GranskarkompetensKIDMetod1 = "competenceSelectors_5__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDMetod1(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_5__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 2
	public static final String MinProfil_GranskarkompetensKIDMetod2 = "competenceSelectors_6__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDMetod2(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_6__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 3
	public static final String MinProfil_GranskarkompetensKIDMetod3 = "competenceSelectors_7__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDMetod3(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_7__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 4
	public static final String MinProfil_GranskarkompetensKIDMetod4 = "competenceSelectors_8__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDMetod4(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_8__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - METOD 5
	public static final String MinProfil_GranskarkompetensKIDMetod5 = "competenceSelectors_9__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDMetod5(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_9__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 1
	public static final String MinProfil_GranskarkompetensKIDNyckelord1 = "competenceSelectors_10__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDNyckelord1(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_10__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 2
	public static final String MinProfil_GranskarkompetensKIDNyckelord2 = "competenceSelectors_11__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDNyckelord2(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_11__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 3
	public static final String MinProfil_GranskarkompetensKIDNyckelord3 = "competenceSelectors_12__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDNyckelord3(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_12__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 4
	public static final String MinProfil_GranskarkompetensKIDNyckelord4 = "competenceSelectors_13__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDNyckelord4(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_13__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - NYCKELORD 5
	public static final String MinProfil_GranskarkompetensKIDNyckelord5 = "competenceSelectors_14__SelectedItemId"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDNyckelord5(WebDriver driver){

		element = driver.findElement(By.id("competenceSelectors_14__SelectedItemId"));
		return element;
	}

	//MIN PROFIL - GRANSKARKOMPETENS - KID - SPARA
	public static final String MinProfil_GranskarkompetensKIDSpara = "//input[@value='Spara']"; {
	}
	public static WebElement MinProfil_GranskarkompetensKIDSpara(WebDriver driver){

		element = driver.findElement(By.xpath("//input[@value='Spara']"));
		return element;
	}







}


