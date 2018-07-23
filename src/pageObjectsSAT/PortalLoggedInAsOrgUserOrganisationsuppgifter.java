package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsOrgUserOrganisationsuppgifter {
	private static WebElement element = null;


	//ORGANISATIONSUPPGIFTER - KNAPPEN
	public static final String Organisationsuppifter_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuOrganizationTasks.pull-right"; {
	}
	public static WebElement Organisationsuppifter_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuOrganizationTasks.pull-right"));
		return element;
	}

	//ORGANISATIONSUPPGIFTER - SIGNERA
	public static final String Organisationsuppifter_Signera_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement Organisationsuppifter_Signera_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//ORGANISATIONSUPPGIFTER - RAPPORTERA
	public static final String Organisationsuppifter_Rapportera_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement Organisationsuppifter_Rapportera_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

}
