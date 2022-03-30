package JTest;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
	
	

	WebDriver driver;
	Exxcel ex =new Exxcel();

	 @Before
	 
	  public void open() {
	  System.setProperty("webdriver.chrome.driver","E:\\SSD\\Uni\\Fourth\\SE 2\\Tools-20220102T070513Z-001\\Tools\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.get("file:///E:/SSD/Uni/Fourth/SE%202/Tools-20220102T070513Z-001/Tools/Shop%20Cart%20Free%20Website%20Template%20-%20Free-CSS.com/Shop%20Cart%20Free%20Website%20Template%20-%20Free-CSS.com/shop-cart/register.html");
	   driver.manage().window().maximize();
	}
	@Test
	
		
	public void testdata() throws InterruptedException, IOException {
		
		for (int i = 0; i < ex.count(); i++) {
		
			
		
		Select SE =new  Select(driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/form/div[1]/div/select")));
		SE.selectByIndex(1);

		driver.findElement(By.id("inputFname")).sendKeys(ex.getdata(i, 1));
		driver.findElement(By.id("inputLname")).sendKeys("Ashraf");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/form/div[4]/div/input")).sendKeys("Kamal@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/form/div[5]/div/input")).sendKeys("@123ml");


		
		SE = new Select (driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/form/div[6]/div/select[1]")));
		SE.selectByIndex(7);
		SE = new Select (driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/form/div[6]/div/select[2]")));

		SE.selectByIndex(2);
		SE = new Select (driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/form/div[6]/div/select[3]")));

		SE.selectByIndex(1);

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/form/div[7]/div/input")).click();

		}
	}

	@After
	
	public void close() {
		//driver.close();
	}
}




