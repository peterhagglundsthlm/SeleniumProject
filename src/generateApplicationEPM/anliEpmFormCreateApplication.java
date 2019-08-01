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


public class anliEpmFormCreateApplication extends BeforeAfterTestBrowsers {
	
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
	public void AnsökanOmEtikPrövning() {
		driver.get("https://testaprismaepm.vr.se/EthicalReviewUniqueKeyRow"); 
	}

	@Test (dependsOnMethods={"AnsökanOmEtikPrövning"})
	public void NyAnsökan() {
		driver.findElement(By.xpath("öakjfd aölkjfd ösa")).click();
//		*[@id=\"UniqueKeyRowGrid\"]/div[1]/table/tbody/tr[1]/td[1]/div/a
	}
	
	@Test (dependsOnMethods={"NyAnsökan"})
	public void Projekttitel() {

		driver.findElement(By.id("ProjectTitleSV")).sendKeys(titelEPM);

		if (driver.findElement(By.id("ProjectTitleSV")).getAttribute("value") != titelEPM);

		{
			driver.findElement(By.id("ProjectTitleSV")).clear();
			driver.findElement(By.id("ProjectTitleSV")).sendKeys(titelEPM);
		}
	}
}
