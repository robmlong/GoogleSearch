package packt.selenium.chapter3_9;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import packt.selenium.chapter3_9.part1.Google;
import packt.selenium.chapter3_9.part1.GoogleSearchPage;

public class SearchGoogleTest {
	private WebDriver driver;
	public Google googlePage;
	public GoogleSearchPage searchPage;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",
		        "C:\\WebDriver\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void testGoogleSearch(){
		googlePage = new Google(driver);
		searchPage = googlePage.goToSearchPage();
		searchPage.getNumberOfResults();
	}
}
