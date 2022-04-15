package variousConcepts;



import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	
	WebDriver driver;
	@Before
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe" );
		driver = new ChromeDriver();	
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testLocators() throws InterruptedException {
		
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.findElement(By.cssSelector("input#sex-1")).click();
		driver.findElement(By.cssSelector("input[value='3']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='radio'][id='exp-3']")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[7]/input")).sendKeys("fun");
	  //  driver.findElements(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("ghjkoo");
		
	    	
		
		
		
	}
	

}
