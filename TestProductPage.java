package phase2.TestPages;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import phase2base.TestBase;
import phase2.pages.ProductPage;
import phase2.pages.SearchPage;

public class TestProductPage extends TestBase{
	
	
	SearchPage sp;
	ProductPage pp;
	
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		sp = new SearchPage(driver);
		pp = new ProductPage(driver);
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test
	public void testproduct_addtocart() throws InterruptedException
	{
		
		sp.searchproduct();
		Thread.sleep(1000);
		sp.selectproduct();
		Thread.sleep(1000);
		pp.addtocart();
		
	}
	
	
	
	
	
	
	
	
	
	

}



