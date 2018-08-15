package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SAT_Home_Page_Not_Logged_In {

	private static WebElement element = null;


	//LOGGA IN KNAPPEN PÅ STARTSIDAN
	public static final String LoginButtonChrome = "body > div.page-container > div.container > div.row.header-row > header > div > div:nth-child(1) > div > a.btn.btn-discreet.btn-login-left.show-modal"; {
	}
	public static WebElement LoginButtonChrome(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > div > div:nth-child(1) > div > a.btn.btn-discreet.btn-login-left.show-modal"));
		return element;
	}

	//FÄLTET DÄR MAN SKRIVER IN EMAIL NÄR MAN LOGGAR IN
	public static final String EnterUserName = "Email"; {	
	}
	public static WebElement EnterUserName(WebDriver driver){

		element = driver.findElement(By.id("Email"));
		return element;
	}

	//FÄLTET DÄR MAN SKRIVER IN LÖSENORD NÄR MAN LOGGAR IN
	public static final String EnterPassword = "Password"; {	
	}
	public static WebElement EnterPassword(WebDriver driver){

		element = driver.findElement(By.id("Password"));
		return element;
	}

	//LOGGA IN KNAPPEN SOM FINNS I MODALEN DÄR MAN SKRIVER EMAIL OCH LÖSENORD.
	public static final String SubmitUserNameAndPassword = "Submitter"; {	
	}
	public static WebElement SubmitUserNameAndPassword(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}

	//KNAPP FÖR ATT ÄNDRA SPRÅKET TILL ENGELSKA
	public static final String InEnglishButton = "body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a"; {	
	}
	public static WebElement InEnglishButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a"));
		return element;
	}

	//KNAPP FÖR ATT ÄNDRA SPRÅKET TILL SVENSKA
	public static final String PåSvenskaButton = "body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a"; {	
	}
	public static WebElement PåSvenskaButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a"));
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA BEHANDLING AV PERSONUPPGIFTER
	public static final String BehandlingAvPersonuppgifterButton = "#processingofpersonaldata"; {	
	}
	public static WebElement BehandlingAvPersonuppgifterButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#processingofpersonaldata"));
		return element;
	}

	//BEHANDLING AV PERSONUPPGIFTER - MODAL
	public static final String BehandlingAvPersonuppgifterModal = "#editDialogBody > section > div > div.accordion-heading.greenTop > h1"; {	
	}
	public static WebElement BehandlingAvPersonuppgifterModal(WebDriver driver){

		element = driver.findElement(By.cssSelector("#editDialogBody > section > div > div.accordion-heading.greenTop > h1"));
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA INFORMATION 
	public static final String InformationButton = "body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(3) > div > a"; {	
	}
	public static WebElement InformationButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(3) > div > a"));
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA OM PRISMA (INFORMATION) 
	public static final String OmPrismaButton = "#aboutprisma"; {	
	}
	public static WebElement OmPrismaButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#aboutprisma"));
		return element;
	}

	//OM PRISMA - MODAL
	public static final String OmPrismaModal = "#editDialogBody > section > div"; {	
	}
	public static WebElement OmPrisma(WebDriver driver){

		element = driver.findElement(By.cssSelector("#editDialogBody > section > div"));
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA OM WEBBPLATSEN (INFORMATION) 
	public static final String OmWebbplatsenButton = "#aboutwebsite"; {	
	}
	public static WebElement OmWebbplatsenButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#aboutwebsite"));
		return element;
	}
	
	//OM WEBBPLATSEN - MODAL
	public static final String OmWebbplatsenModal = "#editDialogBody > section > div"; {	
	}
	public static WebElement OmWebbplatsenModal(WebDriver driver){

		element = driver.findElement(By.cssSelector("#editDialogBody > section > div"));
		return element;
	}

	//KNAPP FÖR ATT ÖPPNA ANVÄNDARSTÖDET (HJÄLP)
	public static final String HjälpButton = "body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(2) > a"; {	
	}
	public static WebElement HjälpButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(2) > a"));
		return element;
	}





}








