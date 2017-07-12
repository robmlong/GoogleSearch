package packt.selenium.chapter3_9.part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	private WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver){
		this.driver = driver;
		System.out.println(driver.getTitle());
		if(!driver.getTitle().equals("Mastering Selenium")){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public String getNumberOfResults(){
		String numberOfResults = driver.findElement(By.id("resultStats")).getText();
		System.out.println(numberOfResults);
		return numberOfResults;
	}
}
