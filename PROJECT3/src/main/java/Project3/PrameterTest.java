package Project3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrameterTest {
	@Test
	public void para() {
		WebDriver cd=new ChromeDriver();
		System.getProperty("Browser");
		Reporter.log("Executed",true);
		
	}

}
