package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class PortalLoggedInAsAdminIntressentregister {
	
	//INTRESSENTREGISTER - KNAPPEN
	public static By IntressentregisterButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.menuStakeholder");
		return element;
	}

	//INTRESSENTREGISTER - PERSONKONTO
	public static By IntressentregisterButton_Personkonto(){

		 By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a");
		return element;
	}

	//INTRESSENTREGISTER - ORGANISATIONSKONTO
	public static By IntressentregisterButton_Organisationskonto(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a");
		return element;
	}

	//INTRESSENTREGISTER - ORGANISATIONSANSÖKNINGAR
	public static By IntressentregisterButton_OrganisationsAnsökningar(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a");
		return element;
	}

	//INTRESSENTREGISTER - BEREDNINGSGRUPPSMEDLEMMAR
	public static By IntressentregisterButton_Beredningsgruppsmedlemmar(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[4]/div/a");
		return element;
	}

	//INTRESSENTREGISTER - GRANSKARPOOL
	public static By IntressentregisterButton_Granskarpool(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[5]/div/a");
		return element;
	}

	//INTRESSENTREGISTER - ARBETSGIVARE
	public static By IntressentregisterButton_Arbetsgivare(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[6]/div/a");
		return element;

	}
}
