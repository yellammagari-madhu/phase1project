package phase2.TestPages;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import phase2base.TestBase;
import phase2.pages.HomePage;
import phase2.pages.RegisterPage;
import phase2.pages.SearchPage;

public class TestSearchPage  extends TestBase {
	

	SearchPage sp;
		@BeforeMethod
		public void OpenApp()
		{
			openBrowser();
			sp = new SearchPage(driver);
		}
		
		
		@AfterMethod
		public void CloseApp()
		{
			driver.quit();
		}
		
		@Test
		public void searchProduct() throws InterruptedException
		{
			sp.searchproduct();
			Thread.sleep(1000);
			sp.selectproduct();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	

}



