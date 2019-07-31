package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PortalLoggedInAsOrgUserOrganisationsuppgifter {
	private static By element = null;


	//ORGANISATIONSUPPGIFTER - KNAPPEN
	public static By Organisationsuppifter(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuOrganizationTasks.pull-right");
		return element;
	}

	//ORGANISATIONSUPPGIFTER - SIGNERA
	public static By Organisationsuppifter_Signera(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a");
		return element;
	}

	//ORGANISATIONSUPPGIFTER - RAPPORTERA
	public static By Organisationsuppifter_Rapportera(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a");
		return element;
	}

}
