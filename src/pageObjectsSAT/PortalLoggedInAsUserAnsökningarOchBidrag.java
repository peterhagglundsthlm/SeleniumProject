package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsUserAnsökningarOchBidrag {
	private static WebElement element = null;


	//ANSÖKNINGAR OCH BIDRAG - KNAPPEN
	public static final String AnsökningarOchBidragButton_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuApplicationsAndGrants"; {
	}
	public static WebElement AnsökningarOchBidragButton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuApplicationsAndGrants"));
		return element;
	}

	//ANSÖKNINGAR OCH BIDRAG - UTLYSNINGAR
	public static final String AnsökningarOchBidragUtlysningarButton_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement AnsökningarOchBidragUtlysningarButton_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//ANSÖKNINGAR OCH BIDRAG - ANSÖKNINGAR
	public static final String AnsökningarOchBidragAnsokningarButton_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement AnsökningarOchBidragAnsokningarButton_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}

	//ANSÖKNINGAR OCH BIDRAG - BIDRAG
	public static final String AnsökningarOchBidragBidragButton_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"; {
	}
	public static WebElement AnsökningarOchBidragBidragButton_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a"));
		return element;
	}

	//ANSÖKNINGAR OCH BIDRAG - ANSÖKAN OM ETIKPRÖVNING
	public static final String AnsökningarOchBidragAnsökOmEtikprövning_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement AnsökningarOchBidragAnsökOmEtikprövning_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//ANSÖKNINGAR OCH BIDRAG - ETIKPRÖVNINGSANSÖKNINGAR
	public static final String AnsökningarOchBidragEtikprövningsansökningar_Xpath = "//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement AnsökningarOchBidragEtikprövningsansökningar_Xpath(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[2]/div/a"));
		return element;
	}


}
