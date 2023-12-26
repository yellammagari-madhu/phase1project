package excelreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.automationtesting.excelreport.Xl;

public class BaseClass {
	
	private static final String Xl = null;
	public WebDriver driver;
	
	@BeforeMethod
	public void baseclass1()
	{
		System.setProperty("webdriver.gecko.driver",  "/home/ubuntu/Downloads/gechodriver");
	       driver = new geckodriver();
	       driver.get("https://mvnrepository.com/");	
	}
	
	@AfterMethod
	public void quitDriver() {
		driver.close();
	}
	
	@AfterSuite
	public void generateReport() throws Exception {
//		Xl.generateReport("Report_Excel.xlsx");
	}

}


