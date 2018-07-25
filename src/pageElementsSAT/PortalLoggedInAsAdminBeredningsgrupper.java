package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsAdminBeredningsgrupper {
	private static WebElement element = null;


	//BEREDNINGSGRUPPERKNAPPEN
	public static final String BeredningsgrupperButton = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview > a"; {
	}
	public static WebElement BeredningsgrupperButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview > a"));
		return element;
	}

	//BEREDNINGSGRUPPER - ADMINISTRERA BEREDNINGSGRUPPER
	public static final String BeredningsgrupperButton_AdministreraBeredningsgrupper = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a"; {
	}
	public static WebElement BeredningsgrupperButton_AdministreraBeredningsgrupper(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a"));
		return element;
	}

	//BEREDNINGSGRUPPER - BEREDNINGSGRUPPER
	public static final String BeredningsgrupperButton_Beredningsgrupper = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a"; {
	}
	public static WebElement BeredningsgrupperButton_Beredningsgrupper(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a"));
		return element;
	}

	//BEREDNINGSGRUPPER - ARVODESHANTERING
	public static final String BeredningsgrupperButton_Arvodeshantering = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a"; {
	}
	public static WebElement BeredningsgrupperButton_Arvodeshantering(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a"));
		return element;
	}


}

