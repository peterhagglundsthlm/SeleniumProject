package generateApplicationEPM;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageElementsSAT_EPM.EPM_applicationFormElements;


public class anliEpmAllPage1aMethods extends anliEpmFormTitleCategory {

	@Parameters({"applicationType"})
	
	@Test
	public static WebElement s1a_AnsökanEndastPersonuppgifter(WebDriver driver) {

		// kontroll om vi öht är på rätt sida
		if (driver.getPageSource().contains("Utkast")){

			// anger antal forskningshuvudmän: EN
			Select AntalFoHuvudman = new Select (driver.findElement(By.id(EPM_applicationFormElements.AntalFoHuvudman))); 
			AntalFoHuvudman.selectByVisibleText("En");

			//Anger läkemedelsprövning: NEJ. 
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.KliniskLäkemedelsprövning)));				
			Select KliniskLäkemedelsPrövning = new Select (driver.findElement(By.id(EPM_applicationFormElements.KliniskLäkemedelsprövning)));
			KliniskLäkemedelsPrövning.selectByVisibleText("Nej");

			// Endast bef uppgifter: JA
			WebDriverWait wait2 = new WebDriverWait(driver, 10);
			wait2.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.BefintligaPersUppg)));
			Select PersUppg= new Select (driver.findElement(By.id(EPM_applicationFormElements.BefintligaPersUppg)));
			PersUppg.selectByVisibleText("Ja");

			// ansökanskategori, spara val2
			WebDriverWait wait2b = new WebDriverWait(driver, 10);
			wait2b.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.AnsökanskategoriSparaVal2)));
			driver.findElement(By.id(EPM_applicationFormElements.AnsökanskategoriSparaVal2)).click();

			// Rådgivande yttrande: NEJ 
			WebDriverWait wait3 = new WebDriverWait(driver, 10);
			wait3.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.RådgivandeYttrande)));
			Select RådGivande = new Select (driver.findElement(By.id(EPM_applicationFormElements.RådgivandeYttrande)));
			RådGivande.selectByVisibleText("Nej");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println("s1a_AnsökanEndastPersonuppgifter från anliEpmAllPage1aMethods");
		return null;

		//
		//	// om det gäller ansökan En huvudman endast befintliga personuppgifter
		//	if (applicationType.equalsIgnoreCase("anliEpmForm01PersuppgEnHuvudman")) {
		//
		//		// anger antal forskningshuvudmän: EN
		//		Select AntalFoHuvudman = new Select (driver.findElement(By.id(EPM_applicationFormElements.AntalFoHuvudman))); 
		//		AntalFoHuvudman.selectByVisibleText("En");
		//
		//		//Anger läkemedelsprövning: NEJ. 
		//		WebDriverWait wait = new WebDriverWait(driver, 10);
		//		wait.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.KliniskLäkemedelsprövning)));				
		//		Select KliniskLäkemedelsPrövning = new Select (driver.findElement(By.id(EPM_applicationFormElements.KliniskLäkemedelsprövning)));
		//		KliniskLäkemedelsPrövning.selectByVisibleText("Nej");
		//
		//		// Endast bef uppgifter: JA
		//		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		//		wait2.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.BefintligaPersUppg)));
		//		Select PersUppg= new Select (driver.findElement(By.id(EPM_applicationFormElements.BefintligaPersUppg)));
		//		PersUppg.selectByVisibleText("Ja");
		//
		//		// ansökanskategori, spara val2
		//		WebDriverWait wait2b = new WebDriverWait(driver, 10);
		//		wait2b.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.AnsökanskategoriSparaVal2)));
		//		driver.findElement(By.id(EPM_applicationFormElements.AnsökanskategoriSparaVal2)).click();
		//
		//		// Rådgivande yttrande: NEJ 
		//		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		//		wait3.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.RådgivandeYttrande)));
		//		Select RådGivande = new Select (driver.findElement(By.id(EPM_applicationFormElements.RådgivandeYttrande)));
		//		RådGivande.selectByVisibleText("Nej");
		//
		//	}
		//
		//	else {
		//		System.out.println("Fail");
		//	}


	}

	// En huvudman, läkemedelsprövning
	@Test
	public static WebElement s1a2_AnsökanEnFohuvLäk(WebDriver driver) {
		

		if (driver.getPageSource().contains("Utkast")){

			// anger antal forskningshuvudmän: EN
			Select AntalFoHuvudman = new Select (driver.findElement(By.id(EPM_applicationFormElements.AntalFoHuvudman))); 
			AntalFoHuvudman.selectByVisibleText("En");

			//Anger läkemedelsprövning: JA. 
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.KliniskLäkemedelsprövning)));				
			Select KliniskLäkemedelsPrövning = new Select (driver.findElement(By.id(EPM_applicationFormElements.KliniskLäkemedelsprövning)));
			KliniskLäkemedelsPrövning.selectByVisibleText("Ja");

			// ansökanskategori, spara val
			WebDriverWait wait2b = new WebDriverWait(driver, 10);
			wait2b.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.AnsökanskategoriSparaVal)));
			driver.findElement(By.id(EPM_applicationFormElements.AnsökanskategoriSparaVal)).click();

			// Rådgivande yttrande: NEJ 
			WebDriverWait wait3 = new WebDriverWait(driver, 10);
			wait3.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.RådgivandeYttrande)));
			Select RådGivande = new Select (driver.findElement(By.id(EPM_applicationFormElements.RådgivandeYttrande)));
			RådGivande.selectByVisibleText("Nej");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println("sektion 1a för Läkemedel, en huvudman (från anliEpmAllPage1aMethods");
		return null;
	}

	// Ansökan endast personuppgifter, en forskningshuvudman
	@Test
	public static WebElement s1a3_AnsökanEnFohuv(WebDriver driver) {

		if (driver.getPageSource().contains("Utkast"))

		{
			// anger antal forskningshuvudmän: EN
			Select AntalFoHuvudman = new Select (driver.findElement(By.id(EPM_applicationFormElements.AntalFoHuvudman))); 
			AntalFoHuvudman.selectByVisibleText("En");

			//Anger läkemedelsprövning: NEJ. 
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.KliniskLäkemedelsprövning)));				
			Select KliniskLäkemedelsPrövning = new Select (driver.findElement(By.id(EPM_applicationFormElements.KliniskLäkemedelsprövning)));
			KliniskLäkemedelsPrövning.selectByVisibleText("Nej");

			// Endast bef uppgifter: NEJ
			WebDriverWait wait2 = new WebDriverWait(driver, 10);
			wait2.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.BefintligaPersUppg)));
			Select PersUppg= new Select (driver.findElement(By.id(EPM_applicationFormElements.BefintligaPersUppg)));
			PersUppg.selectByVisibleText("Nej");

			// ansökanskategori, spara val2
			WebDriverWait wait2b = new WebDriverWait(driver, 10);
			wait2b.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.AnsökanskategoriSparaVal2)));
			driver.findElement(By.id(EPM_applicationFormElements.AnsökanskategoriSparaVal2)).click();

			// Rådgivande yttrande: NEJ 
			WebDriverWait wait3 = new WebDriverWait(driver, 10);
			wait3.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.RådgivandeYttrande)));
			Select RådGivande = new Select (driver.findElement(By.id(EPM_applicationFormElements.RådgivandeYttrande)));
			RådGivande.selectByVisibleText("Nej");
		}
		else {
			System.out.println("Fail");
		}
		return null;
	}

	// Ansökan flera huvudmän, läkemedel, samband
	@Test (dependsOnMethods={"BytFokusTillFormulär"})
	public static WebElement s1a4_AnsökanFleraFohuvLäk(WebDriver driver) {

		if (driver.getPageSource().contains("Utkast")){
			
			// anger antal forskningshuvudmän: FLERA
			Select AntalFoHuvudman = new Select (driver.findElement(By.id(EPM_applicationFormElements.AntalFoHuvudman))); 
			AntalFoHuvudman.selectByVisibleText("Flera");

			// anger samband med en av fo-huvudmännen: JA
			Select Samband = new Select (driver.findElement(By.id(EPM_applicationFormElements.Samband))); 
			Samband.selectByVisibleText("Ja");

			//Anger läkemedelsprövning: JA (för fler fo-huvudmän) 
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.KliniskLäkemedelsprövningFler)));				
			Select KliniskLäkemedelsPrövning = new Select (driver.findElement(By.id(EPM_applicationFormElements.KliniskLäkemedelsprövningFler)));
			KliniskLäkemedelsPrövning.selectByVisibleText("Ja");

			// ansökanskategori, spara val2
			WebDriverWait wait2b = new WebDriverWait(driver, 10);
			wait2b.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.AnsökanskategoriSparaVal2)));
			driver.findElement(By.id(EPM_applicationFormElements.AnsökanskategoriSparaVal2)).click();

			// Rådgivande yttrande: NEJ 
			WebDriverWait wait3 = new WebDriverWait(driver, 10);
			wait3.until(ExpectedConditions.elementToBeClickable(By.id(EPM_applicationFormElements.RådgivandeYttrande)));
			Select RådGivande = new Select (driver.findElement(By.id(EPM_applicationFormElements.RådgivandeYttrande)));
			RådGivande.selectByVisibleText("Nej");
		}
		else {
			System.out.println("Fail");
		}
		return null;
	}

}

