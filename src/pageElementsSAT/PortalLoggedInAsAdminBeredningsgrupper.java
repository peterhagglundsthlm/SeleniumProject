package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsAdminBeredningsgrupper {
	private static WebElement element = null;

	//BEREDNINGSGRUPPERKNAPPEN
	public static By BeredningsgrupperButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview > a");
		return element;	
	}

	//BEREDNINGSGRUPPER - ADMINISTRERA BEREDNINGSGRUPPER
	public static By BeredningsgrupperButton_AdministreraBeredningsgrupper(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a");
		return element;		
	}

	//BEREDNINGSGRUPPER - BEREDNINGSGRUPPER
	public static By BeredningsgrupperButton_Beredningsgrupper(){
		
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a");
		return element;		
	}

	//BEREDNINGSGRUPPER - ARVODESHANTERING
	public static By BeredningsgrupperButton_Arvodeshantering(){
		
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a");
		return element;
	}


}

