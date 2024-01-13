package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chorome.driver", "C:/Users/champ/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("7870092002");
		
		driver.findElement(By.name("pass")).sendKeys("ayush0029");
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("login")).click();
		
	Thread.sleep(15000);
		
		 driver.quit(); //
		
	}

}
