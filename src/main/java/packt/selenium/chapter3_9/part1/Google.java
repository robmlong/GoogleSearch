package packt.selenium.chapter3_9.part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {
	private WebDriver driver;
	private String baseURL;
	
	public Google(WebDriver driver){
		this.driver = driver;
		this.baseURL = "http://www.google.com";
		this.driver.get(baseURL + "/?gws_rd=cr&ei=y4FmWeTjLdDMwQLbo6CYBQ");
		if(!driver.getTitle().equals("Google")){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public GoogleSearchPage goToSearchPage(){
		driver.findElement(By.id("lst-ib")).sendKeys("Mastering Selenium");
		driver.findElement(By.name("btnG")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
		return new GoogleSearchPage(driver);
	}

}
