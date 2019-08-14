package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class PortalLoggedInAsUserAnsökningarOchBidrag {
	private static By element = null;


	//ANSÖKNINGAR OCH BIDRAG - KNAPPEN
	public static By AnsökningarOchBidragButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuApplicationsAndGrants");
		return element;
	}

	//ANSÖKNINGAR OCH BIDRAG - UTLYSNINGAR
	public static By AnsökningarOchBidragUtlysningarButton(){
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a");
		return element;
	}

	//ANSÖKNINGAR OCH BIDRAG - ANSÖKNINGAR
	public static By AnsökningarOchBidragAnsokningar(){
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a");
		return element;
	}

	//ANSÖKNINGAR OCH BIDRAG - BIDRAG
	public static By AnsökningarOchBidragBidrag(){
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[3]/div/a");
		return element;
	}

	//ANSÖKNINGAR OCH BIDRAG - ANSÖKAN OM ETIKPRÖVNING
	public static By AnsökningarOchBidragAnsökOmEtikprövning(){
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[1]/div/a");
		return element;
	}

	//ANSÖKNINGAR OCH BIDRAG - ETIKPRÖVNINGSANSÖKNINGAR
	public static By AnsökningarOchBidragEtikprövningsansökningar(){
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[2]/div/a");
		return element;
	}
	
	//ANSÖKNINGAR OCH BIDRAG - ÄNDRINGSANSÖKNINGAR
		public static By AnsökningarOchBidragÄndringsansökningar(){
			By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[2]/div/div/ul/li[3]/div/a");
			return element;
		}


}
