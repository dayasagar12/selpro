package Initialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base_myselpro {

	public WebDriver driver;
	public Properties prop;
	
	
	public WebDriver initializeBrowser() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Work\\SeleniumProjects\\MySelPro\\src\\main\\java\\Initialize\\data.properties");
		prop.load(fis);
		String browser_name = prop.getProperty("browser");
		
		if(browser_name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Work\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if(browser_name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geko.driver", "C:\\Work\\driver\\today\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
		else {
			System.setProperty("webdriver.ie.driver", "C:\\Work\\driver\\today\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}
	
	
}
