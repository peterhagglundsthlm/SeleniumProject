package generateApplicationEPM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsAdminLoggaUt;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import pageElementsSAT_EPM.EPM_applicationFormElements;

public class anliEpmFormTitle01 extends BeforeAfterTestBrowsers{
	
	String titelEPM;

	@Parameters({"projectTitle"})	
	@BeforeClass 
	public void skapaTitel(@Optional String projectTitle) {
		
		titelEPM = projectTitle;
	}
	
	@Test
	public void Utlysning() {
		driver.get("https://testaprismaepm.vr.se/EthicalReviewUniqueKeyRow"); 
	}

	@Test (dependsOnMethods={"Utlysning"})
	public void Ans�kanOmEtikPr�vning() {
		driver.get("https://testaprismaepm.vr.se/EthicalReviewUniqueKeyRow"); 
	}

	@Test (dependsOnMethods={"Ans�kanOmEtikPr�vning"})
	public void NyAns�kan() {
		driver.findElement(By.xpath("//*[@id=\"UniqueKeyRowGrid\"]/div[1]/table/tbody/tr[1]/td[1]/div/a")).click();
		
	}
	
	@Test (dependsOnMethods={"NyAns�kan"})
	public void Projekttitel() {
//		
//�ndra titel p� ans�kan h�r!
//
//		String Projekttitel = "Testa skapa ans�kan med formStandard (bas: form01) 190723 11.03";
		
		driver.findElement(By.id("ProjectTitleSV")).sendKeys(titelEPM);

		if (driver.findElement(By.id("ProjectTitleSV")).getAttribute("value") != titelEPM);

		{
			driver.findElement(By.id("ProjectTitleSV")).clear();
			driver.findElement(By.id("ProjectTitleSV")).sendKeys(titelEPM);
		}
	}
	
	@Test (dependsOnMethods={"Projekttitel"})
	public void SkapaEtikpr�vning() {

		driver.findElement(By.id("Submitter")).click();
	}

	@Test (dependsOnMethods={"SkapaEtikpr�vning"})
	public void BytFokusTillFormul�r() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

	}

}