package generateApplicationEPM;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class baraBilagor extends anliEpmFormTitleCategory {
	
   @Test 
	public void s15_Bilagor() throws AWTException, InterruptedException, IOException {
		
	   	System.out.println(ansökansKategori + " ... och nu kommer sektion 15.");
		driver.findElement(By.linkText("15. BILAGOR")).click();

		//15.1 bifoga forskningsplan - obligatorisk -- ALLA BILAGOR LADDAS UPP SIST

		// Frågor om bilagor: 15.2
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("9e0fb60e-cd29-4208-9561-b9c1d53e946c")));
		Select Disp = new Select (driver.findElement(By.id("9e0fb60e-cd29-4208-9561-b9c1d53e946c")));
		Disp.selectByVisibleText("Nej");
		System.out.println("wait1");

		// Frågor om bilagor: 15.3
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("7c0cded1-b0b0-4245-8ef6-b5e2591a07bb")));
		Select Disp2 = new Select (driver.findElement(By.id("7c0cded1-b0b0-4245-8ef6-b5e2591a07bb")));
		Disp2.selectByVisibleText("Nej");
		System.out.println("wait2");

		// Frågor om bilagor: 15.4
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("ff16dfd4-37a5-4f2a-9b22-d151440f0152")));
		Select Disp3 = new Select (driver.findElement(By.id("ff16dfd4-37a5-4f2a-9b22-d151440f0152")));
		Disp3.selectByVisibleText("Nej");
		System.out.println("wait3");

		//		Fråga om läkemedel: 15.5
//		WebDriverWait wait4 = new WebDriverWait(driver, 10);
//		wait4.until(ExpectedConditions.elementToBeClickable(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
//		System.out.println("wait4");

		//		om det är en läkemedelsprövning: 
		if (ansökansKategori.equalsIgnoreCase("Form02")	|| ansökansKategori.equalsIgnoreCase("Form04")|| ansökansKategori.equalsIgnoreCase("Form07")){
//			|| ansökansKategori=="Form04"|| ansökansKategori=="Form07"
			
			//		om parameter ansökanstyp==Form02 eller Form04 eller Form07 tar jag in kod eudraCT från anliEpmLäkemedel */
			WebDriverWait wait4a = new WebDriverWait(driver, 10);
			wait4a.until(ExpectedConditions.elementToBeClickable(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
			System.out.println("wait4a");
			Select Disp4a = new Select (driver.findElement(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
			Disp4a.selectByVisibleText("Ja");
			System.out.println("Ansökanstyp är " + ansökansKategori);
			System.out.println("Jag har valt Ja på läkemedelsprövning");

			// 15.5.1 EudraCT-nr in med javascript
			driverAndCommands.GetCurrentUrl.GetUrlAndPrintInConsole(driver);
			generateApplicationEPM.anliEpmLakemedel.eudraCTnr(driver);
		}

		// annars = om det inte är läkemedelsprövning
		else {
			WebDriverWait wait4 = new WebDriverWait(driver, 10);
			wait4.until(ExpectedConditions.elementToBeClickable(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
			System.out.println("wait4");
			Select Disp4 = new Select (driver.findElement(By.id("d8a5629c-7ff5-43af-a6c3-30d0af5d12d4")));
			Disp4.selectByVisibleText("Nej");
			System.out.println("Ansökanstyp är " + ansökansKategori);
			System.out.println("Jag har valt Nej på läkemedelsprövning");
		}

		// resten av bilagorna etc. 15.6
		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("47bcd41a-346e-44b7-9d7a-869de0e096b3")));
		Select Disp5 = new Select (driver.findElement(By.id("47bcd41a-346e-44b7-9d7a-869de0e096b3")));
		Disp5.selectByVisibleText("Nej");
		System.out.println("wait5");

		// resten av bilagorna etc. 15.7
		WebDriverWait wait6 = new WebDriverWait(driver, 10);
		wait6.until(ExpectedConditions.elementToBeClickable(By.id("78e0e3ef-49b7-4719-b492-53df1b1d65ed")));
		Select Disp6 = new Select (driver.findElement(By.id("78e0e3ef-49b7-4719-b492-53df1b1d65ed")));
		Disp6.selectByVisibleText("Nej");
		System.out.println("wait6");

		// resten av bilagorna etc. 15.8
		WebDriverWait wait7 = new WebDriverWait(driver, 10);
		wait7.until(ExpectedConditions.elementToBeClickable(By.id("5674d283-9e88-4ad0-9b30-0e2c8f16d7be")));
		Select Disp7 = new Select (driver.findElement(By.id("5674d283-9e88-4ad0-9b30-0e2c8f16d7be")));
		Disp7.selectByVisibleText("Nej");
		System.out.println("wait7");

		// tillägg av alla obligatoriska bilagor
		driverAndCommands.GetCurrentUrl.GetUrlAndPrintInConsole(driver);
		generateApplicationEPM.anliEpmLakemedel.bilagorLäkemedel(driver);

		System.out.println("Alla filer är uppladdade.");
		System.out.println("Sektion 15 är klar.");
	}
}
