package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoggedInAsAdminIntressentregister {
	private static WebElement element = null;

	//INTRESSENTREGISTER - KNAPPEN
	public static final String IntressentregisterButton_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li.menuStakeholder"; {
	}
	public static WebElement IntressentregisterButton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.menuStakeholder"));
		return element;
	}

	//INTRESSENTREGISTER - PERSONKONTO
	public static final String IntressentregisterButton_Personkonto_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement IntressentregisterButton_Personkonto_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//INTRESSENTREGISTER - ORGANISATIONSKONTO
	public static final String IntressentregisterButton_Organisationskonto_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement IntressentregisterButton_Organisationskonto_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//INTRESSENTREGISTER - ORGANISATIONSANSÖKNINGAR
	public static final String IntressentregisterButton_OrganisationsAnsökningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"; {
	}
	public static WebElement IntressentregisterButton_OrganisationsAnsökningar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"));
		return element;
	}

	//INTRESSENTREGISTER - BEREDNINGSGRUPPSMEDLEMMAR
	public static final String IntressentregisterButton_Beredningsgruppsmedlemmar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"; {
	}
	public static WebElement IntressentregisterButton_Beredningsgruppsmedlemmar_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a"));
		return element;
	}

	//INTRESSENTREGISTER - GRANSKARPOOL
	public static final String IntressentregisterButton_Granskarpool_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"; {
	}
	public static WebElement IntressentregisterButton_Granskarpool_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a"));
		return element;
	}

	//INTRESSENTREGISTER - ARBETSGIVARE
	public static final String IntressentregisterButton_Arbetsgivare_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"; {
	}
	public static WebElement IntressentregisterButton_Arbetsgivare_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a"));
		return element;

	}
}
