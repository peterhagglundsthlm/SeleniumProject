package testCasesSATMinProfilPublikationer;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class BidragTillBok {
	
	public static void RestenAvEnBok(WebDriver driver) throws InterruptedException{ 
		
		GemensammaMetoder.TitelOchFörfattare(driver);
		GemensammaMetoder.Redaktör(driver);
		GemensammaMetoder.FörlagOchPlats(driver);
		GemensammaMetoder.Sidnummer(driver);
		GemensammaMetoder.ISBN_publikation(driver);
		GemensammaMetoder.Utgivare(driver);
		GemensammaMetoder.OpenAccess(driver);
		GemensammaMetoder.Spara(driver);
	}
}
