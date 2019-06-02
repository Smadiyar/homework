package homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hwKayak {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kayak.com");
		
	}
	
	@Test
	public void test() throws InterruptedException {
	
	System.out.println(driver.getTitle());
		
	driver.findElement(By.xpath("//li[@class='col js-vertical-cruises _bd _CZ _Y _mK _sh _e05 _8W _cF']")).click();
	Thread.sleep(2000);
		
		
	}
	
	@After
	public void end() {
		driver.quit();
	}

}
