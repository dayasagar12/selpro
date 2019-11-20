package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Initialize.base_myselpro;
import PageObjects.loginPage;

public class hotelSearch extends base_myselpro{
	
	
	@BeforeTest
	public void start_browser() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		
	}
	
	
	@Test
	public void searchHotel() throws IOException {

		loginPage lp = new loginPage(driver);
		lp.searchHotel();
		
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
