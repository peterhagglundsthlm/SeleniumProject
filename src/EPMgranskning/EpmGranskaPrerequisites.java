package EPMgranskning;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import driverAndCommands.BeforeAfterTestBrowsers;

public class EpmGranskaPrerequisites extends BeforeAfterTestBrowsers {

	static String beredningsgrupp;
	static String granskningsuppgifter;
	static String datum;

	@Parameters({"bgURL"})
	@BeforeClass 
	public void aktuellBeredningsgrupp (@Optional String bgURL) {

		beredningsgrupp = bgURL;
		System.out.println("URL för beredningsgrupp: " + beredningsgrupp);
	}

	@Parameters({"granskningURL"})
	@BeforeClass 
	public void aktuellGransknUppgifter (@Optional String granskningURL) {

		granskningsuppgifter = granskningURL;
	}

	@Parameters({"date"})
	@BeforeClass 
	public void datum (@Optional String date) {

		datum = date;
		System.out.println("Datum är " + datum);
	}
}
