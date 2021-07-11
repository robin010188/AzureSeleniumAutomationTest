package Academy;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{	
		
		System.out.println("Hello Guys");
		
			
    ChromeOptions options = new ChromeOptions();
//	options.addArguments("--headless");
//	options.addArguments("--disable-gpu");
	options.addArguments("--disable-dev-shm-usage");
	
// 	URL url = new URL("http://localhost:4444/wd/hub");
	RemoteWebDriver driver = new RemoteWebDriver(url,options);
// 		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
// 		WebDriver driver =new ChromeDriver();
		driver.get("https://robindeshwal.azurewebsites.net/webapp/");
		String text =driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
		driver.close();
	
		
		
	}
}
