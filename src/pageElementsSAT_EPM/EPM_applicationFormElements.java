package pageElementsSAT_EPM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EPM_applicationFormElements {
	private static WebElement element = null;

	//Dropdown antal forskningshuvudm�n
	public static final String AntalFoHuvudman = "4ec91423-1d5a-4d03-86ed-14792a006821_select_0"; 

	public static WebElement AntalFoHuvudman(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_0"));
		return element;
	}

	//Dropdown samband med en av fo-huvudm�nnen
	public static final String Samband = "4ec91423-1d5a-4d03-86ed-14792a006821_select_1"; 

	public static WebElement Samband(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_1"));
		return element;
	}

	//Dropdown l�kemedelspr�vning eller ej, en fo-huvudman
	public static final String KliniskL�kemedelspr�vning = "4ec91423-1d5a-4d03-86ed-14792a006821_select_1"; 

	public static WebElement KliniskL�kemedelspr�vning(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_1"));
		return element;
	}

	//Dropdown l�kemedelspr�vning eller ej, fler fo-huvudman
	public static final String KliniskL�kemedelspr�vningFler = "4ec91423-1d5a-4d03-86ed-14792a006821_select_2"; 

	public static WebElement KliniskL�kemedelspr�vningFler(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_2"));
		return element;
	}
	//Dropdown endast befintliga personuppgifter eller ej, EN fo-huv
	public static final String BefintligaPersUppg = "4ec91423-1d5a-4d03-86ed-14792a006821_select_2"; 

	public static WebElement BefintligaPersupp(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_2"));
		return element;
	}		

	//Dropdown endast befintliga personuppgifter eller ej, FLERA fo-huv
	public static final String BefintligaPersuppgFler = "4ec91423-1d5a-4d03-86ed-14792a006821_select_3"; 

	public static WebElement BefintligaPersuppgFler(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_3"));
		return element;
	}		
	//Ans�kanskategori, spara val: endast en fo-huvudman l�kemedelspr�vning
	public static final String Ans�kanskategoriSparaVal = "4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_1"; 

	public static WebElement Ans�kanskategoriSparaVal(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_1"));
		return element;
	}		

	//Ans�kanskategori, spara val 2: endast en fo-huvudman, p-uppg ja/nej; flera fo-huvudm�n l�kemedelspr�vning
	public static final String Ans�kanskategoriSparaVal2 = "4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_2"; 

	public static WebElement Ans�kanskategoriSparaVal2(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_2"));
		return element;
	}		

	//Ans�kanskategori, spara val 3: flera fo-huvudm�n, p-uppg ja/nej
	public static final String Ans�kanskategoriSparaVal3 = "4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_3"; 

	public static WebElement Ans�kanskategoriSparaVal3(WebDriver driver){
		element = driver.findElement(By.id("4ec91423-1d5a-4d03-86ed-14792a006821_select_submit_3"));
		return element;
	}		

	//R�dgivande yttrande eller ej
	public static final String R�dgivandeYttrande = "90e1b632-c222-4285-8b77-694f538357f2"; 

	public static WebElement R�dgivandeYttrande(WebDriver driver){
		element = driver.findElement(By.id("90e1b632-c222-4285-8b77-694f538357f2"));
		return element;
	}

//	//Text med radbrytningar
//	public static final String TextMedRadbrytningar = "Git �r ett verktyg f�r versionshantering. "
//			+ "Det g�r det m�jligt f�r flera personer att arbeta p� samma projekt. Git g�r att k�ra genom gr�nssnittet, genom Eclipse eller genom command promt. "
//			+ "Vi har valt att anv�nda command promt eftersom att det var mest stabilt och mycket enklare �n Eclipse egen hantering f�r Git. "
//			+ "Mer information om att arbeta med Git kommer senare i dokumentet."
//			+ "Eclipse �r den utvecklingsmilj� som vi har valt att anv�nda f�r detta projekt. "
//			+ "Det finns ett flertal andra alternativ men vi valde att arbeta med Eclipse eftersom att det �r den vanligaste utvecklingsmilj�n som anv�nds tillsammans med Selenium. "
//			+ "Det finns mycket information och tips ang�ende Eclipse och Selenium p� Google." 
//			+ "En detaljerad guide f�r att installera Eclipse och Selenium finns p�: "
//			+ "https://www.guru99.com/installing-selenium-webdriver.html" 
//			+ Keys.ENTER + "Git �r ett verktyg f�r versionshantering. Det g�r det m�jligt f�r flera personer att arbeta p� samma projekt. "
//			+ "Git g�r att k�ra genom gr�nssnittet, genom Eclipse eller genom command promt. "
//			+ "Vi har valt att anv�nda command promt eftersom att det var mest stabilt och mycket enklare �n Eclipse egen hantering f�r Git. "
//			+ "Mer information om att arbeta med Git kommer senare i dokumentet." 
//			+ Keys.ENTER + "En detaljerad guide f�r att installera Eclipse och Selenium finns p�: www.guru99.com/installing-selenium-webdriver.html"
//			+ Keys.ENTER + Keys.ENTER + "Nu �r texten slut."; 
//
//	public static WebElement TextMedRadbrytningar (WebDriver driver){
//		element = driver.findElement(By.id("Git �r ett verktyg f�r versionshantering." 
//				+ "Det g�r det m�jligt f�r flera personer att arbeta p� samma projekt. Git g�r att k�ra genom gr�nssnittet, genom Eclipse eller genom command promt. " 
//				+ "Vi har valt att anv�nda command promt eftersom att det var mest stabilt och mycket enklare �n Eclipse egen hantering f�r Git."  
//				+ "Mer information om att arbeta med Git kommer senare i dokumentet. " 
//				+ "Eclipse �r den utvecklingsmilj� som vi har valt att anv�nda f�r detta projekt.  " 
//				+ "Det finns ett flertal andra alternativ men vi valde att arbeta med Eclipse eftersom att det �r den vanligaste utvecklingsmilj�n som anv�nds tillsammans med Selenium.  " 
//				+"Det finns mycket information och tips ang�ende Eclipse och Selenium p� Google."   
//				+"En detaljerad guide f�r att installera Eclipse och Selenium finns p�:  " 
//				+ "https://www.guru99.com/installing-selenium-webdriver.html"   
//				+ Keys.ENTER + "Git �r ett verktyg f�r versionshantering. Det g�r det m�jligt f�r flera personer att arbeta p� samma projekt. "  
//				+"Git g�r att k�ra genom gr�nssnittet, genom Eclipse eller genom command promt. "  
//				+"Vi har valt att anv�nda command promt eftersom att det var mest stabilt och mycket enklare �n Eclipse egen hantering f�r Git. "  
//				+"Mer information om att arbeta med Git kommer senare i dokumentet."   
//				+ Keys.ENTER + "En detaljerad guide f�r att installera Eclipse och Selenium finns p�: www.guru99.com/installing-selenium-webdriver.html"  
//				+ Keys.ENTER + Keys.ENTER + "Nu �r texten slut."));
//		return element;
//
//	}

}
