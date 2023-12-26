package AnnotationsAssignment.webdriver.Listener;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

@SuppressWarnings("deprecation")
public class AmazonTest {

	public static void main(String[] args) {

		String siteUrl = "https://www.amazon.in/";
		String driverPath = "drivers/windows/geckodriver.exe";
		System.setProperty("webdriver.geckodriver.driver", driverPath);

		// create a webdriver instance 
		WebDriver driver = new FirefoxDriver();

		// create instance of EventFiringWebDriver
		EventFiringWebDriver  eDriver = new EventFiringWebDriver(driver);
		
		// create instance of your event listener
		SWListener eListener  = new SWListener();
		
		// attach the lister to eDriver
		eDriver.register(eListener);
		
		eDriver.get(siteUrl);
		
		eDriver.unregister(eListener);
		
	}
}



